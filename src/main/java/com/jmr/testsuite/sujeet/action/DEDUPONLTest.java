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
import com.jmr.testsuite.sujeet.page.DEDUPONL;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDUPONLTest extends AbstractTestNGSpringContextTests {

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

	private DEDUPONL data;
	private final String screenId = "DEDUPONL";
	private final String screenName = "Journal Batch Upload";

	private List<DEDUPONL> dataList;
	private List<DEDUPONL> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = fcubs.loadDataFromExcel(DEDUPONL.class, screenId);
		resultList = new ArrayList<>();
	}
	
	@Test()
	public void executeTestCase() throws Exception {
		for (DEDUPONL data : dataList) {
			try {
				this.testCaseId = data.getTestCaseID();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					fcubs.clickNew();
					
					fcubs.populateTextById("BLK_UPLOAD_MASTER__SOURCE_CODE", data.getSourceCode());
					// Source Code
					fcubs.populateTextById("BLK_UPLOAD_MASTER__BATCH_NO", data.getBatchNumber());
					// Batch Number
					fcubs.selectFlag("BLK_UPLOAD_MASTER__POSITION_REQD", data.getPositionRequired());
					// Branch Code
					fcubs.selectFlag("BLK_UPLOAD_MASTER__DRCRCHK", data.getCreditDebitCheck());
					// Credit Debit Check
					fcubs.populateTextById("BLK_UPLOAD_MASTER__CUSVARIANCEI", data.getVariance());
					// Variance
					fcubs.selectFlag("BLK_UPLOAD_MASTER__IGNORE_OVERRIDES", data.getIgnoreOverrides());
					// Ignore Overrides
					
					fcubs.clickButtonById("BLK_UPLOAD_MASTER__BTN_VALIDATE");
					//Validate Button
					
					fcubs.clickSave();
					
/*					if(data.getDeleteButton().equalsIgnoreCase("Yes")){
						fcubs.clickButton("");	
					}
*/					
					try{
						fcubs.closeOverridePopUp();						
					}
					catch(Exception e){

					}				
					try{
						fcubs.closeInfoPopUp();						
					}
					catch(Exception e){

					}			
					fcubs.closeScreen();
					
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
		for (DEDUPONL data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}