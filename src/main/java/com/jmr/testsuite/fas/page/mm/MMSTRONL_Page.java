package com.jmr.testsuite.fas.page.mm;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "MMSTRONL")
public class MMSTRONL_Page {
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "ReferenceNumber")
	private String referencenumber;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "RecordStatus")
	private String recordstatus;
	
	@SheetColumn(value = "UserReference")
	private String userreference;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "Customer")
	private String customer;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "BookingDate")
	private String bookingdate;
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "ReleatedReference")
	private String releatedreference;
	
	@SheetColumn(value = "AccountBranch")
	private String accountbranch;

	@SheetColumn(value = "Module")
	private String module;
	
	@SheetColumn(value = "SettlementStatus")
	private String settlementstatus;
	
	@SheetColumn(value = "ParentContractReference")
	private String parentcontractreference;

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

	public String getReferencenumber() {
		return referencenumber;
	}

	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}

	public String getAuthorizestatus() {
		return authorizestatus;
	}

	public void setAuthorizestatus(String authorizestatus) {
		this.authorizestatus = authorizestatus;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getUserreference() {
		return userreference;
	}

	public void setUserreference(String userreference) {
		this.userreference = userreference;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	public String getReleatedreference() {
		return releatedreference;
	}

	public void setReleatedreference(String releatedreference) {
		this.releatedreference = releatedreference;
	}

	public String getAccountbranch() {
		return accountbranch;
	}

	public void setAccountbranch(String accountbranch) {
		this.accountbranch = accountbranch;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getSettlementstatus() {
		return settlementstatus;
	}

	public void setSettlementstatus(String settlementstatus) {
		this.settlementstatus = settlementstatus;
	}

	public String getParentcontractreference() {
		return parentcontractreference;
	}

	public void setParentcontractreference(String parentcontractreference) {
		this.parentcontractreference = parentcontractreference;
	}

	@Override
	public String toString() {
		return "MMSTRONL_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", referencenumber=" + referencenumber + ", authorizestatus=" + authorizestatus + ", recordstatus="
				+ recordstatus + ", userreference=" + userreference + ", product=" + product + ", customer=" + customer
				+ ", currency=" + currency + ", bookingdate=" + bookingdate + ", maturitydate=" + maturitydate
				+ ", releatedreference=" + releatedreference + ", accountbranch=" + accountbranch + ", module=" + module
				+ ", settlementstatus=" + settlementstatus + ", parentcontractreference=" + parentcontractreference
				+ "]";
	}
	
	

}
