package com.jmr.testsuite.fas;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.page.st.DepositAccountBookingPage;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class TestFile extends AbstractTestNGSpringContextTests {

	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	private String errorMsg = "";
	private final String screenId = "STDCUSTD";
	private final String screenName = "Deposit Account Booking";

	private List<DepositAccountBookingPage> dataList;
	private List<DepositAccountBookingPage> resultList;
	private List<String> multiEntryElementIdText;
	private List<String> multiEntryElementValueText;
	private List<String> multiEntryElementType;
	private String testCaseId;

	@Test(priority = 0)
	public void setup() throws Exception {
		fcubs.launchApp();
	}

	@Test(priority = 1)
	public void destroy() throws Exception {

	}

}
