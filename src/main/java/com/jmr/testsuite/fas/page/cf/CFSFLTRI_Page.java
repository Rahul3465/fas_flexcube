package com.jmr.testsuite.fas.page.cf;

import io.github.millij.poi.ss.model.annotations.SheetColumn;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
@Component
@Sheet(value = "CFSFLTRI")
public class CFSFLTRI_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "RateCode")
	private String ratecode;
	
	@SheetColumn(value = "BanchCode")
	private String branchcode;

	@SheetColumn(value = "Description")
	private String description;

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

	public String getAuthorizestatus() {
		return authorizestatus;
	}

	public void setAuthorizestatus(String authorizestatus) {
		this.authorizestatus = authorizestatus;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getRatecode() {
		return ratecode;
	}

	public void setRatecode(String ratecode) {
		this.ratecode = ratecode;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CFSFLTRI_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorizestatus=" + authorizestatus + ", recordstatus=" + recordstatus
				+ ", ratecode=" + ratecode + ", branchcode=" + branchcode + ", description=" + description + "]";
	}
	


}
