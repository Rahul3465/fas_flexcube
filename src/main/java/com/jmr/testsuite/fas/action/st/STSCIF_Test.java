package com.jmr.testsuite.fas.action.st;

import java.io.File;
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
import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.fas.page.st.STSCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class STSCIF_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	
	@Autowired
	private ScreenShotUtil screenShotUtil;

	private String errorMsg = "";

	private final String screenId = "STSCIF";
	private final String screenName="Customer Summary";

	private List<STSCIF_Page> dataList;
	private List<STSCIF_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(STSCIF_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
		
		public void executeTestCase() throws Exception {
			
			for (STSCIF_Page data : dataList) {
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.selectDropdownByText("BLK_CUSTOMER_QUERY__AUTHSTAT", data.getAuthorsestauts());
					fcubs.selectDropdownByText("BLK_CUSTOMER_QUERY__TXNSTAT", data.getRecordstatus());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__CUSTNO", data.getCustomernumber());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__CTYPE", data.getType());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__CUSTNAME", data.getCustomername());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__SHORTNAME", data.getShortname());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__CCATEGORY", data.getCustomercategory());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__NATIONALITY", data.getNationality());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__COUNTRY", data.getCountry());
					fcubs.populateTextById("BLK_CUSTOMER_QUERY__LBRN", data.getBranchcode());

					fcubs.clickSearchButton();
					
					try {
					fcubs.clickButtonById("RSLT_CHKBOX0");
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
					
					if (data.getDelete().equalsIgnoreCase("Yes")) {
						fcubs.switchframes();
						fcubs.clickDelete();
						fcubs.closeConfirmaPopUp();
						
					}
				
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						resultList.add(data);
						continue;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
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
		for (STSCIF_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}



}
