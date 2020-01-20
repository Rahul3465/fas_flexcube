package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSCIFIS")
public class STSCIFIS_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "CustomerNumber")
	private String customername;
	
	@SheetColumn(value = "Branch")
	private String branch;
	
	@SheetColumn(value = "SignatureTitle")
	private String signaturetitle;

	@SheetColumn(value = "AuthorsizedStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "SignatureID")
	private String signid;
	
	@SheetColumn(value = "SignatureName")
	private String signname;
	
	@SheetColumn(value = "Status")
	private String status;
	
	
	@SheetColumn(value = "Search")
	private String search;
	
	

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

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

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSignaturetitle() {
		return signaturetitle;
	}

	public void setSignaturetitle(String signaturetitle) {
		this.signaturetitle = signaturetitle;
	}

	public String getAuthorizestatus() {
		return authorizestatus;
	}

	public void setAuthorizestatus(String authorizestatus) {
		this.authorizestatus = authorizestatus;
	}

	public String getSignid() {
		return signid;
	}

	public void setSignid(String signid) {
		this.signid = signid;
	}

	public String getSignname() {
		return signname;
	}

	public void setSignname(String signname) {
		this.signname = signname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "STSCIFIS_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", customername=" + customername + ", branch=" + branch
				+ ", signaturetitle=" + signaturetitle + ", authorizestatus=" + authorizestatus + ", signid=" + signid
				+ ", signname=" + signname + ", status=" + status + ", search=" + search + "]";
	}

	
	
	

}
