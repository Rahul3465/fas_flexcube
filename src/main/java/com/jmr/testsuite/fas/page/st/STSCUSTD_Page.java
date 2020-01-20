package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSCUSTD")

public class STSCUSTD_Page {
	
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
	
	@SheetColumn(value = "TDAccountNumber")
	private String tdaccountnumber;
	
	@SheetColumn(value = "AccountDescription")
	private String accountdescrption;
		
	@SheetColumn(value = "Customernumber")
	private String customernumber;
	
	@SheetColumn(value = "TDCurrency")
	private String tdcurrency;
	
	@SheetColumn(value = "StockCatalogCode")
	private String stockcatalogycode;
	
	@SheetColumn(value = "CertificateNumber")
	private String certificatenumber;

	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "Search")
	private String search;

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

	public String getTdaccountnumber() {
		return tdaccountnumber;
	}

	public void setTdaccountnumber(String tdaccountnumber) {
		this.tdaccountnumber = tdaccountnumber;
	}

	public String getAccountdescrption() {
		return accountdescrption;
	}

	public void setAccountdescrption(String accountdescrption) {
		this.accountdescrption = accountdescrption;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getTdcurrency() {
		return tdcurrency;
	}

	public void setTdcurrency(String tdcurrency) {
		this.tdcurrency = tdcurrency;
	}

	public String getStockcatalogycode() {
		return stockcatalogycode;
	}

	public void setStockcatalogycode(String stockcatalogycode) {
		this.stockcatalogycode = stockcatalogycode;
	}

	public String getCertificatenumber() {
		return certificatenumber;
	}

	public void setCertificatenumber(String certificatenumber) {
		this.certificatenumber = certificatenumber;
	}

	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "STSCUSTD_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", branch=" + branch + ", authorsestauts=" + authorsestauts
				+ ", recordstatus=" + recordstatus + ", tdaccountnumber=" + tdaccountnumber + ", accountdescrption="
				+ accountdescrption + ", customernumber=" + customernumber + ", tdcurrency=" + tdcurrency
				+ ", stockcatalogycode=" + stockcatalogycode + ", certificatenumber=" + certificatenumber
				+ ", maturitydate=" + maturitydate + ", search=" + search + "]";
	}
	
	


}
