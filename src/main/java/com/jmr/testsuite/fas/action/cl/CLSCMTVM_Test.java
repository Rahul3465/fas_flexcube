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
import com.jmr.testsuite.fas.page.cl.CLSCMTVM_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class CLSCMTVM_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "CLSCMTVM";
	private final String screenName="Commitment Summary";

	private List<CLSCMTVM_Page> dataList1;
	private List<CLSCMTVM_Page> resultList1;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList1 = xlsReader.read(CLSCMTVM_Page.class, new File(AppConfig.testFileLocation), 4);
		resultList1 = new ArrayList<>();
		
	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (CLSCMTVM_Page data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);

				
				fcubs.populateTextById("BLK_SUMMARY__ACCNOVAMD", data.getAccountnumber());
				fcubs.populateTextById("BLK_SUMMARY__APPLNO", data.getApplicatnme());
				fcubs.populateTextById("BLK_SUMMARY__PRD", data.getProduct());
				fcubs.populateTextById("BLK_SUMMARY__VALDTI", data.getValuedate());
				fcubs.populateTextById("BLK_SUMMARY__AMTI", data.getAmt());
				
				
				fcubs.selectDropdownByText("BLK_SUMMARY__CONTSTAT",data.getAccountstatus());
				fcubs.selectDropdownByText("BLK_SUMMARY__AUTHSTAT",data.getAuthorisedstatus());
				
				
				fcubs.populateTextById("BLK_SUMMARY__BRNVAMD", data.getBranch());
				fcubs.populateTextById("BLK_SUMMARY__CUSTID", data.getCustid());
				fcubs.populateTextById("BLK_SUMMARY__ALTACCNO", data.getAlternateaccno());
				fcubs.populateTextById("BLK_SUMMARY__MATDTI", data.getMaturitydate());
				fcubs.populateTextById("BLK_SUMMARY__CCY", data.getCcy());
				fcubs.selectFlag("Search", data.getSearch());
				
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
			for(CLSCMTVM_Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}



}
