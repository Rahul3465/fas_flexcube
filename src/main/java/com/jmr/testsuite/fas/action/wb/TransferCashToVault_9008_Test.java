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
import com.jmr.testsuite.fas.page.TransferCashToVault_9008_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class TransferCashToVault_9008_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "9008";
	private final String screenName="Transfer Cash from Vault : Branch Date.*";

	private List<TransferCashToVault_9008_Page> dataList1;
	private List<TransferCashToVault_9008_Page> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList1 = xlsReader.read(TransferCashToVault_9008_Page.class, new File(AppConfig.testFileLocation), 25);
		resultList1 = new ArrayList<>();
		
	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (TransferCashToVault_9008_Page data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen1(screenId);

				
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__TXNCCY", data.getTransferccy());
				fcubs.populateTextById("BLK_TRANSACTION_DETAILS__TXNAMTI", data.getTransferamt());
		
				fcubs.clickButtonById("BLK_TRANSACTION_DETAILS__BTN_P");
			
				
				fcubs.clickButtonById("BLK_DENOMINATION_SE__DEFAULT");
				
				
				
				fcubs.clickSave();
				fcubs.closeInfoPopUp();
			
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
			for(TransferCashToVault_9008_Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}

}
