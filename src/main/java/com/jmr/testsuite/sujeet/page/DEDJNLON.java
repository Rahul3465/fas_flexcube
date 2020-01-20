package com.jmr.testsuite.sujeet.page;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDJNLON")
public class DEDJNLON {
	
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;
	
	@SheetColumn("Test Case Id")
	private String testCaseID;

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
	
	@SheetColumn(value = "AccountBranch")
	private String accountBranch;
	
	@SheetColumn(value = "AccountBranch2")
	private String accountBranch2;

	
	@SheetColumn(value = "AccountNumber")
	private String accountNo;
	
	@SheetColumn(value = "AccountNumber2")
	private String accountNo2;
	
	public String getAccountBranch2() {
		return accountBranch2;
	}

	public void setAccountBranch2(String accountBranch2) {
		this.accountBranch2 = accountBranch2;
	}

	public String getAccountNo2() {
		return accountNo2;
	}

	public void setAccountNo2(String accountNo2) {
		this.accountNo2 = accountNo2;
	}

	@SheetColumn(value = "Currency")
	private String ccy;
	
	@SheetColumn(value = "Currency2")
	private String ccy2;

	public String getCcy2() {
		return ccy2;
	}

	public void setCcy2(String ccy2) {
		this.ccy2 = ccy2;
	}

	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "Amount2")
	private String amount2;
	
	@SheetColumn(value = "UserReferenceNo")
	private String userReferenceNumber;
	
	@SheetColumn(value = "UserReferenceNo2")
	private String userReferenceNumber2;
	
	@SheetColumn(value = "Debit/CreditIndicator")
	private String drcrInd;
	
	@SheetColumn(value = "Debit/CreditIndicator2")
	private String drcrInd2;
	
	@SheetColumn(value = "Value Date")
	private String valueDate;
	
	@SheetColumn(value = "TransactionCode")
	private String txnCD;
	
	@SheetColumn(value = "TransactionCode2")
	private String txnCD2;
	
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
	
	@SheetColumn(value = "AdditionalText2")
	private String addlTxt2;
	
	public String getAmount2() {
		return amount2;
	}

	public void setAmount2(String amount2) {
		this.amount2 = amount2;
	}

	public String getUserReferenceNumber2() {
		return userReferenceNumber2;
	}

	public void setUserReferenceNumber2(String userReferenceNumber2) {
		this.userReferenceNumber2 = userReferenceNumber2;
	}

	public String getDrcrInd2() {
		return drcrInd2;
	}

	public void setDrcrInd2(String drcrInd2) {
		this.drcrInd2 = drcrInd2;
	}

	public String getTxnCD2() {
		return txnCD2;
	}

	public void setTxnCD2(String txnCD2) {
		this.txnCD2 = txnCD2;
	}

	public String getAddlTxt2() {
		return addlTxt2;
	}

	public void setAddlTxt2(String addlTxt2) {
		this.addlTxt2 = addlTxt2;
	}

	@SheetColumn(value = "Batch Close")
	private String batCls;

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
	
	public String getUserReferenceNumber() {
		return userReferenceNumber;
	}

	public void setUserReferenceNumber(String userReferenceNumber) {
		this.userReferenceNumber = userReferenceNumber;
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
}