package com.jmr.testsuite.sujeet.page;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDUPONL")
public class DEDUPONL {
	
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;
	
	@SheetColumn("Test Case Id")
	private String testCaseID;

	@SheetColumn(value = "SOURCE_CODE")
	private String sourceCode;
	
	
	@SheetColumn(value = "BATCH_NUMBER")
	private String batchNumber;
	
	@SheetColumn(value = "POSITIONING_REQUIRED")
	private String positionRequired;
	
	@SheetColumn(value = "CREDIT/DEBIT _CHECK")
	private String creditDebitCheck;
	
	@SheetColumn(value = "VARIANCE")
	private String variance;

	@SheetColumn(value = "IGNORE_OVERRIDES")
	private String ignoreOverrides;
	
	@SheetColumn(value = "DELETE")
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
}