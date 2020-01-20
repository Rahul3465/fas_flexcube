package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSSTDOR")
public class STSSTDOR_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;

	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "BranchCode")
	private String branchcode;
	
	@SheetColumn(value = "AuthoriseStatus")
	private String authorsestauts;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "CustomerAccount")
	private String customeracc;

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

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getAuthorsestauts() {
		return authorsestauts;
	}

	public void setAuthorsestauts(String authorsestauts) {
		this.authorsestauts = authorsestauts;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getCustomeracc() {
		return customeracc;
	}

	public void setCustomeracc(String customeracc) {
		this.customeracc = customeracc;
	}

	@Override
	public String toString() {
		return "STSSTDOR_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", branchcode=" + branchcode + ", authorsestauts=" + authorsestauts
				+ ", recordstatus=" + recordstatus + ", customeracc=" + customeracc + "]";
	}
	
	

}
