package com.jmr.testsuite.fas.page.cy;

import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import com.jmr.testsuite.fas.SpringConfiguration;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "CYDQRATE")
public class CYDQRATE_Page
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
	
	@SheetColumn(value = "CURRENCY2")
	private String currency2;
	
	@SheetColumn(value = "RATETYPE")
	private String ratetype;
	
	@SheetColumn(value = "FROMDATE")
	private String fromdate;
	
	@SheetColumn(value = "TODATE")
	private String todate;

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

	public String getCurrency2() {
		return currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public String getRatetype() {
		return ratetype;
	}

	public void setRatetype(String ratetype) {
		this.ratetype = ratetype;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	@Override
	public String toString() {
		return "CYDQRATE_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", currency1=" + currency1 + ", currency2=" + currency2 + ", ratetype="
				+ ratetype + ", fromdate=" + fromdate + ", todate=" + todate + "]";
	}

	
	
}
