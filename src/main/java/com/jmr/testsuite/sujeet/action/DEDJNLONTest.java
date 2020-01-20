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
import com.jmr.testsuite.sujeet.page.DEDJNLON;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDJNLONTest extends AbstractTestNGSpringContextTests {

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

	private DEDJNLON data;
	private final String screenId = "DEDJNLON";
	private final String screenName = "Journal Entry Input";

	private List<DEDJNLON> dataList;
	private List<DEDJNLON> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = fcubs.loadDataFromExcel(DEDJNLON.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (DEDJNLON data : dataList) {
			try {
				this.testCaseId = data.getTestCaseID();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);

					fcubs.clickNew();
					fcubs.switchToFrameByTitle("Batch Open");
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER__BATCH_NO", data.getBatchNumber());
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER__DESCRIPTION", data.getDescription());
					fcubs.clickBtnOk();
					Thread.sleep(2000);
					fcubs.switchToActiveFrame();
					fcubs.closeInfoPopUp();
//					fcubs.switchToActiveFrame();
					
					fcubs.clickButtonById("cmdAddRow_BLK_DETBS_JRNL_TXN_DETAIL");
					fcubs.clickButtonById("cmdAddRow_BLK_DETBS_JRNL_TXN_DETAIL");
					Thread.sleep(4000);
					
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__USER_REF_NORC1", data.getUserReferenceNumber2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__USER_REF_NO", data.getUserReferenceNumber());
					Thread.sleep(2000);
					fcubs.selectDropdownByText("BLK_DETBS_JRNL_TXN_DETAIL__DR_CRRC1", data.getDrcrInd2());
					fcubs.selectDropdownByText("BLK_DETBS_JRNL_TXN_DETAIL__DR_CR", data.getDrcrInd());
					
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__BRANCH_CODERC1", data.getAccountBranch2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__BRANCH_CODE", data.getAccountBranch());
					
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__CCYRC1", data.getCcy2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__CCY", data.getCcy());
										
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__UI_AC_GL_NORC1", data.getAccountNo2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__UI_AC_GL_NO", data.getAccountNo());
					Thread.sleep(2000);
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__AMOUNTIRC1", data.getAmount2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__AMOUNTI", data.getAmount());
					
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__TXN_CODERC1", data.getTxnCD2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__TXN_CODE", data.getTxnCD());
										
					Thread.sleep(3000);
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__ADDL_TEXTRC1", data.getAddlTxt2());
					fcubs.populateTextById("BLK_DETBS_JRNL_TXN_DETAIL__ADDL_TEXT", data.getAddlTxt());
					
					
					fcubs.clickButtonById("BLK_DETBS_BATCH_MASTER__BTN_COMPUTE");		// C button
					Thread.sleep(3000);
					fcubs.closeInfoPopUp();
					
					fcubs.clickSave();													// Save Button
					Thread.sleep(4000);
					try{
						fcubs.closeOverridePopUp();						
					}
					catch(Exception e){
						fcubs.closeInfoPopUp();

					}
					
					fcubs.closeInfoPopUp();
					
					fcubs.clickButtonById("BLK_DETBS_JRNL_TXN_MASTER__BTN_CLOSE_BATCH"); // Batch close
					System.out.println("Batch Closed button clicked successfully!!!!!");
					fcubs.closeInfoPopUp();
					
				
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
		for (DEDJNLON data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}