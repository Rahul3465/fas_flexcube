package com.jmr.testsuite.fas.page.mm;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "MMDVAMIN")
public class MMDVAMIN_Page {
	
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "ContractReferenceNumber")
	private String contractrefnumber;
	
	@SheetColumn(value = "Unlock")
	private String unlock;
	
	@SheetColumn(value = "AmendmentTab")
	private String amendmentTab;
	
	@SheetColumn(value = "AmendmentDate")
	private String amendmentdate;
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "InterestTab")
	private String interesttab;
	
	@SheetColumn(value = "Rate")
	private String rate;
	
	@SheetColumn(value = "RateCode")
	private String ratecode;
	
	@SheetColumn(value = "Delete")
	private String delete;
	
	@SheetColumn(value = "Authorise")
	private String authorise;

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

	public String getContractrefnumber() {
		return contractrefnumber;
	}

	public void setContractrefnumber(String contractrefnumber) {
		this.contractrefnumber = contractrefnumber;
	}

	public String getUnlock() {
		return unlock;
	}

	public void setUnlock(String unlock) {
		this.unlock = unlock;
	}

	public String getAmendmentTab() {
		return amendmentTab;
	}

	public void setAmendmentTab(String amendmentTab) {
		this.amendmentTab = amendmentTab;
	}

	public String getAmendmentdate() {
		return amendmentdate;
	}

	public void setAmendmentdate(String amendmentdate) {
		this.amendmentdate = amendmentdate;
	}

	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getInteresttab() {
		return interesttab;
	}

	public void setInteresttab(String interesttab) {
		this.interesttab = interesttab;
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

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getAuthorise() {
		return authorise;
	}

	public void setAuthorise(String authorise) {
		this.authorise = authorise;
	}

	@Override
	public String toString() {
		return "MMDVAMIN_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", contractrefnumber=" + contractrefnumber + ", unlock=" + unlock + ", amendmentTab=" + amendmentTab
				+ ", amendmentdate=" + amendmentdate + ", maturitydate=" + maturitydate + ", amount=" + amount
				+ ", interesttab=" + interesttab + ", rate=" + rate + ", ratecode=" + ratecode + ", delete=" + delete
				+ ", authorise=" + authorise + "]";
	}
	
	
	
	

}
