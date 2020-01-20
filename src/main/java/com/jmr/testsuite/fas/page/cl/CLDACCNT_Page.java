package com.jmr.testsuite.fas.page.cl;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "CLDACCNT")
public class CLDACCNT_Page {
	
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
	
	@SheetColumn(value = "RateCode")
	private String ratecode;
	
	@SheetColumn(value = "CodeUsage")
	private String codeusage;
	
	@SheetColumn(value = "EditUDEDetail")
	private String editudedetail;
	
	@SheetColumn(value = "EffectiveDate")
	private String effectivedate;
	
	@SheetColumn(value = "LinkageDetailTab")
	private String linkagedetailtab;
	
	@SheetColumn(value = "AddbforLinkgagedetail")
	private String addbtn;
	
	@SheetColumn(value = "LinkageType")
	private String linkagetype;
	
	@SheetColumn(value = "LinkageRefno")
	private String linkagerefno;
	
	@SheetColumn(value = "linkageBranch")
	private String linkagebranch;
	
	@SheetColumn(value = "LinkageCurrency")
	private String linkagecurrency;
	
	@SheetColumn(value = "LinkageOverallAmt")
	private String linkageoverallamt;
	
	@SheetColumn(value = "LinkageCollateralCategory")
	private String linkagecollateralcategory;
	
	@SheetColumn(value = "LinkageHairCut")
	private String Linkagehaircut;
	
	@SheetColumn(value = "LinkageLimitAmount")
	private String linkagelimitamt;
	
	@SheetColumn(value = "LinkageLinkedPercentage")
	private String linkagelinkedpercentage;
	
	@SheetColumn(value = "UtilizationOrderNo")
	private String utilizationorderno;
	
	@SheetColumn(value = "CommitmentProduct")
	private String commitmentproduct;
	
	@SheetColumn(value = "PreferenctTab")
	private String preferencetab;
	
	@SheetColumn(value = "LiqbackDate")
	private String liqbackdate;
	

	
	
	@SheetColumn(value = "PaymentModeLink")
	private String paymentmodeLink;
	
	@SheetColumn(value = "CreditSettlementMode")
	private String creditsettlemtnmode;
	
	
	@SheetColumn(value = "CreditPaymentModeTab")
	private String creditpaymentmodetab;
	
	@SheetColumn(value = "CreditAccountBranch")
	private String creditaccountbranch;
	
	@SheetColumn(value = "CreditProductAccount")
	private String creditproductAccount;
	
	@SheetColumn(value = "DebitSettlementModeTab")
	private String debitsettlemtnmodetab;
	
	
	@SheetColumn(value = "DebitPaymentMode")
	private String debitpaymentmode;
	
	@SheetColumn(value = "DebitAccountBranch")
	private String debitaccountbranch;
	
	@SheetColumn(value = "DebitProductAccount")
	private String debitproductAccount;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	
	
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@SheetColumn(value = "Authorise")
	private String authorise;
	
	
	@SheetColumn(value = "New")
	private String newdata;
	
	
	@SheetColumn(value = "Save")
	private String save;
	
	
	

	public String getAuthorise() {
		return authorise;
	}

	public void setAuthorise(String authorise) {
		this.authorise = authorise;
	}

	public String getNewdata() {
		return newdata;
	}

	public void setNewdata(String newdata) {
		this.newdata = newdata;
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

	public String getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	public String getLinkagedetailtab() {
		return linkagedetailtab;
	}

	public void setLinkagedetailtab(String linkagedetailtab) {
		this.linkagedetailtab = linkagedetailtab;
	}

	public String getAddbtn() {
		return addbtn;
	}

	public void setAddbtn(String addbtn) {
		this.addbtn = addbtn;
	}

	public String getLinkagetype() {
		return linkagetype;
	}

	public void setLinkagetype(String linkagetype) {
		this.linkagetype = linkagetype;
	}

	public String getLinkagerefno() {
		return linkagerefno;
	}

	public void setLinkagerefno(String linkagerefno) {
		this.linkagerefno = linkagerefno;
	}

	public String getLinkagebranch() {
		return linkagebranch;
	}

	public void setLinkagebranch(String linkagebranch) {
		this.linkagebranch = linkagebranch;
	}

	public String getLinkagecurrency() {
		return linkagecurrency;
	}

	public void setLinkagecurrency(String linkagecurrency) {
		this.linkagecurrency = linkagecurrency;
	}

	public String getLinkageoverallamt() {
		return linkageoverallamt;
	}

	public void setLinkageoverallamt(String linkageoverallamt) {
		this.linkageoverallamt = linkageoverallamt;
	}

	public String getLinkagecollateralcategory() {
		return linkagecollateralcategory;
	}

	public void setLinkagecollateralcategory(String linkagecollateralcategory) {
		this.linkagecollateralcategory = linkagecollateralcategory;
	}

	public String getLinkagehaircut() {
		return Linkagehaircut;
	}

	public void setLinkagehaircut(String linkagehaircut) {
		Linkagehaircut = linkagehaircut;
	}

	public String getLinkagelimitamt() {
		return linkagelimitamt;
	}

	public void setLinkagelimitamt(String linkagelimitamt) {
		this.linkagelimitamt = linkagelimitamt;
	}

	public String getLinkagelinkedpercentage() {
		return linkagelinkedpercentage;
	}

	public void setLinkagelinkedpercentage(String linkagelinkedpercentage) {
		this.linkagelinkedpercentage = linkagelinkedpercentage;
	}

	public String getUtilizationorderno() {
		return utilizationorderno;
	}

	public void setUtilizationorderno(String utilizationorderno) {
		this.utilizationorderno = utilizationorderno;
	}

	public String getCommitmentproduct() {
		return commitmentproduct;
	}

	public void setCommitmentproduct(String commitmentproduct) {
		this.commitmentproduct = commitmentproduct;
	}

	public String getPreferencetab() {
		return preferencetab;
	}

	public void setPreferencetab(String preferencetab) {
		this.preferencetab = preferencetab;
	}

	public String getLiqbackdate() {
		return liqbackdate;
	}

	public void setLiqbackdate(String liqbackdate) {
		this.liqbackdate = liqbackdate;
	}
	
	

	public String getPaymentmodeLink() {
		return paymentmodeLink;
	}

	public void setPaymentmodeLink(String paymentmodeLink) {
		this.paymentmodeLink = paymentmodeLink;
	}

	public String getCreditsettlemtnmode() {
		return creditsettlemtnmode;
	}

	public void setCreditsettlemtnmode(String creditsettlemtnmode) {
		this.creditsettlemtnmode = creditsettlemtnmode;
	}

	public String getCreditpaymentmodetab() {
		return creditpaymentmodetab;
	}

	public void setCreditpaymentmodetab(String creditpaymentmodetab) {
		this.creditpaymentmodetab = creditpaymentmodetab;
	}

	public String getCreditaccountbranch() {
		return creditaccountbranch;
	}

	public void setCreditaccountbranch(String creditaccountbranch) {
		this.creditaccountbranch = creditaccountbranch;
	}

	public String getCreditproductAccount() {
		return creditproductAccount;
	}

	public void setCreditproductAccount(String creditproductAccount) {
		this.creditproductAccount = creditproductAccount;
	}

	public String getDebitsettlemtnmodetab() {
		return debitsettlemtnmodetab;
	}

	public void setDebitsettlemtnmodetab(String debitsettlemtnmodetab) {
		this.debitsettlemtnmodetab = debitsettlemtnmodetab;
	}

	public String getDebitpaymentmode() {
		return debitpaymentmode;
	}

	public void setDebitpaymentmode(String debitpaymentmode) {
		this.debitpaymentmode = debitpaymentmode;
	}

	public String getDebitaccountbranch() {
		return debitaccountbranch;
	}

	public void setDebitaccountbranch(String debitaccountbranch) {
		this.debitaccountbranch = debitaccountbranch;
	}

	public String getDebitproductAccount() {
		return debitproductAccount;
	}

	public void setDebitproductAccount(String debitproductAccount) {
		this.debitproductAccount = debitproductAccount;
	}

	public String getSave() {
		return save;
	}

	public void setSave(String save) {
		this.save = save;
	}

	@Override
	public String toString() {
		return "CLDACCNT_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", branch=" + branch + ", newbutton=" + newbutton + ", maintab=" + maintab
				+ ", product=" + product + ", custid=" + custid + ", ccy=" + ccy + ", amtfinanced=" + amtfinanced
				+ ", valuedate=" + valuedate + ", maturitydate=" + maturitydate + ", productdefault=" + productdefault
				+ ", numberofinstallment=" + numberofinstallment + ", unit=" + unit + ", frequency=" + frequency
				+ ", installmentstartdate=" + installmentstartdate + ", enrich=" + enrich + ", interestrate="
				+ interestrate + ", ratecode=" + ratecode + ", codeusage=" + codeusage + ", editudedetail="
				+ editudedetail + ", effectivedate=" + effectivedate + ", linkagedetailtab=" + linkagedetailtab
				+ ", addbtn=" + addbtn + ", linkagetype=" + linkagetype + ", linkagerefno=" + linkagerefno
				+ ", linkagebranch=" + linkagebranch + ", linkagecurrency=" + linkagecurrency + ", linkageoverallamt="
				+ linkageoverallamt + ", linkagecollateralcategory=" + linkagecollateralcategory + ", Linkagehaircut="
				+ Linkagehaircut + ", linkagelimitamt=" + linkagelimitamt + ", linkagelinkedpercentage="
				+ linkagelinkedpercentage + ", utilizationorderno=" + utilizationorderno + ", commitmentproduct="
				+ commitmentproduct + ", preferencetab=" + preferencetab + ", liqbackdate=" + liqbackdate
				+ ", paymentmodeLink=" + paymentmodeLink + ", creditsettlemtnmode=" + creditsettlemtnmode
				+ ", creditpaymentmodetab=" + creditpaymentmodetab + ", creditaccountbranch=" + creditaccountbranch
				+ ", creditproductAccount=" + creditproductAccount + ", debitsettlemtnmodetab=" + debitsettlemtnmodetab
				+ ", debitpaymentmode=" + debitpaymentmode + ", debitaccountbranch=" + debitaccountbranch
				+ ", debitproductAccount=" + debitproductAccount + ", accountnumber=" + accountnumber + ", authorise="
				+ authorise + ", newdata=" + newdata + ", save=" + save + "]";
	}

}
