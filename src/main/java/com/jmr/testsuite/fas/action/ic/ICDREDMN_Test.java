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
import com.jmr.testsuite.fas.page.ic.ICDREDMN_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class ICDREDMN_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "ICDREDMN";
	private final String screenName = "Term Deposits Redemption Input";

	private List<ICDREDMN_Page> dataList;
	private List<ICDREDMN_Page> resultList;

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		//dataList1 = xlsReader.read(ICDRDSIM.class, new File(AppConfig.testFileLocation), 16);
		dataList = fcubs.loadDataFromExcel(ICDREDMN_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test()
	public void executeTestCase() throws Exception {
		for (ICDREDMN_Page data : dataList) {
			try{
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickNew();
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_MASTER__ACC_NO", data.getTermDepositAccNumber());
					fcubs.clickButtonById("BLK_ICTMS_TDREDMPAYOUT_MASTER__ACTION_FLAG2");
					fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__ACTION_FLAG", data.getRollover());
					fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__ACTION_FLAG3", data.getTenorModification());
					fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__ADDFUNDS", data.getAddFunds());
					fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__WAIVE_INTEREST", data.getWaiveInterest());
					try{
						fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_MASTER__REDEMPTION_MODE", data.getRedemptionMode());
						fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_MASTER__REDEMPTION_AMTI", data.getRedemptionAmount());
					}catch(Exception e){}
					fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__WAVE_PENALTY", data.getWaivePenalty());
					fcubs.clickButtonById("BLK_ICTMS_TDREDMPAYOUT_MASTER__BTN_COMPUTE"); // Click on Compute
					try
					{
						fcubs.closeInfoPopUp();
					}catch(Exception e){}
					fcubs.clickButtonById("cmdAddRow_BLK_ICTMS_TDREDMPAYOUT_DETAILS"); // Add row in Payout section
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDM_PAYOUT_COMP", data.getPayoutComponent());
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PAYOUTTYPE", data.getPayoutType1());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PERCENTAGEI", data.getPayoutPercentage1());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDMAMTI", data.getPayoutRedemptionAmount());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__OFFSET_ACC", data.getPayoutOffsetAccount1());
					try{
						fcubs.LOVDataNew("//label[text()=' Account Number']//following::input[1]", "//label[text()=' Account Number']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getPayoutOffsetAccount1(), data.getPayoutOffsetBranch1());
						fcubs.switchToActiveFrame();}catch(Exception e){}
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__NARRATIVE", data.getNarrative1());
					fcubs.clickButtonById("cmdAddRow_BLK_ICTMS_TDREDMPAYOUT_DETAILS");
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDM_PAYOUT_COMPRC1", data.getPayoutComponent());
					fcubs.selectDropdownByText("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PAYOUTTYPERC1", data.getPayoutType2());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__PERCENTAGEIRC1", data.getPayoutPercentage2());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__REDMAMTIRC1", data.getPayoutRedemptionAmount());
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__OFFSET_ACCRC1", data.getPayoutOffsetAccount2());
					try{
						fcubs.LOVDataNew("//label[text()=' Account Number']//following::input[1]", "//label[text()=' Account Number']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getPayoutOffsetAccount2(), data.getPayoutOffsetBranch2());
						fcubs.switchToActiveFrame();}catch(Exception e){}
					fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_DETAILS__NARRATIVERC1", data.getNarrative2());
					try{
						if(data.getTdPayoutDetails().equalsIgnoreCase("Yes"))
						{
							fcubs.clickButtonByXpath("//a[contains(text(),'TD Payout Details')]");
							fcubs.switchtosubscreensframe();
							fcubs.switchTab("Counterparty Details");
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_PC__PCBANKCODE", data.getCounterpartyBankCode());
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_PC__PCOFFSET_ACC", data.getCounterpartyAccount());
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_PC__BENFNAME", data.getBeneficiaryName());
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_PC__BENFADD1", data.getAddressLine1());
							fcubs.clickBtnOk();
							fcubs.switchToActiveFrame();
						}
					}catch(Exception e){}

					try{
						if(data.getPayoutType1().equalsIgnoreCase("Term deposit")){
							fcubs.clickButtonByXpath("//a[contains(text(),'TD Payout Details')]");
							fcubs.switchtosubscreensframe();
							fcubs.switchTab("Term deposit");
							fcubs.clickButtonById("BLK_ICTBS_REDEM_BY_TD__DEFTFROM2");	// Click Account Class
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_TD__ACCOUNT_CLASS", data.getAccountclass());
							fcubs.clickButtonById("BLK_ICTBS_REDEM_BY_TD__BTNPOPULATE");
							fcubs.clickBtnOk();
							fcubs.switchToActiveFrame();
						}
					}
					catch(Exception e){}

					try{
						if(data.getPayoutType1().equalsIgnoreCase("Bank's Cheque")||data.getPayoutType1().equalsIgnoreCase("Demand Draft")){
							fcubs.clickButtonByXpath("//a[contains(text(),'TD Payout Details')]");
							fcubs.switchtosubscreensframe();
							fcubs.switchTab("Instrument Details");
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_BC__BANKCODE", data.getBankCode());
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_BC__CHQ_DATEI", data.getChequeDate());
							fcubs.populateTextById("BLK_ICTBS_REDEM_BY_BC__PAYBRN", data.getBranch());
							fcubs.clickBtnOk();
							fcubs.switchToActiveFrame();
						}
					}
					catch(Exception e){}

					try{
						if(data.getRollover().equalsIgnoreCase("Yes"))
						{
							fcubs.clickButtonById("cmdAddRow_BLK_REDEM_PAYIN_DTLS"); //Add row in PayIn Section
							fcubs.selectDropdownByText("BLK_REDEM_PAYIN_DTLS__MMPAYOPT", data.getPayInOption1());
							fcubs.populateTextById("BLK_REDEM_PAYIN_DTLS__MMPERCENTI", data.getPercentagePayInOption1());
							fcubs.populateTextById("BLK_REDEM_PAYIN_DTLS__MMTDAMTI", data.getAmountPayInOption1());
							fcubs.populateTextById("BLK_REDEM_PAYIN_DTLS__MMOFFACC", data.getOffsetAccountPayInOption1());
							try{
								fcubs.LOVDataNew("//label[text()=' Account']//following::input[1]", "//label[text()=' Account']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getOffsetAccountPayInOption1(), data.getOffsetbranchPayInOption1());
								fcubs.switchToActiveFrame();}catch(Exception e){}

							fcubs.clickButtonById("cmdAddRow_BLK_REDEM_PAYIN_DTLS");   //Add another row in PayIn Section
							fcubs.selectDropdownByText("BLK_REDEM_PAYIN_DTLS__MMPAYOPTRC1", data.getPayInOption2());
							fcubs.populateTextById("BLK_REDEM_PAYIN_DTLS__MMPERCENTIRC1", data.getPercentagePayInOption2());
							fcubs.populateTextById("BLK_REDEM_PAYIN_DTLS__MMTDAMTIRC1", data.getAmountPayInOption2());
							fcubs.populateTextById("BLK_REDEM_PAYIN_DTLS__MMOFFACCRC1", data.getOffsetAccountPayInOption2());
							try{
								fcubs.LOVDataNew("//label[text()=' Account']//following::input[1]", "//label[text()=' Account']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//label[text()=' Branch Code']//following::input[1]", "//button[contains(text(),'Fetch')]", "//div[@id='LovDiv']//tr[1]//td[2]//div[1]", data.getOffsetAccountPayInOption2(), data.getOffsetbranchPayInOption2());
								fcubs.switchToActiveFrame();}catch(Exception e){}

							fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__ROLL_TENOR_PREF", data.getAccountClassTenor());
							fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__ROLL_TENOR_PREF2", data.getAccountTenor());
							fcubs.selectFlag("BLK_ICTMS_TDREDMPAYOUT_MASTER__ROLL_TENOR_PREF3", data.getIndependentTenor());
							fcubs.populateTextById("BLK_ICTMS_TDREDMPAYOUT_MASTER__TENOR_YYI", data.getTenorYears());
						}

					}catch(Exception e){}
					//fcubs.clickSave();
					try
					{
						fcubs.closeInfoPopUp();
					}catch(Exception e){}

					fcubs.closeScreen();
					//					fcubs.closeConfirmaPopUp();
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
					// fcubs.closeInfoPopUp();
					// fcubs.closeScreen();
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
		for (ICDREDMN_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
