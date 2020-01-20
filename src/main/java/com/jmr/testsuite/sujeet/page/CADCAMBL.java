package com.jmr.testsuite.sujeet.page;

import io.github.millij.poi.ss.model.annotations.SheetColumn;

public class CADCAMBL {
	
	private String testCaseResult;

	@SheetColumn(value = "Run Mode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "BRANCH")
	private String branch;
		
	@SheetColumn(value = "CUSTOMER")
	private String customerNumber;
	
	@SheetColumn(value = "AMOUNT")
	private String amount;
	
	@SheetColumn(value = "EFFECTIVE_DATE")
	private String effectiveDate;
	
	@SheetColumn(value = "EXPIRY_DATE")
	private String expiryDate;
	
	@SheetColumn(value = "REMARKS")
	private String remarks;

	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

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
	
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
