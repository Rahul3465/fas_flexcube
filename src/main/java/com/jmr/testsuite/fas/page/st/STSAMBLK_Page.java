package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STSAMBLK")
public class STSAMBLK_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;

	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "Account")
	private String account;
	
	@SheetColumn(value = "AuthoriseStatus")
	private String authorsestauts;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "BlockRefNumber")
	private String blockrefnumber;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "EffectiveDate")
	private String effectivedate;
		
	@SheetColumn(value = "ExpiryDate")
	private String expirydate;
	
	@SheetColumn(value = "AmountBlockType")
	private String amountblocktype;
	
	@SheetColumn(value = "ReferenceNumber")
	private String refernece;
	
	@SheetColumn(value = "Branch")
	private String branch;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public String getBlockrefnumber() {
		return blockrefnumber;
	}

	public void setBlockrefnumber(String blockrefnumber) {
		this.blockrefnumber = blockrefnumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getAmountblocktype() {
		return amountblocktype;
	}

	public void setAmountblocktype(String amountblocktype) {
		this.amountblocktype = amountblocktype;
	}

	public String getRefernece() {
		return refernece;
	}

	public void setRefernece(String refernece) {
		this.refernece = refernece;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "STSAMBLK_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", account=" + account + ", authorsestauts=" + authorsestauts
				+ ", recordstatus=" + recordstatus + ", blockrefnumber=" + blockrefnumber + ", amount=" + amount
				+ ", effectivedate=" + effectivedate + ", expirydate=" + expirydate + ", amountblocktype="
				+ amountblocktype + ", refernece=" + refernece + ", branch=" + branch + "]";
	}
	
	

}
