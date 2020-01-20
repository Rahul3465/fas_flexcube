package com.jmr.testsuite.fas.page.ft;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "FTSRCST")
public class FTSRCST_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "RouteCode")
	private String routecode;
	
	@SheetColumn(value = "Description")
	private String description;
	
	@SheetColumn(value = "NostroAccount")
	private String nostroaccount;
	
	@SheetColumn(value = "CreditAccountBranch")
	private String creditaccountbranch;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;

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

	public String getRoutecode() {
		return routecode;
	}

	public void setRoutecode(String routecode) {
		this.routecode = routecode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNostroaccount() {
		return nostroaccount;
	}

	public void setNostroaccount(String nostroaccount) {
		this.nostroaccount = nostroaccount;
	}

	public String getCreditaccountbranch() {
		return creditaccountbranch;
	}

	public void setCreditaccountbranch(String creditaccountbranch) {
		this.creditaccountbranch = creditaccountbranch;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	@Override
	public String toString() {
		return "FTSRCST_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", authorizestatus=" + authorizestatus + ", recordstatus=" + recordstatus + ", routecode=" + routecode
				+ ", description=" + description + ", nostroaccount=" + nostroaccount + ", creditaccountbranch="
				+ creditaccountbranch + ", productcode=" + productcode + "]";
	}
	
	
	


}
