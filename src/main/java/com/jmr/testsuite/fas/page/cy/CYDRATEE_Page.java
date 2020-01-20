package com.jmr.testsuite.fas.page.cy;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "CYDRATEE")
public class CYDRATEE_Page
{
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "CURRENCY1")
	private String currency1;
	
	@SheetColumn(value = "RATETYPE")
	private String ratetype;
	
	@SheetColumn(value = "MidRate")
	private String midRate;
	
	@SheetColumn(value = "BuySpread")
	private String buySpread;
	
	@SheetColumn(value = "SellSpread")
	private String sellSpread;

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

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getRatetype() {
		return ratetype;
	}

	public void setRatetype(String ratetype) {
		this.ratetype = ratetype;
	}

	public String getMidRate() {
		return midRate;
	}

	public void setMidRate(String midRate) {
		this.midRate = midRate;
	}

	public String getBuySpread() {
		return buySpread;
	}

	public void setBuySpread(String buySpread) {
		this.buySpread = buySpread;
	}

	public String getSellSpread() {
		return sellSpread;
	}

	public void setSellSpread(String sellSpread) {
		this.sellSpread = sellSpread;
	}

	@Override
	public String toString() {
		return "CYDRATEE_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", currency1=" + currency1 + ", ratetype=" + ratetype + ", midRate="
				+ midRate + ", buySpread=" + buySpread + ", sellSpread=" + sellSpread + "]";
	}
	
}
