package com.jmr.testsuite.fas.page.pc;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "PCSECDIS")
public class PCSCNLEX_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ConsolidatedStatus")
	private String consolidatedstatus;
	
	@SheetColumn(value = "CustomerNumber")
	private String customernumber;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "AccountCurrency")
	private String accountcurrency;
	
	@SheetColumn(value = "Amount")
	private String amount;

	@SheetColumn(value = "CustomerEntryValueDate")
	private String customerentryvaluedate;
	
	@SheetColumn(value = "CustomerEntryDate")
	private String customerentrydate;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "AccountEntryRefNo")
	private String accountentryrefno;
	
	@SheetColumn(value = "ExceptionQueue")
	private String exceptionqueue;
	
	@SheetColumn(value = "TransactionCount")
	private String transactioncount;
	
	@SheetColumn(value = "CustomerAccountBranch")
	private String customeraccountbranch;

	@SheetColumn(value = "ConsoleRef")
	private String consoleref;
	
	@SheetColumn(value = "ProductType")
	private String producttype;

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

	

	public String getConsolidatedstatus() {
		return consolidatedstatus;
	}

	public void setConsolidatedstatus(String consolidatedstatus) {
		this.consolidatedstatus = consolidatedstatus;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountcurrency() {
		return accountcurrency;
	}

	public void setAccountcurrency(String accountcurrency) {
		this.accountcurrency = accountcurrency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCustomerentryvaluedate() {
		return customerentryvaluedate;
	}

	public void setCustomerentryvaluedate(String customerentryvaluedate) {
		this.customerentryvaluedate = customerentryvaluedate;
	}

	public String getCustomerentrydate() {
		return customerentrydate;
	}

	public void setCustomerentrydate(String customerentrydate) {
		this.customerentrydate = customerentrydate;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getAccountentryrefno() {
		return accountentryrefno;
	}

	public void setAccountentryrefno(String accountentryrefno) {
		this.accountentryrefno = accountentryrefno;
	}

	public String getExceptionqueue() {
		return exceptionqueue;
	}

	public void setExceptionqueue(String exceptionqueue) {
		this.exceptionqueue = exceptionqueue;
	}

	public String getTransactioncount() {
		return transactioncount;
	}

	public void setTransactioncount(String transactioncount) {
		this.transactioncount = transactioncount;
	}

	public String getCustomeraccountbranch() {
		return customeraccountbranch;
	}

	public void setCustomeraccountbranch(String customeraccountbranch) {
		this.customeraccountbranch = customeraccountbranch;
	}

	public String getConsoleref() {
		return consoleref;
	}

	public void setConsoleref(String consoleref) {
		this.consoleref = consoleref;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	@Override
	public String toString() {
		return "PCSCNLEX_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", consolidatedstatus=" + consolidatedstatus + ", customernumber="
				+ customernumber + ", accountnumber=" + accountnumber + ", accountcurrency=" + accountcurrency
				+ ", amount=" + amount + ", customerentryvaluedate=" + customerentryvaluedate + ", customerentrydate="
				+ customerentrydate + ", productcode=" + productcode + ", accountentryrefno=" + accountentryrefno
				+ ", exceptionqueue=" + exceptionqueue + ", transactioncount=" + transactioncount
				+ ", customeraccountbranch=" + customeraccountbranch + ", consoleref=" + consoleref + ", producttype="
				+ producttype + "]";
	}

	
	


}
