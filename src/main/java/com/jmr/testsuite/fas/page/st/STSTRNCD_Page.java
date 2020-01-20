package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSTRNCD")
public class STSTRNCD_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorisestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "Transactioncode")
	private String transactioncode;

	
	@SheetColumn(value = "Description")
	private String description;
	
	@SheetColumn(value = "Shiftcode")
	private String shiftcode;
	
	@SheetColumn(value = "MISHead")
	private String mishead;

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

	public String getAuthorisestatus() {
		return authorisestatus;
	}

	public void setAuthorisestatus(String authorisestatus) {
		this.authorisestatus = authorisestatus;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getTransactioncode() {
		return transactioncode;
	}

	public void setTransactioncode(String transactioncode) {
		this.transactioncode = transactioncode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShiftcode() {
		return shiftcode;
	}

	public void setShiftcode(String shiftcode) {
		this.shiftcode = shiftcode;
	}

	public String getMishead() {
		return mishead;
	}

	public void setMishead(String mishead) {
		this.mishead = mishead;
	}

	@Override
	public String toString() {
		return "STSTRNCD_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorisestatus=" + authorisestatus + ", recordstatus=" + recordstatus
				+ ", transactioncode=" + transactioncode + ", description=" + description + ", shiftcode=" + shiftcode
				+ ", mishead=" + mishead + "]";
	}
	



}
