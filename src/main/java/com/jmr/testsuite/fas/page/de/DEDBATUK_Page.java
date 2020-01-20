package com.jmr.testsuite.fas.page.de;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DESMJONL")
public class DEDBATUK_Page {
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "BatchNumber")
	private String batchnumber;
	
	@SheetColumn(value = "LastOperatorID")
	private String lastoperatorid;
	
	@SheetColumn(value = "Description")
	private String description;
	
	@SheetColumn(value = "BatchType")
	private String batchtype;

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

	public String getBatchnumber() {
		return batchnumber;
	}

	public void setBatchnumber(String batchnumber) {
		this.batchnumber = batchnumber;
	}

	public String getLastoperatorid() {
		return lastoperatorid;
	}

	public void setLastoperatorid(String lastoperatorid) {
		this.lastoperatorid = lastoperatorid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBatchtype() {
		return batchtype;
	}

	public void setBatchtype(String batchtype) {
		this.batchtype = batchtype;
	}

	@Override
	public String toString() {
		return "DEDBATUK_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", fastpath=" + fastpath + ", batchnumber=" + batchnumber + ", lastoperatorid=" + lastoperatorid
				+ ", description=" + description + ", batchtype=" + batchtype + "]";
	}

	
}
