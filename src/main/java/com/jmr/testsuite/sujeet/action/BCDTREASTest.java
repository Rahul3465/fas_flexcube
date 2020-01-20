package com.jmr.testsuite.sujeet.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestCaseImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.sujeet.page.BCDTREAS;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class BCDTREASTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver driver;
	private WebDriverWait driverWait;
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	@Autowired
	private ScreenShotUtil screenShotUtil;
	private String testCaseId;

	private String errorMsg = "";

	private BCDTREAS data;
	private final String screenId = "BCDTREAS";
	private final String screenName = "Bills & Collection Contract Summary";

	private List<BCDTREAS> dataList;
	private List<BCDTREAS> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(BCDTREAS.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(BCDTREAS.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (BCDTREAS data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					fcubs.clickNew();
					Thread.sleep(1000);
					fcubs.populateTextById("BLK_REASSIGN__PRDCD", data.getProductCode());
					Thread.sleep(1000);
					fcubs.clickButtonById("TAB_MAIN__SEC_1__PART1__FST_REASSIGN");
					
					
					fcubs.LOVData("//body/div[@id='DIVWNDContainer']/div[@id='DIVScrContainer']/div[@id='ResTree']/div[@id='DIVMainTmp']/div[@id='mainTabContainer']/div[@id='TBLPageTAB_MAIN']/div[@id='TAB_MAIN__SEC_1']/div[@id='TAB_MAIN__SEC_1__PART1']/fieldset[@id='TAB_MAIN__SEC_1__PART1__FST_REASSIGN']/div[2]/button[1]/span[1]",
							"//input[@id='1']", 
							"//input[@id='1']", 
							"//button[contains(text(),'Fetch')]", 
							"//div[@id='LovDiv']//tr[1]//td[1]//div[1]//a[1]", 
							data.getContractReference());
					fcubs.switchToActiveFrame();
					Thread.sleep(5000);

					fcubs.populateTextById("BLK_REASSIGN__NEWMAKRID", data.getNewUserIdentity());	
					
					fcubs.clickSave();
//					fcubs.closeInfoPopUp();
					
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					// fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for
					// next test case
					fcubs.closeInfoPopUp();
					fcubs.closeScreen();

					data.setTestCaseResult("SUCCESS");
				}
			} catch (Exception ex) {
				errorMsg = fcubs.checkUIFormatError();
				if (fcubs.validInput(errorMsg)) {
					data.setTestCaseResult(errorMsg);
				} else if (fcubs.validInput(ex.getMessage())) {
					data.setTestCaseResult(ex.getMessage());
				}
				ex.printStackTrace();
				resultList.add(data);
				// to update the status as failed
				// fcubs.updateTestCaseExecutionAsFailed();
			}

		}

	}

	@AfterClass
	public void destroy() throws Exception {
		System.out.println("before destroying opened session");
		fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (BCDTREAS data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}