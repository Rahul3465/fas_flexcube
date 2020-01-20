package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLSADOCH")

public class CLSADOCH_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "InternalRefNo")
	private String internalrefno;

	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Contractstatus")
	private String contstatus;
	
	@SheetColumn(value = "Branch")
	private String branch;
	
	@SheetColumn(value = "AuthorisedStatus")
	private String authstatus;

	@SheetColumn(value = "Search")
	private String search;

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

	public String getInternalrefno() {
		return internalrefno;
	}

	public void setInternalrefno(String internalrefno) {
		this.internalrefno = internalrefno;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getContstatus() {
		return contstatus;
	}

	public void setContstatus(String contstatus) {
		this.contstatus = contstatus;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAuthstatus() {
		return authstatus;
	}

	public void setAuthstatus(String authstatus) {
		this.authstatus = authstatus;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "AdhocChargeSumm_CLSADOCH_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", fastpath=" + fastpath + ", internalrefno=" + internalrefno
				+ ", accountnumber=" + accountnumber + ", contstatus=" + contstatus + ", branch=" + branch
				+ ", authstatus=" + authstatus + ", search=" + search + "]";
	}
		
	

}
