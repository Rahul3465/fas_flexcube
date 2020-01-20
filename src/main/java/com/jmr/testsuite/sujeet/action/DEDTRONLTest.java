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
import com.jmr.testsuite.sujeet.page.DEDTRONL;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDTRONLTest extends AbstractTestNGSpringContextTests {

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

	private DEDTRONL data;
	private final String screenId = "DEDTRONL";
	private final String screenName = "Journal Single Entry Input";

	private List<DEDTRONL> dataList;
	private List<DEDTRONL> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = fcubs.loadDataFromExcel(DEDTRONL.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (DEDTRONL data : dataList) {
			try {
				this.testCaseId = data.getTestCaseID();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);

					fcubs.clickNew();
					fcubs.switchToFrameByTitle("Batch Open");
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__BATCH_NO", data.getBatchNumber());
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__DESCRIPTION", data.getDescription());
					fcubs.clickBtnOk();

					fcubs.switchToActiveFrame();
					fcubs.closeInfoPopUp();
					


					fcubs.switchToFrameByTitle("Journal Single Entry Input");
//					fcubs.populateTextById("BLK_JRNL_LOG__FUNDID", data.getFuncId());
					fcubs.populateTextById("BLK_JRNL_LOG__ACBRN", data.getAccountBranch());
					fcubs.populateTextById("BLK_JRNL_LOG__UI_ACCOUNT", data.getAccountNo());
					fcubs.populateTextById("BLK_JRNL_LOG__CCY", data.getCcy());
					fcubs.populateTextById("BLK_JRNL_LOG__AMTI", data.getAmount());
					fcubs.selectDropdownByText("BLK_JRNL_LOG__DRCR", data.getDrcrInd());
					
					Thread.sleep(4000);
//					fcubs.populateDateField("BLK_JRNL_LOG__VALDTI", data.getValueDate());
					fcubs.populateTextById("BLK_JRNL_LOG__TXNCD", data.getTxnCD());
					Thread.sleep(4000);

//					fcubs.populateTextById("BLK_JRNL_LOG__EXRATEI", data.getExRate());
//					fcubs.populateTextById("BLK_JRNL_LOG__PRDCODE", data.getPeriodCode());
//					fcubs.populateTextById("BLK_JRNL_LOG__RELCUST", data.getRelCustomer());
//					fcubs.populateTextById("BLK_JRNL_LOG__MISGRP", data.getMisGrp());
//					fcubs.populateTextById("BLK_JRNL_LOG__INSTNO", data.getInstNo());
					Thread.sleep(4000);
					fcubs.populateTextById("BLK_JRNL_LOG__ADDLETXT", data.getAddlTxt());
					
					fcubs.clickButtonById("BLK_JRNL_LOG__BTN_CAL");		// C button
					try {
						fcubs.closeInfoPopUp();
						
					} catch (Exception e ) {
						
					}
					fcubs.switchToActiveFrame();
					Thread.sleep(4000);
					fcubs.clickSave();									// Save Button
					Thread.sleep(4000);
					try {
						fcubs.closeInfoPopUp();
						
					}
					catch (Exception e){
						fcubs.switchToActiveFrame();
						fcubs.clickButtonById("BLK_JRNL_LOG__BTN_BATCLS");
						fcubs.closeOverridePopUp();

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
//					fcubs.closeInfoPopUp();
//					fcubs.closeScreen();

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
		for (DEDTRONL data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}