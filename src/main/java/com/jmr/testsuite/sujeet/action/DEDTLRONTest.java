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
import com.jmr.testsuite.sujeet.page.DEDTLRON;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDTLRONTest extends AbstractTestNGSpringContextTests {

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

	private DEDTLRON data;
	private final String screenId = "DEDTLRON";
	private final String screenName = "Teller Transaction Input";

	private List<DEDTLRON> dataList;
	private List<DEDTLRON> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = fcubs.loadDataFromExcel(DEDTLRON.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (DEDTLRON data : dataList) {
			try {
				this.testCaseId = data.getTestCaseID();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					fcubs.clickNew();
					
					fcubs.switchToActiveFrame();
					
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__BATCH_NO", data.getBatchNumber());
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__DESCRIPTION", data.getDescription());
					fcubs.selectFlag("BLK_DEVWS_BATCH_MASTER_1__BALANCING", data.getBalancing());
					
					fcubs.clickBtnOk();
					
					fcubs.switchToActiveFrame();
					
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__PRODUCT_CODE", data.getProduct());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__ADDTEXT", data.getAdditionalText());
					fcubs.clickButtonById("BLK_DETBS_TELLER_MASTER__BTN_P");
					
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__TXN_BRANCH", data.getTransactionBranch());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__TXN_ACCOUNT", data.getTransactionAccount());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__TXN_CCY", data.getTransactionCurrency());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__TXN_AMOUNTI", data.getTransactionAmount());
					
					fcubs.clickButtonById("BLK_DETBS_TELLER_MASTER__BTN_DENOM_TXN_AMT"); 	// D Button 1
 					
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__OFFSET_ACCOUNT_BRANCH", data.getOffsetBranch());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__OFFSET_ACCOUNT", data.getOffsetAccount());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__OFFSET_CCY", data.getOffsetCurrency());
					fcubs.populateTextById("BLK_DETBS_TELLER_MASTER__OFFSET_AMOUNTI", data.getOffsetAmount());
					
					fcubs.clickButtonById("BLK_DETBS_TELLER_MASTER__BTN_DENOM_OFF_AMT"); 	// D Button 2
										
					fcubs.clickSave();
					//fcubs.clickExecuteQuery();					
					
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseID());
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
		for (DEDTLRON data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}