package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSCUSSH")
public class STSCUSSH_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "CustomerNumber")
	private String customernumber;
	
	@SheetColumn(value = "FirstName")
	private String firstname;
	
	@SheetColumn(value = "LastName")
	private String lastname;

	
	@SheetColumn(value = "CustomerType")
	private String customertype;
	
	@SheetColumn(value = "Telephone")
	private String telephone;
	
	@SheetColumn(value = "Email")
	private String email;
	
	@SheetColumn(value = "UniqueidNAME")
	private String uniqueidname;
	
	@SheetColumn(value = "CorporateName")
	private String corporatename;
	
	@SheetColumn(value = "Country")
	private String country;

	
	@SheetColumn(value = "SSN")
	private String ssn;
	
	@SheetColumn(value = "Shortname")
	private String shortname;
	
	@SheetColumn(value = "UniqueIdValue")
	private String uniqueidvalue;

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

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUniqueidname() {
		return uniqueidname;
	}

	public void setUniqueidname(String uniqueidname) {
		this.uniqueidname = uniqueidname;
	}

	public String getCorporatename() {
		return corporatename;
	}

	public void setCorporatename(String corporatename) {
		this.corporatename = corporatename;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getUniqueidvalue() {
		return uniqueidvalue;
	}

	public void setUniqueidvalue(String uniqueidvalue) {
		this.uniqueidvalue = uniqueidvalue;
	}

	@Override
	public String toString() {
		return "STSCUSSH_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", customernumber=" + customernumber + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", customertype=" + customertype + ", telephone=" + telephone + ", email="
				+ email + ", uniqueidname=" + uniqueidname + ", corporatename=" + corporatename + ", country=" + country
				+ ", ssn=" + ssn + ", shortname=" + shortname + ", uniqueidvalue=" + uniqueidvalue + "]";
	}
	
	

}
