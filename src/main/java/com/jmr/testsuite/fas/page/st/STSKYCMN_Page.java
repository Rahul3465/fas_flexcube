package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSKYCMN")
public class STSKYCMN_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;

	@SheetColumn(value = "Fastpath")
	private String fastpath;

	@SheetColumn(value = "AuthoriseStatus")
	private String authorsestauts;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "KYCRefNo")
	private String kycrefno;
		
	@SheetColumn(value = "KYCDescrpition")
	private String kycdescription;
	
	@SheetColumn(value = "KYCCustomerType")
	private String kyccustomertype;
	
	@SheetColumn(value = "RiskLevel")
	private String risklevel;

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

	public String getKycrefno() {
		return kycrefno;
	}

	public void setKycrefno(String kycrefno) {
		this.kycrefno = kycrefno;
	}

	public String getKycdescription() {
		return kycdescription;
	}

	public void setKycdescription(String kycdescription) {
		this.kycdescription = kycdescription;
	}

	public String getKyccustomertype() {
		return kyccustomertype;
	}

	public void setKyccustomertype(String kyccustomertype) {
		this.kyccustomertype = kyccustomertype;
	}

	public String getRisklevel() {
		return risklevel;
	}

	public void setRisklevel(String risklevel) {
		this.risklevel = risklevel;
	}

	@Override
	public String toString() {
		return "STSKYCMN_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", authorsestauts=" + authorsestauts + ", recordstatus=" + recordstatus
				+ ", kycrefno=" + kycrefno + ", kycdescription=" + kycdescription + ", kyccustomertype="
				+ kyccustomertype + ", risklevel=" + risklevel + "]";
	}
	
	
	
	

}
