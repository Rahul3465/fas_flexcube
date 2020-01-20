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
import com.jmr.testsuite.fas.page.FXPurchaseWalkin_8004_Page;
import com.jmr.testsuite.fas.page.cl.CLDCMTMT_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class FXPurchaseWalkin_8004_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "8004";
	private final String screenName="FX Purchase Walk in : Branch Date 2019-03-01";

	private List<FXPurchaseWalkin_8004_Page> dataList1;
	private List<FXPurchaseWalkin_8004_Page> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList1 = fcubs.loadDataFromExcel(FXPurchaseWalkin_8004_Page.class, screenId);
		resultList1 = new ArrayList<>();

	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (FXPurchaseWalkin_8004_Page data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);

				
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__TXNCCY", data.getCurrencybought());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__OFFSETCCY", data.getCurrenctsold());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__TXNAMTI", data.getAmountbought());
				
				
				/*fcubs.switchTab1("FX Denomination Details");
				fcubs.switchtosubscreensframe();
				fcubs.clickButtonById("BLK_DENOMINATION_FXSE__DEFAULT");
				fcubs.clickBtnOk();
				fcubs.switchframes();*/
				
				
				fcubs.openChildScreenByTitle("FX Denomination Details");
				fcubs.clickButtonById("BLK_DENOMINATION_FXSE__DEFAULT");
				fcubs.closeChildScreen();
				fcubs.switchToActiveFrame();
				
				fcubs.clickButtonById("BLK_TRANSACTION_DETAILS__BTN_RECALC");
				fcubs.popupalert();//frames need to adde here
				
				/*fcubs.switchTab1("Denomination");
				fcubs.switchtosubscreensframe();
				Thread.sleep(3000);
				fcubs.clickButtonByXpath("//button[text()='Populate']");
				fcubs.clickBtnOk();
				fcubs.switchframes();*/
				
				
				fcubs.openChildScreenByTitle("Denomination");
				Thread.sleep(3000);
				fcubs.clickButtonByXpath("//button[text()='Populate']");
				fcubs.closeChildScreen();
				
				fcubs.switchToActiveFrame();
				
				
				fcubs.clickSave();
				try {
					fcubs.closeOverridePopUp1();
					fcubs.switchframes();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
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
			for(FXPurchaseWalkin_8004_Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}


}
