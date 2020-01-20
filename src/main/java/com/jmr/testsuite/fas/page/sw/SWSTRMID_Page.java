package com.jmr.testsuite.fas.page.sw;


import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "SWSTRMID")
public class SWSTRMID_Page {
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AuthorisedStatus")
	private String authorisedstauts;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "TerminalID")
	private String terminalid;

	@SheetColumn(value = "OrginatingBranch")
	private String orginatingbranch;

	@SheetColumn(value = "MerchantID")
	private String merchantid;

	@SheetColumn(value = "Channel")
	private String channel;
	
	@SheetColumn(value = "CashGLNumber")
	private String cashglnumber;
	
	@SheetColumn(value = "TerminalAddress")
	private String terminaladdress;

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

	public String getAuthorisedstauts() {
		return authorisedstauts;
	}

	public void setAuthorisedstauts(String authorisedstauts) {
		this.authorisedstauts = authorisedstauts;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getTerminalid() {
		return terminalid;
	}

	public void setTerminalid(String terminalid) {
		this.terminalid = terminalid;
	}

	public String getOrginatingbranch() {
		return orginatingbranch;
	}

	public void setOrginatingbranch(String orginatingbranch) {
		this.orginatingbranch = orginatingbranch;
	}

	public String getMerchantid() {
		return merchantid;
	}

	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCashglnumber() {
		return cashglnumber;
	}

	public void setCashglnumber(String cashglnumber) {
		this.cashglnumber = cashglnumber;
	}

	public String getTerminaladdress() {
		return terminaladdress;
	}

	public void setTerminaladdress(String terminaladdress) {
		this.terminaladdress = terminaladdress;
	}

	@Override
	public String toString() {
		return "SWSTRMID_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorisedstauts=" + authorisedstauts + ", recordstatus=" + recordstatus
				+ ", terminalid=" + terminalid + ", orginatingbranch=" + orginatingbranch + ", merchantid=" + merchantid
				+ ", channel=" + channel + ", cashglnumber=" + cashglnumber + ", terminaladdress=" + terminaladdress
				+ "]";
	}
	
	


}
