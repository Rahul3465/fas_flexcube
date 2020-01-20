package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLSCMTVM")


public class CLSCMTVM_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "BranchCode")
	private String branch;
		
	@SheetColumn(value = "Applicantname")
	private String applicatnme;
	
	@SheetColumn(value = "AlternateAccountNumber")
	private String alternateaccno;
	
	@SheetColumn(value = "CustomerID")
	private String custid;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "Amount")
	private String amt;
	
	@SheetColumn(value = "Currency")
	private String ccy;
	
	@SheetColumn(value = "ContractStatus")
	private String accountstatus;
	
	@SheetColumn(value = "AuthorizedStatus")
	private String authorisedstatus;
	
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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getApplicatnme() {
		return applicatnme;
	}

	public void setApplicatnme(String applicatnme) {
		this.applicatnme = applicatnme;
	}

	public String getAlternateaccno() {
		return alternateaccno;
	}

	public void setAlternateaccno(String alternateaccno) {
		this.alternateaccno = alternateaccno;
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

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "CommitSumm_CLSCMTVM_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", fastpath=" + fastpath + ", accountnumber=" + accountnumber + ", branch="
				+ branch + ", applicatnme=" + applicatnme + ", alternateaccno=" + alternateaccno + ", custid=" + custid
				+ ", valuedate=" + valuedate + ", product=" + product + ", maturitydate=" + maturitydate + ", amt="
				+ amt + ", ccy=" + ccy + ", accountstatus=" + accountstatus + ", authorisedstatus=" + authorisedstatus
				+ ", search=" + search + "]";
	}


}
