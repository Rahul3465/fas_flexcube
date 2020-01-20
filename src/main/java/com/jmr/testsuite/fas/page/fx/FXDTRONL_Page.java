package com.jmr.testsuite.fas.page.fx;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "FXDTRONL")
public class FXDTRONL_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "CounterParty")
	private String counterparty;
	
	@SheetColumn(value = "BroughtCurrency")
	private String broughtcurrency;
	
	@SheetColumn(value = "BroughtAmount")
	private String broughtamount;
	
	@SheetColumn(value = "BroughtValueDate")
	private String broughtvaluedate;
	
	@SheetColumn(value = "SoldCurrency")
	private String soldcurrency;

	@SheetColumn(value = "SoldAmount")
	private String soldamount;
	
	@SheetColumn(value = "SoldValueDate")
	private String soldvaluedate;
	
	@SheetColumn(value = "CalculateButton")
	private String calculatebutton;
	
	@SheetColumn(value = "LinkedDealDetailbutton")
	private String linkeddealdetailbutton;
	
	@SheetColumn(value = "BookDate")
	private String bookingtype;
	
	@SheetColumn(value = "DealType")
	private String dealtype;
	
	@SheetColumn(value = "AutoLiquidation")
	private String autoliquidation;
	
	@SheetColumn(value = "RollOverInstructionTab")
	private String rolloverinstructiontab;
	
	@SheetColumn(value = "AutoRollOver")
	private String autorollover;
	
	@SheetColumn(value = "RollOverRequired")
	private String rolloverrequired;
	
	@SheetColumn(value = "NettingTab")
	private String nettingtab;
	
	@SheetColumn(value = "NettingType")
	private String nettingtype;
	
	@SheetColumn(value = "ModeOfNetting")
	private String modeofnetting;

	@SheetColumn(value = "LimitTracking")
	private String limittracing;
	
	@SheetColumn(value = "Charge")
	private String charge;
	
	@SheetColumn(value = "ChargeWaive")
	private String chargewaive;
	
	@SheetColumn(value = "Brokerage")
	private String brokerage;

	
	@SheetColumn(value = "BrokeageWaive")
	private String brokeragewaive;
	
	
	
	
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

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	public String getBroughtcurrency() {
		return broughtcurrency;
	}

	public void setBroughtcurrency(String broughtcurrency) {
		this.broughtcurrency = broughtcurrency;
	}

	public String getBroughtamount() {
		return broughtamount;
	}

	public void setBroughtamount(String broughtamount) {
		this.broughtamount = broughtamount;
	}

	public String getBroughtvaluedate() {
		return broughtvaluedate;
	}

	public void setBroughtvaluedate(String broughtvaluedate) {
		this.broughtvaluedate = broughtvaluedate;
	}

	public String getSoldcurrency() {
		return soldcurrency;
	}

	public void setSoldcurrency(String soldcurrency) {
		this.soldcurrency = soldcurrency;
	}

	public String getSoldamount() {
		return soldamount;
	}

	public void setSoldamount(String soldamount) {
		this.soldamount = soldamount;
	}

	public String getSoldvaluedate() {
		return soldvaluedate;
	}

	public void setSoldvaluedate(String soldvaluedate) {
		this.soldvaluedate = soldvaluedate;
	}

	public String getCalculatebutton() {
		return calculatebutton;
	}

	public void setCalculatebutton(String calculatebutton) {
		this.calculatebutton = calculatebutton;
	}

	public String getLinkeddealdetailbutton() {
		return linkeddealdetailbutton;
	}

	public void setLinkeddealdetailbutton(String linkeddealdetailbutton) {
		this.linkeddealdetailbutton = linkeddealdetailbutton;
	}
	
	public String getBookingtype() {
		return bookingtype;
	}

	public void setBookingtype(String bookingtype) {
		this.bookingtype = bookingtype;
	}

	public String getDealtype() {
		return dealtype;
	}

	public void setDealtype(String dealtype) {
		this.dealtype = dealtype;
	}

	public String getAutoliquidation() {
		return autoliquidation;
	}

	public void setAutoliquidation(String autoliquidation) {
		this.autoliquidation = autoliquidation;
	}

	public String getRolloverinstructiontab() {
		return rolloverinstructiontab;
	}

	public void setRolloverinstructiontab(String rolloverinstructiontab) {
		this.rolloverinstructiontab = rolloverinstructiontab;
	}

	public String getAutorollover() {
		return autorollover;
	}

	public void setAutorollover(String autorollover) {
		this.autorollover = autorollover;
	}

	public String getRolloverrequired() {
		return rolloverrequired;
	}

	public void setRolloverrequired(String rolloverrequired) {
		this.rolloverrequired = rolloverrequired;
	}

	public String getNettingtab() {
		return nettingtab;
	}

	public void setNettingtab(String nettingtab) {
		this.nettingtab = nettingtab;
	}

	public String getNettingtype() {
		return nettingtype;
	}

	public void setNettingtype(String nettingtype) {
		this.nettingtype = nettingtype;
	}

	public String getModeofnetting() {
		return modeofnetting;
	}

	public void setModeofnetting(String modeofnetting) {
		this.modeofnetting = modeofnetting;
	}

	public String getLimittracing() {
		return limittracing;
	}

	public void setLimittracing(String limittracing) {
		this.limittracing = limittracing;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getChargewaive() {
		return chargewaive;
	}

	public void setChargewaive(String chargewaive) {
		this.chargewaive = chargewaive;
	}

	public String getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(String brokerage) {
		this.brokerage = brokerage;
	}

	public String getBrokeragewaive() {
		return brokeragewaive;
	}

	public void setBrokeragewaive(String brokeragewaive) {
		this.brokeragewaive = brokeragewaive;
	}

	@Override
	public String toString() {
		return "FXDTRONL_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", product=" + product + ", counterparty=" + counterparty
				+ ", broughtcurrency=" + broughtcurrency + ", broughtamount=" + broughtamount + ", broughtvaluedate="
				+ broughtvaluedate + ", soldcurrency=" + soldcurrency + ", soldamount=" + soldamount
				+ ", soldvaluedate=" + soldvaluedate + ", calculatebutton=" + calculatebutton
				+ ", linkeddealdetailbutton=" + linkeddealdetailbutton + ", bookingtype=" + bookingtype + ", dealtype="
				+ dealtype + ", autoliquidation=" + autoliquidation + ", rolloverinstructiontab="
				+ rolloverinstructiontab + ", autorollover=" + autorollover + ", rolloverrequired=" + rolloverrequired
				+ ", nettingtab=" + nettingtab + ", nettingtype=" + nettingtype + ", modeofnetting=" + modeofnetting
				+ ", limittracing=" + limittracing + ", charge=" + charge + ", chargewaive=" + chargewaive
				+ ", brokerage=" + brokerage + ", brokeragewaive=" + brokeragewaive + "]";
	}


	
	
}
