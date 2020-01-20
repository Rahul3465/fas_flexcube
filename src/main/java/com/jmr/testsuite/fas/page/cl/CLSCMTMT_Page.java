package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLSCMTMT")

public class CLSCMTMT_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Branch")
	private String branch;

	
	@SheetColumn(value = "CustomerID")
	private String custid;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "Productcode")
	private String productcode;
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "AmountFinanced")
	private String amtfinanced;
	
	@SheetColumn(value = "Currency")
	private String ccy;
		
	
	@SheetColumn(value = "UserDefinedStatus")
	private String userdefstatus;
	
	@SheetColumn(value = "UserRefNumber")
	private String userefnum;
	
	@SheetColumn(value = "AccountStatus")
	private String accountstatus;
	
	@SheetColumn(value = "AuthorizedStatus")
	private String authorisedstatus;
	

	@SheetColumn(value = "AlternateAccountNumber")
	private String alteaccno;
	
	
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


	public String getProductcode() {
		return productcode;
	}


	public void setProductcode(String productcode) {
		this.productcode = productcode;
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


	public String getCcy() {
		return ccy;
	}


	public void setCcy(String ccy) {
		this.ccy = ccy;
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


	public String getAlteaccno() {
		return alteaccno;
	}


	public void setAlteaccno(String alteaccno) {
		this.alteaccno = alteaccno;
	}


	public String getSearch() {
		return search;
	}


	public void setSearch(String search) {
		this.search = search;
	}


	@Override
	public String toString() {
		return "CommitmentSumm_CLSCMTMT_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", fastpath=" + fastpath + ", accountnumber=" + accountnumber + ", branch="
				+ branch + ", custid=" + custid + ", valuedate=" + valuedate + ", productcode=" + productcode
				+ ", maturitydate=" + maturitydate + ", amtfinanced=" + amtfinanced + ", ccy=" + ccy
				+ ", userdefstatus=" + userdefstatus + ", userefnum=" + userefnum + ", accountstatus=" + accountstatus
				+ ", authorisedstatus=" + authorisedstatus + ", alteaccno=" + alteaccno + ", search=" + search + "]";
	}


}
