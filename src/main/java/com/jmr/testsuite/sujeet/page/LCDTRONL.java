package com.jmr.testsuite.sujeet.page;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "LCDTRONL")

public class LCDTRONL {
	
	@SheetColumn(value = "TestcaseResult")
	private String testCaseResult;
	
	@SheetColumn(value = "Run Mode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "BRANCH_CODE")
	private String branchCode;
	
	@SheetColumn(value = "PRODUCT_CODE")
	private String productCode;
	
	@SheetColumn(value = "OPERATION_CODE")
	private String operationCode;
	
	@SheetColumn(value = "CONTRACT_AMOUNT")
	private String contractAmount;
	
	@SheetColumn(value = "POSITIVE_TOLERANCE")
	private String positiveTolerance;
	
	@SheetColumn(value = "NEGATIVE_TOLERANCE")
	private String negativeTolerance;
	
	@SheetColumn(value = "CUSTOMER")
	private String customer;
	
	@SheetColumn(value = "CUSTOMER_REFERENCE")
	private String customerReference;
	
	@SheetColumn(value = "REVOLVES_IN")
	private String revolvesIn;
	
	@SheetColumn(value = "UNITS")
	private String units;
	
	@SheetColumn(value = "FREQUENCY")
	private String frequency;
	
	@SheetColumn(value = "ISSUE_DATE")
	private String issueDate;
	
	@SheetColumn(value = "EFFECTIVE_DATE")
	private String effectiveDate;
	
	@SheetColumn(value = "TENOR")
	private String tenor;
	
	@SheetColumn(value = "EXPIRY_DATE")
	private String expiryDate;
	
	@SheetColumn(value = "PRE_ADVICE_DATE")
	private String preAdviceDate;
	
	@SheetColumn(value = "EXPIRY_PLACE")
	private String expiryPlace;
	
	@SheetColumn(value = "CREDIT_AVAILABLE_WITH")
	private String creditAvailableWith;
	
	@SheetColumn(value = "TRANSFERABLE")
	private String transferable;
	
	@SheetColumn(value = "ALLOW_PREPAYMENT")
	private String allowPrepayment;
	
	@SheetColumn(value = "ALLOW_STATUS_CHANGE")
	private String allowStatusChange;
	
	@SheetColumn(value = "PARTIAL_CONFIRMATION_ALLOWED")
	private String partialConfirmationAllowed;
	
	@SheetColumn(value = "CONFIRM_PERCENTAGE")
	private String confirmPercentage;
	
	@SheetColumn(value = "PARTY_ID FOR PARTY TYPE0")
	private String partyIdForPartyType0;
	
	@SheetColumn(value = "PARTY_ID FOR PARTY TYPE1")
	private String partyIdForPartyType1;

	@SheetColumn(value = "PARTY_ID FOR PARTY TYPE2")
	private String partyIdForPartyType2;

	
	@SheetColumn(value = "CUST_REFERENCE")
	private String custReference;
	
	@SheetColumn(value = "DATED")
	private String dated;
	
	@SheetColumn(value = "PARTY_TYPE_1")
	private String partyType1;
	
	@SheetColumn(value = "PARTY_TYPE_2")
	private String partyType2;
	
	@SheetColumn(value = "MEDIUM_1")
	private String medium1;
	
	@SheetColumn(value = "MEDIUM_2")
	private String medium2;

	public String getPartyType1() {
		return partyType1;
	}

	public void setPartyType1(String partyType1) {
		this.partyType1 = partyType1;
	}

	public String getPartyType2() {
		return partyType2;
	}

	public void setPartyType2(String partyType2) {
		this.partyType2 = partyType2;
	}

	public String getMedium1() {
		return medium1;
	}

	public void setMedium1(String medium1) {
		this.medium1 = medium1;
	}

	public String getMedium2() {
		return medium2;
	}

	public void setMedium2(String medium2) {
		this.medium2 = medium2;
	}

	@SheetColumn(value = "COST_CTR")
	private String costCTR;
	
	@SheetColumn(value = "Contract Reference Number")
	private String contractReferenceNumber;
	
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

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public String getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	public String getPositiveTolerance() {
		return positiveTolerance;
	}

	public void setPositiveTolerance(String positiveTolerance) {
		this.positiveTolerance = positiveTolerance;
	}

	public String getNegativeTolerance() {
		return negativeTolerance;
	}

	public void setNegativeTolerance(String negativeTolerance) {
		this.negativeTolerance = negativeTolerance;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	public String getRevolvesIn() {
		return revolvesIn;
	}

	public void setRevolvesIn(String revolvesIn) {
		this.revolvesIn = revolvesIn;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getTenor() {
		return tenor;
	}

	public void setTenor(String tenor) {
		this.tenor = tenor;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getPreAdviceDate() {
		return preAdviceDate;
	}

	public void setPreAdviceDate(String preAdviceDate) {
		this.preAdviceDate = preAdviceDate;
	}

	public String getExpiryPlace() {
		return expiryPlace;
	}

	public void setExpiryPlace(String expiryPlace) {
		this.expiryPlace = expiryPlace;
	}

	public String getCreditAvailableWith() {
		return creditAvailableWith;
	}

	public void setCreditAvailableWith(String creditAvailableWith) {
		this.creditAvailableWith = creditAvailableWith;
	}

	public String getTransferable() {
		return transferable;
	}

	public void setTransferable(String transferable) {
		this.transferable = transferable;
	}

	public String getAllowPrepayment() {
		return allowPrepayment;
	}

	public void setAllowPrepayment(String allowPrepayment) {
		this.allowPrepayment = allowPrepayment;
	}

	public String getAllowStatusChange() {
		return allowStatusChange;
	}

	public void setAllowStatusChange(String allowStatusChange) {
		this.allowStatusChange = allowStatusChange;
	}

	public String getPartialConfirmationAllowed() {
		return partialConfirmationAllowed;
	}

	public void setPartialConfirmationAllowed(String partialConfirmationAllowed) {
		this.partialConfirmationAllowed = partialConfirmationAllowed;
	}

	public String getPartyIdForPartyType0() {
		return partyIdForPartyType0;
	}

	public void setPartyIdForPartyType0(String partyIdForPartyType0) {
		this.partyIdForPartyType0 = partyIdForPartyType0;
	}

	public String getPartyIdForPartyType1() {
		return partyIdForPartyType1;
	}

	public void setPartyIdForPartyType1(String partyIdForPartyType1) {
		this.partyIdForPartyType1 = partyIdForPartyType1;
	}

	public String getPartyIdForPartyType2() {
		return partyIdForPartyType2;
	}

	public void setPartyIdForPartyType2(String partyIdForPartyType2) {
		this.partyIdForPartyType2 = partyIdForPartyType2;
	}
	
	public String getConfirmPercentage() {
		return confirmPercentage;
	}

	public void setConfirmPercentage(String confirmPercentage) {
		this.confirmPercentage = confirmPercentage;
	}

	public String getCustReference() {
		return custReference;
	}

	public void setCustReference(String custReference) {
		this.custReference = custReference;
	}

	public String getDated() {
		return dated;
	}

	public void setDated(String dated) {
		this.dated = dated;
	}
	
	public String getCostCTR() {
		return costCTR;
	}

	public void setCostCTR(String costCTR) {
		this.costCTR = costCTR;
	}
	
	public String getContractReferenceNumber() {
		return contractReferenceNumber;
	}

	public void setContractReferenceNumber(String contractReferenceNumber) {
		this.contractReferenceNumber = contractReferenceNumber;
	}


}