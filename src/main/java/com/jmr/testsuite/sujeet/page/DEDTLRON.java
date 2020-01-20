package com.jmr.testsuite.sujeet.page;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "DEDTLRON")
public class DEDTLRON {
	
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;
	
	@SheetColumn("Test Case Id")
	private String testCaseID;										

	@SheetColumn(value = "BATCH_NUMBER")
	private String batchNumber;
	
	@SheetColumn(value = "DESCRIPTION")
	private String description;
	
	@SheetColumn(value = "BALANCING")
	private String balancing;
	
	@SheetColumn(value = "PRODUCT")
	private String product;
	
	@SheetColumn(value = "ADDITIONAL_TEXT")
	private String additionalText;
	
	@SheetColumn(value = "TRANSACTION_BRANCH")
	private String transactionBranch;
	
	@SheetColumn(value = "TRANSACTION_ACCOUNT")
	private String transactionAccount;
	
	@SheetColumn(value = "TRANSACTION_CURRENCY")
	private String transactionCurrency;
	
	@SheetColumn(value = "TRANSACTION_AMOUNT")
	private String transactionAmount;
	
	@SheetColumn(value = "OFFSET_BRANCH")
	private String offsetBranch;

	@SheetColumn(value = "OFFSET_ACCOUNT")
	private String offsetAccount;
		
	@SheetColumn(value = "OFFSET_CURRENCY")
	private String offsetCurrency;
	
	@SheetColumn(value = "OFFSET_AMOUNT")
	private String offsetAmount;

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

	public String getTestCaseID() {
		return testCaseID;
	}

	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBalancing() {
		return balancing;
	}

	public void setBalancing(String balancing) {
		this.balancing = balancing;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(String additionalText) {
		this.additionalText = additionalText;
	}

	public String getTransactionBranch() {
		return transactionBranch;
	}

	public void setTransactionBranch(String transactionBranch) {
		this.transactionBranch = transactionBranch;
	}

	public String getTransactionAccount() {
		return transactionAccount;
	}

	public void setTransactionAccount(String transactionAccount) {
		this.transactionAccount = transactionAccount;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getOffsetBranch() {
		return offsetBranch;
	}

	public void setOffsetBranch(String offsetBranch) {
		this.offsetBranch = offsetBranch;
	}

	public String getOffsetAccount() {
		return offsetAccount;
	}

	public void setOffsetAccount(String offsetAccount) {
		this.offsetAccount = offsetAccount;
	}

	public String getOffsetCurrency() {
		return offsetCurrency;
	}

	public void setOffsetCurrency(String offsetCurrency) {
		this.offsetCurrency = offsetCurrency;
	}

	public String getOffsetAmount() {
		return offsetAmount;
	}

	public void setOffsetAmount(String offsetAmount) {
		this.offsetAmount = offsetAmount;
	}
	
}
