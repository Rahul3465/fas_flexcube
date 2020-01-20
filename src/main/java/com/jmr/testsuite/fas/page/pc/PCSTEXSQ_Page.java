package com.jmr.testsuite.fas.page.pc;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "PCSTEXSQ")

public class PCSTEXSQ_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ContractRef")
	private String contractref;
	
	@SheetColumn(value = "ProductCategory")
	private String productcategory;
	
	@SheetColumn(value = "ExceptionQueue")
	private String exceptionqueue;
	
	@SheetColumn(value = "Authorized")
	private String authorized;
	
	@SheetColumn(value = "NextEventCode")
	private String nexteventcode;

	@SheetColumn(value = "AccountEntryRefNo")
	private String accountentryrefno;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "LastEventCode")
	private String lasteventcode;

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

	public String getContractref() {
		return contractref;
	}

	public void setContractref(String contractref) {
		this.contractref = contractref;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getExceptionqueue() {
		return exceptionqueue;
	}

	public void setExceptionqueue(String exceptionqueue) {
		this.exceptionqueue = exceptionqueue;
	}

	public String getAuthorized() {
		return authorized;
	}

	public void setAuthorized(String authorized) {
		this.authorized = authorized;
	}

	public String getNexteventcode() {
		return nexteventcode;
	}

	public void setNexteventcode(String nexteventcode) {
		this.nexteventcode = nexteventcode;
	}

	public String getAccountentryrefno() {
		return accountentryrefno;
	}

	public void setAccountentryrefno(String accountentryrefno) {
		this.accountentryrefno = accountentryrefno;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
	}

	public String getLasteventcode() {
		return lasteventcode;
	}

	public void setLasteventcode(String lasteventcode) {
		this.lasteventcode = lasteventcode;
	}

	@Override
	public String toString() {
		return "PCSTEXSQ_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", contractref=" + contractref + ", productcategory=" + productcategory
				+ ", exceptionqueue=" + exceptionqueue + ", authorized=" + authorized + ", nexteventcode="
				+ nexteventcode + ", accountentryrefno=" + accountentryrefno + ", productcode=" + productcode
				+ ", contractstatus=" + contractstatus + ", lasteventcode=" + lasteventcode + "]";
	}
	
	
	

}
