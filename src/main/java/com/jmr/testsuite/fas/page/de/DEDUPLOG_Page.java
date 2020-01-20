package com.jmr.testsuite.fas.page.de;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDUPLOG")
public class DEDUPLOG_Page
{
	@SheetColumn(value = "TestcaseResult")
	private String testCaseResult;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "SourceCode")
	private String sourceCode;
	
	@SheetColumn(value = "BatchNumber")
	private String batchNumber;
	
	@SheetColumn(value = "BranchCode")
	private String branchCode;
	

	@SheetColumn(value = "CurrentNumber")
	private String currentNumber;


	public String getTestCaseResult() {
		return testCaseResult;
	}


	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}


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


	public String getFastpath() {
		return fastpath;
	}


	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}


	public String getSourceCode() {
		return sourceCode;
	}


	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}


	public String getBatchNumber() {
		return batchNumber;
	}


	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}


	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getCurrentNumber() {
		return currentNumber;
	}


	public void setCurrentNumber(String currentNumber) {
		this.currentNumber = currentNumber;
	}


	@Override
	public String toString() {
		return "DEDUPLOG_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", fastpath=" + fastpath + ", sourceCode=" + sourceCode + ", batchNumber=" + batchNumber
				+ ", branchCode=" + branchCode + ", currentNumber=" + currentNumber + "]";
	}
	
	
}
