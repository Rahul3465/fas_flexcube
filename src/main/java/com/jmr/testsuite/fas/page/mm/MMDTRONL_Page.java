package com.jmr.testsuite.fas.page.mm;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "MMSVAMIN")
public class MMDTRONL_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "CustomerNumber")
	private String customernumber;
	
	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "TradeDate")
	private String tradedate;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;
	
	@SheetColumn(value = "UserMaturityDate")
	private String usermaturitydate;
	
	@SheetColumn(value = "MaturityType")
	private String maturitytype;
	
	@SheetColumn(value = "InterestTab")
	private String interesttab;
	
	@SheetColumn(value = "RateType")
	private String ratetype;
	
	@SheetColumn(value = "Rate")
	private String rate;
	
	@SheetColumn(value = "RateCode")
	private String ratecode;
	
	@SheetColumn(value = "Mode")
	private String mode;
	
	@SheetColumn(value = "ScheduleBasis")
	private String schedulebasis;
	
	@SheetColumn(value = "PreferenceTab")
	private String preferencetab;
	
	@SheetColumn(value = "IgnoreHolidays")
	private String ignoreholiday;
	
	@SheetColumn(value = "MoveForward")
	private String moveforward;
	
	@SheetColumn(value = "MoveBackWard")
	private String movebackward;
	
	
	@SheetColumn(value = "Unlock")
	private String unlock;
	
	@SheetColumn(value = "Delete")
	private String delete;
	
	
	@SheetColumn(value = "Copy")
	private String copy;
	
	@SheetColumn(value = "New")
	private String newdata;
	
	@SheetColumn(value = "ContractRefNumber")
	private String contractrefnumber;

	@SheetColumn(value = "Authorize")
	private String authorize;
	
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAuthorize() {
		return authorize;
	}

	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}

	public String getContractrefnumber() {
		return contractrefnumber;
	}

	public void setContractrefnumber(String contractrefnumber) {
		this.contractrefnumber = contractrefnumber;
	}

	public String getNewdata() {
		return newdata;
	}

	public void setNewdata(String newdata) {
		this.newdata = newdata;
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

	public String getCopy() {
		return copy;
	}

	public void setCopy(String copy) {
		this.copy = copy;
	}

	public String getTestCaseResult() {
		return testCaseResult;
	}

	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
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

	public String getTradedate() {
		return tradedate;
	}

	public void setTradedate(String tradedate) {
		this.tradedate = tradedate;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getUsermaturitydate() {
		return usermaturitydate;
	}

	public void setUsermaturitydate(String usermaturitydate) {
		this.usermaturitydate = usermaturitydate;
	}

	public String getMaturitytype() {
		return maturitytype;
	}

	public void setMaturitytype(String maturitytype) {
		this.maturitytype = maturitytype;
	}

	public String getInteresttab() {
		return interesttab;
	}

	public void setInteresttab(String interesttab) {
		this.interesttab = interesttab;
	}

	public String getRatetype() {
		return ratetype;
	}

	public void setRatetype(String ratetype) {
		this.ratetype = ratetype;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRatecode() {
		return ratecode;
	}

	public void setRatecode(String ratecode) {
		this.ratecode = ratecode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getSchedulebasis() {
		return schedulebasis;
	}

	public void setSchedulebasis(String schedulebasis) {
		this.schedulebasis = schedulebasis;
	}

	public String getPreferencetab() {
		return preferencetab;
	}

	public void setPreferencetab(String preferencetab) {
		this.preferencetab = preferencetab;
	}

	public String getIgnoreholiday() {
		return ignoreholiday;
	}

	public void setIgnoreholiday(String ignoreholiday) {
		this.ignoreholiday = ignoreholiday;
	}

	public String getMoveforward() {
		return moveforward;
	}

	public void setMoveforward(String moveforward) {
		this.moveforward = moveforward;
	}

	public String getMovebackward() {
		return movebackward;
	}

	public void setMovebackward(String movebackward) {
		this.movebackward = movebackward;
	}

	@Override
	public String toString() {
		return "MMDTRONL_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", product=" + product + ", customernumber=" + customernumber + ", accountnumber=" + accountnumber
				+ ", currency=" + currency + ", amount=" + amount + ", tradedate=" + tradedate + ", valuedate="
				+ valuedate + ", usermaturitydate=" + usermaturitydate + ", maturitytype=" + maturitytype
				+ ", interesttab=" + interesttab + ", ratetype=" + ratetype + ", rate=" + rate + ", ratecode="
				+ ratecode + ", mode=" + mode + ", schedulebasis=" + schedulebasis + ", preferencetab=" + preferencetab
				+ ", ignoreholiday=" + ignoreholiday + ", moveforward=" + moveforward + ", movebackward=" + movebackward
				+ ", unlock=" + unlock + ", delete=" + delete + ", copy=" + copy + ", newdata=" + newdata
				+ ", contractrefnumber=" + contractrefnumber + ", authorize=" + authorize + "]";
	}


	

}
