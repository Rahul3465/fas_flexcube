package com.jmr.testsuite.sujeet.page;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "GEDCOLLT")
public class GEDCOLLT {
	
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;
	
	@SheetColumn("Test Case Id")
	private String testCaseId;	

	
	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	@SheetColumn("LiabilityNo")
	private String liabilityNo;

	@SheetColumn(value = "CollateralCode")
	private String collateralCode;
	
	@SheetColumn(value = "SeniorityClaim")
	private String seniorityClaim;
	
	@SheetColumn(value = "ChargeType")
	private String chargeType;
	
	@SheetColumn(value = "HaircutPercent")
	private String haircutPercent;	
	
	@SheetColumn(value = "CollateralCategory")
	private String collateralCategory;
	
	@SheetColumn(value = "CollateralCurrency")
	private String collateralCurrency;
	
	@SheetColumn(value = "CollateralValue")
	private String collateralValue;
	
	@SheetColumn(value = "StartDate")
	private String startDate;

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

	public String getLiabilityNo() {
		return liabilityNo;
	}

	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

	public String getCollateralCode() {
		return collateralCode;
	}

	public void setCollateralCode(String collateralCode) {
		this.collateralCode = collateralCode;
	}

	public String getSeniorityClaim() {
		return seniorityClaim;
	}

	public void setSeniorityClaim(String seniorityClaim) {
		this.seniorityClaim = seniorityClaim;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getHaircutPercent() {
		return haircutPercent;
	}

	public void setHaircutPercent(String haircutPercent) {
		this.haircutPercent = haircutPercent;
	}

	public String getCollateralCategory() {
		return collateralCategory;
	}

	public void setCollateralCategory(String collateralCategory) {
		this.collateralCategory = collateralCategory;
	}

	public String getCollateralCurrency() {
		return collateralCurrency;
	}

	public void setCollateralCurrency(String collateralCurrency) {
		this.collateralCurrency = collateralCurrency;
	}

	public String getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(String collateralValue) {
		this.collateralValue = collateralValue;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
				

}