package com.jmr.testsuite.fas.page.ac;


import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "ACDACTRN")
public class ACDACTRN_Page {
	
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "AccountBranch")
	private String accountbranch;
	
	@SheetColumn(value = "NoOfTransaction")
	private String nooftrans;

	@SheetColumn(value = "CustomerCategory")
	private String customercategory;

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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountbranch() {
		return accountbranch;
	}

	public void setAccountbranch(String accountbranch) {
		this.accountbranch = accountbranch;
	}

	public String getNooftrans() {
		return nooftrans;
	}

	public void setNooftrans(String nooftrans) {
		this.nooftrans = nooftrans;
	}

	public String getCustomercategory() {
		return customercategory;
	}

	public void setCustomercategory(String customercategory) {
		this.customercategory = customercategory;
	}

	@Override
	public String toString() {
		return "ACDACTRN_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", accountnumber=" + accountnumber + ", accountbranch=" + accountbranch + ", nooftrans=" + nooftrans
				+ ", customercategory=" + customercategory + "]";
	}
	
	

}
