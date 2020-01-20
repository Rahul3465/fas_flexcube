package com.jmr.testsuite.fas.page.ic;

import io.github.millij.poi.ss.model.annotations.SheetColumn;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
@Component
@Sheet(value = "ICSREDMN")

public class ICSREDMN_Page {
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "Authorized")
	private String authorizestatus;
	
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "RedemptionReferenceNumber")
	private String redemptionrefon;
	
	@SheetColumn(value = "BranchCode")
	private String branchcode;

	@SheetColumn(value = "ParentAccount")
	private String parentaccount;
	
	@SheetColumn(value = "CustomerID")
	private String customerid;
	
	@SheetColumn(value = "MakerID")
	private String makerid;
	
	@SheetColumn(value = "CheckerID")
	private String checkerid;

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

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
	}

	public String getRedemptionrefon() {
		return redemptionrefon;
	}

	public void setRedemptionrefon(String redemptionrefon) {
		this.redemptionrefon = redemptionrefon;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getParentaccount() {
		return parentaccount;
	}

	public void setParentaccount(String parentaccount) {
		this.parentaccount = parentaccount;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getMakerid() {
		return makerid;
	}

	public void setMakerid(String makerid) {
		this.makerid = makerid;
	}

	public String getCheckerid() {
		return checkerid;
	}

	public void setCheckerid(String checkerid) {
		this.checkerid = checkerid;
	}

	@Override
	public String toString() {
		return "ICSREDMN_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorizestatus=" + authorizestatus + ", contractstatus="
				+ contractstatus + ", redemptionrefon=" + redemptionrefon + ", branchcode=" + branchcode
				+ ", parentaccount=" + parentaccount + ", customerid=" + customerid + ", makerid=" + makerid
				+ ", checkerid=" + checkerid + "]";
	}

	
}
