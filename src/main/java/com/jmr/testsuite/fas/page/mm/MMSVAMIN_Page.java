package com.jmr.testsuite.fas.page.mm;
import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "MMSVAMIN")
public class MMSVAMIN_Page {
	private String testCaseResult;

	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "ContractReferenceNumber")
	private String contractreferencenumber;
	
	@SheetColumn(value = "AuthorizeStatus")
	private String authorizestatus;
	
	@SheetColumn(value = "ContractStatus")
	private String contractstatus;
	
	@SheetColumn(value = "UserReference")
	private String userreference;
	
	@SheetColumn(value = "Product")
	private String product;
	
	@SheetColumn(value = "CounterParty")
	private String counterparty;
	
	@SheetColumn(value = "Currency")
	private String currency;
	
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "BookingDate")
	private String bookingdate;
	
	@SheetColumn(value = "MaturityDate")
	private String maturitydate;
	
	@SheetColumn(value = "ValueDate")
	private String valuedate;

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

	public String getContractreferencenumber() {
		return contractreferencenumber;
	}

	public void setContractreferencenumber(String contractreferencenumber) {
		this.contractreferencenumber = contractreferencenumber;
	}

	public String getAuthorizestatus() {
		return authorizestatus;
	}

	public void setAuthorizestatus(String authorizestatus) {
		this.authorizestatus = authorizestatus;
	}

	public String getContractstatus() {
		return contractstatus;
	}

	public void setContractstatus(String contractstatus) {
		this.contractstatus = contractstatus;
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

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
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

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	@Override
	public String toString() {
		return "MMSVAMIN_Page [testCaseResult=" + testCaseResult + ", runMode=" + runMode + ", testCaseId=" + testCaseId
				+ ", contractreferencenumber=" + contractreferencenumber + ", authorizestatus=" + authorizestatus
				+ ", contractstatus=" + contractstatus + ", userreference=" + userreference + ", product=" + product
				+ ", counterparty=" + counterparty + ", currency=" + currency + ", amount=" + amount + ", bookingdate="
				+ bookingdate + ", maturitydate=" + maturitydate + ", valuedate=" + valuedate + "]";
	}
	
	
	


}
