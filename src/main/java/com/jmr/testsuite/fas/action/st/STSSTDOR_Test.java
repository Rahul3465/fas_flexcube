package com.jmr.testsuite.fas.action.st;

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
import com.jmr.testsuite.fas.page.st.STSSTDOR_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class STSSTDOR_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "STSSTDOR";
	private final String screenName="Dormancy parameter Summary";

	private List<STSSTDOR_Page> dataList;
	private List<STSSTDOR_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(STSSTDOR_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
		
		public void executeTestCase() throws Exception {
			
			for (STSSTDOR_Page data : dataList) {
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.selectDropdownByText("BLK_STATUS__AUTHSTAT", data.getAuthorsestauts());
					fcubs.selectDropdownByText("BLK_STATUS__TXNSTAT", data.getRecordstatus());
					fcubs.populateTextById("BLK_STATUS__CUST_AC_NO", data.getCustomeracc());
					fcubs.populateTextById("BLK_STATUS__BRANCH_CODE", data.getBranchcode());
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
		//fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (STSSTDOR_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
