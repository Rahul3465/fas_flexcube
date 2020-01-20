package com.jmr.testsuite.fas.page;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "1401")


public class CashDeposit_1401Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
		
	@SheetColumn(value = "TransactionAmount")
	private String trasnactionamount;
	
	
	@SheetColumn(value = "UserID")
	private String userid;
	
	@SheetColumn(value = "Currency1")
	private String currency1;
	
	@SheetColumn(value = "Currency2")
	private String currency2;
	
	@SheetColumn(value = "TellerRemarks")
	private String tellerremark;

	public String getTestCaseResult() {
		return testCaseResult;
	}
	
	public String getUserid() {
		return userid;
	}
	
	
	

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getCurrency2() {
		return currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getTellerremark() {
		return tellerremark;
	}



	public void setTellerremark(String tellerremark) {
		this.tellerremark = tellerremark;
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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getTrasnactionamount() {
		return trasnactionamount;
	}

	public void setTrasnactionamount(String trasnactionamount) {
		this.trasnactionamount = trasnactionamount;
	}

	@Override
	public String toString() {
		return "CashDeposit_1401Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode="
				+ runMode + ", accountnumber=" + accountnumber + ", trasnactionamount=" + trasnactionamount
				+ ", userid=" + userid + ", currency1=" + currency1 + ", currency2=" + currency2 + ", tellerremark="
				+ tellerremark + "]";
	}



	

	

}
