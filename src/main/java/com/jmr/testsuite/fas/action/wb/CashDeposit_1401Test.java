package com.jmr.testsuite.fas.action.wb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

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
import com.jmr.testsuite.fas.page.CashDeposit_1401Page;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class CashDeposit_1401Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "1401";
	private final String screenName = "Cash Deposit : Branch Date 2019-03-01";

	private List<CashDeposit_1401Page> dataList1;
	private List<CashDeposit_1401Page> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList1 = fcubs.loadDataFromExcel(CashDeposit_1401Page.class, screenId);
		resultList1 = new ArrayList<>();

	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (CashDeposit_1401Page data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);
				
			/*	fcubs.LOVButton();
				fcubs.switchtosubscreensframe();
				driver.findElement(By.xpath("//label[contains(text(),'Account Number')]/following::input[1]")).sendKeys(data.getAccountnumber());
				driver.findElement(By.xpath("//label[contains(text(),'Branch Code')]/following::input[1]")).sendKeys(data.getBrachcode());
				fcubs.clickButtonByXpath("//button[@class='BTNtext']");
				fcubs.clickButtonByXpath("//a[contains(text(),'Account Number')]/following::tbody[1]//tr[1]");*/
				
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__UI_TXN_ACC", data.getAccountnumber());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__OFFSETAMTI", data.getTrasnactionamount());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__OFFSETCCY", data.getCurrency1());


				fcubs.clickButtonById("BLK_TRANSACTION_DETAILS__BTN_PICKUP");
				fcubs.popupalert();//frames need to adde here
				fcubs.switchTab1("Denomination");
				fcubs.switchtosubscreensframe();
				fcubs.clickButtonById("BLK_DENOMINATION_SE__DEFAULT");
				fcubs.clickBtnOk();
				fcubs.switchframes();
				fcubs.clickSave();
				fcubs.closeOverridePopUp1();
				fcubs.switchframes();
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__ASSIGNTO", data.getUserid());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__MAKREM", data.getTellerremark());
				fcubs.clickButtonById("BLK_TRANSACTION_DETAILS__ASSIGN");
				fcubs.assignframe();
				fcubs.clickBtnOk();
				try {
					errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
					System.out.println("Error Message  " + errorMsg);
					data.setTestCaseResult(errorMsg);
					resultList1.add(data);
					continue;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				data.setTestCaseResult("SUCCESS");
				resultList1.add(data);
				// on successful save action confirm and close window for next test case
				/*driver.switchTo().parentFrame();
				driver.switchTo().frame("ifr_AlertWin");*/
				
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
			for(CashDeposit_1401Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}


}
