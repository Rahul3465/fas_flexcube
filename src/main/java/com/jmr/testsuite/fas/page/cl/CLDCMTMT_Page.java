package com.jmr.testsuite.fas.page.cl;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLDCMTMT")
public class CLDCMTMT_Page {
private String testCaseResult;
	
@SheetColumn(value = "Test Case Id")
private String testCaseId;

@SheetColumn(value = "RunMode")
private String runMode;

@SheetColumn(value = "Fastpath")
private String fastpath;

@SheetColumn(value = "Branch")
private String branch;

@SheetColumn(value = "New")
private String newbutton;

@SheetColumn(value = "MainTab")
private String maintab;

@SheetColumn(value = "Product")
private String product;

@SheetColumn(value = "CustomerID")
private String custid;

@SheetColumn(value = "Currency")
private String ccy;

@SheetColumn(value = "AmountFinanced")
private String amtfinanced;
	
@SheetColumn(value = "ValueDate")
private String valuedate;

@SheetColumn(value = "MaturityDate")
private String maturitydate;

@SheetColumn(value = "ProductDefault")
private String productdefault;

@SheetColumn(value = "NumberofInstallment")
private String numberofinstallment;

@SheetColumn(value = "Unit")
private String unit;

@SheetColumn(value = "Frequency")
private String frequency;

@SheetColumn(value = "InstallmentStartDate")
private String installmentstartdate;

@SheetColumn(value = "Enrichbutton")
private String enrich;

@SheetColumn(value = "InterestRate")
private String interestrate;

@SheetColumn(value = "MaturityType")
private String maturitytype;

@SheetColumn(value = "CodeUsage")
private String codeusage;

@SheetColumn(value = "EditUDEDetail")
private String editudedetail;

@SheetColumn(value = "EffectiveDate")
private String effectivedate;

@SheetColumn(value = "UserdefinedInterestValue")
private String userdefinterestvalue;

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

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public String getNewbutton() {
	return newbutton;
}

public void setNewbutton(String newbutton) {
	this.newbutton = newbutton;
}

public String getMaintab() {
	return maintab;
}

public void setMaintab(String maintab) {
	this.maintab = maintab;
}

public String getProduct() {
	return product;
}

public void setProduct(String product) {
	this.product = product;
}

public String getCustid() {
	return custid;
}

public void setCustid(String custid) {
	this.custid = custid;
}

public String getCcy() {
	return ccy;
}

public void setCcy(String ccy) {
	this.ccy = ccy;
}

public String getAmtfinanced() {
	return amtfinanced;
}

public void setAmtfinanced(String amtfinanced) {
	this.amtfinanced = amtfinanced;
}

public String getValuedate() {
	return valuedate;
}

public void setValuedate(String valuedate) {
	this.valuedate = valuedate;
}

public String getMaturitydate() {
	return maturitydate;
}

public void setMaturitydate(String maturitydate) {
	this.maturitydate = maturitydate;
}

public String getProductdefault() {
	return productdefault;
}

public void setProductdefault(String productdefault) {
	this.productdefault = productdefault;
}

public String getNumberofinstallment() {
	return numberofinstallment;
}

public void setNumberofinstallment(String numberofinstallment) {
	this.numberofinstallment = numberofinstallment;
}

public String getUnit() {
	return unit;
}

public void setUnit(String unit) {
	this.unit = unit;
}

public String getFrequency() {
	return frequency;
}

public void setFrequency(String frequency) {
	this.frequency = frequency;
}

public String getInstallmentstartdate() {
	return installmentstartdate;
}

public void setInstallmentstartdate(String installmentstartdate) {
	this.installmentstartdate = installmentstartdate;
}

public String getEnrich() {
	return enrich;
}

public void setEnrich(String enrich) {
	this.enrich = enrich;
}

public String getInterestrate() {
	return interestrate;
}

public void setInterestrate(String interestrate) {
	this.interestrate = interestrate;
}

public String getMaturitytype() {
	return maturitytype;
}

public void setMaturitytype(String maturitytype) {
	this.maturitytype = maturitytype;
}

public String getCodeusage() {
	return codeusage;
}

public void setCodeusage(String codeusage) {
	this.codeusage = codeusage;
}

public String getEditudedetail() {
	return editudedetail;
}

public void setEditudedetail(String editudedetail) {
	this.editudedetail = editudedetail;
}

public String getEffectivedate() {
	return effectivedate;
}

public void setEffectivedate(String effectivedate) {
	this.effectivedate = effectivedate;
}

public String getUserdefinterestvalue() {
	return userdefinterestvalue;
}

public void setUserdefinterestvalue(String userdefinterestvalue) {
	this.userdefinterestvalue = userdefinterestvalue;
}

@Override
public String toString() {
	return "CLDCMTMT_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
			+ ", fastpath=" + fastpath + ", branch=" + branch + ", newbutton=" + newbutton + ", maintab=" + maintab
			+ ", product=" + product + ", custid=" + custid + ", ccy=" + ccy + ", amtfinanced=" + amtfinanced
			+ ", valuedate=" + valuedate + ", maturitydate=" + maturitydate + ", productdefault=" + productdefault
			+ ", numberofinstallment=" + numberofinstallment + ", unit=" + unit + ", frequency=" + frequency
			+ ", installmentstartdate=" + installmentstartdate + ", enrich=" + enrich + ", interestrate=" + interestrate
			+ ", maturitytype=" + maturitytype + ", codeusage=" + codeusage + ", editudedetail=" + editudedetail
			+ ", effectivedate=" + effectivedate + ", userdefinterestvalue=" + userdefinterestvalue + "]";
}




	
}
