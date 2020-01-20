package com.jmr.testsuite.fas.page.sms;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "SMSUSRDF")
public class SMSUSRDF_Page {
	
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

	@SheetColumn(value = "HomeBranch")
	private String homebranch;
	
	@SheetColumn(value = "TimeLevel")
	private String timelevel;
	
	@SheetColumn(value = "Classification")
	private String classification;
	
	@SheetColumn(value = "UserIdentification")
	private String useridentification;
	
	@SheetColumn(value = "Language")
	private String language;
	
	@SheetColumn(value = "Name")
	private String name;

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

	public String getHomebranch() {
		return homebranch;
	}

	public void setHomebranch(String homebranch) {
		this.homebranch = homebranch;
	}

	public String getTimelevel() {
		return timelevel;
	}

	public void setTimelevel(String timelevel) {
		this.timelevel = timelevel;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getUseridentification() {
		return useridentification;
	}

	public void setUseridentification(String useridentification) {
		this.useridentification = useridentification;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SMSUSRDF_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorisestatus=" + authorisestatus + ", recordstatus=" + recordstatus
				+ ", homebranch=" + homebranch + ", timelevel=" + timelevel + ", classification=" + classification
				+ ", useridentification=" + useridentification + ", language=" + language + ", name=" + name + "]";
	}
	
	

}
