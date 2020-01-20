package com.jmr.testsuite.fas.action.up;

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
import com.jmr.testsuite.fas.page.BillPaymentQuery_UPDQUERYpage;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;
import com.jmr.testsuite.fas.page.st.CustomerReport_STRCUSRPpage;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class UPDQUERY_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "STRCUSRP";
	private final String screenName = "360 Degree Customer Report";

	private List<BillPaymentQuery_UPDQUERYpage> dataList1;
	private List<BillPaymentQuery_UPDQUERYpage> resultList1;
	
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList1 = xlsReader.read(BillPaymentQuery_UPDQUERYpage.class, new File(AppConfig.testFileLocation), 7);
		resultList1 = new ArrayList<>();
		
	}
	
	
	@Test()
	public void executeTestCase() throws Exception {

		
		for (BillPaymentQuery_UPDQUERYpage data : dataList1) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);
				
			fcubs.clickButtonByXpath("//a[contains(text(),'Enter Query')]");
			fcubs.populateTextById("BLK_UPVWS_TRANSACTION_DETAILS__FCCREF", data.getContractrefno());
			fcubs.clickButtonByXpath("//a[contains(text(),'Execute Query')]");
			try {
				errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
				System.out.println("Error Message  " + errorMsg);
				data.setTestCaseResult(errorMsg);
				resultList1.add(data);
				continue;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
				fcubs.closeScreen();
				
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
		for(BillPaymentQuery_UPDQUERYpage data:resultList1) {
			System.out.println(data.getTestCaseId()+"\t"+data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
