package com.jmr.testsuite.fas.page.pc;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "PCSPEXSQ")
public class PCSPEXSQ_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorizationStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "ExceptionQueue")
	private String exceptionqueue;
	
	@SheetColumn(value = "ContractRef")
	private String contractref;
	
	@SheetColumn(value = "ProductCategory")
	private String productcategory;
	
	@SheetColumn(value = "CustomerAccountBranch")
	private String customeraccountbranch;

	@SheetColumn(value = "CustomerAccountCurrency")
	private String customeraccountccy;
	
	@SheetColumn(value = "CustomerBankCode")
	private String customerbankcode;
	
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "AccountEntryRef")
	private String accountentryref;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "CustomerNumber")
	private String customernumber;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;

	@SheetColumn(value = "ActiveDate")
	private String activedate;
	
	@SheetColumn(value = "LocalClearingAccount")
	private String localclearingaccount;

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

	public String getAuthorizestatus() {
		return authorizestatus;
	}

	public void setAuthorizestatus(String authorizestatus) {
		this.authorizestatus = authorizestatus;
	}

	public String getExceptionqueue() {
		return exceptionqueue;
	}

	public void setExceptionqueue(String exceptionqueue) {
		this.exceptionqueue = exceptionqueue;
	}

	public String getContractref() {
		return contractref;
	}

	public void setContractref(String contractref) {
		this.contractref = contractref;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getCustomeraccountbranch() {
		return customeraccountbranch;
	}

	public void setCustomeraccountbranch(String customeraccountbranch) {
		this.customeraccountbranch = customeraccountbranch;
	}

	public String getCustomeraccountccy() {
		return customeraccountccy;
	}

	public void setCustomeraccountccy(String customeraccountccy) {
		this.customeraccountccy = customeraccountccy;
	}

	public String getCustomerbankcode() {
		return customerbankcode;
	}

	public void setCustomerbankcode(String customerbankcode) {
		this.customerbankcode = customerbankcode;
	}

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
	}

	public String getAccountentryref() {
		return accountentryref;
	}

	public void setAccountentryref(String accountentryref) {
		this.accountentryref = accountentryref;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
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

	public String getActivedate() {
		return activedate;
	}

	public void setActivedate(String activedate) {
		this.activedate = activedate;
	}

	public String getLocalclearingaccount() {
		return localclearingaccount;
	}

	public void setLocalclearingaccount(String localclearingaccount) {
		this.localclearingaccount = localclearingaccount;
	}

	@Override
	public String toString() {
		return "PCSPEXSQ_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorizestatus=" + authorizestatus + ", exceptionqueue="
				+ exceptionqueue + ", contractref=" + contractref + ", productcategory=" + productcategory
				+ ", customeraccountbranch=" + customeraccountbranch + ", customeraccountccy=" + customeraccountccy
				+ ", customerbankcode=" + customerbankcode + ", contractstatus=" + contractstatus + ", accountentryref="
				+ accountentryref + ", productcode=" + productcode + ", customernumber=" + customernumber
				+ ", accountnumber=" + accountnumber + ", activedate=" + activedate + ", localclearingaccount="
				+ localclearingaccount + "]";
	}
	
	
}
