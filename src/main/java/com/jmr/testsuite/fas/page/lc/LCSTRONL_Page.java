package com.jmr.testsuite.fas.page.lc;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "LCSTRONL")
public class LCSTRONL_Page {
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "ContractRefNumber")
	private String contractrefnumber;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "Branch")
	private String Branch;
	
	@SheetColumn(value = "AuthroizedStatus")
	private String authorisedstatus;
	
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "ContractAmount")
	private String contractamount;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "OperationCode")
	private String operationcode;

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

	public String getContractrefnumber() {
		return contractrefnumber;
	}

	public void setContractrefnumber(String contractrefnumber) {
		this.contractrefnumber = contractrefnumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getAuthorisedstatus() {
		return authorisedstatus;
	}

	public void setAuthorisedstatus(String authorisedstatus) {
		this.authorisedstatus = authorisedstatus;
	}

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
	}

	public String getContractamount() {
		return contractamount;
	}

	public void setContractamount(String contractamount) {
		this.contractamount = contractamount;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getOperationcode() {
		return operationcode;
	}

	public void setOperationcode(String operationcode) {
		this.operationcode = operationcode;
	}

	@Override
	public String toString() {
		return "LCSTRONL_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", contractrefnumber=" + contractrefnumber + ", currency=" + currency + ", Branch=" + Branch
				+ ", authorisedstatus=" + authorisedstatus + ", contractstatus=" + contractstatus + ", contractamount="
				+ contractamount + ", productcode=" + productcode + ", operationcode=" + operationcode + "]";
	}
	
	


}
