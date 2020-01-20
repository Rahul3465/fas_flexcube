package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLSACCVM")
public class CLSACCVM_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	
	@SheetColumn(value = "Search")
	private String search;

	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Branchcode")
	private String branchcode;
	
	@SheetColumn(value = "Applicantnumber")
	private String applinumber;
	
	@SheetColumn(value = "CustomerID")
	private String custid;

	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "AlternateAccountNumber")
	private String alteaccno;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "Amount")
	private String amt;
	
	@SheetColumn(value = "Currency")
	private String ccy;
		
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "AuthorizedStatus")
	private String authorisedstatus;

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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getApplinumber() {
		return applinumber;
	}

	public void setApplinumber(String applinumber) {
		this.applinumber = applinumber;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
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

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
	}

	public String getAuthorisedstatus() {
		return authorisedstatus;
	}

	public void setAuthorisedstatus(String authorisedstatus) {
		this.authorisedstatus = authorisedstatus;
	}

	@Override
	public String toString() {
		return "ValueDateAmend_CLSACCVM_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", fastpath=" + fastpath + ", search=" + search + ", accountnumber="
				+ accountnumber + ", branchcode=" + branchcode + ", applinumber=" + applinumber + ", custid=" + custid
				+ ", product=" + product + ", alteaccno=" + alteaccno + ", valuedate=" + valuedate + ", maturitydate="
				+ maturitydate + ", amt=" + amt + ", ccy=" + ccy + ", contractstatus=" + contractstatus
				+ ", authorisedstatus=" + authorisedstatus + "]";
	}
	



}
