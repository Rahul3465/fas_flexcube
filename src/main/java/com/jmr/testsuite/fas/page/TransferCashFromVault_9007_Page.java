package com.jmr.testsuite.fas.page;



import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "9007")
public class TransferCashFromVault_9007_Page {

	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "TransferCurrency")
	private String transferccy;

	@SheetColumn(value = "Transferamount")
	private String transferamt;

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

	public String getTransferccy() {
		return transferccy;
	}

	public void setTransferccy(String transferccy) {
		this.transferccy = transferccy;
	}

	public String getTransferamt() {
		return transferamt;
	}

	public void setTransferamt(String transferamt) {
		this.transferamt = transferamt;
	}

	@Override
	public String toString() {
		return "TransferCashFromVault_9007_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", transferccy=" + transferccy + ", transferamt=" + transferamt + "]";
	}
	
	
}
