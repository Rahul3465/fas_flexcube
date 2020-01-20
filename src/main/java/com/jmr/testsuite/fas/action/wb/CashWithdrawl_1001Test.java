package com.jmr.testsuite.fas.action.wb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import com.jmr.testsuite.fas.page.CashWithdrawl_1001Page;
import com.jmr.testsuite.fas.page.FXSaleWalIn_8203_Page;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CashWithdrawl_1001Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "1001";
	private final String screenName = "Cash Withdrawal : Branch Date 2019-03-01";

	private List<CashWithdrawl_1001Page> dataList1;
	private List<CashWithdrawl_1001Page> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList1 = fcubs.loadDataFromExcel(CashWithdrawl_1001Page.class, screenId);
		resultList1 = new ArrayList<>();

	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (CashWithdrawl_1001Page data : dataList1) {
			try {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);

				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__UI_TXN_ACC", data.getAccountnumber());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__OFFSETAMTI", data.getTransactionamount());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__OFFSETCCY", data.getCurrency1());
				
				fcubs.clickButtonById("BLK_TRANSACTION_DETAILS__BTN_PICKUP");
				fcubs.popupalert();//frames need to adde here
				
				
			/*	fcubs.switchTab1("FX Denomination Details");
				fcubs.switchtosubscreensframe();
				fcubs.clickButtonById("BLK_DENOMINATION_FXSE__DEFAULT");
				fcubs.clickBtnOk();
				fcubs.switchframes();*/
				
				
				
				/*fcubs.openChildScreenByTitle("FX Denomination Details");
				Thread.sleep(3000);
				fcubs.clickButtonById("BLK_DENOMINATION_FXSE__DEFAULT");
				fcubs.closeChildScreen();
				
				try {
				fcubs.switchToActiveFrame();
				}catch(Exception e) {
					
				}
				
				fcubs.clickButtonById("BLK_TRANSACTION_DETAILS__BTN_RECALC");
				fcubs.popupalert();//frames need to adde here
*/				
			/*	fcubs.switchTab1("Denomination");
				fcubs.switchtosubscreensframe();
				Thread.sleep(3000);
				fcubs.clickButtonByXpath("//button[text()='Populate']");
				fcubs.clickBtnOk();
				fcubs.switchframes();*/
				
				
				
				fcubs.openChildScreenByTitle("Denomination");
				Thread.sleep(3000);
				fcubs.clickButtonByXpath("//button[text()='Populate']");
				fcubs.closeChildScreen();
				try {
					fcubs.switchToActiveFrame();
					}catch(Exception e) {
						
					}
				
				fcubs.clickSave();
				fcubs.closeOverridePopUp();
				
				try {
					fcubs.switchToActiveFrame();
				} catch (Exception e) {
					// TODO: handle exception
				}
			
				fcubs.closeInfoPopUp();
				
				try {
				//fcubs.switchtosubscreensframe();
					fcubs.closeScreen();;
				}catch(Exception e) {
					
				}

				
				try {
					errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
					System.out.println("Error Message  " + errorMsg);
					data.setTestCaseResult(errorMsg);
					if (fcubs.validInput(errorMsg)) {
						resultList1.add(data);
						continue;
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				//fcubs.closeOverridePopUp();
				data.setTestCaseResult("SUCCESS");
				resultList1.add(data);
				// on successful save action confirm and close window for next test case
				//fcubs.closeInfoPopUp();
				//fcubs.closeScreen();

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
			resultList1.add(data);
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
			for(CashWithdrawl_1001Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}

}
