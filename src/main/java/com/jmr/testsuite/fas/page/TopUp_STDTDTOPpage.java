package com.jmr.testsuite.fas.page;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STDTDTOP")

public class TopUp_STDTDTOPpage {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "TopupAmount")
	private String topupamt;

	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "PayInOption")
	private String payinoption;
	
	@SheetColumn(value = "Percentage")
	private String percentage;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "OffsetAccount")
	private String offsetaccount;

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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getTopupamt() {
		return topupamt;
	}

	public void setTopupamt(String topupamt) {
		this.topupamt = topupamt;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getPayinoption() {
		return payinoption;
	}

	public void setPayinoption(String payinoption) {
		this.payinoption = payinoption;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOffsetaccount() {
		return offsetaccount;
	}

	public void setOffsetaccount(String offsetaccount) {
		this.offsetaccount = offsetaccount;
	}

	@Override
	public String toString() {
		return "TopUp_STDTDTOPpage [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode="
				+ runMode + ", accountnumber=" + accountnumber + ", topupamt=" + topupamt + ", valuedate=" + valuedate
				+ ", payinoption=" + payinoption + ", percentage=" + percentage + ", amount=" + amount
				+ ", offsetaccount=" + offsetaccount + "]";
	}

	
	
	
}
