package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLDPYMNT")

public class CLDPYMNT_Page {
	

private String testCaseResult;

	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "LoanBranch")
	private String loanbranch;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "EventSequenceNumber")
	private String eventsequencenumber;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "addbutton")
	private String addbutton;
	
	@SheetColumn(value = "PaymentMode")
	private String paymentmode;
	
	@SheetColumn(value = "SettlementAmount")
	private String settlementamount;
	
	@SheetColumn(value = "SettlementBranch")
	private String settlementbranch;
	
	@SheetColumn(value = "SettlementCurrency")
	private String settlementcurrency;
	
	@SheetColumn(value = "LoanCurrencyEquivalent")
	private String loancurrencyequvialent;
	
	@SheetColumn(value = "SettlementAccount")
	private String settlementaccount;
	
	@SheetColumn(value = "PopulateDue")
	private String populatedue;
	
	@SheetColumn(value = "allocatebuttn")
	private String allocatebutton;
	
	@SheetColumn(value = "AdvancePayment")
	private String advancepayment;
	
	@SheetColumn(value = "New")
	private String newdata;
	
	@SheetColumn(value = "Authorise")
	private String authorize;
	
	
	
	

	public String getNewdata() {
		return newdata;
	}

	public void setNewdata(String newdata) {
		this.newdata = newdata;
	}

	public String getAuthorize() {
		return authorize;
	}

	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}

	public String getAdvancepayment() {
		return advancepayment;
	}

	public void setAdvancepayment(String advancepayment) {
		this.advancepayment = advancepayment;
	}

	public String getSettlementaccount() {
		return settlementaccount;
	}

	public void setSettlementaccount(String settlementaccount) {
		this.settlementaccount = settlementaccount;
	}

	public String getAllocatebutton() {
		return allocatebutton;
	}

	public void setAllocatebutton(String allocatebutton) {
		this.allocatebutton = allocatebutton;
	}

	public String getTestCaseResult() {
		return testCaseResult;
	}

	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public String getFastpath() {
		return fastpath;
	}

	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}

	public String getLoanbranch() {
		return loanbranch;
	}

	public void setLoanbranch(String loanbranch) {
		this.loanbranch = loanbranch;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getEventsequencenumber() {
		return eventsequencenumber;
	}

	public void setEventsequencenumber(String eventsequencenumber) {
		this.eventsequencenumber = eventsequencenumber;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getAddbutton() {
		return addbutton;
	}

	public void setAddbutton(String addbutton) {
		this.addbutton = addbutton;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public String getSettlementamount() {
		return settlementamount;
	}

	public void setSettlementamount(String settlementamount) {
		this.settlementamount = settlementamount;
	}

	public String getLoancurrencyequvialent() {
		return loancurrencyequvialent;
	}

	public void setLoancurrencyequvialent(String loancurrencyequvialent) {
		this.loancurrencyequvialent = loancurrencyequvialent;
	}

	public String getSettlementbranch() {
		return settlementbranch;
	}

	public void setSettlementbranch(String settlementbranch) {
		this.settlementbranch = settlementbranch;
	}

	public String getPopulatedue() {
		return populatedue;
	}

	public void setPopulatedue(String populatedue) {
		this.populatedue = populatedue;
	}
	
	public String getSettlementcurrency() {
		return settlementcurrency;
	}

	public void setSettlementcurrency(String settlementcurrency) {
		this.settlementcurrency = settlementcurrency;
	}

	@Override
	public String toString() {
		return "CLDPYMNT_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", loanbranch=" + loanbranch + ", accountnumber=" + accountnumber
				+ ", eventsequencenumber=" + eventsequencenumber + ", valuedate=" + valuedate + ", addbutton="
				+ addbutton + ", paymentmode=" + paymentmode + ", settlementamount=" + settlementamount
				+ ", settlementbranch=" + settlementbranch + ", settlementcurrency=" + settlementcurrency
				+ ", loancurrencyequvialent=" + loancurrencyequvialent + ", settlementaccount=" + settlementaccount
				+ ", populatedue=" + populatedue + ", allocatebutton=" + allocatebutton + ", advancepayment="
				+ advancepayment + ", newdata=" + newdata + ", authorize=" + authorize + "]";
	}

	
}
