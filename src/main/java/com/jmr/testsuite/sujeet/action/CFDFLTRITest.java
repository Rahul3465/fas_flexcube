package com.jmr.testsuite.sujeet.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.sujeet.page.CFDFLTRI;
import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CFDFLTRITest extends AbstractTestNGSpringContextTests {
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "CFDFLTRI";
	private final String screenName="Floating Rate Input";

	private List<CFDFLTRI> dataList1;
	private List<CFDFLTRI> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList1 = fcubs.loadDataFromExcel(CFDFLTRI.class, screenId);
		resultList1 = new ArrayList<>();

	}

	
	@Test()
	public void executeTestCase() throws Exception {
		for (CFDFLTRI data : dataList1) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
			fcubs.setTestCaseId(testCaseId);
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);
				fcubs.clickNew();
				
				fcubs.populateTextById("BLK_RATE_CODE__RATE_CODE", data.getRatecode());
				fcubs.populateTextById("BLK_RATE_CODE__RATE_DESC", data.getDescription());
				fcubs.populateTextById("BLK_RATE_CODE__QUOTE_BASIS", data.getQuortebasisforloan());
				fcubs.clickButtonByXpath("//label[contains(text(),'Propagate Floating Rates To Branches')]"); // Propagate
																												// Floating
																												// Rates
										 																		// To
																												// Branches

				// Currency

				fcubs.clickButtonById("cmdAddRow_BLK_RATE_CCY"); // Adding row
																	// here
				fcubs.populateTextById("BLK_RATE_CCY__CCY_CODE", data.getCurrencycode());

				// Effective Date and Amount Slab

				fcubs.clickButtonById("cmdAddRow_BLK_FLOAD_RATE"); // Adding row
																	// here
				fcubs.populateTextById("BLK_FLOAD_RATE__AMOUNT_SLABI", data.getAmountslab());
				Thread.sleep(4000);
				fcubs.populateDateField("BLK_FLOAD_RATE__EFFECTIVE_DATEI", data.getEffectivedate());
				Thread.sleep(4000);
				fcubs.selectDropdownByText("BLK_FLOAD_RATE__BORROW_LEND_NO", data.getBorrowlend());

				// Tenor and Interest Rate Details

				fcubs.clickButtonById("cmdAddRow_BLK_FLTRATE_DETAIL"); // Adding
																		// row
																		// here
				fcubs.populateTextById("BLK_FLTRATE_DETAIL__TENOR_TOI", data.getTenorto());
				fcubs.populateTextById("BLK_FLTRATE_DETAIL__INT_RATEI", data.getInterestrate());

//				fcubs.switchToActiveFrame();
				fcubs.clickSave();
				Thread.sleep(4000);
				fcubs.clickBtnOk();
				// added to close remark screen/alert
//				fcubs.closeRemarkScreen();
				try {
					errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
					System.out.println("Error Message  " + errorMsg);
					continue;
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("no Error found test case passed");
				}
				
				fcubs.closeOverridePopUp();
				
			}
			} catch (Exception ex) {
				errorMsg = fcubs.checkUIFormatError();
				if (fcubs.validInput(errorMsg)) {
					data.setTestCaseResult(errorMsg);
				} else if (fcubs.validInput(ex.getMessage())) {
					data.setTestCaseResult(ex.getMessage());
				}
				
				data.setTestCaseResult("SUCCESS");
				ex.printStackTrace();
				resultList1.add(data);
				// on successful save action confirm and close window for next
				// test case
				fcubs.closeInfoPopUp();
				fcubs.closeScreen();

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
		for (CFDFLTRI data : resultList1) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
