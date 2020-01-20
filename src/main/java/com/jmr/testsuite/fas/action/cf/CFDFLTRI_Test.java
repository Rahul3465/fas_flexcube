package com.jmr.testsuite.fas.action.cf;

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
import com.jmr.testsuite.fas.page.cf.CFDFLTRI_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CFDFLTRI_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "CFDFLTRI";
	private final String screenName="Floating Rate Input";

	private List<CFDFLTRI_Page> dataList;
	private List<CFDFLTRI_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CFDFLTRI_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (CFDFLTRI_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
				
					fcubs.clickNew();
				

					fcubs.populateTextById("BLK_RATE_CODE__RATE_CODE", data.getRatecode());
					fcubs.populateTextById("BLK_RATE_CODE__RATE_DESC", data.getDescription());
					fcubs.selectDropdownByText("BLK_RATE_CODE__QUOTE_BASIS", data.getQuortebasisforloan());
					fcubs.selectFlag("BLK_RATE_CODE__FL_BR_RATE_PROP", data.getProporaefloatrate());
					fcubs.selectFlag("cmdAddRow_BLK_RATE_CCY", data.getCurrencyadd());
					fcubs.populateTextById("BLK_RATE_CCY__CCY_CODE", data.getCurrencycode());
					fcubs.selectFlag("cmdAddRow_BLK_FLOAD_RATE", data.getAmountadd());
					fcubs.populateTextById("BLK_FLOAD_RATE__AMOUNT_SLABI", data.getAmountslab());
					fcubs.populateTextById("BLK_FLOAD_RATE__EFFECTIVE_DATEI", data.getEffectivedate());
					fcubs.selectDropdownByText("BLK_FLOAD_RATE__BORROW_LEND_NO", data.getBorrowlend());
					fcubs.selectFlag("cmdAddRow_BLK_FLTRATE_DETAIL", data.getTenoradd());
					fcubs.populateTextById("BLK_FLTRATE_DETAIL__TENOR_TOI", data.getTenorto());
					fcubs.populateTextById("BLK_FLTRATE_DETAIL__INT_RATEI", data.getInterestrate());
					fcubs.populateTextById("BLK_FLTRATE_DETAIL__INT_RATEI", data.getPickuprate());

					

					
					
					
					fcubs.clickSave();
				
					// added to close remark screen/alert
					fcubs.closeRemarkPopUp(); 
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
		for (CFDFLTRI_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
