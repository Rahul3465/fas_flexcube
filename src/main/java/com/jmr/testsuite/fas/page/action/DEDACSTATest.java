package com.jmr.testsuite.fas.page.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.DEDACSTA;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.fas.page.common.UIFormatException;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDACSTATest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver driver;
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	@Autowired
	private ScreenShotUtil screenShotUtil;

	private DEDACSTA data;
	private List<DEDACSTA> dataList;
	private final String screenId = "DEDACSTA";

	private List<DEDACSTA> resultList;
	private String actualResult;

	@Test(priority = 0)
	public void initSetup() throws Exception {
		fcubs.launchApp();
		fcubs.launchScreen(screenId);
		dataList = xlsReader.read(DEDACSTA.class, new File(AppConfig.testFileLocation), 3);
		resultList = new ArrayList<>();
	}

	@Test(priority = 1)
	public void executeTestCase() throws Exception {
		Iterator<DEDACSTA> it = dataList.iterator();
		while (it.hasNext()) {
			data = it.next();
			if (data.getRunMode().equalsIgnoreCase("Y")) {
				loadData(data);
			}
		}
		Thread.sleep(60 * 1000);
	}

	private void loadData(DEDACSTA data) throws UIFormatException,Exception{
		fcubs.clickEnterQuery();
		// Batch No
		fcubs.populateTextById("BLK_MASTER__BATCH_NO", data.getBatchNo());
		// Source Code
		fcubs.populateTextById("BLK_MASTER__SOURCE_CODE", data.getBatchNo());
		// Branch Code
		fcubs.populateTextById("BLK_MASTER__BRANCH_CODE", data.getBatchNo());
		// Upload Status
		fcubs.selectDropdownByText("BLK_MASTER__UPLOAD_STAT", data.getUploadStatus());
		fcubs.clickExecuteQuery();
		try {
			WebElement element = driver.findElement(By.xpath("//*[@title='Error Message']"));
			driver.switchTo().frame(element);
			String msg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
			//fcubs.closeMainScreen();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("no Error found test case passed");
		}
	}
}
