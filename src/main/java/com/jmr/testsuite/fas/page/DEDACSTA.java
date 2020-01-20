package com.jmr.testsuite.fas.page;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDACSTA")
public class DEDACSTA {

	@SheetColumn("RunMode")
	private String runMode;
	@SheetColumn("Test Case Id")
	private String testCaseId;
	@SheetColumn("Expceted Result")
	private String exceptedResult;

	private String actualResult;

	@SheetColumn("Action")
	private String action;
	@SheetColumn("Batch No")
	private String batchNo;
	@SheetColumn("Branch Code")
	private String branchCode;
	@SheetColumn("Source Code")
	private String sourceCode;
	@SheetColumn("Upload Status")
	private String uploadStatus;

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getExceptedResult() {
		return exceptedResult;
	}

	public void setExceptedResult(String exceptedResult) {
		this.exceptedResult = exceptedResult;
	}

	public String getActualResult() {
		return actualResult;
	}

	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getUploadStatus() {
		return uploadStatus;
	}

	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}

}
