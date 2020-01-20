package com.jmr.testsuite.fas.action.st;

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
import com.jmr.testsuite.fas.page.st.CustomerReview360_STDRETVW_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class STDRETVW_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";
	private WebDriver driver;

	private final String screenId = "STDRETVW";
	private final String screenName = "360 Degree Retail Customer View";

	private List<CustomerReview360_STDRETVW_Page> dataList1;
	private List<CustomerReview360_STDRETVW_Page> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList1 = xlsReader.read(CustomerReview360_STDRETVW_Page.class, new File(AppConfig.testFileLocation), 20);
		resultList1 = new ArrayList<>();
		
	}
	
	@Test()
	public void executeTestCase() throws Exception {
		
		for (CustomerReview360_STDRETVW_Page data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);
				
			
				fcubs.clickEnterQuery();
				fcubs.populateTextById("BLK_QUERY__CUSTOMER_NO", data.getCustomernumber());
				fcubs.clickExecuteQuery();
				fcubs.selectFlag("BLK_QUERY__BTN_REPORTS", data.getReport());
				
				if(data.getReport().equalsIgnoreCase("Yes")) {
					Thread.sleep(4000);
					fcubs.reportscreen("//h1[@class='WNDtitletxt']");
					driver.findElement(By.id("BTN_OK")).click();
					driver.switchTo().parentFrame();
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
			for(CustomerReview360_STDRETVW_Page data:resultList1) {
				System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
			}
		}

}
