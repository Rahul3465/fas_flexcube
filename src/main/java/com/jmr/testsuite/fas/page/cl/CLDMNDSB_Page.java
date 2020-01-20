package com.jmr.testsuite.fas.page.cl;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLDMNDSB")
public class CLDMNDSB_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Defaultbutton")
	private String branch;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "ExecutionDate")
	private String executiondate;
	
	@SheetColumn(value = "SettlementMode")
	private String settlementmode;
	
	@SheetColumn(value = "SettlementCurrency")
	private String settlementcurrency;
		
	@SheetColumn(value = "SettlementAmount")
	private String settlementamount;
	
	@SheetColumn(value = "Remarks")
	private String remark;
	
	@SheetColumn(value = "New")
	private String newdata;
	
	@SheetColumn(value = "Authorize")
	private String authorize;
	
	
	public String getNewdata() {
		return newdata;
	}

	public void setNewdata(String newdata) {
		this.newdata = newdata;
	}

	public String getAuthorize() {
		return authorize;
	}

	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getExecutiondate() {
		return executiondate;
	}

	public void setExecutiondate(String executiondate) {
		this.executiondate = executiondate;
	}

	public String getSettlementmode() {
		return settlementmode;
	}

	public void setSettlementmode(String settlementmode) {
		this.settlementmode = settlementmode;
	}

	public String getSettlementcurrency() {
		return settlementcurrency;
	}

	public void setSettlementcurrency(String settlementcurrency) {
		this.settlementcurrency = settlementcurrency;
	}

	public String getSettlementamount() {
		return settlementamount;
	}

	public void setSettlementamount(String settlementamount) {
		this.settlementamount = settlementamount;
	}

	@Override
	public String toString() {
		return "CLDMNDSB_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", accountnumber=" + accountnumber + ", branch=" + branch + ", valuedate="
				+ valuedate + ", executiondate=" + executiondate + ", settlementmode=" + settlementmode
				+ ", settlementcurrency=" + settlementcurrency + ", settlementamount=" + settlementamount + ", remark="
				+ remark + ", newdata=" + newdata + ", authorize=" + authorize + "]";
	}

	


	

}
