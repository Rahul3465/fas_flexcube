package com.jmr.testsuite.fas.action.de;

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

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.de.DEDUPONL_Page;

import io.github.millij.poi.ss.reader.XlsxReader;
import java.util.concurrent.TimeUnit;
@ContextConfiguration(classes = SpringConfiguration.class)
public class DEDUPON_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "DEDUPONL";
	private final String screenName = "Journal Batch Upload";

	private List<DEDUPONL_Page> dataList;
	private List<DEDUPONL_Page> resultList;

	private String testCaseId;
	public WebDriver driver;
	
	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		//dataList1 = xlsReader.read(ICDRDSIM.class, new File(AppConfig.testFileLocation), 16);
		dataList = fcubs.loadDataFromExcel(DEDUPONL_Page.class, screenId);
		resultList = new ArrayList<>();

	}
	
	@Test
	public void executeTestCase() throws Exception {
		for (DEDUPONL_Page data : dataList) {
			try{
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickNew();
					fcubs.populateTextById("BLK_UPLOAD_MASTER__SOURCE_CODE", data.getSourceCode()); // Source Code
					//fcubs.populateTextById("BLK_UPLOAD_MASTER__BATCH_NO", data.getBatchNumber()); // Batch Number
					fcubs.selectFlag("BLK_UPLOAD_MASTER__POSITION_REQD", data.getPositionRequired()); // Branch Code
					fcubs.selectFlag("BLK_UPLOAD_MASTER__DRCRCHK", data.getCreditDebitCheck()); // Credit Debit Check
					fcubs.populateTextById("BLK_UPLOAD_MASTER__CUSVARIANCEI", data.getVariance()); // Variance
					fcubs.selectFlag("BLK_UPLOAD_MASTER__IGNORE_OVERRIDES", data.getIgnoreOverrides()); // Ignore Overrides
					fcubs.clickButtonById("BLK_UPLOAD_MASTER__BTN_VALIDATE");//Validate Button
					try{
						fcubs.defaultframe();
						fcubs.closeInfoPopUp();
						fcubs.switchToActiveFrame();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
						fcubs.closeInfoPopUp();
					}
					catch(Exception e)
					{
						
					}
					fcubs.clickSave();

					/*					if(data.getDeleteButton().equalsIgnoreCase("Yes")){
						fcubs.clickButton("");	
					}
					 */					

					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseID());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					// fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for
					// next test case
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
		for (DEDUPONL_Page data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
