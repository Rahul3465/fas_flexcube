package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSLOCHL")
public class STSLOCHL_Page {
	
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
	
	@SheetColumn(value = "Branch")
	private String branch;

	
	@SheetColumn(value = "Year")
	private String year;


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


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "STSLOCHL_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorisedstauts=" + authorisedstauts + ", recordstatus=" + recordstatus
				+ ", branch=" + branch + ", year=" + year + "]";
	}
	
	

}
