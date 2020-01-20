package com.jmr.testsuite.fas.page.de;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DESPRMNT")
public class DESPRMNT_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordStatus;
	
	@SheetColumn(value = "ProductCode")
	private String productcode;
	
	@SheetColumn(value = "ProductDescription")
	private String productdescription;
	
	@SheetColumn(value = "ProductGroup")
	private String productgroup;
	
	@SheetColumn(value = "DataEntryProductType")
	private String dataentryproducttype;

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

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public String getProductgroup() {
		return productgroup;
	}

	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}

	public String getDataentryproducttype() {
		return dataentryproducttype;
	}

	public void setDataentryproducttype(String dataentryproducttype) {
		this.dataentryproducttype = dataentryproducttype;
	}

	@Override
	public String toString() {
		return "DESPRMNT_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", fastpath=" + fastpath + ", authorizestatus=" + authorizestatus + ", recordStatus=" + recordStatus
				+ ", productcode=" + productcode + ", productdescription=" + productdescription + ", productgroup="
				+ productgroup + ", dataentryproducttype=" + dataentryproducttype + "]";
	}

	
}
