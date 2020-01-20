package com.jmr.testsuite.fas.page.pc;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "PCSPRXSQ")
public class PCSPRXSQ_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "InstrumentRef")
	private String instrumentref;
	
	@SheetColumn(value = "ProductCategory")
	private String productcategory;
	
	@SheetColumn(value = "productCode")
	private String productcode;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "CustomerAccountBranch")
	private String customeraccountbranch;

	@SheetColumn(value = "CustomerNumber")
	private String customernumber;

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

	public String getInstrumentref() {
		return instrumentref;
	}

	public void setInstrumentref(String instrumentref) {
		this.instrumentref = instrumentref;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCustomeraccountbranch() {
		return customeraccountbranch;
	}

	public void setCustomeraccountbranch(String customeraccountbranch) {
		this.customeraccountbranch = customeraccountbranch;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	@Override
	public String toString() {
		return "PCSPRXSQ_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", instrumentref=" + instrumentref + ", productcategory=" + productcategory
				+ ", productcode=" + productcode + ", accountnumber=" + accountnumber + ", customeraccountbranch="
				+ customeraccountbranch + ", customernumber=" + customernumber + "]";
	}
	
	
	
	

}
