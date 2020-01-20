package com.jmr.testsuite.fas.page.de;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDBTTOT")
public class DEDBTTOT_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "BatchNumber")
	private String batchnumber;
	
	@SheetColumn(value = "LastOperatorID")
	private String lastoperatorid;
	
	@SheetColumn(value = "AuthroizedStatus")
	private String authorisedstatus;
	
	@SheetColumn(value = "CheckTotal")
	private String checktotal;
	
	@SheetColumn(value = "Delete")
	private String delete;
	
	@SheetColumn(value = "AuthoriseButton")
	private String authorisebutton;

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

	public String getAuthorisedstatus() {
		return authorisedstatus;
	}

	public void setAuthorisedstatus(String authorisedstatus) {
		this.authorisedstatus = authorisedstatus;
	}

	public String getChecktotal() {
		return checktotal;
	}

	public void setChecktotal(String checktotal) {
		this.checktotal = checktotal;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getAuthorisebutton() {
		return authorisebutton;
	}

	public void setAuthorisebutton(String authorisebutton) {
		this.authorisebutton = authorisebutton;
	}

	@Override
	public String toString() {
		return "DEDBTTOT_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", batchnumber=" + batchnumber + ", lastoperatorid=" + lastoperatorid + ", authorisedstatus="
				+ authorisedstatus + ", checktotal=" + checktotal + ", delete=" + delete + ", authorisebutton="
				+ authorisebutton + "]";
	}
	
	

}
