package com.jmr.testsuite.fas.page.ic;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "ICDBADHC")
public class ICDBADHC_Page
{
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value="AccountNumber")
	private String accountnumber;
	
	@SheetColumn(value="StockCatalogCode")
	private String stockCatalogCode;
	
	@SheetColumn(value="CertificateNumber")
	private String certificateNumber;
	
	@SheetColumn(value="MarkAsDuplicate")
	private String markAsDuplicate;
	
	@SheetColumn(value="AutoGenerateCertificateNo")
	private String autoGenerateCertificateNo;
	
	@SheetColumn(value="Generate")
	private String generate;

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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getStockCatalogCode() {
		return stockCatalogCode;
	}

	public void setStockCatalogCode(String stockCatalogCode) {
		this.stockCatalogCode = stockCatalogCode;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getMarkAsDuplicate() {
		return markAsDuplicate;
	}

	public void setMarkAsDuplicate(String markAsDuplicate) {
		this.markAsDuplicate = markAsDuplicate;
	}

	public String getAutoGenerateCertificateNo() {
		return autoGenerateCertificateNo;
	}

	public void setAutoGenerateCertificateNo(String autoGenerateCertificateNo) {
		this.autoGenerateCertificateNo = autoGenerateCertificateNo;
	}

	public String getGenerate() {
		return generate;
	}

	public void setGenerate(String generate) {
		this.generate = generate;
	}

	@Override
	public String toString() {
		return "ICDBADHC_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", accountnumber=" + accountnumber + ", stockCatalogCode="
				+ stockCatalogCode + ", certificateNumber=" + certificateNumber + ", markAsDuplicate=" + markAsDuplicate
				+ ", autoGenerateCertificateNo=" + autoGenerateCertificateNo + ", generate=" + generate + "]";
	}

}
