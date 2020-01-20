package com.jmr.testsuite.fas.page.fx;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "FXSTRPAY")
public class FXSTRPAY_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "ReferenceNumber")
	private String referencenumber;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorisestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "UserReference")
	private String userreference;
	
	@SheetColumn(value = "BuySell")
	private String buysell;
	
	@SheetColumn(value = "LiquidationCancellation")
	private String liquidationcancellation;

	@SheetColumn(value = "BroughtCurrency")
	private String broughtcurrency;
	
	@SheetColumn(value = "SoldCurrency")
	private String soldcurrency;
	
	@SheetColumn(value = "OutStandingAmount")
	private String outstandingamount;

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

	public String getReferencenumber() {
		return referencenumber;
	}

	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}

	public String getAuthorisestatus() {
		return authorisestatus;
	}

	public void setAuthorisestatus(String authorisestatus) {
		this.authorisestatus = authorisestatus;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getUserreference() {
		return userreference;
	}

	public void setUserreference(String userreference) {
		this.userreference = userreference;
	}

	public String getBuysell() {
		return buysell;
	}

	public void setBuysell(String buysell) {
		this.buysell = buysell;
	}

	public String getLiquidationcancellation() {
		return liquidationcancellation;
	}

	public void setLiquidationcancellation(String liquidationcancellation) {
		this.liquidationcancellation = liquidationcancellation;
	}

	public String getBroughtcurrency() {
		return broughtcurrency;
	}

	public void setBroughtcurrency(String broughtcurrency) {
		this.broughtcurrency = broughtcurrency;
	}

	public String getSoldcurrency() {
		return soldcurrency;
	}

	public void setSoldcurrency(String soldcurrency) {
		this.soldcurrency = soldcurrency;
	}

	public String getOutstandingamount() {
		return outstandingamount;
	}

	public void setOutstandingamount(String outstandingamount) {
		this.outstandingamount = outstandingamount;
	}

	@Override
	public String toString() {
		return "FXSTRPAY_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", referencenumber=" + referencenumber + ", authorisestatus="
				+ authorisestatus + ", recordstatus=" + recordstatus + ", userreference=" + userreference + ", buysell="
				+ buysell + ", liquidationcancellation=" + liquidationcancellation + ", broughtcurrency="
				+ broughtcurrency + ", soldcurrency=" + soldcurrency + ", outstandingamount=" + outstandingamount + "]";
	}
	
	
	
	
}
