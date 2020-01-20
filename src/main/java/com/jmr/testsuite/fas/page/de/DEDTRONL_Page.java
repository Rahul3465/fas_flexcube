package com.jmr.testsuite.fas.page.de;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDTRONL")
public class DEDTRONL_Page
{
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "BatchNumber")
	private String batchnumber;
	
	@SheetColumn(value = "Description")
	private String description;
	
	@SheetColumn(value = "Balancing")
	private String balancing;
	
	@SheetColumn(value = "AccountBranch")
	private String accountbranch;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "DebitorCreditIndicator")
	private String debitorcreditindicator;
	
	@SheetColumn(value = "TransactionCode")
	private String transactioncode;
	
	@SheetColumn(value = "PeriodCode")
	private String periodcode;
	
	@SheetColumn(value = "FinancialCycle")
	private String financialcycle;

	@SheetColumn(value = "AdditionalText")
	private String additionaltext;	
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "CButton")
	private String cbutton;

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

	public String getBatchnumber() {
		return batchnumber;
	}

	public void setBatchnumber(String batchnumber) {
		this.batchnumber = batchnumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBalancing() {
		return balancing;
	}

	public void setBalancing(String balancing) {
		this.balancing = balancing;
	}

	public String getAccountbranch() {
		return accountbranch;
	}

	public void setAccountbranch(String accountbranch) {
		this.accountbranch = accountbranch;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDebitorcreditindicator() {
		return debitorcreditindicator;
	}

	public void setDebitorcreditindicator(String debitorcreditindicator) {
		this.debitorcreditindicator = debitorcreditindicator;
	}

	public String getTransactioncode() {
		return transactioncode;
	}

	public void setTransactioncode(String transactioncode) {
		this.transactioncode = transactioncode;
	}

	public String getPeriodcode() {
		return periodcode;
	}

	public void setPeriodcode(String periodcode) {
		this.periodcode = periodcode;
	}

	public String getFinancialcycle() {
		return financialcycle;
	}

	public void setFinancialcycle(String financialcycle) {
		this.financialcycle = financialcycle;
	}

	public String getAdditionaltext() {
		return additionaltext;
	}

	public void setAdditionaltext(String additionaltext) {
		this.additionaltext = additionaltext;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getCbutton() {
		return cbutton;
	}

	public void setCbutton(String cbutton) {
		this.cbutton = cbutton;
	}

	@Override
	public String toString() {
		return "DEDTRONL_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", batchnumber=" + batchnumber + ", description=" + description
				+ ", balancing=" + balancing + ", accountbranch=" + accountbranch + ", accountnumber=" + accountnumber
				+ ", currency=" + currency + ", amount=" + amount + ", debitorcreditindicator=" + debitorcreditindicator
				+ ", transactioncode=" + transactioncode + ", periodcode=" + periodcode + ", financialcycle="
				+ financialcycle + ", additionaltext=" + additionaltext + ", valuedate=" + valuedate + ", cbutton="
				+ cbutton + "]";
	}

}