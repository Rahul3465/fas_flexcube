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
import com.jmr.testsuite.sujeet.page.GEDCOLLT;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class GEDCOLLTTest extends AbstractTestNGSpringContextTests {

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

	private GEDCOLLT data;
	private final String screenId = "GEDCOLLT";
	private final String screenName = "Collaterals Maintenance";

	private List<GEDCOLLT> dataList;
	private List<GEDCOLLT> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = fcubs.loadDataFromExcel(GEDCOLLT.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (GEDCOLLT data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);

					fcubs.clickNew();
					
					fcubs.populateTextById("BLK_COLLATERALS__LIAB_NO", data.getLiabilityNo());
					// LiabilityNo
					fcubs.populateTextById("BLK_COLLATERALS__COLLATERAL_CODE", data.getCollateralCode());					
					//CollateralCode
					fcubs.populateTextById("BLK_COLLATERALS__SENIORITY_OF_CLAIM", data.getSeniorityClaim());				
					//SeniorityClaim
					fcubs.populateTextById("BLK_COLLATERALS__CHARGE_TYPE", data.getChargeType());
					//ChargeType
					fcubs.populateTextById("BLK_COLLATERALS__HAIRCUTI", data.getHaircutPercent());
					//HaircutPercent
					fcubs.populateTextById("BLK_COLLATERALS__START_DATEI", data.getStartDate());
					
					fcubs.populateTextById("BLK_COLLATERALS__CATEGORY_NAME", data.getCollateralCategory());
					
					fcubs.populateTextById("BLK_COLLATERALS__COLLATERAL_CURRENCY", data.getCollateralCurrency());
					
					fcubs.populateTextById("BLK_COLLATERALS__COLLATERAL_VALUEI", data.getCollateralValue());
										
					fcubs.clickSave();													// Save Button
					Thread.sleep(4000);
					try{
						fcubs.closeOverridePopUp();						
					}
					catch(Exception e){
						fcubs.closeInfoPopUp();

					}
					
					fcubs.closeInfoPopUp();
					
					
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
		for (GEDCOLLT data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}