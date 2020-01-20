package com.jmr.testsuite.fas.action.pc;

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
import com.jmr.testsuite.fas.page.pc.PCSCNLEX_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class PCSCNLEX_Test extends AbstractTestNGSpringContextTests{
	

	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "PCSCNLEX";
	private final String screenName="Error Code Details";

	private List<PCSCNLEX_Page> dataList;
	private List<PCSCNLEX_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(PCSCNLEX_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (PCSCNLEX_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CONSOL_STATUS", data.getConsolidatedstatus());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CUST_NO", data.getCustomernumber());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CUST_AC_CCY", data.getAccountcurrency());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__AMOUNTI", data.getAmount());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CUST_ENTRY_VAL_DTI", data.getCustomerentryvaluedate());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CUST_ENTRY_DTI", data.getCustomerentrydate());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__PRODUCT_CODE", data.getProductcode());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__AC_ENTRY_REF_NO", data.getAccountentryrefno());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__EXCEPTION_QUEUE", data.getExceptionqueue());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__TXN_COUNTI", data.getTransactioncount());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CUST_AC_BRN", data.getCustomeraccountbranch());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CONSOL_REF", data.getConsoleref());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__PRODUCT_TYPE", data.getProducttype());
					fcubs.populateTextById("BLK_PCVWS_CONSOLIDATION__CUST_AC_NO", data.getAccountnumber());
					
					fcubs.clickSearchButton();
					
					try {
					fcubs.clickButtonByXpath("//div[@id='QryRslts']//tr[1]//td[1]//div[1]//label[1]//div[1]");
					fcubs.clickdetail();
					}
					catch(Exception ex) {
						System.out.println("No record to select");
					}
				

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
		for (PCSCNLEX_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
