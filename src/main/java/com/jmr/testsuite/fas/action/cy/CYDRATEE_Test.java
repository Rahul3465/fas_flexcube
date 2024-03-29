package com.jmr.testsuite.fas.action.cy;

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

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.cy.CYDRATEE_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class CYDRATEE_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "CYDRATEE";
	private final String screenName="Currency Exchange Rates Input";

	private List<CYDRATEE_Page> dataList;
	private List<CYDRATEE_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CYDRATEE_Page.class, screenId);
		resultList = new ArrayList<>();
	}
	
	@Test()
	public void executeTestCase() throws Exception {

		for (CYDRATEE_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
			
					fcubs.clickEnterQuery();
					fcubs.populateTextById("BLK_CCY_RATE_MASTER__CCY1", data.getCurrency1());
					fcubs.clickExecuteQuery();
					fcubs.clickButtonByXpath("//a[text()='Unlock']");
					fcubs.clickButtonById("cmdAddRow_BLK_CCY_RATE_DETAILS");
					fcubs.populateTextById("BLK_CCY_RATE_DETAILS__RATETYPE", data.getRatetype());
					fcubs.populateTextById("BLK_CCY_RATE_DETAILS__MIDRATEI", data.getMidRate());
					fcubs.populateTextById("BLK_CCY_RATE_DETAILS__BUYSPRDI", data.getBuySpread());
					fcubs.populateTextById("BLK_CCY_RATE_DETAILS__SALESPRDI", data.getSellSpread());
					fcubs.clickButtonById("BLK_CCY_RATE_MASTER__BTNENRICH");
					fcubs.clickSave();
					try {
					fcubs.closeInfoPopUp();
					}
					catch (Exception ex){
						System.out.println("Record exists");
					}
				
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
					//fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for next test case
				//	fcubs.closeInfoPopUp();
				//	fcubs.closeScreen();

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
		//fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (CYDRATEE_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
