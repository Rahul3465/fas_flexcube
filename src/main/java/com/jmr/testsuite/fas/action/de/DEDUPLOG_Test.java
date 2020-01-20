package com.jmr.testsuite.fas.action.de;

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
import com.jmr.testsuite.fas.page.de.DEDUPLOG_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDUPLOG_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "DEDUPLOG";
	private final String screenName = "Journal Batch Upload Logs";

	private List<DEDUPLOG_Page> dataList;
	private List<DEDUPLOG_Page> resultList;

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = fcubs.loadDataFromExcel(DEDUPLOG_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
	public void executeTestCase() throws Exception {
		for (DEDUPLOG_Page data : dataList) {
			try{
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickEnterQuery();
					fcubs.populateTextById("BLK_MASTER__SOURCE_CODE", data.getSourceCode()); // Source Code
					fcubs.populateTextById("BLK_MASTER__BATCH_NO", data.getBatchNumber()); // Batch Number
					fcubs.populateTextById("BLK_MASTER__BRANCH_CODE", data.getBranchCode()); // Branch Code
					//fcubs.populateTextById("BLK_MASTER__CURR_NOI", data.getCurrentNumber()); // Current Number
					fcubs.clickExecuteQuery();
					//fcubs.clickAuthorize();

					try {
						fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						continue;
					} catch (Exception ex) {
						ex.printStackTrace();
						System.out.println("no Error found test case passed");
					}
					fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for next test case
					fcubs.closeInfoPopUp();
					fcubs.closeScreen();
				} 
			}catch (Exception ex) {
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
		for (DEDUPLOG_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}

