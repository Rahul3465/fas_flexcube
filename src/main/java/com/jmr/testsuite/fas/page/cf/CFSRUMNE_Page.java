package com.jmr.testsuite.fas.page.cf;

import io.github.millij.poi.ss.model.annotations.SheetColumn;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
@Component
@Sheet(value = "CFSRUMNE")
public class CFSRUMNE_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "RuleType")
	private String ruletype;
	
	@SheetColumn(value = "RuleID")
	private String ruleid;

	@SheetColumn(value = "Description")
	private String description;
	
	@SheetColumn(value = "TransactionCurrency")
	private String transactioncurrency;
	
	@SheetColumn(value = "Customer")
	private String customer;
	
	@SheetColumn(value = "CustomerGroup")
	private String customergroup;

	@SheetColumn(value = "BranchCode")
	private String branchcode;

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

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getRuletype() {
		return ruletype;
	}

	public void setRuletype(String ruletype) {
		this.ruletype = ruletype;
	}

	public String getRuleid() {
		return ruleid;
	}

	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransactioncurrency() {
		return transactioncurrency;
	}

	public void setTransactioncurrency(String transactioncurrency) {
		this.transactioncurrency = transactioncurrency;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomergroup() {
		return customergroup;
	}

	public void setCustomergroup(String customergroup) {
		this.customergroup = customergroup;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	@Override
	public String toString() {
		return "CFSRUMNE_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorizestatus=" + authorizestatus + ", recordstatus=" + recordstatus
				+ ", ruletype=" + ruletype + ", ruleid=" + ruleid + ", description=" + description
				+ ", transactioncurrency=" + transactioncurrency + ", customer=" + customer + ", customergroup="
				+ customergroup + ", branchcode=" + branchcode + "]";
	}
	
	


}
