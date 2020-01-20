package com.jmr.testsuite.fas.action.cl;

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
import com.jmr.testsuite.fas.page.cl.CLDMNDSB_Page;
import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CLDMNDSB_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "CLDMNDSB";
	private final String screenName="Manual Disbursement Details";

	private List<CLDMNDSB_Page> dataList;
	private List<CLDMNDSB_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CLDMNDSB_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (CLDMNDSB_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					
					fcubs.launchScreen(screenId);
					
					
					if (data.getNewdata().equalsIgnoreCase("Yes")) {

				
					fcubs.clickNew();
					fcubs.populateTextById("BLK_DSBR_MASTER__ACTNO", data.getAccountnumber());
					fcubs.clickButtonById("BLK_DSBR_MASTER__BTN_DEFAULT");
					
					fcubs.populateTextById("BLK_DSBR_MASTER__VALDTI", data.getValuedate());
					fcubs.populateTextById("BLK_DSBR_MASTER__EXECUTIONDATEI", data.getExecutiondate());
					fcubs.populateTextById("BLK_DSBR_MASTER__REMARKS", data.getRemark());
					
					fcubs.selectDropdownByText("BLK_DSBR_DETAIL__STTLMODE", data.getSettlementmode());
					fcubs.populateTextById("BLK_DSBR_DETAIL__STTLCCY", data.getSettlementcurrency());
					fcubs.populateTextById("BLK_DSBR_DETAIL__STTLAMTI", data.getSettlementamount());
					
				
					
					fcubs.clickSave();
			
					
					fcubs.closeOverridePopUp();
					
					}
					
					
//============================================Authorise Record=================================================
					
					if (data.getAuthorize().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_DSBR_MASTER__ACTNO", data.getAccountnumber());
						fcubs.clickExecuteQuery();

						fcubs.clickButtonByXpath("//a[contains(text(),'Authorize')]");
						fcubs.switchtosubscreensframe();
						fcubs.clickBtnAuthorisebtn();
						fcubs.closeInfoPopUp();
						fcubs.closeScreen();
										
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
		for (CLDMNDSB_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
