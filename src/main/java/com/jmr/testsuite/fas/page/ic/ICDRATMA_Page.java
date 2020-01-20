package com.jmr.testsuite.fas.page.ic;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "ICDRATMA")
public class ICDRATMA_Page
{
	private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "BranchCode")
	private String branchCode;
	
	@SheetColumn(value = "CurrencyCode")
	private String currencyCode;
	
	@SheetColumn(value = "RateCode")
	private String rateCode;
	
	@SheetColumn(value = "EffectiveDate")
	private String effectiveDate;
	
	@SheetColumn(value = "Rate")
	private String rate;
	
	@SheetColumn(value = "Open")
	private String open;
	
	@SheetColumn(value = "Save")
	private String save;
	
	@SheetColumn(value = "EnterQuery")
	private String enterQuery;
	
	@SheetColumn(value = "ExecuteQuery")
	private String executeQuery;
	
	@SheetColumn(value = "Unlock")
	private String unlock;
	
	@SheetColumn(value = "Delete")
	private String delete;

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

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getSave() {
		return save;
	}

	public void setSave(String save) {
		this.save = save;
	}

	public String getEnterQuery() {
		return enterQuery;
	}

	public void setEnterQuery(String enterQuery) {
		this.enterQuery = enterQuery;
	}

	public String getExecuteQuery() {
		return executeQuery;
	}

	public void setExecuteQuery(String executeQuery) {
		this.executeQuery = executeQuery;
	}

	public String getUnlock() {
		return unlock;
	}

	public void setUnlock(String unlock) {
		this.unlock = unlock;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "ICDRATMA_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", branchCode=" + branchCode + ", currencyCode=" + currencyCode
				+ ", rateCode=" + rateCode + ", effectiveDate=" + effectiveDate + ", rate=" + rate + ", open=" + open
				+ ", save=" + save + ", enterQuery=" + enterQuery + ", executeQuery=" + executeQuery + ", unlock="
				+ unlock + ", delete=" + delete + "]";
	}

}
