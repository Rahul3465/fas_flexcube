package com.jmr.testsuite.fas.action.td;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.common.UIFormatException;
import com.jmr.testsuite.fas.page.td.STDCUSTD_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class STDCUSTD_Test extends AbstractTestNGSpringContextTests
{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	private String errorMsg = "";

	private final String screenId = "STDCUSTD";
	private final String screenName="Deposit Account Booking";
	private final String userDefinedElementId = "TAX_RATE";
	private String testCaseId;

	private List<STDCUSTD_Page> dataList;
	private List<STDCUSTD_Page> resultList;
	private List<String> authList;
	private HashMap<String, String> auth1;
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;


	@PostConstruct
	public void initSetup() throws Exception {
		multiEntryElementIdText = new ArrayList<>();
		multiEntryElementValueText = new ArrayList<>();
		multiEntryElementType = new ArrayList<>();
		authList = new ArrayList<>();
		auth1 = new HashMap<String, String>();
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		//dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(STDCUSTD_Page.class, screenId);
		resultList = new ArrayList<>();

	}

	@Test
	public void executeTestCase() throws UIFormatException, Exception {

		for (STDCUSTD_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunmode().equalsIgnoreCase("Yes") || data.getRunmode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickNew();
					fcubs.populateTextById("BLK_CUST_ACCOUNT__CUSTNO", data.getCustomerNo());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ACCLS", data.getAccountClass());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__CCY", data.getTermDepositCurrency());
					fcubs.clickButtonById("BLK_CUST_ACCOUNT__BTN_ACCPKP");
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
								multiEntryElementType);
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						// to update the status as failed
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {

					}
					fcubs.populateTextById("BLK_TDDETAILS__TDAMTI", data.getTermDepositAmount());
					fcubs.populateTextById("BLK_TDDETAILS__DEPTENORYEAR", data.getDepositTenorYear());
					fcubs.populateTextById("BLK_TDDETAILS__DEPTENORDAY", data.getDepositTenorDays());
					fcubs.populateTextById("BLK_TDDETAILS__DEPTENORMON", data.getDepositTenorMonth());
					fcubs.selectFlag("BLK_TDDETAILS__AUTOROLL", data.getAutoRollover());
					fcubs.selectFlag("BLK_TDDETAILS__CLONMAT", data.getCloseonMaturity());
					fcubs.selectFlag("BLK_TDDETAILS__MOVINTUNCLM", data.getMoveInteresttoUnclaimed());
					fcubs.selectFlag("BLK_TDDETAILS__MOVPRIUNCLM", data.getMovePrincipaltoUnclaimed());
					fcubs.selectRadioBtn("ACCTYPE", data.getAccountType());
					fcubs.selectDropdownByText("BLK_CUST_ACCOUNT__OPMODE", data.getModeofOperation());

					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);
					// MultiEntry Data of PayIn Details starts
					multiEntryElementType.add("select");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__MMPAYOPT");
					multiEntryElementValueText.add(data.getTermDepositPayInOption());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__MMPERCENTAGEI");
					multiEntryElementValueText.add(data.getPayinPercentage());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__MMTDAMTI");
					multiEntryElementValueText.add(data.getPayinAmount());

					multiEntryElementType.add("lov");
					multiEntryElementIdText
					.add("//tr[row]//td[6]//div[1]//button[1]:1:2:BLK_TDPAYINDETAILS__MMOFFSETACC");
					multiEntryElementValueText.add(data.getPayinOffsetAccount());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__CHQ_INSTRUMENTNO");
					multiEntryElementValueText.add(data.getPayinChequeInstrumentNo());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__PAYINCLGPRD");
					multiEntryElementValueText.add(data.getPayinClearingType());

					multiEntryElementType.add("date");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__PAYINCHQDATEI");
					multiEntryElementValueText.add(data.getPayinChequeDate());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__DRAWEE_AC_NO");
					multiEntryElementValueText.add(data.getPayinDraweeAccountNumber());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYINDETAILS__ROUTINGNO");
					multiEntryElementValueText.add(data.getPayinRoutingNo());

					// Perform Multi-Entry record action
					fcubs.MultiEntryFieldById("cmdAddRow_BLK_TDPAYINDETAILS", "", multiEntryElementType,
							multiEntryElementIdText, multiEntryElementValueText);
					// mandate to clear all data of Payin Details post
					// processing
					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);
					// MultiEntry Data of PayIn Details ends

					// Multientry fields
					multiEntryElementType.add("select");
					multiEntryElementIdText.add("BLK_TDPAYOUTDETAILS__PAYOUTTYPE");
					multiEntryElementValueText.add(data.getPayoutType());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYOUTDETAILS__PERCENTAGEI");
					multiEntryElementValueText.add(data.getPayoutPercentage());

					multiEntryElementType.add("lov");
					multiEntryElementIdText.add("//tr[row]//td[5]//div[1]//button[1]:1:4:BLK_TDPAYOUTDETAILS__OFFACC");
					multiEntryElementValueText.add(data.getPayoutOffsetAccount());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_TDPAYOUTDETAILS__NARRATIVE");
					multiEntryElementValueText.add(data.getPayoutNarrative());

					multiEntryElementType.add("select");
					multiEntryElementIdText.add("BLK_TDPAYOUTDETAILS__PAYOUTCOMP");
					multiEntryElementValueText.add(data.getPayoutComponent());

					// Perform Multi-Entry record action
					fcubs.MultiEntryFieldById("cmdAddRow_BLK_TDPAYOUTDETAILS", "", multiEntryElementType,
							multiEntryElementIdText, multiEntryElementValueText);
					// mandate to clear all data of Payout Details post
					// processing
					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);
					fcubs.selectFlag("BLK_TDDETAILS__AUTOPAY", data.getAutoPaymentTakedown());
					fcubs.selectFlag("BLK_TDDETAILS__MOVTOUNCLM", data.getMoveMaturitiestoUnclaimed());
					fcubs.populateTextById("BLK_TDDETAILS__PAYBRN", data.getPaymentBranch());
					fcubs.populateTextById("BLK_TDDETAILS__PAYACC", data.getPaymentAccounts());

					fcubs.populateTextById("BLK_TDDETAILS__RDAMTI", data.getInstalmentAmount());
					fcubs.selectFlag("BLK_TDDETAILS__FUNDONOVD", data.getMovefundsonOverdraft());
					fcubs.populateTextById("BLK_TDDETAILS__RDFREDAYI", data.getInstallmentFrequencyDays());
					fcubs.populateTextById("BLK_TDDETAILS__RDFREMTHI", data.getInstallmentFrequencyMonths());
					fcubs.populateTextById("BLK_TDDETAILS__RDFREYEARI", data.getInstallmentFrequencyYears());
					fcubs.selectDropdownByText("BLK_CUST_ACCOUNT__SWPTYPE", data.getSweepType());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__MASTERACC", data.getMasterAccountNumber());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ADESC", data.getAccountDescription());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__COUNTRY_CODE", data.getCountryCode());
					fcubs.populateDateField("BLK_CUST_ACCOUNT__ACCOPENDTI", data.getAccountOpenDate());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ALTACC", data.getAlternateAccountNumber());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__CLRBNKCD", data.getClearingBankCode());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ADDR1", data.getAddress());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__LOC", data.getLocation());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__MEDIA", data.getMedia());

					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);
					fcubs.switchTab("Nominee");
					// Click add button of Nomiee Multi-entry data
					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__NAM");
					multiEntryElementValueText.add(data.getName());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__DOBI");
					multiEntryElementValueText.add(data.getdOB());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__RELSHIP");
					multiEntryElementValueText.add(data.getRelationship());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__NADDR1");
					multiEntryElementValueText.add(data.getAddress1());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__GUARDNAM");
					multiEntryElementValueText.add(data.getGuardianName());

					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__GUARDRELNSHP");
					multiEntryElementValueText.add(data.getGuardianRelationship());

					multiEntryElementType.add("flag");
					multiEntryElementIdText.add("BLK_ACC_NOMINEES__NOMMINOR");
					multiEntryElementValueText.add(data.getMinor());
					// Perform Multi-Entry record action
					fcubs.MultiEntryFieldById("", "//*[@id=\"MESV_BLK_ACC_NOMINEES\"]/button[3]", multiEntryElementType,
							multiEntryElementIdText, multiEntryElementValueText);
					// mandate to clear all data of Nomiee processing
					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);

					fcubs.openChildScreenByTitle("Rollover Details");
					fcubs.selectRadioBtn("ROLLTYPE", data.getRolloverType());
					fcubs.selectRadioBtn("ROLLTENORPREF", data.getRolloverTenor());
					fcubs.populateTextById("BLK_TDDETAILS__ROLLAMTI", data.getRolloverAmount());
					fcubs.populateTextById("BLK_TDDETAILS__ROLLTENORYEARSI", data.getRolloverTenorYears());
					fcubs.populateTextById("BLK_TDDETAILS__ROLLTENORMONTHSI", data.getRolloverTenorMonths());
					fcubs.populateTextById("BLK_TDDETAILS__ROLLTENORDAYSI", data.getRolloverTenorDays());
					fcubs.closeChildScreen();

					// fcubs.switchToFrameByTitle(screenName);
					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);
					fcubs.openChildScreenByTitle("Joint Holders");
					multiEntryElementType.add("text");
					multiEntryElementIdText.add("BLK_JOINTHOLDERS__JNTHLDCDE");
					multiEntryElementValueText.add(data.getJointHolderCustomerNo());

					multiEntryElementType.add("select");
					multiEntryElementIdText.add("BLK_JOINTHOLDERS__JNTHLDTYP");
					multiEntryElementValueText.add(data.getJointHolderType());

					multiEntryElementType.add("date");
					multiEntryElementIdText.add("BLK_JOINTHOLDERS__START_DATEI");
					multiEntryElementValueText.add(data.getStartDate());

					multiEntryElementType.add("date");
					multiEntryElementIdText.add("BLK_JOINTHOLDERS__END_DATEI");
					multiEntryElementValueText.add(data.getEndDate());
					// Perform Multi-Entry record action
					fcubs.MultiEntryFieldById("cmdAddRow_BLK_JOINTHOLDERS", "", multiEntryElementType,
							multiEntryElementIdText, multiEntryElementValueText);
					// mandate to clear all data of Joint Holders processing
					fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
							multiEntryElementType);
					fcubs.closeChildScreen();

					// fcubs.switchToFrameByTitle(screenName);

					fcubs.openChildScreenByTitle("TD Payout Details");
					fcubs.populateTextById("BLK_TDDETAILSFPO__CUSTNO", data.gettDPayoutDetailTermDepositCustomerNo());
					fcubs.selectRadioBtn("DFTFROM", data.getDefaultFrom());
					fcubs.populateTextById("BLK_TDDETAILSFPO__ACCLS", data.gettDPayoutDetailTermDepositAccountClass());
					if (fcubs.validInput(data.gettDPayoutDetailTermDepositPopulate())
							&& data.gettDPayoutDetailTermDepositPopulate().equalsIgnoreCase("Yes"))
						fcubs.clickButtonById("BLK_TDDETAILSFPO__BTNPOPULATE");
					try{
						fcubs.closeInfoPopUp();
						fcubs.switchToActiveFrame();
					}catch(Exception e){}

					fcubs.switchTab("Bankers Cheque / Demand Draft");
					fcubs.populateTextById("BLK_BCPAYOUT__BANKCODE", data.getBankCode());
					fcubs.populateTextById("BLK_BCPAYOUT__PAYBRN", data.getPayableBranch());
					fcubs.populateTextById("BLK_BCPAYOUT__BENFNAME", data.getBeneficiary());
					fcubs.populateTextById("BLK_BCPAYOUT__OTHERDETS", data.getPassportICNumber());
					fcubs.populateTextById("BLK_BCPAYOUT__NARRATIVE", data.getBankerChequeNarrative());
					fcubs.populateTextById("BLK_BCPAYOUT__BENFADD1", data.getBankerChequeBeneficiaryAddress());

					fcubs.switchTab("PC");
					fcubs.populateTextById("BLK_PCPAYOUT__PCBANKCODE", data.getCounterpartyBankcode());
					fcubs.populateTextById("BLK_PCPAYOUT__PCOFFSET_ACC", data.getCounterpartyAccount());
					fcubs.populateTextById("BLK_PCPAYOUT__BENFNAME", data.getBeneficiaryName());
					fcubs.populateTextById("BLK_PCPAYOUT__OTHERDETS", data.getPassport());
					fcubs.populateTextById("BLK_PCPAYOUT__NARRATIVE", data.getNarrative());
					fcubs.populateTextById("BLK_PCPAYOUT__BENFADD1", data.getBeneficiaryAddress());
					fcubs.closeChildScreen();

					// fcubs.switchToFrameByTitle(screenName);
					fcubs.openChildScreenByTitle("Interest");
					fcubs.populateTextById("BLK_INTDETAILS__BOOKACC", data.getInterestBookingAccount());
					fcubs.populateTextById("", data.getEffectivedate());
					fcubs.populateTextById("", data.getWaive());
					//fcubs.nw("",userDefinedElementId);
					fcubs.closeChildScreen();

					fcubs.openChildScreenByTitle("MIS");
					fcubs.populateTextById("BLK_MISDETAILS__POOLCD", data.getPoolCode());
					fcubs.closeChildScreen();
					//fcubs.selectDropdownByText("BLK_CUST_ACCOUNT__PAYINBYCHQ", data.getPayInOption());
					fcubs.clickSave();
					fcubs.closeRemarkPopUp();

					try{
						fcubs.closeOverridePopUp();
					}catch (Exception e){}
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText,
								multiEntryElementType);
						// to update the status as failed
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					data.setTestCaseResult("SUCCESS");
					// to update the status as success
					/*fcubs.saveAuthKeyDetails(testCaseId, "BLK_CUST_ACCOUNT__ACC", "BLK_CUST_ACCOUNT__BRN");// this

					authList.add(testCaseId + "~" + fcubs.getFieldValue("BLK_CUST_ACCOUNT__ACC")); // input for
																									// authorize*/

					// auth1.put(testCaseId,fcubs.getFieldValue("BLK_CUST_ACCOUNT__ACC"));

					resultList.add(data);
					fcubs.closeInfoPopUp();
					fcubs.closeScreen();


					try {
						fcubs.checkUIFormatError();
					}
					catch (Exception ex){
						System.out.println("Record exists");
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
					// fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for next test case
					try{
						fcubs.closeInfoPopUp();}catch(Exception e){}
					try{fcubs.closeScreen();}catch(Exception e){}

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
		//		fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (STDCUSTD_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
