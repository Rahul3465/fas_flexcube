package com.jmr.testsuite.fas.action.cl;

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
import com.jmr.testsuite.fas.page.cl.CLDCMTMT_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CLDCMTMT_Test extends AbstractTestNGSpringContextTests{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "CLDCMTMT";
	private final String screenName="Commitment Account Details";

	private List<CLDCMTMT_Page> dataList;
	private List<CLDCMTMT_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CLDCMTMT_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (CLDCMTMT_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
				
					fcubs.clickNew();
				
					fcubs.populateTextById("BLK_ACCOUNT_MASTER__PROD", data.getProduct());
					
					if(data.getMaintab().equalsIgnoreCase("Yes")) {
											
						fcubs.switchTab("Main");
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__CUSTID", data.getCustid());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__CCY", data.getCcy());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__AMTFINANCEDI", data.getAmtfinanced());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__VALDTI", data.getValuedate());
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__BTN_DEFAULT", data.getProductdefault());
						try {
						fcubs.closeOverridePopUp();
						}
						catch(Exception ex) {
							System.out.println("No Override popup exists");
						}
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__NOOFINSI", data.getNumberofinstallment());
						fcubs.selectDropdownByText("BLK_ACCOUNT_MASTER__FREQUNIT", data.getUnit());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__FREQI", data.getFrequency());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__INSSTDTI", data.getInstallmentstartdate());
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__BTN_EDITUDE", data.getEditudedetail());
					//	fcubs.clearField("BLK_UDE_VALS__UDEVALIRC1", data.getInterestrate());
						fcubs.populateTextById("BLK_UDE_VALS__UDEVALIRC1", data.getUserdefinterestvalue());
						
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__BTN_ENRICH", data.getEnrich());
						
						try {
							fcubs.closeOverridePopUp();
						}catch(Exception e) {
							System.out.println("override pop up");
						}
					}
				
					
					fcubs.clickSave();
				
					// added to close remark screen/alert
					fcubs.closeOverridePopUp();
					
					
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					//fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for next test case
					fcubs.closeInfoPopUp();
					fcubs.closeScreen();

					data.setTestCaseResult("SUCCESS");
				}
			} catch (Exception ex) {
				errorMsg = fcubs.checkUIFormatError();
				if (fcubs.validInput(errorMsg)) {
					data.setTestCaseResult(errorMsg);
				} else if (fcubs.validInput(ex.getMessage())) {
					data.setTestCaseResult(ex.getMessage());
				}
				ex.printStackTrace();
				resultList.add(data);
				// to update the status as failed
				// fcubs.updateTestCaseExecutionAsFailed();
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
		for (CLDCMTMT_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
