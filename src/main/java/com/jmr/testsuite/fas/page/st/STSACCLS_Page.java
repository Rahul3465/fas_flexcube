package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSACCLS")
public class STSACCLS_Page {

	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "AuthorizedStatus")
	private String authorisestatus;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountClass")
	private String accountclass;
	
	@SheetColumn(value = "AccountStatus")
	private String accountstatus;

	@SheetColumn(value = "AccountType")
	private String accounttype;
	
	@SheetColumn(value = "NaturalGL")
	private String naturalgl;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "Type")
	private String type;
	
	@SheetColumn(value = "DormancyDays")
	private String dormancydays;
	
	@SheetColumn(value = "Search")
	private String search;
	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
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

	public String getAuthorisestatus() {
		return authorisestatus;
	}

	public void setAuthorisestatus(String authorisestatus) {
		this.authorisestatus = authorisestatus;
	}

	public String getFastpath() {
		return fastpath;
	}

	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getNaturalgl() {
		return naturalgl;
	}

	public void setNaturalgl(String naturalgl) {
		this.naturalgl = naturalgl;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDormancydays() {
		return dormancydays;
	}

	public void setDormancydays(String dormancydays) {
		this.dormancydays = dormancydays;
	}
	
	

	public String getAccountclass() {
		return accountclass;
	}

	public void setAccountclass(String accountclass) {
		this.accountclass = accountclass;
	}

	@Override
	public String toString() {
		return "STSACCLS_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", authorisestatus=" + authorisestatus + ", fastpath=" + fastpath + ", accountclass=" + accountclass
				+ ", accountstatus=" + accountstatus + ", accounttype=" + accounttype + ", naturalgl=" + naturalgl
				+ ", recordstatus=" + recordstatus + ", type=" + type + ", dormancydays=" + dormancydays + ", search="
				+ search + "]";
	}

	
	
	
}
