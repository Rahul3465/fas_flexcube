package com.jmr.testsuite.fas.page.de;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DESMJONL")
public class DESMJONL_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "ReferenceNumber")
	private String refrencenumber;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "BatchNumber")
	private String batchnumber;
	
	@SheetColumn(value = "CurrentNumber")
	private String currentnumber;
	
	@SheetColumn(value = "Account")
	private String accountnumber;
	
	@SheetColumn(value = "CurrencyCode")
	private String currencycode;
	
	@SheetColumn(value = "DrCr")
	private String debitcredit;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "ExchangeRate")
	private String exchangerate;
	
	@SheetColumn(value = "AuthorizationStatus")
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

	public String getRefrencenumber() {
		return refrencenumber;
	}

	public void setRefrencenumber(String refrencenumber) {
		this.refrencenumber = refrencenumber;
	}

	public String getFastpath() {
		return fastpath;
	}

	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}

	public String getBatchnumber() {
		return batchnumber;
	}

	public void setBatchnumber(String batchnumber) {
		this.batchnumber = batchnumber;
	}

	public String getCurrentnumber() {
		return currentnumber;
	}

	public void setCurrentnumber(String currentnumber) {
		this.currentnumber = currentnumber;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getDebitcredit() {
		return debitcredit;
	}

	public void setDebitcredit(String debitcredit) {
		this.debitcredit = debitcredit;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExchangerate() {
		return exchangerate;
	}

	public void setExchangerate(String exchangerate) {
		this.exchangerate = exchangerate;
	}

	public String getAuthorizedstatus() {
		return authorizedstatus;
	}

	public void setAuthorizedstatus(String authorizedstatus) {
		this.authorizedstatus = authorizedstatus;
	}

	@Override
	public String toString() {
		return "DESMJONL_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", refrencenumber=" + refrencenumber + ", fastpath=" + fastpath + ", batchnumber=" + batchnumber
				+ ", currentnumber=" + currentnumber + ", accountnumber=" + accountnumber + ", currencycode="
				+ currencycode + ", debitcredit=" + debitcredit + ", amount=" + amount + ", exchangerate="
				+ exchangerate + ", authorizedstatus=" + authorizedstatus + "]";
	}

}
