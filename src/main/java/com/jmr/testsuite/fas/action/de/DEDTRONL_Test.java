package com.jmr.testsuite.fas.action.de;

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
import com.jmr.testsuite.fas.page.de.DEDTRONL_Page;
import com.jmr.testsuite.fas.page.lm.ISSBICDR_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDTRONL_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "DEDTRONL";
	private final String screenName="Journal Single Entry Input";

	private List<DEDTRONL_Page> dataList;
	private List<DEDTRONL_Page> resultList;


	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(DEDTRONL_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
	public void executeTestCase() throws Exception {

		for (DEDTRONL_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);

					fcubs.clickNew();
					fcubs.switchToActiveFrame();
					fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__DESCRIPTION", data.getDescription());
					Thread.sleep(2000);
					if (data.getBalancing().equalsIgnoreCase("No")) 
					{
						fcubs.clickButtonByXpath("//div[@class='DIVChkRadSel']");			
					}
					fcubs.clickBtnOk();
					Thread.sleep(2000);
					fcubs.switchToActiveFrame();
					fcubs.closeInfoPopUp();
					fcubs.populateTextById("BLK_JRNL_LOG__ACBRN", data.getAccountbranch());
					fcubs.populateTextById("BLK_JRNL_LOG__UI_ACCOUNT", data.getAccountnumber());
					fcubs.populateTextById("BLK_JRNL_LOG__CCY", data.getCurrency());
					fcubs.populateTextById("BLK_JRNL_LOG__AMTI", data.getAmount());
					fcubs.selectDropdownByText("BLK_JRNL_LOG__DRCR", data.getDebitorcreditindicator());
					fcubs.populateTextById("BLK_JRNL_LOG__TXNCD", data.getTransactioncode());
					try{
					fcubs.populateTextById("BLK_JRNL_LOG__PRDCODE", data.getPeriodcode());
					fcubs.LOVDataNew("//label[text()=' Period Code']//following::input[1]", "//label[text()=' Period Code']//following::input[1]", "//label[text()=' Financial Cycle']//following::input[1]", "//label[text()=' Financial Cycle']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getPeriodcode(),data.getFinancialcycle());
					fcubs.switchToActiveFrame();
					}
					catch(Exception e){}
					Thread.sleep(2000);
					fcubs.populateTextById("BLK_JRNL_LOG__ADDLETXT", data.getAdditionaltext());
					fcubs.populateTextById("BLK_JRNL_LOG__VALDTI", data.getValuedate());
					fcubs.clickButtonById("BLK_JRNL_LOG__BTN_CAL");
					fcubs.closeInfoPopUp();
					fcubs.clickSave();
//					fcubs.closeOverridePopUp();

					try {
						fcubs.closeInfoPopUp();
					}
					catch (Exception ex){
						System.out.println("Record exists");
					}
					fcubs.closeConfirmaPopUp();
					try{
					fcubs.closeConfirmaPopUp();
					}
					catch(Exception e)
					{
						
					}
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
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
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
		for (DEDTRONL_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
