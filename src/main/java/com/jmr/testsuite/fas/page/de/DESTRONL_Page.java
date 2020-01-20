package com.jmr.testsuite.fas.page.de;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DESQUERY")
public class DESTRONL_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ReferenceNumber")
	private String refrencenumber;
	
	@SheetColumn(value = "BatchNumber")
	private String batchnumber;
	
	@SheetColumn(value = "CurrentNumber")
	private String currencynumber;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "DebitCreditIndicator")
	private String debitcreditindicator;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "AccountBranch")
	private String accountbranch;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizedstatus;

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

	public String getRefrencenumber() {
		return refrencenumber;
	}

	public void setRefrencenumber(String refrencenumber) {
		this.refrencenumber = refrencenumber;
	}

	public String getBatchnumber() {
		return batchnumber;
	}

	public void setBatchnumber(String batchnumber) {
		this.batchnumber = batchnumber;
	}

	public String getCurrencynumber() {
		return currencynumber;
	}

	public void setCurrencynumber(String currencynumber) {
		this.currencynumber = currencynumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDebitcreditindicator() {
		return debitcreditindicator;
	}

	public void setDebitcreditindicator(String debitcreditindicator) {
		this.debitcreditindicator = debitcreditindicator;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountbranch() {
		return accountbranch;
	}

	public void setAccountbranch(String accountbranch) {
		this.accountbranch = accountbranch;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getAuthorizedstatus() {
		return authorizedstatus;
	}

	public void setAuthorizedstatus(String authorizedstatus) {
		this.authorizedstatus = authorizedstatus;
	}

	@Override
	public String toString() {
		return "DESTRONL_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", fastpath=" + fastpath + ", refrencenumber=" + refrencenumber + ", batchnumber=" + batchnumber
				+ ", currencynumber=" + currencynumber + ", currency=" + currency + ", debitcreditindicator="
				+ debitcreditindicator + ", accountnumber=" + accountnumber + ", accountbranch=" + accountbranch
				+ ", valuedate=" + valuedate + ", authorizedstatus=" + authorizedstatus + "]";
	}

	
}
