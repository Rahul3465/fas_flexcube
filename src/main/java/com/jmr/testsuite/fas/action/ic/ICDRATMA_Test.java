package com.jmr.testsuite.fas.action.ic;

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
import com.jmr.testsuite.fas.page.ic.ICDRATMA_Page;
import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class ICDRATMA_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "ICDRATMA";
	private final String screenName= "Interest & Charges Rate Input";

	private List<ICDRATMA_Page> dataList;
	private List<ICDRATMA_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(ICDRATMA_Page.class, screenId);
		resultList = new ArrayList<>();
	}
	
	@Test()
	public void executeTestCase() throws Exception {

		for (ICDRATMA_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickNew();
					fcubs.selectFlag("EnterQuery", data.getEnterQuery());
					fcubs.populateTextById("BLK_ICTMSRATEDEF__BRANCHCODE", data.getBranchCode());
					fcubs.populateTextById("BLK_ICTMSRATEDEF__CCYCODE", data.getCurrencyCode());
					fcubs.populateTextById("BLK_ICTMSRATEDEF__RATECODE", data.getRateCode());
					fcubs.clickButtonById("cmdAddRow_BLK_ICTMSRATES");
					fcubs.populateTextById("BLK_ICTMSRATES__EFFDTI", data.getEffectiveDate());
					fcubs.populateTextById("BLK_ICTMSRATES__RATEI", data.getRate());
					fcubs.selectFlag("BLK_ICTMSRATES__RECRDSTAT", data.getOpen());
					fcubs.selectFlag("ExecuteQuery", data.getExecuteQuery());
					fcubs.selectFlag("Save", data.getSave());
					try {
					fcubs.closeInfoPopUp();
					}
					catch (Exception ex){
						System.out.println("Record exists");
					}
					fcubs.closeScreen();
					try{
						fcubs.closeConfirmaPopUp();
					}catch(Exception e){}
					
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
				//	fcubs.closeInfoPopUp();
				//	fcubs.closeScreen();

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
		//fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (ICDRATMA_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
