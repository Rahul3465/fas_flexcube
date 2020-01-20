package com.jmr.testsuite.sujeet.page;

import org.springframework.stereotype.Component;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "GEDMLIAB")
public class GEDMLIAB {
	
	private String testCaseResult;
	
	@SheetColumn("RunMode")
	private String runMode;	
	@SheetColumn("Test Case Id")
	private String testCaseId;	
	@SheetColumn("LiabilityNo")
	private String liabilityNo;
	@SheetColumn("LiabilityName")
	private String liabilityName;
	@SheetColumn("LiabilityBranch")
	private String liabilityBranch;
	@SheetColumn("LiabilityCurrency")
	private String liabilityCurrency;
	@SheetColumn("OverallLimit")
	private String overallLimit;
	
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
	public String getLiabilityNo() {
		return liabilityNo;
	}
	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}
	public String getLiabilityName() {
		return liabilityName;
	}
	public void setLiabilityName(String liabilityName) {
		this.liabilityName = liabilityName;
	}
	public String getLiabilityBranch() {
		return liabilityBranch;
	}
	public void setLiabilityBranch(String liabilityBranch) {
		this.liabilityBranch = liabilityBranch;
	}
	public String getLiabilityCurrency() {
		return liabilityCurrency;
	}
	public void setLiabilityCurrency(String liabilityCurrency) {
		this.liabilityCurrency = liabilityCurrency;
	}
	public String getOverallLimit() {
		return overallLimit;
	}
	public void setOverallLimit(String overallLimit) {
		this.overallLimit = overallLimit;
	}

}
