package com.jmr.testsuite.fas.page.cl;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLDACCVM")
public class CLDACCVM_Page {
	
	private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;

	@SheetColumn(value = "RunMode")
	private String runMode;

	@SheetColumn(value = "Fastpath")
	private String fastpath;

	@SheetColumn(value = "Branch")
	private String branch;

	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	
	@SheetColumn(value = "MainTab")
	private String maintab;
	
	@SheetColumn(value = "AmountFinanced")
	private String amountfinanced;

	@SheetColumn(value = "ValueDate")
	private String valuedate;

	@SheetColumn(value = "EffectiveDate")
	private String effectivedate;
	
	@SheetColumn(value = "EffectiveDate2")
	private String effectivedate2;

	@SheetColumn(value = "NumberofInstallment")
	private String numberofinstallments;

	@SheetColumn(value = "Unit")
	private String unit;

	@SheetColumn(value = "Frequency")
	private String frequency;
		
	@SheetColumn(value = "IntallmentstartDate")
	private String installmentstartdate;

	@SheetColumn(value = "MaturityDate")
	private String maturitydate;

	@SheetColumn(value = "ProductDefault")
	private String productdefault;

	@SheetColumn(value = "NumberofInstallment")
	private String numberofinstallment;

	@SheetColumn(value = "Enrichbutton")
	private String enrich;

	@SheetColumn(value = "InterestRate")
	private String interestrate;

	@SheetColumn(value = "MaturityType")
	private String maturitytype;
	
	@SheetColumn(value = "RateCode")
	private String ratecode;

	@SheetColumn(value = "CodeUsage")
	private String codeusage;

	@SheetColumn(value = "EditUDEDetail")
	private String editudedetail;

	@SheetColumn(value = "InterestValue")
	private String interestvalue;
	
	
	@SheetColumn(value = "PreferenceTab")
	private String preferencetab;
	
	@SheetColumn(value = "Holiday")
	private String holiday;
	
	@SheetColumn(value = "AmendPastPaidSchedule")
	private String amendpastpaidschedule;
	
	@SheetColumn(value = "LiquidateBackSchedule")
	private String liquidatebackschedule;
	
	@SheetColumn(value = "AutoLiquidation")
	private String autoliquidation;
	
	@SheetColumn(value = "ResetRetryCount")
	private String resetretrycount;
	
	@SheetColumn(value = "PartialLiquidation")
	private String partialLiquidation;
	

	@SheetColumn(value = "StatusChange")
	private String statuschange;
	
	@SheetColumn(value = "UserdefinedInterestValue")
	private String userdefinterestvalue;
	
	@SheetColumn(value = "LinkagesTab")
	private String linkagestab;
	
	@SheetColumn(value = "LinkageType")
	private String linkagetype;
	
	@SheetColumn(value = "LinkedRefNumber")
	private String linkedrefnumber;
	
	@SheetColumn(value = "HairCut")
	private String haircut;
	
	@SheetColumn(value = "LinkedPercentage")
	private String linkedpercentage;
	
	@SheetColumn(value = "UtilizedOrderNumber")
	private String utilizedordernumber;
	
	@SheetColumn(value = "EffectivedateReq")
	private String effectivedatereq;
	
	@SheetColumn(value = "InterestRateReq")
	private String interestratereq;
	
	@SheetColumn(value = "ElementID")
	private String elementid;
	
	@SheetColumn(value = "New")
	private String newdata;
	
	@SheetColumn(value = "Authorize")
	private String authorize;
	
	
	
		
	
	public String getNewdata() {
		return newdata;
	}

	public void setNewdata(String newdata) {
		this.newdata = newdata;
	}

	public String getAuthorize() {
		return authorize;
	}

	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}

	public String getElementid() {
		return elementid;
	}

	public void setElementid(String elementid) {
		this.elementid = elementid;
	}

	public String getEffectivedatereq() {
		return effectivedatereq;
	}

	public void setEffectivedatereq(String effectivedatereq) {
		this.effectivedatereq = effectivedatereq;
	}

	public String getInterestratereq() {
		return interestratereq;
	}

	public void setInterestratereq(String interestratereq) {
		this.interestratereq = interestratereq;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getMaintab() {
		return maintab;
	}

	public void setMaintab(String maintab) {
		this.maintab = maintab;
	}

	public String getAmountfinanced() {
		return amountfinanced;
	}

	public void setAmountfinanced(String amountfinanced) {
		this.amountfinanced = amountfinanced;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	public String getNumberofinstallments() {
		return numberofinstallments;
	}

	public void setNumberofinstallments(String numberofinstallments) {
		this.numberofinstallments = numberofinstallments;
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

	public String getRatecode() {
		return ratecode;
	}

	public void setRatecode(String ratecode) {
		this.ratecode = ratecode;
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

	public String getInterestvalue() {
		return interestvalue;
	}

	public void setInterestvalue(String interestvalue) {
		this.interestvalue = interestvalue;
	}

	public String getPreferencetab() {
		return preferencetab;
	}

	public void setPreferencetab(String preferencetab) {
		this.preferencetab = preferencetab;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getAmendpastpaidschedule() {
		return amendpastpaidschedule;
	}

	public void setAmendpastpaidschedule(String amendpastpaidschedule) {
		this.amendpastpaidschedule = amendpastpaidschedule;
	}

	public String getLiquidatebackschedule() {
		return liquidatebackschedule;
	}

	public void setLiquidatebackschedule(String liquidatebackschedule) {
		this.liquidatebackschedule = liquidatebackschedule;
	}

	public String getAutoliquidation() {
		return autoliquidation;
	}

	public void setAutoliquidation(String autoliquidation) {
		this.autoliquidation = autoliquidation;
	}

	public String getResetretrycount() {
		return resetretrycount;
	}

	public void setResetretrycount(String resetretrycount) {
		this.resetretrycount = resetretrycount;
	}

	public String getPartialLiquidation() {
		return partialLiquidation;
	}

	public void setPartialLiquidation(String partialLiquidation) {
		this.partialLiquidation = partialLiquidation;
	}

	public String getStatuschange() {
		return statuschange;
	}

	public void setStatuschange(String statuschange) {
		this.statuschange = statuschange;
	}

	public String getUserdefinterestvalue() {
		return userdefinterestvalue;
	}

	public void setUserdefinterestvalue(String userdefinterestvalue) {
		this.userdefinterestvalue = userdefinterestvalue;
	}

	public String getLinkagestab() {
		return linkagestab;
	}

	public void setLinkagestab(String linkagestab) {
		this.linkagestab = linkagestab;
	}

	public String getLinkagetype() {
		return linkagetype;
	}

	public void setLinkagetype(String linkagetype) {
		this.linkagetype = linkagetype;
	}

	public String getLinkedrefnumber() {
		return linkedrefnumber;
	}

	public void setLinkedrefnumber(String linkedrefnumber) {
		this.linkedrefnumber = linkedrefnumber;
	}

	public String getHaircut() {
		return haircut;
	}

	public void setHaircut(String haircut) {
		this.haircut = haircut;
	}

	public String getLinkedpercentage() {
		return linkedpercentage;
	}

	public void setLinkedpercentage(String linkedpercentage) {
		this.linkedpercentage = linkedpercentage;
	}

	public String getUtilizedordernumber() {
		return utilizedordernumber;
	}

	public void setUtilizedordernumber(String utilizedordernumber) {
		this.utilizedordernumber = utilizedordernumber;
	}
	
	
	

	public String getEffectivedate2() {
		return effectivedate2;
	}

	public void setEffectivedate2(String effectivedate2) {
		this.effectivedate2 = effectivedate2;
	}

	@Override
	public String toString() {
		return "CLDACCVM_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", branch=" + branch + ", accountnumber=" + accountnumber + ", maintab="
				+ maintab + ", amountfinanced=" + amountfinanced + ", valuedate=" + valuedate + ", effectivedate="
				+ effectivedate + ", effectivedate2=" + effectivedate2 + ", numberofinstallments="
				+ numberofinstallments + ", unit=" + unit + ", frequency=" + frequency + ", installmentstartdate="
				+ installmentstartdate + ", maturitydate=" + maturitydate + ", productdefault=" + productdefault
				+ ", numberofinstallment=" + numberofinstallment + ", enrich=" + enrich + ", interestrate="
				+ interestrate + ", maturitytype=" + maturitytype + ", ratecode=" + ratecode + ", codeusage="
				+ codeusage + ", editudedetail=" + editudedetail + ", interestvalue=" + interestvalue
				+ ", preferencetab=" + preferencetab + ", holiday=" + holiday + ", amendpastpaidschedule="
				+ amendpastpaidschedule + ", liquidatebackschedule=" + liquidatebackschedule + ", autoliquidation="
				+ autoliquidation + ", resetretrycount=" + resetretrycount + ", partialLiquidation="
				+ partialLiquidation + ", statuschange=" + statuschange + ", userdefinterestvalue="
				+ userdefinterestvalue + ", linkagestab=" + linkagestab + ", linkagetype=" + linkagetype
				+ ", linkedrefnumber=" + linkedrefnumber + ", haircut=" + haircut + ", linkedpercentage="
				+ linkedpercentage + ", utilizedordernumber=" + utilizedordernumber + ", effectivedatereq="
				+ effectivedatereq + ", interestratereq=" + interestratereq + ", elementid=" + elementid + ", newdata="
				+ newdata + ", authorize=" + authorize + "]";
	}

	

}
