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
import com.jmr.testsuite.fas.page.cl.CLDADOCH_Page;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CLDADOCH_Test extends AbstractTestNGSpringContextTests{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	
	@Autowired
	private ScreenShotUtil screenShotUtil;
	private String errorMsg = "";

	private final String screenId = "CLDADOCH";
	private final String screenName="Ad-hoc Charges";

	private List<CLDADOCH_Page> dataList;
	private List<CLDADOCH_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CLDADOCH_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (CLDADOCH_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
				
					fcubs.clickNew();

					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__ACCNO", data.getAccountnumber());
					
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__CRACC", data.getCreditaccount());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__CHGTYPE", data.getChargetype());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__REASON", data.getReason());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__CCY", data.getCurrency());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__AMTI", data.getAmount());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__EXCHRTI", data.getExchangerate());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__COMPCCYEQI", data.getComponentccyequipment());
					fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__ORGEXCHRATEI", data.getOrginalexchangerate());
					fcubs.LOVData("//body/div[@id='DIVWNDContainer']/div[@id='DIVScrContainer']/div[@id='ResTree']/div[@id='DIVMainTmp']/div[@id='mainTabContainer']/div[@id='TBLPageTAB_MAIN']/div[@id='TAB_MAIN__SEC_MAIN']/div[@id='TAB_MAIN__SEC_MAIN__PAR_MAIN']/fieldset[@id='TAB_MAIN__SEC_MAIN__PAR_MAIN__FST_CHARGE']/div[4]/button[1]/span[1]", "//label[text()=' Component Name']//following::input[1]","//label[text()=' Component Name']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getComponet());
					try{
						fcubs.switchToActiveFrame();
					}catch(Exception e) {
						System.out.println("no such frame exists");
					}
					
					fcubs.clickSave();
					try {
						fcubs.closeInfoPopUp();
						}
						catch(Exception ex) {
							System.out.println("No Remark popup exists");
						}
					
					
					if (data.getDelete().equalsIgnoreCase("Yes")) {
						
					}
					
					if(data.getReverse().equalsIgnoreCase("Yes")) {
						fcubs.clickButtonByXpath(" //a[contains(text(),'Reverse')]");
						fcubs.closeConfirmaPopUp();
						fcubs.closeInfoPopUp();
					}
					
					if(data.getCopy().equalsIgnoreCase("Yes")) {
						
						fcubs.clickButtonByXpath("//a[contains(text(),'Copy')]");
						fcubs.populateTextById("BLK_CLVWS_ADHOC_CHARGES__AMTI", data.getCopyamount());
						fcubs.clickSave();

					}

					
					fcubs.closeScreen();
					
					// added to close remark screen/alert
				//	fcubs.closeRemarkPopUp(); 
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
		//fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (CLDADOCH_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
