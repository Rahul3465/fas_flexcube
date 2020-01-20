package com.jmr.testsuite.fas.page.cf;

import io.github.millij.poi.ss.model.annotations.SheetColumn;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
@Component
@Sheet(value = "CFDFLTRI")
public class CFDFLTRI_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "RateCode")
	private String ratecode;
	
	@SheetColumn(value = "Description")
	private String description;
	
	@SheetColumn(value = "QuoteBasisforLoan")
	private String quortebasisforloan;
	
	@SheetColumn(value = "ProporatefloatRate")
	private String proporaefloatrate;
	
	@SheetColumn(value = "CurrencyAdd")
	private String currencyadd;
	
	@SheetColumn(value = "CurrencyCode")
	private String currencycode;

	@SheetColumn(value = "AmountslabAdd")
	private String amountadd;
	
	@SheetColumn(value = "AmountSlab")
	private String amountslab;
	
	@SheetColumn(value = "EffectiveDate")
	private String effectivedate;
	
	@SheetColumn(value = "BorrowLend")
	private String borrowlend;
	
	@SheetColumn(value = "TenorAdd")
	private String tenoradd;
	
	@SheetColumn(value = "TenorTo")
	private String tenorto;
	
	@SheetColumn(value = "InterestRate")
	private String interestrate;
	
	@SheetColumn(value = "PickUpRate")
	private String pickuprate;
	
	

	public String getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(String interestrate) {
		this.interestrate = interestrate;
	}

	public String getPickuprate() {
		return pickuprate;
	}

	public void setPickuprate(String pickuprate) {
		this.pickuprate = pickuprate;
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

	

	public String getRatecode() {
		return ratecode;
	}

	public void setRatecode(String ratecode) {
		this.ratecode = ratecode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuortebasisforloan() {
		return quortebasisforloan;
	}

	public void setQuortebasisforloan(String quortebasisforloan) {
		this.quortebasisforloan = quortebasisforloan;
	}

	public String getProporaefloatrate() {
		return proporaefloatrate;
	}

	public void setProporaefloatrate(String proporaefloatrate) {
		this.proporaefloatrate = proporaefloatrate;
	}

	public String getCurrencyadd() {
		return currencyadd;
	}

	public void setCurrencyadd(String currencyadd) {
		this.currencyadd = currencyadd;
	}

	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getAmountadd() {
		return amountadd;
	}

	public void setAmountadd(String amountadd) {
		this.amountadd = amountadd;
	}

	public String getAmountslab() {
		return amountslab;
	}

	public void setAmountslab(String amountslab) {
		this.amountslab = amountslab;
	}

	public String getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	public String getBorrowlend() {
		return borrowlend;
	}

	public void setBorrowlend(String borrowlend) {
		this.borrowlend = borrowlend;
	}

	public String getTenoradd() {
		return tenoradd;
	}

	public void setTenoradd(String tenoradd) {
		this.tenoradd = tenoradd;
	}

	public String getTenorto() {
		return tenorto;
	}

	public void setTenorto(String tenorto) {
		this.tenorto = tenorto;
	}

	@Override
	public String toString() {
		return "CFDFLTRI_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", ratecode=" + ratecode + ", description=" + description
				+ ", quortebasisforloan=" + quortebasisforloan + ", proporaefloatrate=" + proporaefloatrate
				+ ", currencyadd=" + currencyadd + ", currencycode=" + currencycode + ", amountadd=" + amountadd
				+ ", amountslab=" + amountslab + ", effectivedate=" + effectivedate + ", borrowlend=" + borrowlend
				+ ", tenoradd=" + tenoradd + ", tenorto=" + tenorto + ", interestrate=" + interestrate + ", pickuprate="
				+ pickuprate + "]";
	}

	



	
}
