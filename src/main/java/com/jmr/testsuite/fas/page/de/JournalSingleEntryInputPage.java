package com.jmr.testsuite.fas.page.de;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDTRONL")
public class JournalSingleEntryInputPage {

	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	@SheetColumn(value = "Batch Number")
	private String batchNumber;
	@SheetColumn(value = "Description")
	private String description;
	@SheetColumn(value = "Debit")
	private String debit;
	@SheetColumn(value = "Credit")
	private String credit;
	@SheetColumn(value = "Func Id")
	private String funcId;
	@SheetColumn(value = "Account Branch")
	private String accountBranch;
	@SheetColumn(value = "Account Number")
	private String accountNo;
	@SheetColumn(value = "Currency")
	private String ccy;
	@SheetColumn(value = "Amount")
	private String amount;
	@SheetColumn(value = "Debit/Credit Indicator")
	private String drcrInd;
	@SheetColumn(value = "Value Date")
	private String valueDate;
	@SheetColumn(value = "Transaction Code")
	private String txnCD;
	@SheetColumn(value = "Exchange Rate")
	private String exRate;
	@SheetColumn(value = "Period Code")
	private String periodCode;
	@SheetColumn(value = "Related Customer")
	private String relCustomer;
	@SheetColumn(value = "MIS Group")
	private String misGrp;
	@SheetColumn(value = "Instrument Number")
	private String instNo;
	@SheetColumn(value = "Additional Text")
	private String addlTxt;
	@SheetColumn(value = "Batch Close")
	private String batCls;

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

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getFuncId() {
		return funcId;
	}

	public void setFuncId(String funcId) {
		this.funcId = funcId;
	}

	public String getAccountBranch() {
		return accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDrcrInd() {
		return drcrInd;
	}

	public void setDrcrInd(String drcrInd) {
		this.drcrInd = drcrInd;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getTxnCD() {
		return txnCD;
	}

	public void setTxnCD(String txnCD) {
		this.txnCD = txnCD;
	}

	public String getExRate() {
		return exRate;
	}

	public void setExRate(String exRate) {
		this.exRate = exRate;
	}

	public String getPeriodCode() {
		return periodCode;
	}

	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}

	public String getRelCustomer() {
		return relCustomer;
	}

	public void setRelCustomer(String relCustomer) {
		this.relCustomer = relCustomer;
	}

	public String getMisGrp() {
		return misGrp;
	}

	public void setMisGrp(String misGrp) {
		this.misGrp = misGrp;
	}

	public String getInstNo() {
		return instNo;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}

	public String getAddlTxt() {
		return addlTxt;
	}

	public void setAddlTxt(String addlTxt) {
		this.addlTxt = addlTxt;
	}

	public String getBatCls() {
		return batCls;
	}

	public void setBatCls(String batCls) {
		this.batCls = batCls;
	}

	public String getTestCaseResult() {
		return testCaseResult;
	}

	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}

	@Override
	public String toString() {
		return "JournalSingleEntryInputPage [testCaseResult=" + testCaseResult + ", runMode=" + runMode
				+ ", testCaseId=" + testCaseId + ", batchNumber=" + batchNumber + ", description=" + description
				+ ", debit=" + debit + ", credit=" + credit + ", funcId=" + funcId + ", accountBranch=" + accountBranch
				+ ", accountNo=" + accountNo + ", ccy=" + ccy + ", amount=" + amount + ", drcrInd=" + drcrInd
				+ ", valueDate=" + valueDate + ", txnCD=" + txnCD + ", exRate=" + exRate + ", periodCode=" + periodCode
				+ ", relCustomer=" + relCustomer + ", misGrp=" + misGrp + ", instNo=" + instNo + ", addlTxt=" + addlTxt
				+ ", batCls=" + batCls + "]";
	}
	
}
