package com.jmr.testsuite.fas.page;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "1460")

public class MiscelaneousGLCredit_1460Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "GLCurrency")
	private String glccy;
		
	@SheetColumn(value = "GLAccount")
	private String glaccount;
	
	@SheetColumn(value = "TransactionCurrency")
	private String transactionccy;
	
	@SheetColumn(value = "Narrative")
	private String narrative;
		
	@SheetColumn(value = "TransactionAmount")
	private String trasnactionamount;
	

	@SheetColumn(value = "UserID")
	private String userid;
	
	@SheetColumn(value = "TellerRemarks")
	private String tellerremark;
	
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTellerremark() {
		return tellerremark;
	}

	public void setTellerremark(String tellerremark) {
		this.tellerremark = tellerremark;
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

	public String getGlccy() {
		return glccy;
	}

	public void setGlccy(String glccy) {
		this.glccy = glccy;
	}

	public String getGlaccount() {
		return glaccount;
	}

	public void setGlaccount(String glaccount) {
		this.glaccount = glaccount;
	}

	public String getTransactionccy() {
		return transactionccy;
	}

	public void setTransactionccy(String transactionccy) {
		this.transactionccy = transactionccy;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public String getTrasnactionamount() {
		return trasnactionamount;
	}

	public void setTrasnactionamount(String trasnactionamount) {
		this.trasnactionamount = trasnactionamount;
	}

	@Override
	public String toString() {
		return "MiscelaneousGLCredit_1460Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", glccy=" + glccy + ", glaccount=" + glaccount + ", transactionccy="
				+ transactionccy + ", narrative=" + narrative + ", trasnactionamount=" + trasnactionamount + ", userid="
				+ userid + ", tellerremark=" + tellerremark + "]";
	}



}
