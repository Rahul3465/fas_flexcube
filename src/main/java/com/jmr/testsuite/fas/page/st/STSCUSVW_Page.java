package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STDCIF")
public class STSCUSVW_Page {
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;

	
	@SheetColumn(value = "CustomerNumber")
	private String custno;
	
	@SheetColumn(value = "ShortName")
	private String shortname;

	@SheetColumn(value = "UniqueIdentityNumber")
	private String uniqueidentitynumber;
	
	@SheetColumn(value = "MobileNumber")
	private String mobilenumber;
	
	@SheetColumn(value = "DateOfBirth")
	private String dateofbirth;
	
	@SheetColumn(value = "ExternalRefNo")
	private String externalrefno;
	
	@SheetColumn(value = "FullName")
	private String fullname;
	
	@SheetColumn(value = "UniqueIdentifyValue")
	private String uniqueidentityvalue;
	
	@SheetColumn(value = "NationalID")
	private String nationalid;

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

	public String getCustno() {
		return custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getUniqueidentitynumber() {
		return uniqueidentitynumber;
	}

	public void setUniqueidentitynumber(String uniqueidentitynumber) {
		this.uniqueidentitynumber = uniqueidentitynumber;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getExternalrefno() {
		return externalrefno;
	}

	public void setExternalrefno(String externalrefno) {
		this.externalrefno = externalrefno;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUniqueidentityvalue() {
		return uniqueidentityvalue;
	}

	public void setUniqueidentityvalue(String uniqueidentityvalue) {
		this.uniqueidentityvalue = uniqueidentityvalue;
	}

	public String getNationalid() {
		return nationalid;
	}

	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}

	@Override
	public String toString() {
		return "STSCUSVW_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", custno=" + custno + ", shortname=" + shortname + ", uniqueidentitynumber=" + uniqueidentitynumber
				+ ", mobilenumber=" + mobilenumber + ", dateofbirth=" + dateofbirth + ", externalrefno=" + externalrefno
				+ ", fullname=" + fullname + ", uniqueidentityvalue=" + uniqueidentityvalue + ", nationalid="
				+ nationalid + "]";
	}
	
	
}
