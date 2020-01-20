package com.jmr.testsuite.fas.page.st;


import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSTDTOP")
public class STSTDTOP_Page {

	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorisestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "Account")
	private String account;

	
	@SheetColumn(value = "TopUpValueDate")
	private String topupvaluedate;
	
	@SheetColumn(value = "TopUpAmount")
	private String topupamount;
	
	@SheetColumn(value = "TopUpRefNumber")
	private String topuprefnumber;
	
	@SheetColumn(value = "Customernumber")
	private String customernumber;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "Branch")
	private String branch;

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

	public String getAuthorisestatus() {
		return authorisestatus;
	}

	public void setAuthorisestatus(String authorisestatus) {
		this.authorisestatus = authorisestatus;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTopupvaluedate() {
		return topupvaluedate;
	}

	public void setTopupvaluedate(String topupvaluedate) {
		this.topupvaluedate = topupvaluedate;
	}

	public String getTopupamount() {
		return topupamount;
	}

	public void setTopupamount(String topupamount) {
		this.topupamount = topupamount;
	}

	public String getTopuprefnumber() {
		return topuprefnumber;
	}

	public void setTopuprefnumber(String topuprefnumber) {
		this.topuprefnumber = topuprefnumber;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "STSTDTOP_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorisestatus=" + authorisestatus + ", recordstatus=" + recordstatus
				+ ", account=" + account + ", topupvaluedate=" + topupvaluedate + ", topupamount=" + topupamount
				+ ", topuprefnumber=" + topuprefnumber + ", customernumber=" + customernumber + ", currency=" + currency
				+ ", branch=" + branch + "]";
	}
	
	

}
