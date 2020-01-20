package com.jmr.testsuite.fas.page.sw;


import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "SWSCDMNT")
public class SWSCDMNT_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorisedStatus")
	private String authorisedstauts;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "ATM/DebitCardNumber")
	private String atmdebitcardnumber;

	@SheetColumn(value = "CardAccountNumber")
	private String cardaccountnumber;

	@SheetColumn(value = "AccountBranch")
	private String accountbranch;

	@SheetColumn(value = "AccountNumber")
	private String accountnumber;

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

	public String getAuthorisedstauts() {
		return authorisedstauts;
	}

	public void setAuthorisedstauts(String authorisedstauts) {
		this.authorisedstauts = authorisedstauts;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getAtmdebitcardnumber() {
		return atmdebitcardnumber;
	}

	public void setAtmdebitcardnumber(String atmdebitcardnumber) {
		this.atmdebitcardnumber = atmdebitcardnumber;
	}

	public String getCardaccountnumber() {
		return cardaccountnumber;
	}

	public void setCardaccountnumber(String cardaccountnumber) {
		this.cardaccountnumber = cardaccountnumber;
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

	@Override
	public String toString() {
		return "SWSCDMNT_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorisedstauts=" + authorisedstauts + ", recordstatus=" + recordstatus
				+ ", atmdebitcardnumber=" + atmdebitcardnumber + ", cardaccountnumber=" + cardaccountnumber
				+ ", accountbranch=" + accountbranch + ", accountnumber=" + accountnumber + "]";
	}
	
	
	
}
