package com.jmr.testsuite.fas.action.st;

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
import com.jmr.testsuite.fas.page.TopUp_STDTDTOPpage;
import com.jmr.testsuite.fas.page.st.STDAMBLK_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class STDTDTOP_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "STDTDTOP";
	private final String screenName = "Top-Up of Term Deposit";

	private List<TopUp_STDTDTOPpage> dataList;
	private List<TopUp_STDTDTOPpage> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(TopUp_STDTDTOPpage.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (TopUp_STDTDTOPpage data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
				
					fcubs.clickNew();
					
					fcubs.populateTextById("BLK_TDTOPUP_DETAIL__ACC", data.getAccountnumber());
					fcubs.clickButtonById("BLK_TDTOPUP_DETAIL__BTN_POPULATE");
					fcubs.closeInfoPopUp();
					
					
					fcubs.populateTextById("BLK_TDTOPUP_DETAIL__TOPUP_AMOUNTI",data.getTopupamt());
					
					
					fcubs.populateTextById("BLK_TDTOPUP_DETAIL__TOPUP_VALUE_DATEI", data.getValuedate());
					fcubs.clickButtonByXpath("//span[@class='ICOadd']");
					fcubs.selectDropdownByText("BLK_TDTOPUP_PAYIN__MULTIMODE_PAYOPT", data.getPayinoption());
					fcubs.populateTextById("BLK_TDTOPUP_PAYIN__MULTIMODE_PERCENTAGEI", data.getPercentage());
					fcubs.populateTextById("BLK_TDTOPUP_PAYIN__MULTIMODE_TDAMOUNTI", data.getAmount());
					fcubs.populateTextById("BLK_TDTOPUP_PAYIN__MULTIMODE_TDOFFSET_ACC", data.getOffsetaccount());

					
					fcubs.clickSave();
				
					try {
					fcubs.closeRemarkPopUp(); 
					}
					catch(Exception ex) {
						System.out.println("No remark pop up exists");
					}
					
					try {
						fcubs.closeOverridePopUp(); 
						}
						catch(Exception ex) {
							System.out.println("No remark pop up exists");
						}
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
		for (TopUp_STDTDTOPpage data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
