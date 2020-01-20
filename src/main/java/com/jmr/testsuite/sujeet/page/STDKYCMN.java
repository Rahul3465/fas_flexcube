package com.jmr.testsuite.sujeet.page;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "STDKYCMN")
public class STDKYCMN {
	
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;
	
	@SheetColumn("Test Case Id")
	private String testCaseID;
	
	@SheetColumn("FULL_NAME")
	private String fullName;
	
	@SheetColumn("KYC_CUSTOMER_TYPE")
	private String kycCustomerType;
	
	@SheetColumn("KYC_Retail")
	private String kycretail;
	
	
	
	@SheetColumn("RISK_LEVEL")
	private String riskLevel;
	
	

	public String getKycretail() {
		return kycretail;
	}

	public void setKycretail(String kycretail) {
		this.kycretail = kycretail;
	}

	public String getTestCaseResult() {
		return testCaseResult;
	}

	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public String getTestCaseID() {
		return testCaseID;
	}

	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getKycCustomerType() {
		return kycCustomerType;
	}

	public void setKycCustomerType(String kycCustomerType) {
		this.kycCustomerType = kycCustomerType;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	
	

	
	//******************RETAIL CUSTOMER******************//
	@SheetColumn("DECLARED_RET")
	private String declaredRet;
	
	@SheetColumn("RESIDENT_RET")
	private String residentRet;
	
	@SheetColumn("POLITICALLY_EXPOSED_PERSON_RET")
	private String politicallyExposedPersonRet;
	
	@SheetColumn("PEP_REMARKS_RET")
	private String pepRemarksRet;
	
	@SheetColumn("LOCAL_ADDRESS_RET")
	private String localAddressRet;
		
	
	@SheetColumn("COUNTRY_RET")
	private String countryRet;
		
	
	@SheetColumn("HOME_COUNTRY_ADDRESS_RET")
	private String homeCountryAddressRet;
		
	
	@SheetColumn("HOME_COUNTRY_RET")
	private String homeCountryRet;
		
	
	@SheetColumn("PERMANENT_US_RES_STAT_RET")
	private String permanentUSResidenceStatusRet;
		
	
	@SheetColumn("VISITED_US_IN_3_YRS")
	private String visitedUSinThreeYrsRet;
		
	
	@SheetColumn("NATIONALITY_RET")
	private String nationalityRet;
	
	
	@SheetColumn("BIRTH_PLACE_RET")
	private String birthPlaceRet;
		
	
	@SheetColumn("BIRTH_COUNTRY_RET")
	private String birthCountryRet;
		
	
	@SheetColumn("BIRTH_DATE_RET")
	private String birthDateRet;
		
	
	@SheetColumn("OFFICE_ISD_CODE_RET")
	private String officeIsdCodeRet;
		
	
	@SheetColumn("OFFICE_NUMBER_RET")
	private String officeNumberRet;
		
	
	@SheetColumn("RESIDENCE_ISD_CODE_RET")
	private String residenceIsdCodeRet;
		
	
	@SheetColumn("RESIDENCE_NUMBER_RET")
	private String residenceNumberRet;
		
	
	@SheetColumn("MOBILE_ISD_CODE_RET")
	private String mobileIsdCodeRet;
		
	
	@SheetColumn("MOBILE_NUMBER_RET")
	private String mobileNumberRet;
		
	
	@SheetColumn("FAX_ISD_RET")
	private String faxIsdRet;
		
	
	@SheetColumn("FAX_NUMBER_RET")
	private String faxNumberRet;
		
	
	@SheetColumn("PURPOSE_ACC_OPENING_RET")
	private String purposeAccOpeningRet;
		
	
	@SheetColumn("ACCOUNT_TYPE_RET")
	private String accountTypeRet;
		
	
	@SheetColumn("PASSPORT_NUMBER_RET")
	private String passportNumberRet;
		
	
	@SheetColumn("PASSPORT_EXPIRY_DATE_RET")
	private String passportExpiryDateRet;
		
	
	@SheetColumn("VISA_NUMBER_RET")
	private String visaNumberRet;
		
	
	@SheetColumn("VISA_EXPIRY_DATE_RET")
	private String visaExpiryDateRet;
		
	
	@SheetColumn("KYC_AMOUNT_CURRENCY_RET")
	private String kycAmountCurrencyRet;
		
	
	@SheetColumn("POT_RET")
	private String potRet;
		
	
	@SheetColumn("POT_HOLDER_NAME_RET")
	private String potHolderNameRet;
		
	
	@SheetColumn("POT_NATIONALITY_RET")
	private String potNationalityRet;
		
	
	@SheetColumn("POT_ADDRESS_RET")
	private String potAddressRet;
		
	
	@SheetColumn("POT_COUNTRY_RET")
	private String potCountryRet;
		
	
	@SheetColumn("POT_TEL_ISD_CODE_RET")
	private String potTelIsdCodeRet;
		
	
	@SheetColumn("POT_TEL_NUM_RET")
	private String potTelNumberRet;
		
	
	@SheetColumn("COMPANY_NAME_RET")
	private String companyNameRet;
		
	
	@SheetColumn("LOCATION_RET")
	private String locationRet;
		
	
	@SheetColumn("PERCENT_HOLDING_RET")
	private String percentHoldingRet;
		
	
	@SheetColumn("ANNUAL_INCOME_RET")
	private String annualIncomeRet;
		
	
	@SheetColumn("LINE_OF_BUSINESS_RET")
	private String lineOfBusinessRet;
		
	
	@SheetColumn("SALARY_RET")
	private String salaryRet;
		
	
	@SheetColumn("RENTAL_RET")
	private String rentalRet;
		
	
	@SheetColumn("INVESTMENT_RET")
	private String investmentRet;
		
	
	@SheetColumn("BUSINESS_CONCERN_RET")
	private String businessConcernRet;
		
	
	@SheetColumn("PROFESSIONAL_BUSINESS_RET")
	private String professionalBusinessRet;
		
	
	@SheetColumn("OVERSEAS_PROPERTY_RET")
	private String overseasPropertyRet;
		
	
	@SheetColumn("TOTAL_INCOME_RET")
	private String totalIncomeRet;
		
	
	@SheetColumn("TOTAL_NET_WORTH_RET")
	private String totalNetWorthRet;
		
	
	@SheetColumn("COMPANY_ACC_NUMBER_RET")
	private String companyAccNumberRet;
		
	
	@SheetColumn("PERSONAL_ACC_NUMBER_RET")
	private String personalAccNumberRet;
		
	
	@SheetColumn("KYC_RET")
	private String kycRet;
		
	
	@SheetColumn("SALES_SERVICE_OFFICER")
	private String salesServiceRet;
		
	
	@SheetColumn("APPROVERS_RET")
	private String approversRet;
	
	
	
	
	
	public String getLocalAddressRet() {
		return localAddressRet;
	}

	public void setLocalAddressRet(String localAddressRet) {
		this.localAddressRet = localAddressRet;
	}

	public String getCountryRet() {
		return countryRet;
	}

	public void setCountryRet(String countryRet) {
		this.countryRet = countryRet;
	}

	public String getHomeCountryAddressRet() {
		return homeCountryAddressRet;
	}

	public void setHomeCountryAddressRet(String homeCountryAddressRet) {
		this.homeCountryAddressRet = homeCountryAddressRet;
	}

	public String getHomeCountryRet() {
		return homeCountryRet;
	}

	public void setHomeCountryRet(String homeCountryRet) {
		this.homeCountryRet = homeCountryRet;
	}

	public String getPermanentUSResidenceStatusRet() {
		return permanentUSResidenceStatusRet;
	}

	public void setPermanentUSResidenceStatusRet(String permanentUSResidenceStatusRet) {
		this.permanentUSResidenceStatusRet = permanentUSResidenceStatusRet;
	}

	public String getVisitedUSinThreeYrsRet() {
		return visitedUSinThreeYrsRet;
	}

	public void setVisitedUSinThreeYrsRet(String visitedUSinThreeYrsRet) {
		this.visitedUSinThreeYrsRet = visitedUSinThreeYrsRet;
	}

	public String getNationalityRet() {
		return nationalityRet;
	}

	public void setNationalityRet(String nationalityRet) {
		this.nationalityRet = nationalityRet;
	}

	public String getBirthPlaceRet() {
		return birthPlaceRet;
	}

	public void setBirthPlaceRet(String birthPlaceRet) {
		this.birthPlaceRet = birthPlaceRet;
	}

	public String getBirthCountryRet() {
		return birthCountryRet;
	}

	public void setBirthCountryRet(String birthCountryRet) {
		this.birthCountryRet = birthCountryRet;
	}

	public String getBirthDateRet() {
		return birthDateRet;
	}

	public void setBirthDateRet(String birthDateRet) {
		this.birthDateRet = birthDateRet;
	}

	public String getOfficeIsdCodeRet() {
		return officeIsdCodeRet;
	}

	public void setOfficeIsdCodeRet(String officeIsdCodeRet) {
		this.officeIsdCodeRet = officeIsdCodeRet;
	}

	public String getOfficeNumberRet() {
		return officeNumberRet;
	}

	public void setOfficeNumberRet(String officeNumberRet) {
		this.officeNumberRet = officeNumberRet;
	}

	public String getResidenceIsdCodeRet() {
		return residenceIsdCodeRet;
	}

	public void setResidenceIsdCodeRet(String residenceIsdCodeRet) {
		this.residenceIsdCodeRet = residenceIsdCodeRet;
	}

	public String getResidenceNumberRet() {
		return residenceNumberRet;
	}

	public void setResidenceNumberRet(String residenceNumberRet) {
		this.residenceNumberRet = residenceNumberRet;
	}

	public String getMobileIsdCodeRet() {
		return mobileIsdCodeRet;
	}

	public void setMobileIsdCodeRet(String mobileIsdCodeRet) {
		this.mobileIsdCodeRet = mobileIsdCodeRet;
	}

	public String getMobileNumberRet() {
		return mobileNumberRet;
	}

	public void setMobileNumberRet(String mobileNumberRet) {
		this.mobileNumberRet = mobileNumberRet;
	}

	public String getFaxIsdRet() {
		return faxIsdRet;
	}

	public void setFaxIsdRet(String faxIsdRet) {
		this.faxIsdRet = faxIsdRet;
	}

	public String getFaxNumberRet() {
		return faxNumberRet;
	}

	public void setFaxNumberRet(String faxNumberRet) {
		this.faxNumberRet = faxNumberRet;
	}

	public String getPurposeAccOpeningRet() {
		return purposeAccOpeningRet;
	}

	public void setPurposeAccOpeningRet(String purposeAccOpeningRet) {
		this.purposeAccOpeningRet = purposeAccOpeningRet;
	}

	public String getAccountTypeRet() {
		return accountTypeRet;
	}

	public void setAccountTypeRet(String accountTypeRet) {
		this.accountTypeRet = accountTypeRet;
	}

	public String getPassportNumberRet() {
		return passportNumberRet;
	}

	public void setPassportNumberRet(String passportNumberRet) {
		this.passportNumberRet = passportNumberRet;
	}

	public String getPassportExpiryDateRet() {
		return passportExpiryDateRet;
	}

	public void setPassportExpiryDateRet(String passportExpiryDateRet) {
		this.passportExpiryDateRet = passportExpiryDateRet;
	}

	public String getVisaNumberRet() {
		return visaNumberRet;
	}

	public void setVisaNumberRet(String visaNumberRet) {
		this.visaNumberRet = visaNumberRet;
	}

	public String getVisaExpiryDateRet() {
		return visaExpiryDateRet;
	}

	public void setVisaExpiryDateRet(String visaExpiryDateRet) {
		this.visaExpiryDateRet = visaExpiryDateRet;
	}

	public String getKycAmountCurrencyRet() {
		return kycAmountCurrencyRet;
	}

	public void setKycAmountCurrencyRet(String kycAmountCurrencyRet) {
		this.kycAmountCurrencyRet = kycAmountCurrencyRet;
	}

	public String getPotRet() {
		return potRet;
	}

	public void setPotRet(String potRet) {
		this.potRet = potRet;
	}

	public String getPotHolderNameRet() {
		return potHolderNameRet;
	}

	public void setPotHolderNameRet(String potHolderNameRet) {
		this.potHolderNameRet = potHolderNameRet;
	}

	public String getPotNationalityRet() {
		return potNationalityRet;
	}

	public void setPotNationalityRet(String potNationalityRet) {
		this.potNationalityRet = potNationalityRet;
	}

	public String getPotAddressRet() {
		return potAddressRet;
	}

	public void setPotAddressRet(String potAddressRet) {
		this.potAddressRet = potAddressRet;
	}

	public String getPotCountryRet() {
		return potCountryRet;
	}

	public void setPotCountryRet(String potCountryRet) {
		this.potCountryRet = potCountryRet;
	}

	public String getPotTelIsdCodeRet() {
		return potTelIsdCodeRet;
	}

	public void setPotTelIsdCodeRet(String potTelIsdCodeRet) {
		this.potTelIsdCodeRet = potTelIsdCodeRet;
	}

	public String getPotTelNumberRet() {
		return potTelNumberRet;
	}

	public void setPotTelNumberRet(String potTelNumberRet) {
		this.potTelNumberRet = potTelNumberRet;
	}

	public String getCompanyNameRet() {
		return companyNameRet;
	}

	public void setCompanyNameRet(String companyNameRet) {
		this.companyNameRet = companyNameRet;
	}

	public String getLocationRet() {
		return locationRet;
	}

	public void setLocationRet(String locationRet) {
		this.locationRet = locationRet;
	}

	public String getPercentHoldingRet() {
		return percentHoldingRet;
	}

	public void setPercentHoldingRet(String percentHoldingRet) {
		this.percentHoldingRet = percentHoldingRet;
	}

	public String getAnnualIncomeRet() {
		return annualIncomeRet;
	}

	public void setAnnualIncomeRet(String annualIncomeRet) {
		this.annualIncomeRet = annualIncomeRet;
	}

	public String getLineOfBusinessRet() {
		return lineOfBusinessRet;
	}

	public void setLineOfBusinessRet(String lineOfBusinessRet) {
		this.lineOfBusinessRet = lineOfBusinessRet;
	}

	public String getSalaryRet() {
		return salaryRet;
	}

	public void setSalaryRet(String salaryRet) {
		this.salaryRet = salaryRet;
	}

	public String getRentalRet() {
		return rentalRet;
	}

	public void setRentalRet(String rentalRet) {
		this.rentalRet = rentalRet;
	}

	public String getInvestmentRet() {
		return investmentRet;
	}

	public void setInvestmentRet(String investmentRet) {
		this.investmentRet = investmentRet;
	}

	public String getBusinessConcernRet() {
		return businessConcernRet;
	}

	public void setBusinessConcernRet(String businessConcernRet) {
		this.businessConcernRet = businessConcernRet;
	}

	public String getProfessionalBusinessRet() {
		return professionalBusinessRet;
	}

	public void setProfessionalBusinessRet(String professionalBusinessRet) {
		this.professionalBusinessRet = professionalBusinessRet;
	}

	public String getOverseasPropertyRet() {
		return overseasPropertyRet;
	}

	public void setOverseasPropertyRet(String overseasPropertyRet) {
		this.overseasPropertyRet = overseasPropertyRet;
	}

	public String getTotalIncomeRet() {
		return totalIncomeRet;
	}

	public void setTotalIncomeRet(String totalIncomeRet) {
		this.totalIncomeRet = totalIncomeRet;
	}

	public String getTotalNetWorthRet() {
		return totalNetWorthRet;
	}

	public void setTotalNetWorthRet(String totalNetWorthRet) {
		this.totalNetWorthRet = totalNetWorthRet;
	}

	public String getCompanyAccNumberRet() {
		return companyAccNumberRet;
	}

	public void setCompanyAccNumberRet(String companyAccNumberRet) {
		this.companyAccNumberRet = companyAccNumberRet;
	}

	public String getPersonalAccNumberRet() {
		return personalAccNumberRet;
	}

	public void setPersonalAccNumberRet(String personalAccNumberRet) {
		this.personalAccNumberRet = personalAccNumberRet;
	}

	public String getKycRet() {
		return kycRet;
	}

	public void setKycRet(String kycRet) {
		this.kycRet = kycRet;
	}

	public String getSalesServiceRet() {
		return salesServiceRet;
	}

	public void setSalesServiceRet(String salesServiceRet) {
		this.salesServiceRet = salesServiceRet;
	}

	public String getApproversRet() {
		return approversRet;
	}

	public void setApproversRet(String approversRet) {
		this.approversRet = approversRet;
	}

	public String getDeclaredRet() {
		return declaredRet;
	}

	public void setDeclaredRet(String declaredRet) {
		this.declaredRet = declaredRet;
	}

	public String getResidentRet() {
		return residentRet;
	}

	public void setResidentRet(String residentRet) {
		this.residentRet = residentRet;
	}

	public String getPoliticallyExposedPersonRet() {
		return politicallyExposedPersonRet;
	}

	public void setPoliticallyExposedPersonRet(String politicallyExposedPersonRet) {
		this.politicallyExposedPersonRet = politicallyExposedPersonRet;
	}

	public String getPepRemarksRet() {
		return pepRemarksRet;
	}

	public void setPepRemarksRet(String pepRemarksRet) {
		this.pepRemarksRet = pepRemarksRet;
	}

	
	
	
	
	//******************CORPORATE CUSTOMER******************//
	@SheetColumn("GROUPS_NAME_CORP")
	private String groupsNameCorp;
	
	@SheetColumn("PARENT_COMPNAME_CORP")
	private String parentCompanyNameCorp;
	
	
	@SheetColumn("TYPE_COMP_CORP")
	private String typeCompanyCorp;
	
	
	@SheetColumn("PURPOSE_ACCOUNT_CORP")
	private String purposeAccountCorp;
	
	
	@SheetColumn("NATURE_BUSINESS_CORP")
	private String natureBusinessCorp;
	
	
	@SheetColumn("PRODUCT_TRADED_CORP")
	private String productTradedCorp;
	
	
	@SheetColumn("MAIN_SRC_FUNDS_CORP")
	private String mainSourceFundsCorp;
	
	
	@SheetColumn("IS_A_BORROWING_ACC_GRP_CORP")
	private String isaborrowingAccountGroupCorp;
	
	
	@SheetColumn("ANNUAL_TURNOVER_CORP")
	private String annualTurnoverCorp;
	
	
	@SheetColumn("KYC_ID_CORP")
	private String kycIDCorp;
		
	
	@SheetColumn("NAME_CORP")
	private String nameCorp;
	
	
	@SheetColumn("POSITION_CORP")
	private String positionCorp;
	
	
	@SheetColumn("RELATIONSHIP_CORP")
	private String relationshipCorp;
	
	
	@SheetColumn("NATIONALITY_CORP")
	private String nationalityCorp;
	
	
	@SheetColumn("ADDRESS_CORP")
	private String addressCorp;
	
	
	@SheetColumn("COUNTRY_CORP")
	private String countryCorp;
	
	
	@SheetColumn("ISD_CODE_CORP")
	private String isdCodeCorp;
	
	
	@SheetColumn("TEL_NUM_CORP")
	private String telephoneNumberCorp;
	
	
	@SheetColumn("TAX_ID_CORP")
	private String taxIDCorp;
	
	
	@SheetColumn("SHARE_PERCENT_CORP")
	private String sharePercentCorp;
	
	
	@SheetColumn("DETAILS_OF_COMPANY_BRN_CORP")
	private String detailsOfCompanyBranchCorp;
	
	
	@SheetColumn("NO_EMP_CORP")
	private String numberOfEmployeesCorp;
	
	
	@SheetColumn("MODE_SALARY_CORP")
	private String modeOfSalaryCorp;
	
	
	@SheetColumn("SUPPLIER_NAME_CORP")
	private String supplierNameCorp;
	
	
	@SheetColumn("SUPPLIER_COUNTRY_CORP")
	private String supplierCountryCorp;
	
	
	@SheetColumn("SUPPLIER_SETTLEMENT_MODE_CORP")
	private String supplierSettlementModeCorp;
	
	
	@SheetColumn("CLIENT_NAME_CORP")
	private String clientNameCorp;
	
	
	@SheetColumn("CLIENT_COUNTRY_CORP")
	private String clientCountryCorp;
	
	
	@SheetColumn("CLIENT_PAYMENT_MODE_CORP")
	private String clientPaymentModeCorp;
	
	
	@SheetColumn("TRAN_TYPE_CORP")
	private String transactionTypeCorp;
	
	
	@SheetColumn("TRAN_COUNT_CORP")
	private String tansactionCountCorp;
		
	
	@SheetColumn("TRAN_TOTAL_AMOUNT_CORP")
	private String transactionTotalAmountCorp;
	
	
	@SheetColumn("TRAN_MAX_SINGLE_AMT_CORP")
	private String transactionMaxSingleAmountCorp;
	
	
	@SheetColumn("TRAN_PURPOSE_CORP")
	private String transactionPurposeCorp;
	
	
	@SheetColumn("TRAN_COUNTRY_CORP")
	private String transactionCountryCorp;
	
	
	@SheetColumn("FT_PURPOSE_CORP")
	private String fundTransferPurposeCorp;
	
	
	@SheetColumn("AUDIT_DATE_CORP")
	private String auditDateCorp;
	
	
	@SheetColumn("ACC_SOLICITED_CORP")
	private String accountSolicitedCorp;
	
	
	@SheetColumn("ACC_SOLICITED_DATE_CORP")
	private String accountSolicitedDateCorp;
	
	
	@SheetColumn("INTRODUCER_DET_CORP")
	private String introducerDetailCorp;
	
	
	@SheetColumn("COMPLIANCE_CLEARANCE_CORP")
	private String complianceClearanceCorp;
	
	
	@SheetColumn("BUSINESS_APPROVAL_CORP")
	private String businessApprovalCorp;
	
	
	@SheetColumn("TRADE_LICENSE_NO_CORP")
	private String tradeLicenseNumberCorp;
	
	
	@SheetColumn("KYC_NXT_REVIEW_DATE_CORP")
	private String kycNextReviewDateCorp;
	
	
	@SheetColumn("KYC_CORP")
	private String kycCorp;
	
	
	@SheetColumn("SALES_SERVICE_OFFICER_CORP")
	private String salesServiceOfficerCorp;
	
	
	@SheetColumn("APPROVERS_CORP")
	private String approversCorp;
	
	

	
	
	public String getGroupsNameCorp() {
		return groupsNameCorp;
	}

	public void setGroupsNameCorp(String groupsNameCorp) {
		this.groupsNameCorp = groupsNameCorp;
	}
		
	public String getParentCompanyNameCorp() {
		return parentCompanyNameCorp;
	}

	public void setParentCompanyNameCorp(String parentCompanyNameCorp) {
		this.parentCompanyNameCorp = parentCompanyNameCorp;
	}

	public String getTypeCompanyCorp() {
		return typeCompanyCorp;
	}

	public void setTypeCompanyCorp(String typeCompanyCorp) {
		this.typeCompanyCorp = typeCompanyCorp;
	}

	public String getPurposeAccountCorp() {
		return purposeAccountCorp;
	}

	public void setPurposeAccountCorp(String purposeAccountCorp) {
		this.purposeAccountCorp = purposeAccountCorp;
	}

	public String getNatureBusinessCorp() {
		return natureBusinessCorp;
	}

	public void setNatureBusinessCorp(String natureBusinessCorp) {
		this.natureBusinessCorp = natureBusinessCorp;
	}

	public String getProductTradedCorp() {
		return productTradedCorp;
	}

	public void setProductTradedCorp(String productTradedCorp) {
		this.productTradedCorp = productTradedCorp;
	}

	public String getMainSourceFundsCorp() {
		return mainSourceFundsCorp;
	}

	public void setMainSourceFundsCorp(String mainSourceFundsCorp) {
		this.mainSourceFundsCorp = mainSourceFundsCorp;
	}

	public String getIsaborrowingAccountGroupCorp() {
		return isaborrowingAccountGroupCorp;
	}

	public void setIsaborrowingAccountGroupCorp(String isaborrowingAccountGroupCorp) {
		this.isaborrowingAccountGroupCorp = isaborrowingAccountGroupCorp;
	}

	public String getAnnualTurnoverCorp() {
		return annualTurnoverCorp;
	}

	public void setAnnualTurnoverCorp(String annualTurnoverCorp) {
		this.annualTurnoverCorp = annualTurnoverCorp;
	}

	public String getKycIDCorp() {
		return kycIDCorp;
	}

	public void setKycIDCorp(String kycIDCorp) {
		this.kycIDCorp = kycIDCorp;
	}

	public String getNameCorp() {
		return nameCorp;
	}

	public void setNameCorp(String nameCorp) {
		this.nameCorp = nameCorp;
	}

	public String getPositionCorp() {
		return positionCorp;
	}

	public void setPositionCorp(String positionCorp) {
		this.positionCorp = positionCorp;
	}

	public String getRelationshipCorp() {
		return relationshipCorp;
	}

	public void setRelationshipCorp(String relationshipCorp) {
		this.relationshipCorp = relationshipCorp;
	}

	public String getNationalityCorp() {
		return nationalityCorp;
	}

	public void setNationalityCorp(String nationalityCorp) {
		this.nationalityCorp = nationalityCorp;
	}

	public String getAddressCorp() {
		return addressCorp;
	}

	public void setAddressCorp(String addressCorp) {
		this.addressCorp = addressCorp;
	}

	public String getCountryCorp() {
		return countryCorp;
	}

	public void setCountryCorp(String countryCorp) {
		this.countryCorp = countryCorp;
	}

	public String getIsdCodeCorp() {
		return isdCodeCorp;
	}

	public void setIsdCodeCorp(String isdCodeCorp) {
		this.isdCodeCorp = isdCodeCorp;
	}

	public String getTelephoneNumberCorp() {
		return telephoneNumberCorp;
	}

	public void setTelephoneNumberCorp(String telephoneNumberCorp) {
		this.telephoneNumberCorp = telephoneNumberCorp;
	}

	public String getTaxIDCorp() {
		return taxIDCorp;
	}

	public void setTaxIDCorp(String taxIDCorp) {
		this.taxIDCorp = taxIDCorp;
	}

	public String getSharePercentCorp() {
		return sharePercentCorp;
	}

	public void setSharePercentCorp(String sharePercentCorp) {
		this.sharePercentCorp = sharePercentCorp;
	}

	public String getDetailsOfCompanyBranchCorp() {
		return detailsOfCompanyBranchCorp;
	}

	public void setDetailsOfCompanyBranchCorp(String detailsOfCompanyBranchCorp) {
		this.detailsOfCompanyBranchCorp = detailsOfCompanyBranchCorp;
	}

	public String getNumberOfEmployeesCorp() {
		return numberOfEmployeesCorp;
	}

	public void setNumberOfEmployeesCorp(String numberOfEmployeesCorp) {
		this.numberOfEmployeesCorp = numberOfEmployeesCorp;
	}

	public String getModeOfSalaryCorp() {
		return modeOfSalaryCorp;
	}

	public void setModeOfSalaryCorp(String modeOfSalaryCorp) {
		this.modeOfSalaryCorp = modeOfSalaryCorp;
	}

	public String getSupplierNameCorp() {
		return supplierNameCorp;
	}

	public void setSupplierNameCorp(String supplierNameCorp) {
		this.supplierNameCorp = supplierNameCorp;
	}

	public String getSupplierCountryCorp() {
		return supplierCountryCorp;
	}

	public void setSupplierCountryCorp(String supplierCountryCorp) {
		this.supplierCountryCorp = supplierCountryCorp;
	}

	public String getSupplierSettlementModeCorp() {
		return supplierSettlementModeCorp;
	}

	public void setSupplierSettlementModeCorp(String supplierSettlementModeCorp) {
		this.supplierSettlementModeCorp = supplierSettlementModeCorp;
	}

	public String getClientNameCorp() {
		return clientNameCorp;
	}

	public void setClientNameCorp(String clientNameCorp) {
		this.clientNameCorp = clientNameCorp;
	}

	public String getClientCountryCorp() {
		return clientCountryCorp;
	}

	public void setClientCountryCorp(String clientCountryCorp) {
		this.clientCountryCorp = clientCountryCorp;
	}

	public String getClientPaymentModeCorp() {
		return clientPaymentModeCorp;
	}

	public void setClientPaymentModeCorp(String clientPaymentModeCorp) {
		this.clientPaymentModeCorp = clientPaymentModeCorp;
	}

	public String getTransactionTypeCorp() {
		return transactionTypeCorp;
	}

	public void setTransactionTypeCorp(String transactionTypeCorp) {
		this.transactionTypeCorp = transactionTypeCorp;
	}

	public String getTansactionCountCorp() {
		return tansactionCountCorp;
	}

	public void setTansactionCountCorp(String tansactionCountCorp) {
		this.tansactionCountCorp = tansactionCountCorp;
	}

	public String getTransactionTotalAmountCorp() {
		return transactionTotalAmountCorp;
	}

	public void setTransactionTotalAmountCorp(String transactionTotalAmountCorp) {
		this.transactionTotalAmountCorp = transactionTotalAmountCorp;
	}

	public String getTransactionMaxSingleAmountCorp() {
		return transactionMaxSingleAmountCorp;
	}

	public void setTransactionMaxSingleAmountCorp(String transactionMaxSingleAmountCorp) {
		this.transactionMaxSingleAmountCorp = transactionMaxSingleAmountCorp;
	}

	public String getTransactionPurposeCorp() {
		return transactionPurposeCorp;
	}

	public void setTransactionPurposeCorp(String transactionPurposeCorp) {
		this.transactionPurposeCorp = transactionPurposeCorp;
	}

	public String getTransactionCountryCorp() {
		return transactionCountryCorp;
	}

	public void setTransactionCountryCorp(String transactionCountryCorp) {
		this.transactionCountryCorp = transactionCountryCorp;
	}

	public String getFundTransferPurposeCorp() {
		return fundTransferPurposeCorp;
	}

	public void setFundTransferPurposeCorp(String fundTransferPurposeCorp) {
		this.fundTransferPurposeCorp = fundTransferPurposeCorp;
	}

	public String getAuditDateCorp() {
		return auditDateCorp;
	}

	public void setAuditDateCorp(String auditDateCorp) {
		this.auditDateCorp = auditDateCorp;
	}

	public String getAccountSolicitedCorp() {
		return accountSolicitedCorp;
	}

	public void setAccountSolicitedCorp(String accountSolicitedCorp) {
		this.accountSolicitedCorp = accountSolicitedCorp;
	}

	public String getAccountSolicitedDateCorp() {
		return accountSolicitedDateCorp;
	}

	public void setAccountSolicitedDateCorp(String accountSolicitedDateCorp) {
		this.accountSolicitedDateCorp = accountSolicitedDateCorp;
	}

	public String getIntroducerDetailCorp() {
		return introducerDetailCorp;
	}

	public void setIntroducerDetailCorp(String introducerDetailCorp) {
		this.introducerDetailCorp = introducerDetailCorp;
	}

	public String getComplianceClearanceCorp() {
		return complianceClearanceCorp;
	}

	public void setComplianceClearanceCorp(String complianceClearanceCorp) {
		this.complianceClearanceCorp = complianceClearanceCorp;
	}

	public String getBusinessApprovalCorp() {
		return businessApprovalCorp;
	}

	public void setBusinessApprovalCorp(String businessApprovalCorp) {
		this.businessApprovalCorp = businessApprovalCorp;
	}

	public String getTradeLicenseNumberCorp() {
		return tradeLicenseNumberCorp;
	}

	public void setTradeLicenseNumberCorp(String tradeLicenseNumberCorp) {
		this.tradeLicenseNumberCorp = tradeLicenseNumberCorp;
	}

	public String getKycNextReviewDateCorp() {
		return kycNextReviewDateCorp;
	}

	public void setKycNextReviewDateCorp(String kycNextReviewDateCorp) {
		this.kycNextReviewDateCorp = kycNextReviewDateCorp;
	}

	public String getKycCorp() {
		return kycCorp;
	}

	public void setKycCorp(String kycCorp) {
		this.kycCorp = kycCorp;
	}

	public String getSalesServiceOfficerCorp() {
		return salesServiceOfficerCorp;
	}

	public void setSalesServiceOfficerCorp(String salesServiceOfficerCorp) {
		this.salesServiceOfficerCorp = salesServiceOfficerCorp;
	}

	public String getApproversCorp() {
		return approversCorp;
	}

	public void setApproversCorp(String approversCorp) {
		this.approversCorp = approversCorp;
	}




	//******************FINANCIAL CUSTOMER******************//
	@SheetColumn("BANK_ADDRESS_FIN")
	private String bankAddressFin;
	
	@SheetColumn("COUNTRY_FIN")
	private String countryFin;
	
	@SheetColumn("TRANSACTION_PRODUCTS_FIN")
	private String transactionProductsFin;
	
	@SheetColumn("RATING_FIN")
	private String ratingFin;
	
	@SheetColumn("MONTHLY_TRANSACTIONS_FIN")
	private String monthlyNumberOfTransactionsFin;
	
	@SheetColumn("MONTHLY_AMOUNT_FIN")
	private String monthlyAmountFin;
	
	@SheetColumn("MGMNT_NAME_FIN")
	private String mgmntNameFin;
	
	@SheetColumn("MGMNT_DESIGNATION_FIN")
	private String mgmntDesginationFin;
	
	@SheetColumn("SHRHLD_NAME_FIN")
	private String shareholderNameFin;
	
	@SheetColumn("SHRHLD_HOLDING_FIN")
	private String shareholderHoldingFin;
	
	@SheetColumn("SHRHLD_ADDRESS_FIN")
	private String shareholderAddressFin;
	
	@SheetColumn("SHRHLD_CITY_FIN")
	private String shareholderCityFin;
	
	@SheetColumn("SHRHLD_COUNTRY_FIN")
	private String shareholderCountryFin;
	
	
	

	
	public String getBankAddressFin() {
		return bankAddressFin;
	}

	public void setBankAddressFin(String bankAddressFin) {
		this.bankAddressFin = bankAddressFin;
	}

	public String getCountryFin() {
		return countryFin;
	}

	public void setCountryFin(String countryFin) {
		this.countryFin = countryFin;
	}

	public String getTransactionProductsFin() {
		return transactionProductsFin;
	}

	public void setTransactionProductsFin(String transactionProductsFin) {
		this.transactionProductsFin = transactionProductsFin;
	}

	public String getRatingFin() {
		return ratingFin;
	}

	public void setRatingFin(String ratingFin) {
		this.ratingFin = ratingFin;
	}

	public String getMonthlyNumberOfTransactionsFin() {
		return monthlyNumberOfTransactionsFin;
	}

	public void setMonthlyNumberOfTransactionsFin(String monthlyNumberOfTransactionsFin) {
		this.monthlyNumberOfTransactionsFin = monthlyNumberOfTransactionsFin;
	}

	public String getMonthlyAmountFin() {
		return monthlyAmountFin;
	}

	public void setMonthlyAmountFin(String monthlyAmountFin) {
		this.monthlyAmountFin = monthlyAmountFin;
	}

	public String getMgmntNameFin() {
		return mgmntNameFin;
	}

	public void setMgmntNameFin(String mgmntNameFin) {
		this.mgmntNameFin = mgmntNameFin;
	}

	public String getMgmntDesginationFin() {
		return mgmntDesginationFin;
	}

	public void setMgmntDesginationFin(String mgmntDesginationFin) {
		this.mgmntDesginationFin = mgmntDesginationFin;
	}

	public String getShareholderNameFin() {
		return shareholderNameFin;
	}

	public void setShareholderNameFin(String shareholderNameFin) {
		this.shareholderNameFin = shareholderNameFin;
	}

	public String getShareholderHoldingFin() {
		return shareholderHoldingFin;
	}

	public void setShareholderHoldingFin(String shareholderHoldingFin) {
		this.shareholderHoldingFin = shareholderHoldingFin;
	}

	public String getShareholderAddressFin() {
		return shareholderAddressFin;
	}

	public void setShareholderAddressFin(String shareholderAddressFin) {
		this.shareholderAddressFin = shareholderAddressFin;
	}

	public String getShareholderCityFin() {
		return shareholderCityFin;
	}

	public void setShareholderCityFin(String shareholderCityFin) {
		this.shareholderCityFin = shareholderCityFin;
	}

	public String getShareholderCountryFin() {
		return shareholderCountryFin;
	}

	public void setShareholderCountryFin(String shareholderCountryFin) {
		this.shareholderCountryFin = shareholderCountryFin;
	}

	@Override
	public String toString() {
		return "STDKYCMN [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseID=" + testCaseID
				+ ", fullName=" + fullName + ", kycCustomerType=" + kycCustomerType + ", kycretail=" + kycretail
				+ ", riskLevel=" + riskLevel + ", declaredRet=" + declaredRet + ", residentRet=" + residentRet
				+ ", politicallyExposedPersonRet=" + politicallyExposedPersonRet + ", pepRemarksRet=" + pepRemarksRet
				+ ", localAddressRet=" + localAddressRet + ", countryRet=" + countryRet + ", homeCountryAddressRet="
				+ homeCountryAddressRet + ", homeCountryRet=" + homeCountryRet + ", permanentUSResidenceStatusRet="
				+ permanentUSResidenceStatusRet + ", visitedUSinThreeYrsRet=" + visitedUSinThreeYrsRet
				+ ", nationalityRet=" + nationalityRet + ", birthPlaceRet=" + birthPlaceRet + ", birthCountryRet="
				+ birthCountryRet + ", birthDateRet=" + birthDateRet + ", officeIsdCodeRet=" + officeIsdCodeRet
				+ ", officeNumberRet=" + officeNumberRet + ", residenceIsdCodeRet=" + residenceIsdCodeRet
				+ ", residenceNumberRet=" + residenceNumberRet + ", mobileIsdCodeRet=" + mobileIsdCodeRet
				+ ", mobileNumberRet=" + mobileNumberRet + ", faxIsdRet=" + faxIsdRet + ", faxNumberRet=" + faxNumberRet
				+ ", purposeAccOpeningRet=" + purposeAccOpeningRet + ", accountTypeRet=" + accountTypeRet
				+ ", passportNumberRet=" + passportNumberRet + ", passportExpiryDateRet=" + passportExpiryDateRet
				+ ", visaNumberRet=" + visaNumberRet + ", visaExpiryDateRet=" + visaExpiryDateRet
				+ ", kycAmountCurrencyRet=" + kycAmountCurrencyRet + ", potRet=" + potRet + ", potHolderNameRet="
				+ potHolderNameRet + ", potNationalityRet=" + potNationalityRet + ", potAddressRet=" + potAddressRet
				+ ", potCountryRet=" + potCountryRet + ", potTelIsdCodeRet=" + potTelIsdCodeRet + ", potTelNumberRet="
				+ potTelNumberRet + ", companyNameRet=" + companyNameRet + ", locationRet=" + locationRet
				+ ", percentHoldingRet=" + percentHoldingRet + ", annualIncomeRet=" + annualIncomeRet
				+ ", lineOfBusinessRet=" + lineOfBusinessRet + ", salaryRet=" + salaryRet + ", rentalRet=" + rentalRet
				+ ", investmentRet=" + investmentRet + ", businessConcernRet=" + businessConcernRet
				+ ", professionalBusinessRet=" + professionalBusinessRet + ", overseasPropertyRet="
				+ overseasPropertyRet + ", totalIncomeRet=" + totalIncomeRet + ", totalNetWorthRet=" + totalNetWorthRet
				+ ", companyAccNumberRet=" + companyAccNumberRet + ", personalAccNumberRet=" + personalAccNumberRet
				+ ", kycRet=" + kycRet + ", salesServiceRet=" + salesServiceRet + ", approversRet=" + approversRet
				+ ", groupsNameCorp=" + groupsNameCorp + ", parentCompanyNameCorp=" + parentCompanyNameCorp
				+ ", typeCompanyCorp=" + typeCompanyCorp + ", purposeAccountCorp=" + purposeAccountCorp
				+ ", natureBusinessCorp=" + natureBusinessCorp + ", productTradedCorp=" + productTradedCorp
				+ ", mainSourceFundsCorp=" + mainSourceFundsCorp + ", isaborrowingAccountGroupCorp="
				+ isaborrowingAccountGroupCorp + ", annualTurnoverCorp=" + annualTurnoverCorp + ", kycIDCorp="
				+ kycIDCorp + ", nameCorp=" + nameCorp + ", positionCorp=" + positionCorp + ", relationshipCorp="
				+ relationshipCorp + ", nationalityCorp=" + nationalityCorp + ", addressCorp=" + addressCorp
				+ ", countryCorp=" + countryCorp + ", isdCodeCorp=" + isdCodeCorp + ", telephoneNumberCorp="
				+ telephoneNumberCorp + ", taxIDCorp=" + taxIDCorp + ", sharePercentCorp=" + sharePercentCorp
				+ ", detailsOfCompanyBranchCorp=" + detailsOfCompanyBranchCorp + ", numberOfEmployeesCorp="
				+ numberOfEmployeesCorp + ", modeOfSalaryCorp=" + modeOfSalaryCorp + ", supplierNameCorp="
				+ supplierNameCorp + ", supplierCountryCorp=" + supplierCountryCorp + ", supplierSettlementModeCorp="
				+ supplierSettlementModeCorp + ", clientNameCorp=" + clientNameCorp + ", clientCountryCorp="
				+ clientCountryCorp + ", clientPaymentModeCorp=" + clientPaymentModeCorp + ", transactionTypeCorp="
				+ transactionTypeCorp + ", tansactionCountCorp=" + tansactionCountCorp + ", transactionTotalAmountCorp="
				+ transactionTotalAmountCorp + ", transactionMaxSingleAmountCorp=" + transactionMaxSingleAmountCorp
				+ ", transactionPurposeCorp=" + transactionPurposeCorp + ", transactionCountryCorp="
				+ transactionCountryCorp + ", fundTransferPurposeCorp=" + fundTransferPurposeCorp + ", auditDateCorp="
				+ auditDateCorp + ", accountSolicitedCorp=" + accountSolicitedCorp + ", accountSolicitedDateCorp="
				+ accountSolicitedDateCorp + ", introducerDetailCorp=" + introducerDetailCorp
				+ ", complianceClearanceCorp=" + complianceClearanceCorp + ", businessApprovalCorp="
				+ businessApprovalCorp + ", tradeLicenseNumberCorp=" + tradeLicenseNumberCorp
				+ ", kycNextReviewDateCorp=" + kycNextReviewDateCorp + ", kycCorp=" + kycCorp
				+ ", salesServiceOfficerCorp=" + salesServiceOfficerCorp + ", approversCorp=" + approversCorp
				+ ", bankAddressFin=" + bankAddressFin + ", countryFin=" + countryFin + ", transactionProductsFin="
				+ transactionProductsFin + ", ratingFin=" + ratingFin + ", monthlyNumberOfTransactionsFin="
				+ monthlyNumberOfTransactionsFin + ", monthlyAmountFin=" + monthlyAmountFin + ", mgmntNameFin="
				+ mgmntNameFin + ", mgmntDesginationFin=" + mgmntDesginationFin + ", shareholderNameFin="
				+ shareholderNameFin + ", shareholderHoldingFin=" + shareholderHoldingFin + ", shareholderAddressFin="
				+ shareholderAddressFin + ", shareholderCityFin=" + shareholderCityFin + ", shareholderCountryFin="
				+ shareholderCountryFin + "]";
	}
	
	
}