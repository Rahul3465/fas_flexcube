package com.jmr.testsuite.fas.page.ic;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "ICDREDMN")
public class ICDREDMN_Page
{
	@SheetColumn(value = "TestcaseResult")
	private String testCaseResult;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "TermDepositAccNumber")
	private String termDepositAccNumber;
	
	@SheetColumn(value = "WaiveInterest")
	private String waiveInterest;
	
	@SheetColumn(value = "Rollover")
	private String rollover;
	
	@SheetColumn(value = "Redemption")
	private String redemption;
	
	@SheetColumn(value = "TenorModification")
	private String tenorModification;
	
	@SheetColumn(value = "AddFunds")
	private String addFunds;
	
	@SheetColumn(value = "RedemptionMode")
	private String redemptionMode;
	
	@SheetColumn(value = "RedemptionAmount")
	private String redemptionAmount;
	
	@SheetColumn(value = "WaivePenalty")
	private String waivePenalty;
	
	@SheetColumn(value = "PayoutComponent")
	private String payoutComponent;
	
	@SheetColumn(value = "PayoutType1")
	private String payoutType1;
	
	@SheetColumn(value = "PayoutType2")
	private String payoutType2;
	
	@SheetColumn(value = "PayoutPercentage1")
	private String payoutPercentage1;
	
	@SheetColumn(value = "PayoutPercentage2")
	private String payoutPercentage2;
	
	@SheetColumn(value = "PayoutRedemptionAmount")
	private String payoutRedemptionAmount;
	
	@SheetColumn(value = "PayoutOffsetBranch1")
	private String payoutOffsetBranch1;
	
	@SheetColumn(value = "PayoutOffsetBranch2")
	private String payoutOffsetBranch2;
	
	@SheetColumn(value = "PayoutOffsetAccount1")
	private String payoutOffsetAccount1;
	
	@SheetColumn(value = "PayoutOffsetAccount2")
	private String payoutOffsetAccount2;
			
	@SheetColumn(value = "Narrative1")
	private String narrative1;	
	
	@SheetColumn(value = "Narrative2")
	private String narrative2;
	
	@SheetColumn(value = "TDPayoutDetails")
	private String tdPayoutDetails;
	
	@SheetColumn(value = "CounterpartyBankCode")
	private String counterpartyBankCode;
	
	@SheetColumn(value = "CounterpartyAccount")
	private String counterpartyAccount;
	
	@SheetColumn(value = "BeneficiaryName")
	private String beneficiaryName;
	
	@SheetColumn(value = "AddressLine1")
	private String addressLine1;
	
	@SheetColumn(value = "AccountClass")
	private String accountclass;
	
	@SheetColumn(value = "Branch")
	private String branch;
	
	@SheetColumn(value = "BankCode")
	private String bankCode;
	
	@SheetColumn(value = "ChequeDate")
	private String chequeDate;

	@SheetColumn(value = "PayInOption1")
	private String payInOption1;
	
	@SheetColumn(value = "PayInOption2")
	private String payInOption2;
	
	@SheetColumn(value = "PercentagePayInOption1")
	private String percentagePayInOption1;
	
	@SheetColumn(value = "PercentagePayInOption2")
	private String percentagePayInOption2;
	
	@SheetColumn(value = "AmountPayInOption1")
	private String amountPayInOption1;
	
	@SheetColumn(value = "AmountPayInOption2")
	private String amountPayInOption2;
	
	@SheetColumn(value = "OffsetbranchPayInOption1")
	private String offsetbranchPayInOption1;
	
	@SheetColumn(value = "OffsetbranchPayInOption2")
	private String offsetbranchPayInOption2;
	
	@SheetColumn(value = "OffsetAccountPayInOption1")
	private String offsetAccountPayInOption1;
	
	@SheetColumn(value = "OffsetAccountPayInOption2")
	private String OffsetAccountPayInOption2;
	
	@SheetColumn(value = "AccountClassTenor")
	private String accountClassTenor;
	
	@SheetColumn(value = "AccountTenor")
	private String accountTenor;
	
	@SheetColumn(value = "IndependentTenor")
	private String independentTenor;
	
	@SheetColumn(value = "TenorDays")
	private String tenorDays;
	
	@SheetColumn(value = "TenorMonths")
	private String tenorMonths;
	
	@SheetColumn(value = "TenorYears")
	private String tenorYears;

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

	public String getFastpath() {
		return fastpath;
	}

	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}

	public String getTermDepositAccNumber() {
		return termDepositAccNumber;
	}

	public void setTermDepositAccNumber(String termDepositAccNumber) {
		this.termDepositAccNumber = termDepositAccNumber;
	}

	public String getWaiveInterest() {
		return waiveInterest;
	}

	public void setWaiveInterest(String waiveInterest) {
		this.waiveInterest = waiveInterest;
	}

	public String getRollover() {
		return rollover;
	}

	public void setRollover(String rollover) {
		this.rollover = rollover;
	}

	public String getRedemption() {
		return redemption;
	}

	public void setRedemption(String redemption) {
		this.redemption = redemption;
	}

	public String getTenorModification() {
		return tenorModification;
	}

	public void setTenorModification(String tenorModification) {
		this.tenorModification = tenorModification;
	}

	public String getAddFunds() {
		return addFunds;
	}

	public void setAddFunds(String addFunds) {
		this.addFunds = addFunds;
	}

	public String getRedemptionMode() {
		return redemptionMode;
	}

	public void setRedemptionMode(String redemptionMode) {
		this.redemptionMode = redemptionMode;
	}

	public String getRedemptionAmount() {
		return redemptionAmount;
	}

	public void setRedemptionAmount(String redemptionAmount) {
		this.redemptionAmount = redemptionAmount;
	}

	public String getWaivePenalty() {
		return waivePenalty;
	}

	public void setWaivePenalty(String waivePenalty) {
		this.waivePenalty = waivePenalty;
	}

	public String getPayoutComponent() {
		return payoutComponent;
	}

	public void setPayoutComponent(String payoutComponent) {
		this.payoutComponent = payoutComponent;
	}

	public String getPayoutType1() {
		return payoutType1;
	}

	public void setPayoutType1(String payoutType1) {
		this.payoutType1 = payoutType1;
	}

	public String getPayoutType2() {
		return payoutType2;
	}

	public void setPayoutType2(String payoutType2) {
		this.payoutType2 = payoutType2;
	}

	public String getPayoutPercentage1() {
		return payoutPercentage1;
	}

	public void setPayoutPercentage1(String payoutPercentage1) {
		this.payoutPercentage1 = payoutPercentage1;
	}

	public String getPayoutPercentage2() {
		return payoutPercentage2;
	}

	public void setPayoutPercentage2(String payoutPercentage2) {
		this.payoutPercentage2 = payoutPercentage2;
	}

	public String getPayoutRedemptionAmount() {
		return payoutRedemptionAmount;
	}

	public void setPayoutRedemptionAmount(String payoutRedemptionAmount) {
		this.payoutRedemptionAmount = payoutRedemptionAmount;
	}

	public String getPayoutOffsetBranch1() {
		return payoutOffsetBranch1;
	}

	public void setPayoutOffsetBranch1(String payoutOffsetBranch1) {
		this.payoutOffsetBranch1 = payoutOffsetBranch1;
	}

	public String getPayoutOffsetBranch2() {
		return payoutOffsetBranch2;
	}

	public void setPayoutOffsetBranch2(String payoutOffsetBranch2) {
		this.payoutOffsetBranch2 = payoutOffsetBranch2;
	}

	public String getPayoutOffsetAccount1() {
		return payoutOffsetAccount1;
	}

	public void setPayoutOffsetAccount1(String payoutOffsetAccount1) {
		this.payoutOffsetAccount1 = payoutOffsetAccount1;
	}

	public String getPayoutOffsetAccount2() {
		return payoutOffsetAccount2;
	}

	public void setPayoutOffsetAccount2(String payoutOffsetAccount2) {
		this.payoutOffsetAccount2 = payoutOffsetAccount2;
	}

	public String getNarrative1() {
		return narrative1;
	}

	public void setNarrative1(String narrative1) {
		this.narrative1 = narrative1;
	}

	public String getNarrative2() {
		return narrative2;
	}

	public void setNarrative2(String narrative2) {
		this.narrative2 = narrative2;
	}

	public String getTdPayoutDetails() {
		return tdPayoutDetails;
	}

	public void setTdPayoutDetails(String tdPayoutDetails) {
		this.tdPayoutDetails = tdPayoutDetails;
	}

	public String getCounterpartyBankCode() {
		return counterpartyBankCode;
	}

	public void setCounterpartyBankCode(String counterpartyBankCode) {
		this.counterpartyBankCode = counterpartyBankCode;
	}

	public String getCounterpartyAccount() {
		return counterpartyAccount;
	}

	public void setCounterpartyAccount(String counterpartyAccount) {
		this.counterpartyAccount = counterpartyAccount;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAccountclass() {
		return accountclass;
	}

	public void setAccountclass(String accountclass) {
		this.accountclass = accountclass;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getPayInOption1() {
		return payInOption1;
	}

	public void setPayInOption1(String payInOption1) {
		this.payInOption1 = payInOption1;
	}

	public String getPayInOption2() {
		return payInOption2;
	}

	public void setPayInOption2(String payInOption2) {
		this.payInOption2 = payInOption2;
	}

	public String getPercentagePayInOption1() {
		return percentagePayInOption1;
	}

	public void setPercentagePayInOption1(String percentagePayInOption1) {
		this.percentagePayInOption1 = percentagePayInOption1;
	}

	public String getPercentagePayInOption2() {
		return percentagePayInOption2;
	}

	public void setPercentagePayInOption2(String percentagePayInOption2) {
		this.percentagePayInOption2 = percentagePayInOption2;
	}

	public String getAmountPayInOption1() {
		return amountPayInOption1;
	}

	public void setAmountPayInOption1(String amountPayInOption1) {
		this.amountPayInOption1 = amountPayInOption1;
	}

	public String getAmountPayInOption2() {
		return amountPayInOption2;
	}

	public void setAmountPayInOption2(String amountPayInOption2) {
		this.amountPayInOption2 = amountPayInOption2;
	}

	public String getOffsetbranchPayInOption1() {
		return offsetbranchPayInOption1;
	}

	public void setOffsetbranchPayInOption1(String offsetbranchPayInOption1) {
		this.offsetbranchPayInOption1 = offsetbranchPayInOption1;
	}

	public String getOffsetbranchPayInOption2() {
		return offsetbranchPayInOption2;
	}

	public void setOffsetbranchPayInOption2(String offsetbranchPayInOption2) {
		this.offsetbranchPayInOption2 = offsetbranchPayInOption2;
	}

	public String getOffsetAccountPayInOption1() {
		return offsetAccountPayInOption1;
	}

	public void setOffsetAccountPayInOption1(String offsetAccountPayInOption1) {
		this.offsetAccountPayInOption1 = offsetAccountPayInOption1;
	}

	public String getOffsetAccountPayInOption2() {
		return OffsetAccountPayInOption2;
	}

	public void setOffsetAccountPayInOption2(String offsetAccountPayInOption2) {
		OffsetAccountPayInOption2 = offsetAccountPayInOption2;
	}

	public String getAccountClassTenor() {
		return accountClassTenor;
	}

	public void setAccountClassTenor(String accountClassTenor) {
		this.accountClassTenor = accountClassTenor;
	}

	public String getAccountTenor() {
		return accountTenor;
	}

	public void setAccountTenor(String accountTenor) {
		this.accountTenor = accountTenor;
	}

	public String getIndependentTenor() {
		return independentTenor;
	}

	public void setIndependentTenor(String independentTenor) {
		this.independentTenor = independentTenor;
	}

	public String getTenorDays() {
		return tenorDays;
	}

	public void setTenorDays(String tenorDays) {
		this.tenorDays = tenorDays;
	}

	public String getTenorMonths() {
		return tenorMonths;
	}

	public void setTenorMonths(String tenorMonths) {
		this.tenorMonths = tenorMonths;
	}

	public String getTenorYears() {
		return tenorYears;
	}

	public void setTenorYears(String tenorYears) {
		this.tenorYears = tenorYears;
	}

	@Override
	public String toString() {
		return "ICDREDMN_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", fastpath=" + fastpath + ", termDepositAccNumber=" + termDepositAccNumber + ", waiveInterest="
				+ waiveInterest + ", rollover=" + rollover + ", redemption=" + redemption + ", tenorModification="
				+ tenorModification + ", addFunds=" + addFunds + ", redemptionMode=" + redemptionMode
				+ ", redemptionAmount=" + redemptionAmount + ", waivePenalty=" + waivePenalty + ", payoutComponent="
				+ payoutComponent + ", payoutType1=" + payoutType1 + ", payoutType2=" + payoutType2
				+ ", payoutPercentage1=" + payoutPercentage1 + ", payoutPercentage2=" + payoutPercentage2
				+ ", payoutRedemptionAmount=" + payoutRedemptionAmount + ", payoutOffsetBranch1=" + payoutOffsetBranch1
				+ ", payoutOffsetBranch2=" + payoutOffsetBranch2 + ", payoutOffsetAccount1=" + payoutOffsetAccount1
				+ ", payoutOffsetAccount2=" + payoutOffsetAccount2 + ", narrative1=" + narrative1 + ", narrative2="
				+ narrative2 + ", tdPayoutDetails=" + tdPayoutDetails + ", counterpartyBankCode=" + counterpartyBankCode
				+ ", counterpartyAccount=" + counterpartyAccount + ", beneficiaryName=" + beneficiaryName
				+ ", addressLine1=" + addressLine1 + ", accountclass=" + accountclass + ", branch=" + branch
				+ ", bankCode=" + bankCode + ", chequeDate=" + chequeDate + ", payInOption1=" + payInOption1
				+ ", payInOption2=" + payInOption2 + ", percentagePayInOption1=" + percentagePayInOption1
				+ ", percentagePayInOption2=" + percentagePayInOption2 + ", amountPayInOption1=" + amountPayInOption1
				+ ", amountPayInOption2=" + amountPayInOption2 + ", offsetbranchPayInOption1="
				+ offsetbranchPayInOption1 + ", offsetbranchPayInOption2=" + offsetbranchPayInOption2
				+ ", offsetAccountPayInOption1=" + offsetAccountPayInOption1 + ", OffsetAccountPayInOption2="
				+ OffsetAccountPayInOption2 + ", accountClassTenor=" + accountClassTenor + ", accountTenor="
				+ accountTenor + ", independentTenor=" + independentTenor + ", tenorDays=" + tenorDays
				+ ", tenorMonths=" + tenorMonths + ", tenorYears=" + tenorYears + "]";
	}

	
}
