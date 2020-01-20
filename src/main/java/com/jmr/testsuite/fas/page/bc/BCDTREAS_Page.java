package com.jmr.testsuite.fas.page.bc;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "BCDTREAS")
public class BCDTREAS_Page {
	
	private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "ContractReference")
	private String contractreference;

	@SheetColumn(value = "NewUserIdentity")
	private String newuseridentity;

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

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getContractreference() {
		return contractreference;
	}

	public void setContractreference(String contractreference) {
		this.contractreference = contractreference;
	}

	public String getNewuseridentity() {
		return newuseridentity;
	}

	public void setNewuseridentity(String newuseridentity) {
		this.newuseridentity = newuseridentity;
	}

	@Override
	public String toString() {
		return "BCDTREAS_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", productcode=" + productcode + ", contractreference=" + contractreference
				+ ", newuseridentity=" + newuseridentity + "]";
	}

	
}
