package com.jmr.testsuite.fas.action.ft;

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
import com.jmr.testsuite.fas.page.ft.FTDTRONL_Page;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;
@ContextConfiguration(classes = SpringConfiguration.class)

public class FTDTRONL_Test extends AbstractTestNGSpringContextTests{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "FTDTRONL";
	private final String screenName="Funds Transfer Contract Input";

	private List<FTDTRONL_Page> dataList;
	private List<FTDTRONL_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(FTDTRONL_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (FTDTRONL_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
				
					fcubs.clickNew();
					

					fcubs.populateTextById("BLK_CONTRACT_DETAILS__PROD", data.getProduct());
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__BTN_DFLT");
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__DRCCY", data.getDebitcurrenct());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__DRACCBRN", data.getDebitBranch());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__UI_DR_ACCOUNT", data.getDebitaccount());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__DRAMTI", data.getDebitamount());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__DRVALDTI", data.getDebitvaluedate());
					
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CRCCY", data.getCreditcurrency());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CRACCBRN", data.getCreditbranch());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__UI_CR_ACCOUNT", data.getCreditaccount());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CRAMTI", data.getCreditamount());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CRVALDTI", data.getCreditvaluedate());

					fcubs.selectFlag("BLK_CONTRACT_DETAILS__BTN_ENRICH", data.getEnrich());
					
					try {
						fcubs.closeOverridePopUp();
						fcubs.closeInfoPopUp();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__EXCHGRATEI", data.getExchangerate());

					
					// =======================================Party Detail Tab============================================//

					if (data.getParty().equalsIgnoreCase("Yes")) {
						fcubs.clickButtonById("TAB_PARTYDET");
						fcubs.populateTextById("BLK_CONTRACT_DETAILS__ULTBEN1", data.getUltimatebenficiary1());
						fcubs.populateTextById("BLK_CONTRACT_DETAILS__BYORDEROF1", data.getByorderdetail1());
						
					}
									
					// =======================================Customer Cover Details Sublink============================================//

					if (data.getCustomercoverdetailtab().equalsIgnoreCase("Yes")) {
						fcubs.openChildScreenByTitle("Customer Cover Details");
						fcubs.populateTextById("BLK_CUST_COVER_DETAILS__ORDCUST1", data.getOrdercustomer());// joint firstname
						fcubs.populateTextById("BLK_CUST_COVER_DETAILS__ULTBEN1", data.getUltimatebefdetail1());// last name

						fcubs.populateTextById("BLK_CUST_COVER_DETAILS__INTERMED1", data.getIntermediary());// address1
						fcubs.populateTextById("BLK_CUST_COVER_DETAILS__ACCWITHINST1", data.getAccountwithinstitution()); // address2
						fcubs.closeChildScreen();
					}

					
					
				
					
					fcubs.clickSave();
				
					// added to close remark screen/alert
					fcubs.closeOverridePopUp();
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
		for (FTDTRONL_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
