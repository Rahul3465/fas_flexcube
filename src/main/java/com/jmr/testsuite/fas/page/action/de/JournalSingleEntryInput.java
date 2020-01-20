package com.jmr.testsuite.fas.page.action.de;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.de.JournalSingleEntryInputPage;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class JournalSingleEntryInput extends AbstractTestNGSpringContextTests {

	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	private String errorMsg = "";
	private final String screenId = "DEDTRONL";
	private final String screenName = "Journal Single Entry Input";

	private List<JournalSingleEntryInputPage> dataList;
	private List<JournalSingleEntryInputPage> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		dataList = xlsReader.read(JournalSingleEntryInputPage.class, new File(AppConfig.testFileLocation), 4);
		resultList = new ArrayList<>();
	}

	@Test(priority = 1)
	public void executeTestCase() throws Exception {
		for (JournalSingleEntryInputPage data : dataList) {
			if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
				fcubs.launchScreen(screenId);
				fcubs.clickNew();
				fcubs.switchToFrameByTitle("Batch Open");
				fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__BATCH_NO", data.getBatchNumber());
				fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__DESCRIPTION", data.getDescription());
				fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__DR_CHK_TOTALI", data.getDebit());
				fcubs.populateTextById("BLK_DEVWS_BATCH_MASTER_1__CR_CHK_TOTALI", data.getCredit());
				fcubs.clickBtnOk();

				try {
					errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
					data.setTestCaseResult(errorMsg);
					resultList.add(data);
					continue;
				} catch (Exception ex) {
					System.out.println("no error found after batch open");
				}

				fcubs.closeInfoPopUp();

				fcubs.switchToFrameByTitle("Journal Single Entry Input");
				fcubs.populateTextById("BLK_JRNL_LOG__FUNDID", data.getFuncId());
				fcubs.populateTextById("BLK_JRNL_LOG__ACBRN", data.getAccountBranch());
				fcubs.populateTextById("BLK_JRNL_LOG__ACCNO", data.getAccountNo());
				fcubs.populateTextById("BLK_JRNL_LOG__CCY", data.getCcy());
				fcubs.populateTextById("BLK_JRNL_LOG__AMTI", data.getAmount());
				fcubs.selectDropdownByText("BLK_JRNL_LOG__DRCR", data.getDrcrInd());
				fcubs.populateDateField("BLK_JRNL_LOG__VALDTI", data.getValueDate());
				fcubs.populateTextById("BLK_JRNL_LOG__TXNCD", data.getTxnCD());
				fcubs.populateTextById("BLK_JRNL_LOG__EXRATEI", data.getExRate());
				fcubs.populateTextById("BLK_JRNL_LOG__PRDCODE", data.getPeriodCode());
				fcubs.populateTextById("BLK_JRNL_LOG__RELCUST", data.getRelCustomer());
				fcubs.populateTextById("BLK_JRNL_LOG__MISGRP", data.getMisGrp());
				fcubs.populateTextById("BLK_JRNL_LOG__INSTNO", data.getInstNo());
				fcubs.populateTextById("BLK_JRNL_LOG__ADDLETXT", data.getAddlTxt());
				if ((data.getBatCls() != null)
						&& (data.getBatCls().equalsIgnoreCase("Y") || data.getBatCls().equalsIgnoreCase("Yes")))
					fcubs.clickButtonById("BLK_JRNL_LOG__BTN_BATCLS");
				fcubs.clickSave();

				try {
					errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
					data.setTestCaseResult(errorMsg);
					resultList.add(data);
					continue;
				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("no error found after save action");
				}
				data.setTestCaseResult("SUCCESS");
				resultList.add(data);
				// on successful save action confirm and close window for next test case
				fcubs.closeInfoPopUp();
				fcubs.closeScreen();
			}
		}
	}
	
	@AfterClass
	public void destory() {
		fcubs.destroy();
	}

}
