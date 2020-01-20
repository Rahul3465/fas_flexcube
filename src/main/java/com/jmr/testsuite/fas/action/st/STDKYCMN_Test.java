package com.jmr.testsuite.fas.action.st;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.fas.page.st.STDKYCMN_Page;

import io.github.millij.poi.ss.reader.XlsxReader;
@ContextConfiguration(classes = SpringConfiguration.class)

public class STDKYCMN_Test extends AbstractTestNGSpringContextTests{
	@Autowired
	private WebDriver driver;
	private WebDriverWait driverWait;
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	private String testCaseId;

	private String errorMsg = "";

	@Autowired
	private ScreenShotUtil screenShotUtil;

	private List<STDKYCMN_Page> dataList;
	private List<STDKYCMN_Page> resultList;
	private final String screenId = "STDKYCMN";
	private final String screenName = "KYC Maintenance";


	private String actualResult;

	@Test(priority = 0)
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();	
		dataList = fcubs.loadDataFromExcel(STDKYCMN_Page.class, screenId);
		resultList = new ArrayList<>();
	}

	@Test(priority = 1)
	public void executeTestCase() throws Exception {
		for (STDKYCMN_Page data : dataList) {

			try {
				this.testCaseId = data.getTestCaseID();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					fcubs.clickNew();
					fcubs.populateTextById("BLK_KYCMASTER__KYCDESC", data.getFullName());
					fcubs.selectDropdownByText("BLK_KYCMASTER__KYCCUSTTYPE", data.getKycCustomerType());
					fcubs.populateTextById("BLK_KYCMASTER__RISKLVL", data.getRiskLevel());						
					
					if(data.getKycCustomerType() == "Retail Customer")
					{
					fcubs.clickButtonById("CVS_RETAIL");
					fcubs.switchToFrameByTitle("KYC Retail Profile");										
					//
					fcubs.populateTextById("BLK_KYCRETAIL__DECLARED", data.getDeclaredRet());
					fcubs.selectFlag("BLK_KYCRETAIL__RESIDNT", data.getResidentRet());
					fcubs.selectFlag("BLK_KYCRETAIL__PEP", data.getPoliticallyExposedPersonRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PEPRMKS", data.getPepRemarksRet());
					
					fcubs.populateTextById("BLK_KYCRETAIL__LCLADDR", data.getLocalAddressRet());
					fcubs.populateTextById("BLK_KYCRETAIL__LOCAL_ADDR_COUNTRY", data.getCountryRet());
					fcubs.populateTextById("BLK_KYCRETAIL__HMCNTRYADR", data.getHomeCountryAddressRet());
					fcubs.populateTextById("BLK_KYCRETAIL__HOME_ADDR_COUNTRY", data.getHomeCountryRet());
					fcubs.selectFlag("BLK_KYCRETAIL__US_RES_STATUS", data.getPermanentUSResidenceStatusRet());
					fcubs.selectFlag("BLK_KYCRETAIL__VST_US_PREV", data.getVisitedUSinThreeYrsRet());
					
					fcubs.populateTextById("BLK_KYCRETAIL__NATIONLTY", data.getNationalityRet());
					fcubs.populateTextById("BLK_KYCRETAIL__BRTHPLC", data.getBirthPlaceRet());
					fcubs.populateTextById("BLK_KYCRETAIL__BIRTH_COUNTRY", data.getBirthCountryRet());
					fcubs.populateTextById("BLK_KYCRETAIL__BRTHDTI", data.getBirthDateRet());
					fcubs.populateTextById("BLK_KYCRETAIL__OFF_TEL_ISD_NOI", data.getOfficeIsdCodeRet());
					fcubs.populateTextById("BLK_KYCRETAIL__OFCTELNO", data.getOfficeNumberRet());
					fcubs.populateTextById("BLK_KYCRETAIL__RES_TEL_ISD_NOI", data.getResidenceIsdCodeRet());
					fcubs.populateTextById("BLK_KYCRETAIL__RESTELNO", data.getResidenceNumberRet());
					fcubs.populateTextById("BLK_KYCRETAIL__MOB_ISD_NOI", data.getMobileIsdCodeRet());
					fcubs.populateTextById("BLK_KYCRETAIL__MOBTELNO", data.getMobileNumberRet());
					fcubs.populateTextById("BLK_KYCRETAIL__FAX_ISD_NOI", data.getFaxIsdRet());
					fcubs.populateTextById("BLK_KYCRETAIL__FAXNO", data.getFaxNumberRet());
					fcubs.populateTextById("BLK_KYCRETAIL__ACCPRPS", data.getPurposeAccOpeningRet());
					
					fcubs.populateTextById("BLK_KYCRETAIL__ACCTYPE", data.getAccountTypeRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PASPRTNO", data.getPassportNumberRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PASPRTEXPDTI", data.getPassportExpiryDateRet());
					fcubs.populateTextById("BLK_KYCRETAIL__VISANO", data.getVisaNumberRet());
					fcubs.populateTextById("BLK_KYCRETAIL__VISAEXPDTI", data.getVisaExpiryDateRet());
					fcubs.populateTextById("BLK_KYCRETAIL__KYCCCY", data.getKycAmountCurrencyRet());
					
					fcubs.selectFlag("BLK_KYCRETAIL__PAGIVN", data.getPotRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PA_HOLDER_NAME", data.getPotHolderNameRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PA_HOLDER_NATIONALTY", data.getPotNationalityRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PA_HOLDER_ADDRESS", data.getPotAddressRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PA_HOLDER_ADDR_COUNTRY", data.getPotCountryRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PA_HOLDER_TEL_ISDI", data.getPotTelIsdCodeRet());
					fcubs.populateTextById("BLK_KYCRETAIL__PA_HOLDER_TEL_NO", data.getPotTelNumberRet());
					
					fcubs.clickButtonById("cmdAddRow_BLK_BFNOWNCMP");
					fcubs.populateTextById("BLK_BFNOWNCMP__CMPNAME", data.getCompanyNameRet());
					fcubs.populateTextById("BLK_BFNOWNCMP__LOCATION", data.getLocationRet());
					fcubs.populateTextById("BLK_BFNOWNCMP__HOLDNGI", data.getPercentHoldingRet());
					fcubs.populateTextById("BLK_BFNOWNCMP__ANNLINCMI", data.getAnnualIncomeRet());
					fcubs.populateTextById("BLK_BFNOWNCMP__BUSSLINE", data.getLineOfBusinessRet());
					
					fcubs.selectFlag("BLK_KYCRETAIL__SALRYINC", data.getSalaryRet());
					fcubs.selectFlag("BLK_KYCRETAIL__RENTALINC", data.getRentalRet());
					fcubs.selectFlag("BLK_KYCRETAIL__INVSTINC", data.getInvestmentRet());
					fcubs.selectFlag("BLK_KYCRETAIL__BUSSINC", data.getBusinessConcernRet());
					fcubs.selectFlag("BLK_KYCRETAIL__PRFBUSINC", data.getProfessionalBusinessRet());
					fcubs.selectFlag("BLK_KYCRETAIL__OVRSINC", data.getOverseasPropertyRet());					
					fcubs.populateTextById("BLK_KYCRETAIL__TTLINCI", data.getTotalIncomeRet());
					fcubs.populateTextById("BLK_KYCRETAIL__TTLNTWORTHI", data.getTotalNetWorthRet());
					
					fcubs.clickButtonById("cmdAddRow_BLK_RELCMPACC");
					fcubs.populateTextById("BLK_RELCMPACC__CMPACC", data.getCompanyAccNumberRet());
					
					fcubs.clickButtonById("cmdAddRow_BLK_PRSNLACC");
					fcubs.populateTextById("BLK_PRSNLACC__PRSNLACC", data.getPersonalAccNumberRet());
					
					fcubs.populateTextById("BLK_KYCRETAIL__KYCCOMMNT", data.getKycRet());
					fcubs.populateTextById("BLK_KYCRETAIL__SSOCMMNT", data.getSalesServiceRet());
					fcubs.populateTextById("BLK_KYCRETAIL__APRVRCMNT", data.getApproversRet());
					
					fcubs.clickBtnOk();				
					
					
					
					
					
					} else if (data.getKycCustomerType() == "Corporate Customer"){
						fcubs.clickButtonById("CVS_CRP");
						fcubs.switchToFrameByTitle("KYC Corporate Profile");
						
						fcubs.populateTextById("BLK_CORPORT__GRPNAME", data.getGroupsNameCorp());
						fcubs.populateTextById("BLK_CORPORT__PRNCOMPCNTRY", data.getParentCompanyNameCorp());
						fcubs.populateTextById("BLK_CORPORT__CMPNYTYPE", data.getTypeCompanyCorp());
						
						fcubs.populateTextById("BLK_CORPORT__ACCPRPS", data.getPurposeAccountCorp());
						
						fcubs.populateTextById("BLK_CORPORT__BUSNSNATURE", data.getNatureBusinessCorp());
						fcubs.populateTextById("BLK_CORPORT__PRDTRADE", data.getProductTradedCorp());
						fcubs.populateTextById("BLK_CORPORT__FNDSSRC", data.getMainSourceFundsCorp());
						fcubs.selectFlag("BLK_CORPORT__BRRWACCGRP", data.getIsaborrowingAccountGroupCorp());
						fcubs.populateTextById("BLK_CORPORT__ANNLTRNOVRI", data.getAnnualTurnoverCorp());
						
						fcubs.clickButtonById("cmdAddRow_BLK_CRPKEYPRSON");
						
						fcubs.populateTextById("BLK_CRPKEYPRSON__KYCID", data.getKycIDCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__NAME", data.getNameCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__POSTNORTITL", data.getPositionCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__RELTONSHP", data.getRelationshipCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__NATNALTY", data.getNationalityCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__ADDRESS", data.getAddressCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__ADDRESS_COUNTRY", data.getCountryCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__ISD_CODEI", data.getIsdCodeCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__TEL_NO", data.getTelephoneNumberCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__TIN", data.getTaxIDCorp());
						fcubs.populateTextById("BLK_CRPKEYPRSON__SHARHOLDNGI", data.getSharePercentCorp());
						
						fcubs.populateTextById("BLK_CORPORT__LCLABROADBRN", data.getDetailsOfCompanyBranchCorp());
						fcubs.populateTextById("BLK_CORPORT__EMPLYNOI", data.getNumberOfEmployeesCorp());
						fcubs.populateTextById("BLK_CORPORT__SLRYMODE", data.getModeOfSalaryCorp());
						
						fcubs.clickButtonById("cmdAddRow_BLK_CRPSUPPLER");
						
						fcubs.populateTextById("BLK_CRPSUPPLER__SUPPLRNAME", data.getSupplierNameCorp());
						fcubs.populateTextById("BLK_CRPSUPPLER__COUNTRES", data.getSupplierCountryCorp());
						fcubs.populateTextById("BLK_CRPSUPPLER__SETTLMNTMOD", data.getSupplierSettlementModeCorp());
						
						fcubs.clickButtonById("cmdAddRow_BLK_CRPCLIENT");
						fcubs.populateTextById("BLK_CRPCLIENT__CLIENTNAME", data.getClientNameCorp());
						fcubs.populateTextById("BLK_CRPCLIENT__COUNTRES", data.getClientCountryCorp());
						fcubs.populateTextById("BLK_CRPCLIENT__PAYMODE", data.getClientPaymentModeCorp());
						
						fcubs.clickButtonById("cmdAddRow_BLK_TXNDETL");
						fcubs.populateTextById("BLK_TXNDETL__TXNDETL", data.getTransactionTypeCorp());
						fcubs.populateTextById("BLK_TXNDETL__MAXCOUNTI", data.getTansactionCountCorp());
						fcubs.populateTextById("BLK_TXNDETL__TTLAMTI", data.getTransactionTotalAmountCorp());
						fcubs.populateTextById("BLK_TXNDETL__SNGLMXAMTI", data.getTransactionMaxSingleAmountCorp());
						fcubs.populateTextById("BLK_TXNDETL__PURPOSE", data.getTransactionPurposeCorp());
						fcubs.populateTextById("BLK_TXNDETL__COUNTRES", data.getTransactionCountryCorp());
						fcubs.populateTextById("BLK_TXNDETL__COUNTRYPRPS", data.getFundTransferPurposeCorp());
						
						
						fcubs.populateTextById("BLK_CORPORT__AUDITDATEI", data.getAuditDateCorp());
						fcubs.selectFlag("BLK_CORPORT__ACCSLOCTED", data.getAccountSolicitedCorp());
						fcubs.populateTextById("BLK_CORPORT__ACCSLOCTDDTI", data.getAccountSolicitedDateCorp());
						fcubs.populateTextById("BLK_CORPORT__INTRODRDTL", data.getIntroducerDetailCorp());
						fcubs.populateTextById("BLK_CORPORT__CMPLNCECLRNCEI", data.getComplianceClearanceCorp());
						fcubs.populateTextById("BLK_CORPORT__BUSNSAPPRVLI", data.getBusinessApprovalCorp());
						fcubs.populateTextById("BLK_CORPORT__TRDLICNCNO", data.getTradeLicenseNumberCorp());
						fcubs.populateTextById("BLK_CORPORT__KYCNXTRVWDTI", data.getKycNextReviewDateCorp());
						fcubs.populateTextById("BLK_CORPORT__KYCCMMENTS", data.getKycCorp());
						fcubs.populateTextById("BLK_CORPORT__SSOCMMENTS", data.getSalesServiceOfficerCorp());
						fcubs.populateTextById("BLK_CORPORT__APPRVRCMMENTS", data.getApproversCorp());
						
						fcubs.clickBtnOk();
						
						
						
						
					} else {
						fcubs.clickButtonById("CVS_FIN");
						fcubs.switchToFrameByTitle("Account Financial Details");
						
						fcubs.populateTextById("BLK_KYCFINCL__BNKADDR", data.getBankAddressFin());
						fcubs.populateTextById("BLK_KYCFINCL__COUNTRY", data.getCountryFin());
						
						fcubs.clickButtonById("cmdAddRow_BLK_TXNPRDCT");
						fcubs.populateTextById("BLK_TXNPRDCT__TXNPRDCT", data.getTransactionProductsFin());
						fcubs.populateTextById("BLK_TXNPRDCT__RATING", data.getRatingFin());
						fcubs.populateTextById("BLK_TXNPRDCT__NOTXNMNTHLYI", data.getMonthlyNumberOfTransactionsFin());
						fcubs.populateTextById("BLK_TXNPRDCT__MNTHLYAMTI", data.getMonthlyAmountFin());
						
						fcubs.clickButtonById("cmdAddRow_BLK_MGMNTDTL");
						fcubs.populateTextById("BLK_MGMNTDTL__NAME", data.getMgmntNameFin());
						fcubs.populateTextById("BLK_MGMNTDTL__DESIGNATN", data.getMgmntDesginationFin());
						
						fcubs.clickButtonById("cmdAddRow_BLK_SHAREHOLDRS");
						fcubs.populateTextById("BLK_SHAREHOLDRS__NAME", data.getShareholderNameFin());
						fcubs.populateTextById("BLK_SHAREHOLDRS__HOLDINGI", data.getShareholderHoldingFin());
						fcubs.populateTextById("BLK_SHAREHOLDRS__ADDRESS", data.getShareholderAddressFin());
						fcubs.populateTextById("BLK_SHAREHOLDRS__CITY", data.getShareholderCityFin());
						fcubs.populateTextById("BLK_SHAREHOLDRS__COUNTRY", data.getShareholderCountryFin());
						
						fcubs.clickBtnOk();
					
					}
					fcubs.clickSave();											

					
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
		for (STDKYCMN_Page data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}
