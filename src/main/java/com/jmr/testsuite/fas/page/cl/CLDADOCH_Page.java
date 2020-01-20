package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLDADOCH")
public class CLDADOCH_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Component")
	private String componet;
	
	@SheetColumn(value = "CreditAccount")
	private String creditaccount;
	
	@SheetColumn(value = "ChargeType")
	private String chargetype;
	
	@SheetColumn(value = "Reason")
	private String reason;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "ExchangeRage")
	private String exchangerate;
	
	@SheetColumn(value = "ComponentCcyEquipment")
	private String componentccyequipment;
	
	@SheetColumn(value = "OriginalExchangeRate")
	private String orginalexchangerate;
	
	
	@SheetColumn(value = "Copy")
	private String copy;
		
	@SheetColumn(value = "Delete")
	private String delete;
	
	@SheetColumn(value = "Reverse")
	private String reverse;
	
	@SheetColumn(value = "CopyAmount")
	private String copyamount;

	
	
	public String getCopyamount() {
		return copyamount;
	}

	public void setCopyamount(String copyamount) {
		this.copyamount = copyamount;
	}

	public String getCopy() {
		return copy;
	}

	public void setCopy(String copy) {
		this.copy = copy;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getReverse() {
		return reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
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

	public String getComponet() {
		return componet;
	}

	public void setComponet(String componet) {
		this.componet = componet;
	}

	public String getCreditaccount() {
		return creditaccount;
	}

	public void setCreditaccount(String creditaccount) {
		this.creditaccount = creditaccount;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExchangerate() {
		return exchangerate;
	}

	public void setExchangerate(String exchangerate) {
		this.exchangerate = exchangerate;
	}

	public String getComponentccyequipment() {
		return componentccyequipment;
	}

	public void setComponentccyequipment(String componentccyequipment) {
		this.componentccyequipment = componentccyequipment;
	}

	public String getOrginalexchangerate() {
		return orginalexchangerate;
	}

	public void setOrginalexchangerate(String orginalexchangerate) {
		this.orginalexchangerate = orginalexchangerate;
	}

	@Override
	public String toString() {
		return "CLDADOCH_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", accountnumber=" + accountnumber + ", componet=" + componet
				+ ", creditaccount=" + creditaccount + ", chargetype=" + chargetype + ", reason=" + reason
				+ ", currency=" + currency + ", amount=" + amount + ", exchangerate=" + exchangerate
				+ ", componentccyequipment=" + componentccyequipment + ", orginalexchangerate=" + orginalexchangerate
				+ ", copy=" + copy + ", delete=" + delete + ", reverse=" + reverse + ", copyamount=" + copyamount + "]";
	}

	

	
	

}
