package com.jmr.testsuite.fas.page.st;


import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STDAMBLK")
public class STDAMBLK_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountNumber")
	private String accountno;
	
	@SheetColumn(value = "Remark")
	private String remark;
	
	@SheetColumn(value = "Amount")
	private String amount;

	
	@SheetColumn(value = "AmountBlockType")
	private String amountblocktype;
	
	@SheetColumn(value = "Referencenumber")
	private String referencenumber;
	
	@SheetColumn(value = "HoldCode")
	private String holdcode;
	
	@SheetColumn(value = "Effectivedate")
	private String effectivedata;
	
	@SheetColumn(value = "Expirydate")
	private String expirydata;

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

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountblocktype() {
		return amountblocktype;
	}

	public void setAmountblocktype(String amountblocktype) {
		this.amountblocktype = amountblocktype;
	}

	public String getReferencenumber() {
		return referencenumber;
	}

	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}

	public String getHoldcode() {
		return holdcode;
	}

	public void setHoldcode(String holdcode) {
		this.holdcode = holdcode;
	}

	public String getEffectivedata() {
		return effectivedata;
	}

	public void setEffectivedata(String effectivedata) {
		this.effectivedata = effectivedata;
	}

	public String getExpirydata() {
		return expirydata;
	}

	public void setExpirydata(String expirydata) {
		this.expirydata = expirydata;
	}

	@Override
	public String toString() {
		return "STDAMBLK_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", accountno=" + accountno + ", remark=" + remark + ", amount=" + amount
				+ ", amountblocktype=" + amountblocktype + ", referencenumber=" + referencenumber + ", holdcode="
				+ holdcode + ", effectivedata=" + effectivedata + ", expirydata=" + expirydata + "]";
	}
	


}
