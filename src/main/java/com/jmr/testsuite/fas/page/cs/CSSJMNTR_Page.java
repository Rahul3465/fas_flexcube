package com.jmr.testsuite.fas.page.cs;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "CSSJMNTR")
public class CSSJMNTR_Page
{
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "Search")
	private String search;
	
	@SheetColumn(value = "Reset")
	private String reset;
	
	@SheetColumn(value = "AdvancedSearch")
	private String advancedSearch;
	
	@SheetColumn(value = "JobId")
	private String jobId;
	
	@SheetColumn(value = "SchemaUser")
	private String schemaUser;
	
	@SheetColumn(value = "Instance")
	private String instance;
	
	@SheetColumn(value = "What")
	private String what;
	
	@SheetColumn(value = "LastDate")
	private String lastDate;
	
	@SheetColumn(value = "Failures")
	private String failures;

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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getReset() {
		return reset;
	}

	public void setReset(String reset) {
		this.reset = reset;
	}

	public String getAdvancedSearch() {
		return advancedSearch;
	}

	public void setAdvancedSearch(String advancedSearch) {
		this.advancedSearch = advancedSearch;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getSchemaUser() {
		return schemaUser;
	}

	public void setSchemaUser(String schemaUser) {
		this.schemaUser = schemaUser;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getFailures() {
		return failures;
	}

	public void setFailures(String failures) {
		this.failures = failures;
	}

	@Override
	public String toString() {
		return "CSSJMNTR_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", search=" + search + ", reset=" + reset + ", advancedSearch="
				+ advancedSearch + ", jobId=" + jobId + ", schemaUser=" + schemaUser + ", instance=" + instance
				+ ", what=" + what + ", lastDate=" + lastDate + ", failures=" + failures + "]";
	}
	
}
