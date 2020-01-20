package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLSACCNT")


public class CLSACCNT_Page {
	
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "Branch")
	private String branch;

	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "CustomerID")
	private String custid;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "Currency")
	private String ccy;
		
	@SheetColumn(value = "AccountStatus")
	private String accountstatus;
	
	@SheetColumn(value = "AuthorizedStatus")
	private String authorisedstatus;
	
	@SheetColumn(value = "BookDate")
	private String bookdate;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "AlternateAccountNumber")
	private String alteaccno;
	
	@SheetColumn(value = "CustomerName")
	private String customername;
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "AmountFinanced")
	private String amtfinanced;
	
	@SheetColumn(value = "UserDefinedStatus")
	private String userdefstatus;
	
	@SheetColumn(value = "UserRefNumber")
	private String userefnum;
	
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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}

	public String getAuthorisedstatus() {
		return authorisedstatus;
	}

	public void setAuthorisedstatus(String authorisedstatus) {
		this.authorisedstatus = authorisedstatus;
	}

	public String getBookdate() {
		return bookdate;
	}

	public void setBookdate(String bookdate) {
		this.bookdate = bookdate;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAlteaccno() {
		return alteaccno;
	}

	public void setAlteaccno(String alteaccno) {
		this.alteaccno = alteaccno;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	public String getAmtfinanced() {
		return amtfinanced;
	}

	public void setAmtfinanced(String amtfinanced) {
		this.amtfinanced = amtfinanced;
	}

	public String getUserdefstatus() {
		return userdefstatus;
	}

	public void setUserdefstatus(String userdefstatus) {
		this.userdefstatus = userdefstatus;
	}

	public String getUserefnum() {
		return userefnum;
	}

	public void setUserefnum(String userefnum) {
		this.userefnum = userefnum;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "AccountSummary_CLSACCNT_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", fastpath=" + fastpath + ", branch=" + branch + ", accountnumber="
				+ accountnumber + ", custid=" + custid + ", valuedate=" + valuedate + ", ccy=" + ccy
				+ ", accountstatus=" + accountstatus + ", authorisedstatus=" + authorisedstatus + ", bookdate="
				+ bookdate + ", product=" + product + ", alteaccno=" + alteaccno + ", customername=" + customername
				+ ", maturitydate=" + maturitydate + ", amtfinanced=" + amtfinanced + ", userdefstatus=" + userdefstatus
				+ ", userefnum=" + userefnum + ", search=" + search + "]";
	}

	

}
