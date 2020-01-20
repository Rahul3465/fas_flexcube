package com.jmr.testsuite.fas.page.st;


import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSCIF")
public class STSCIF_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;

	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "Branch")
	private String branch;
	
	@SheetColumn(value = "AuthoriseStatus")
	private String authorsestauts;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "CustomerNumber")
	private String customernumber;
	
	@SheetColumn(value = "Customername")
	private String customername;
	
	@SheetColumn(value = "Type")
	private String type;
		
	@SheetColumn(value = "ShortName")
	private String shortname;
	
	@SheetColumn(value = "CustomerCategory")
	private String customercategory;
	
	@SheetColumn(value = "Country")
	private String country;
	
	@SheetColumn(value = "Nationality")
	private String nationality;

	@SheetColumn(value = "BranchCode")
	private String branchcode;
	
	@SheetColumn(value = "Search")
	private String search;
	
	@SheetColumn(value = "Delete")
	private String delete;
	
	

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
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

	public String getFastpath() {
		return fastpath;
	}

	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getCustomercategory() {
		return customercategory;
	}

	public void setCustomercategory(String customercategory) {
		this.customercategory = customercategory;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "STSCIF_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", branch=" + branch + ", authorsestauts=" + authorsestauts
				+ ", recordstatus=" + recordstatus + ", customernumber=" + customernumber + ", customername="
				+ customername + ", type=" + type + ", shortname=" + shortname + ", customercategory="
				+ customercategory + ", country=" + country + ", nationality=" + nationality + ", branchcode="
				+ branchcode + ", search=" + search + ", delete=" + delete + "]";
	}

}
