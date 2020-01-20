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
import com.jmr.testsuite.fas.page.ic.ICDRDSIM_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class ICDRDSIM_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "ICDRDSIM";
	private final String screenName = "Redemption Simulation Screen";

	private List<ICDRDSIM_Page> dataList;
	private List<ICDRDSIM_Page> resultList;

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		//dataList1 = xlsReader.read(ICDRDSIM.class, new File(AppConfig.testFileLocation), 16);
		dataList = fcubs.loadDataFromExcel(ICDRDSIM_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
	public void executeTestCase() throws Exception {
		for (ICDRDSIM_Page data : dataList) {
			try{
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickNew();

					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_MASTER__ACC_NO", data.getAccountNumber());
					fcubs.clickButtonById("BLK_ICTMS_TDREDMPAYOUT_MASTER__BTN_P");				// populate button
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_MASTER__REDEMPTION_MODE", data.getRedemptionMode());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_MASTER__REDEMPTION_AMTI", data.getRedemptionAmount());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_MASTER__REDMN_EXEC_DATEI", data.getRedemptionExecutionDate());
					fcubs.clickButtonById("BLK_ICTMS_TDREDMPAYOUT_MASTER__BTN_COMPUTE"); 		// compute button
					fcubs.clickButtonById("BLK_DEPO_DET_AFTER_REDMN__BTN_REDEEMDEPO"); 			// redeem deposit button
					fcubs.clickButtonById("cmdAddRow_BLK_ICTMS_TDREDMPAYOUT_DETAILS"); 			// Add Row in Payout section
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDM_PAYOUT_COMP", data.getPayOutComponent());
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PAYOUTTYPE", data.getPayOutType1());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PERCENTAGEI", data.getPercentage1());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDMAMTI", data.getRedemptionAmountInPayOut1());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__OFFSET_ACC", data.getOffsetAccount1());
					try{
						fcubs.LOVDataNew("//label[text()=' Account Number']//following::input[1]", "//label[text()=' Account Number']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getOffsetAccount1(), data.getPaymentBranch1());
						fcubs.switchToActiveFrame();}catch(Exception e){}
					fcubs.clickButtonById("cmdAddRow_BLK_ICTMS_TDREDMPAYOUT_DETAILS");
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDM_PAYOUT_COMPRC1", data.getPayOutComponent());
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PAYOUTTYPERC1", data.getPayOutType2());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PERCENTAGEIRC1", data.getPercentage2());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDMAMTIRC1", data.getRedemptionAmountInPayOut2());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__OFFSET_ACCRC1", data.getOffsetAccount2());
					try{
						fcubs.LOVDataNew("//label[text()=' Account Number']//following::input[1]", "//label[text()=' Account Number']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getOffsetAccount2(), data.getPaymentBranch2());
						fcubs.switchToActiveFrame();}catch(Exception e){}

					if(data.getPayOutType1().equalsIgnoreCase("Term deposit")){
						fcubs.clickButtonByXpath("//a[contains(text(),'TD Payout Details')]");
						fcubs.switchtosubscreensframe();
						fcubs.switchTab("Term deposit");
						fcubs.clickButtonById("BLK_ICTBS_REDEM_BY_TD__DEFTFROM2");			// Click Account Class
						fcubs.populateTextById("BLK_ICTBS_REDEM_BY_TD__ACCOUNT_CLASS", data.getAccountclass());
						fcubs.clickButtonById("BLK_ICTBS_REDEM_BY_TD__BTNPOPULATE");
						fcubs.clickBtnOk();
						fcubs.switchToActiveFrame();
					}

					if(data.getPayOutType1().equalsIgnoreCase("Bank's Cheque") || data.getPayOutType1().equalsIgnoreCase("Demand Draft")){
						fcubs.clickButtonByXpath("//a[contains(text(),'TD Payout Details')]");
						fcubs.switchtosubscreensframe();
						fcubs.switchTab("Instrument Details");
						fcubs.populateTextById("BLK_ICTBS_REDEM_BY_BC__BANKCODE", data.getBankCode());
						fcubs.populateTextById("BLK_ICTBS_REDEM_BY_BC__CHQ_DATEI", data.getChequeDate());
						fcubs.populateTextById("BLK_ICTBS_REDEM_BY_BC__PAYBRN", data.getBranch());
						fcubs.clickBtnOk();
						fcubs.switchToActiveFrame();
					}

					fcubs.clickSave();
					try
					{
						fcubs.closeInfoPopUp();
					}catch(Exception e){}
					
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
		//		fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (ICDRDSIM_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}