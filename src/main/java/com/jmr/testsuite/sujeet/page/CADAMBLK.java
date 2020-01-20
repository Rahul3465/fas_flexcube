package com.jmr.testsuite.sujeet.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.jetty9.util.log.Log;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;


@Component
@Sheet(value = "CADAMBLK")
public class CADAMBLK {
	
	private String testCaseResult;

	@SheetColumn(value = "Run Mode")
	private String runMode;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "ACCOUNT")
	private String account;
	
	@SheetColumn(value = "AMOUNT")
	private String amount;
	
	
	@SheetColumn(value = "AMOUNT_BLOCK_TYPE")
	private String amountBlockType;
	
	@SheetColumn(value = "HOLD_CODE")
	private String holdCode;
	
	@SheetColumn(value = "VERIFY_AVAILABLE_BALANCE")
	private String verifyAvailableBalance;
	
	@SheetColumn(value = "EFFECTIVE_DATE")
	private String effectiveDate;
	
	@SheetColumn(value = "EXPIRY_DATE")
	private String expiryDate;
	
	@SheetColumn(value = "REFERENCE_NO")
	private String referenceNumber;
	
	@SheetColumn(value = "HOLD_DESCRIPTION")
	private String holdDescription;
	
	@SheetColumn(value = "REMARKS")
	private String remarks;









	

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
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getAmountBlockType() {
		return amountBlockType;
	}

	public void setAmountBlockType(String amountBlockType) {
		this.amountBlockType = amountBlockType;
	}

	public String getHoldCode() {
		return holdCode;
	}

	public void setHoldCode(String holdCode) {
		this.holdCode = holdCode;
	}

	public String getVerifyAvailableBalance() {
		return verifyAvailableBalance;
	}

	public void setVerifyAvailableBalance(String verifyAvailableBalance) {
		this.verifyAvailableBalance = verifyAvailableBalance;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getHoldDescription() {
		return holdDescription;
	}

	public void setHoldDescription(String holdDescription) {
		this.holdDescription = holdDescription;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
