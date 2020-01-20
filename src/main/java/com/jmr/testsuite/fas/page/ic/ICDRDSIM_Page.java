package com.jmr.testsuite.fas.page.ic;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "ICDRDSIM")

public class ICDRDSIM_Page
{
	@SheetColumn(value = "TestcaseResult")
	private String testCaseResult;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountNumber")
	private String accountNumber;
	
	@SheetColumn(value = "RedemptionMode")
	private String redemptionMode;
	
	@SheetColumn(value = "RedemptionAmount")
	private String redemptionAmount;
	
	@SheetColumn(value = "RedemptionExecutionDate")
	private String redemptionExecutionDate;
	
	@SheetColumn(value = "PayOutComponent")
	private String payOutComponent;
	
	@SheetColumn(value = "PayOutType1")
	private String payOutType1;
	
	@SheetColumn(value = "PayOutType2")
	private String payOutType2;
	
	@SheetColumn(value = "Percentage1")
	private String percentage1;
	
	@SheetColumn(value = "Percentage2")
	private String percentage2;
	
	@SheetColumn(value = "RedemptionAmountinPayOut1")
	private String redemptionAmountInPayOut1;
	
	@SheetColumn(value = "RedemptionAmountinPayOut2")
	private String redemptionAmountInPayOut2;
	
	@SheetColumn(value = "OffsetAccount1")
	private String offsetAccount1;
	
	@SheetColumn(value = "OffsetAccount2")
	private String offsetAccount2;
	
	@SheetColumn(value = "BankCode")
	private String bankCode;
	
	@SheetColumn(value = "ChequeDate")
	private String chequeDate;
	
	@SheetColumn(value = "PaymentBranch1")
	private String paymentBranch1;
	
	@SheetColumn(value = "PaymentBranch2")
	private String paymentBranch2;
	
	@SheetColumn(value = "AccountClass")
	private String accountclass;
	
	@SheetColumn(value = "Branch")
	private String branch;

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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public String getRedemptionExecutionDate() {
		return redemptionExecutionDate;
	}

	public void setRedemptionExecutionDate(String redemptionExecutionDate) {
		this.redemptionExecutionDate = redemptionExecutionDate;
	}

	public String getPayOutComponent() {
		return payOutComponent;
	}

	public void setPayOutComponent(String payOutComponent) {
		this.payOutComponent = payOutComponent;
	}

	public String getPayOutType1() {
		return payOutType1;
	}

	public void setPayOutType1(String payOutType1) {
		this.payOutType1 = payOutType1;
	}

	public String getPayOutType2() {
		return payOutType2;
	}

	public void setPayOutType2(String payOutType2) {
		this.payOutType2 = payOutType2;
	}

	public String getPercentage1() {
		return percentage1;
	}

	public void setPercentage1(String percentage1) {
		this.percentage1 = percentage1;
	}

	public String getPercentage2() {
		return percentage2;
	}

	public void setPercentage2(String percentage2) {
		this.percentage2 = percentage2;
	}

	public String getRedemptionAmountInPayOut1() {
		return redemptionAmountInPayOut1;
	}

	public void setRedemptionAmountInPayOut1(String redemptionAmountInPayOut1) {
		this.redemptionAmountInPayOut1 = redemptionAmountInPayOut1;
	}

	public String getRedemptionAmountInPayOut2() {
		return redemptionAmountInPayOut2;
	}

	public void setRedemptionAmountInPayOut2(String redemptionAmountInPayOut2) {
		this.redemptionAmountInPayOut2 = redemptionAmountInPayOut2;
	}

	public String getOffsetAccount1() {
		return offsetAccount1;
	}

	public void setOffsetAccount1(String offsetAccount1) {
		this.offsetAccount1 = offsetAccount1;
	}

	public String getOffsetAccount2() {
		return offsetAccount2;
	}

	public void setOffsetAccount2(String offsetAccount2) {
		this.offsetAccount2 = offsetAccount2;
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

	public String getPaymentBranch1() {
		return paymentBranch1;
	}

	public void setPaymentBranch1(String paymentBranch1) {
		this.paymentBranch1 = paymentBranch1;
	}

	public String getPaymentBranch2() {
		return paymentBranch2;
	}

	public void setPaymentBranch2(String paymentBranch2) {
		this.paymentBranch2 = paymentBranch2;
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

	@Override
	public String toString() {
		return "ICDRDSIM_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", fastpath=" + fastpath + ", accountNumber=" + accountNumber + ", redemptionMode=" + redemptionMode
				+ ", redemptionAmount=" + redemptionAmount + ", redemptionExecutionDate=" + redemptionExecutionDate
				+ ", payOutComponent=" + payOutComponent + ", payOutType1=" + payOutType1 + ", payOutType2="
				+ payOutType2 + ", percentage1=" + percentage1 + ", percentage2=" + percentage2
				+ ", redemptionAmountInPayOut1=" + redemptionAmountInPayOut1 + ", redemptionAmountInPayOut2="
				+ redemptionAmountInPayOut2 + ", offsetAccount1=" + offsetAccount1 + ", offsetAccount2="
				+ offsetAccount2 + ", bankCode=" + bankCode + ", chequeDate=" + chequeDate + ", paymentBranch1="
				+ paymentBranch1 + ", paymentBranch2=" + paymentBranch2 + ", accountclass=" + accountclass + ", branch="
				+ branch + "]";
	}

	
}
