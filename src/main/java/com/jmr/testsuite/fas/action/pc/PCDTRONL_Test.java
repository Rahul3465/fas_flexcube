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
import com.jmr.testsuite.fas.page.pc.PCDTRONL_Page;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class PCDTRONL_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "PCDTRONL";
	private final String screenName="Transaction Input";

	private List<PCDTRONL_Page> dataList;
	private List<PCDTRONL_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(PCDTRONL_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		
		fcubs.launchScreen(screenId);
		fcubs.clickNew();
		for (PCDTRONL_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					
				
					
						
					fcubs.switchframes();
					fcubs.populateTextById("BLK_BATCH_PROCESS__PRDCATDIS", data.getProductcategory());
					//fcubs.LOVData("//fieldset[@id='TAB_ALL__SEC_SELECT__SEC_SELECT_PART1__FST_SCREEN4_SEC1_PART1']//span[@class='ICOlov']", "//label[text()=' Product Category']//following::input[1]","//label[text()=' Product Category']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getProductcategory());

					fcubs.populateTextById("BLK_BATCH_PROCESS__BATCH_NOI", data.getBatchnumber());
					fcubs.populateTextById("BLK_BATCH_PROCESS__BATCH_DESC", data.getBatchdescription());
					
					try {
					fcubs.clickBtnOk();
					fcubs.closeInfoPopUp();
					}
					catch(Exception ex) {
						System.out.println("no record");
					}
					fcubs.defaultframe();
					fcubs.switchframes();
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__PRDCOD", data.getProductcode());
					fcubs.clickButtonById("BLK_PCTB_CONTRACT_MASTER__BTN_PRDT_DEF");
					fcubs.closeInfoPopUp();
					fcubs.switchframes();
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__UI_CUST_AC_NO", data.getAccountnumber());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__CUSBNKCOD", data.getBankcode());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__CUSBNKNAM", data.getBankname());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__CPACNO", data.getCounterpartyaccno());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__CPBNKCOD", data.getCounterpartybankcode());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__ACTDTI", data.getActivationdate());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__ACTAMTI", data.getAmount());
					fcubs.populateTextById("BLK_PCTB_CONTRACT_MASTER__EXRATI", data.getExchangerate());
					fcubs.selectDropdownByText("BLK_PCTB_CONTRACT_MASTER__CUTOFSTAT", data.getCutoffstatus());
					

					fcubs.clickSave();
				
					fcubs.closeOverridePopUp();
					fcubs.closeInfoPopUp();
				
					fcubs.closeScreen();
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
			/*		fcubs.closeInfoPopUp();
					fcubs.closeScreen();*/

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
		for (PCDTRONL_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
