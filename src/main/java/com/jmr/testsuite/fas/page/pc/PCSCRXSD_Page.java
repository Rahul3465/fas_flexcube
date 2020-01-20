package com.jmr.testsuite.fas.page.pc;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "PCSCRXSD")
public class PCSCRXSD_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ContractReference")
	private String contractref;
	
	@SheetColumn(value = "AccountEntryRefNo")
	private String accountentryrefno;
	
	@SheetColumn(value = "Productcode")
	private String productcode;

	@SheetColumn(value = "Customernumber")
	private String customernumber;
	
	@SheetColumn(value = "BankCode")
	private String bankcode;
	
	@SheetColumn(value = "AccountBranch")
	private String accountbranch;
	
	@SheetColumn(value = "LastEventCode")
	private String lasteventcode;

	@SheetColumn(value = "NextEventCode")
	private String nexteventcode;

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

	public String getContractref() {
		return contractref;
	}

	public void setContractref(String contractref) {
		this.contractref = contractref;
	}

	public String getAccountentryrefno() {
		return accountentryrefno;
	}

	public void setAccountentryrefno(String accountentryrefno) {
		this.accountentryrefno = accountentryrefno;
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

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getAccountbranch() {
		return accountbranch;
	}

	public void setAccountbranch(String accountbranch) {
		this.accountbranch = accountbranch;
	}

	public String getLasteventcode() {
		return lasteventcode;
	}

	public void setLasteventcode(String lasteventcode) {
		this.lasteventcode = lasteventcode;
	}

	public String getNexteventcode() {
		return nexteventcode;
	}

	public void setNexteventcode(String nexteventcode) {
		this.nexteventcode = nexteventcode;
	}

	@Override
	public String toString() {
		return "PCSCRXSD_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", contractref=" + contractref + ", accountentryrefno=" + accountentryrefno
				+ ", productcode=" + productcode + ", customernumber=" + customernumber + ", bankcode=" + bankcode
				+ ", accountbranch=" + accountbranch + ", lasteventcode=" + lasteventcode + ", nexteventcode="
				+ nexteventcode + "]";
	}
	
	

}
