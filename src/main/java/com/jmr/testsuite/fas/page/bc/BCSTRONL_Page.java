package com.jmr.testsuite.fas.page.bc;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "BCSTRONL")
public class BCSTRONL_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ContractRefno")
	private String contractrefno;
	
	@SheetColumn(value = "Branch")
	private String branch;

	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "UserRefno")
	private String userrefno;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "CounterParty")
	private String counterparty;
	
	@SheetColumn(value = "LCReference")
	private String lcreference;

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

	public String getContractrefno() {
		return contractrefno;
	}

	public void setContractrefno(String contractrefno) {
		this.contractrefno = contractrefno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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

	public String getUserrefno() {
		return userrefno;
	}

	public void setUserrefno(String userrefno) {
		this.userrefno = userrefno;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	public String getLcreference() {
		return lcreference;
	}

	public void setLcreference(String lcreference) {
		this.lcreference = lcreference;
	}

	@Override
	public String toString() {
		return "BCSTRONL_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", contractrefno=" + contractrefno + ", branch=" + branch
				+ ", authorizestatus=" + authorizestatus + ", contractstatus=" + contractstatus + ", userrefno="
				+ userrefno + ", product=" + product + ", counterparty=" + counterparty + ", lcreference=" + lcreference
				+ "]";
	}

	
	

}
