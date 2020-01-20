package com.jmr.testsuite.fas.page.de;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDUPONL")
public class DEDUPONL_Page
{
	@SheetColumn(value = "TestcaseResult")
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;
	
	@SheetColumn("Test Case Id")
	private String testCaseID;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;

	@SheetColumn(value = "SourceCode")
	private String sourceCode;
	
	
	@SheetColumn(value = "BATCHNUMBER")
	private String batchNumber;
	
	@SheetColumn(value = "PositioningRequired")
	private String positionRequired;
	
	@SheetColumn(value = "CreditDebit_Check")
	private String creditDebitCheck;
	
	@SheetColumn(value = "Variance")
	private String variance;

	@SheetColumn(value = "IgnoreOverrides")
	private String ignoreOverrides;
	
	@SheetColumn(value = "Delete")
	private String deleteButton;

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

	public String getTestCaseID() {
		return testCaseID;
	}

	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
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

	public String getPositionRequired() {
		return positionRequired;
	}

	public void setPositionRequired(String positionRequired) {
		this.positionRequired = positionRequired;
	}

	public String getCreditDebitCheck() {
		return creditDebitCheck;
	}

	public void setCreditDebitCheck(String creditDebitCheck) {
		this.creditDebitCheck = creditDebitCheck;
	}

	public String getVariance() {
		return variance;
	}

	public void setVariance(String variance) {
		this.variance = variance;
	}

	public String getIgnoreOverrides() {
		return ignoreOverrides;
	}

	public void setIgnoreOverrides(String ignoreOverrides) {
		this.ignoreOverrides = ignoreOverrides;
	}

	public String getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(String deleteButton) {
		this.deleteButton = deleteButton;
	}

	@Override
	public String toString() {
		return "DEDUPONL_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseID=" + testCaseID
				+ ", fastpath=" + fastpath + ", sourceCode=" + sourceCode + ", batchNumber=" + batchNumber
				+ ", positionRequired=" + positionRequired + ", creditDebitCheck=" + creditDebitCheck + ", variance="
				+ variance + ", ignoreOverrides=" + ignoreOverrides + ", deleteButton=" + deleteButton + "]";
	}

	
}
