package com.jmr.testsuite.fas.page.pc;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "PCDTRONL")
public class PCDTRONL_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ProductCategory")
	private String productcategory;
	
	@SheetColumn(value = "BatchNumber")
	private String batchnumber;

	@SheetColumn(value = "BatchDescription")
	private String batchdescription;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "BankCode")
	private String Bankcode;
	
	@SheetColumn(value = "BankName")
	private String bankname;
	
	@SheetColumn(value = "CounterpartyAccno")
	private String counterpartyaccno;
	
	@SheetColumn(value = "CounterpartyBankCode")
	private String counterpartybankcode;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "ExchangeRate")
	private String exchangerate;
	
	@SheetColumn(value = "CutoffStatus")
	private String cutoffstatus;
	
	@SheetColumn(value = "ActivationDate")
	private String activationdate;
	
	

	public String getActivationdate() {
		return activationdate;
	}

	public void setActivationdate(String activationdate) {
		this.activationdate = activationdate;
	}

	public String getCutoffstatus() {
		return cutoffstatus;
	}

	public void setCutoffstatus(String cutoffstatus) {
		this.cutoffstatus = cutoffstatus;
	}

	public String getExchangerate() {
		return exchangerate;
	}

	public void setExchangerate(String exchangerate) {
		this.exchangerate = exchangerate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCounterpartyaccno() {
		return counterpartyaccno;
	}

	public void setCounterpartyaccno(String counterpartyaccno) {
		this.counterpartyaccno = counterpartyaccno;
	}

	public String getCounterpartybankcode() {
		return counterpartybankcode;
	}

	public void setCounterpartybankcode(String counterpartybankcode) {
		this.counterpartybankcode = counterpartybankcode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankcode() {
		return Bankcode;
	}

	public void setBankcode(String bankcode) {
		Bankcode = bankcode;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
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

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getBatchnumber() {
		return batchnumber;
	}

	public void setBatchnumber(String batchnumber) {
		this.batchnumber = batchnumber;
	}

	public String getBatchdescription() {
		return batchdescription;
	}

	public void setBatchdescription(String batchdescription) {
		this.batchdescription = batchdescription;
	}

	@Override
	public String toString() {
		return "PCDTRONL_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", productcategory=" + productcategory + ", batchnumber=" + batchnumber
				+ ", batchdescription=" + batchdescription + ", productcode=" + productcode + ", accountnumber="
				+ accountnumber + ", Bankcode=" + Bankcode + ", bankname=" + bankname + ", counterpartyaccno="
				+ counterpartyaccno + ", counterpartybankcode=" + counterpartybankcode + ", amount=" + amount
				+ ", exchangerate=" + exchangerate + ", cutoffstatus=" + cutoffstatus + ", activationdate="
				+ activationdate + "]";
	}

	
	
}
