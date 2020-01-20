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
import com.jmr.testsuite.fas.page.st.STSCUSTD_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class STSCUSTD_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "STSCUSTD";
	private final String screenName="Deposit Account Summary";

	private List<STSCUSTD_Page> dataList;
	private List<STSCUSTD_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(STSCUSTD_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
		
		public void executeTestCase() throws Exception {
			
			for (STSCUSTD_Page data : dataList) {
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.selectDropdownByText("BLK_ICVW_TD_CUST__AUTHSTAT", data.getAuthorsestauts());
					fcubs.selectDropdownByText("BLK_ICVW_TD_CUST__TXNSTAT", data.getRecordstatus());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__CUST_NO", data.getCustomernumber());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__BRN", data.getBranch());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__ACC", data.getTdaccountnumber());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__AC_DESC", data.getAccountdescrption());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__CCY", data.getTdcurrency());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__STOCK_CATLOG_CD", data.getStockcatalogycode());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__CERTIFICATE_NOI", data.getCertificatenumber());
					fcubs.populateTextById("BLK_ICVW_TD_CUST__MATURITY_DATEI", data.getMaturitydate());

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
		fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (STSCUSTD_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
