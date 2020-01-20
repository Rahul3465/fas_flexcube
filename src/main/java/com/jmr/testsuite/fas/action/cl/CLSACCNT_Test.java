package com.jmr.testsuite.fas.action.cl;

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
import com.jmr.testsuite.fas.page.cl.CLSACCNT_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CLSACCNT_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "CLSACCNT";
	private final String screenName="Account Summary";

	private List<CLSACCNT_Page> dataList1;
	private List<CLSACCNT_Page> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList1 = xlsReader.read(CLSACCNT_Page.class, new File(AppConfig.testFileLocation), 1);
		resultList1 = new ArrayList<>();
		
	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (CLSACCNT_Page data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);

				
				fcubs.populateTextById("BLK_SMRY__BRN", data.getBranch());
				fcubs.populateTextById("BLK_SMRY__ACCNO", data.getAccountnumber());
				fcubs.populateTextById("BLK_SMRY__CUSTID", data.getCustid());
				fcubs.populateTextById("BLK_SMRY__VALDTI", data.getValuedate());
				fcubs.populateTextById("BLK_SMRY__CCY", data.getCcy());
				
				
				fcubs.selectDropdownByText("BLK_SMRY__CONTSTATS",data.getAccountstatus());
				fcubs.selectDropdownByText("BLK_SMRY__AUTHSTATS",data.getAuthorisedstatus());
				
				
				fcubs.populateTextById("BLK_SMRY__BOOK_DATEI", data.getBookdate());
				fcubs.populateTextById("BLK_SMRY__PRD", data.getProduct());
				fcubs.populateTextById("BLK_SMRY__ALTACCNO", data.getAlteaccno());
				fcubs.populateTextById("BLK_SMRY__PRIMARY_APPLICANT_NAME", data.getCustomername());
				fcubs.populateTextById("BLK_SMRY__MATDTI", data.getMaturitydate());
				fcubs.populateTextById("BLK_SMRY__AMTFINANCED", data.getAmtfinanced());
				fcubs.populateTextById("BLK_SMRY__USRDEFSTAT", data.getUserdefstatus());
				fcubs.populateTextById("BLK_SMRY__USER_REF_NO", data.getUserefnum());
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
			for(CLSACCNT_Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}


}
