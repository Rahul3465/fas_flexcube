package com.jmr.testsuite.sujeet.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestCaseImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.sujeet.page.LCDTRONL;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class LCDTRONLTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver driver;
	private WebDriverWait driverWait;
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	@Autowired
	private ScreenShotUtil screenShotUtil;
	private String testCaseId;

	private String errorMsg = "";

	private LCDTRONL data;
	private final String screenId = "LCDTRONL";
	private final String screenName = "Letters Of Credit Contract Detailed";

	private List<LCDTRONL> dataList;
	private List<LCDTRONL> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(LCDTRONL.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (LCDTRONL data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);

					fcubs.clickNew();
					
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__PRDCD", data.getProductCode());
					fcubs.selectDropdownByText("BLK_CONTRACT_DETAILS__OPERCD", data.getOperationCode());
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__BTN_P");				// populate button

					fcubs.switchTab("Main");
					
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CONTAMTI", data.getContractAmount());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__POSTOLI", data.getPositiveTolerance());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__NEGTOLI", data.getNegativeTolerance());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CIFID", data.getCustomer());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CUSTREFNO", data.getCustomerReference());
					fcubs.selectDropdownByText("BLK_CONTRACT_DETAILS__REVOLVE", data.getRevolvesIn());
					fcubs.selectDropdownByText("BLK_CONTRACT_DETAILS__UNITS", data.getUnits());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__FREQI", data.getFrequency());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__ISSDTI", data.getIssueDate());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__EFFDTI", data.getEffectiveDate());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__TENOR", data.getTenor());				
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__EXPDTI", data.getEffectiveDate());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__PREADVDTI", data.getPreAdviceDate());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__EXPPLACE", data.getExpiryPlace());
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CREDITAVLWITH", data.getCreditAvailableWith());
					
					//Default Button Clicked
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__BTN_DEFAULT");

					fcubs.closeOverridePopUp();
					fcubs.closeInfoPopUp();
					
					Thread.sleep(2000);
					fcubs.switchTab("Preferences");
					
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__TRANSBLE");
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__ALLOWREPAY");
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__STATUSFLAG");
					fcubs.clickButtonById("BLK_CONTRACT_DETAILS__PARCONALLOW");
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CONFPERCENTI", data.getConfirmPercentage());
					
					Thread.sleep(2000);
					fcubs.switchTab("Parties");
					
					fcubs.populateTextById("BLK_PARTY_DETAILS__PARTYCIFID", data.getPartyIdForPartyType0());
					fcubs.populateTextById("BLK_PARTY_DETAILS__PARTYCIFIDRC1", data.getPartyIdForPartyType1());
					fcubs.populateTextById("BLK_PARTY_DETAILS__PARTYCIFIDRC2", data.getPartyIdForPartyType2());
					
					fcubs.populateTextById("BLK_PARTY_DETAILS__CUSTREFNO", data.getCustReference());
//					fcubs.populateDateField("BLK_PARTY_DETAILS__CUSTREFDATEI", data.getDated());
					
					Thread.sleep(2000);
					fcubs.switchTab("Tracers");
					
					fcubs.populateTextById("BLK_TRACER_DETAILS__TRACERPRTY", data.getPartyType1());
					fcubs.populateTextById("BLK_TRACER_DETAILS__TRACERPRTYRC1", data.getPartyType2());
					
					fcubs.populateTextById("BLK_TRACER_DETAILS__MEDIUM", data.getMedium1());
					fcubs.populateTextById("BLK_TRACER_DETAILS__MEDIUMRC1", data.getMedium2());
					Thread.sleep(2000);
					
//					fcubs.openChildScreenByTitle("MIS");
					
//					fcubs.populateTextById("BLK_MISDETAILS__TXNMIS1", data.getCostCTR());
					
//					fcubs.closeChildScreen();
//					fcubs.clickBtnOk();
					fcubs.clickSave();				
										
					
					fcubs.closeOverridePopUp();

					// added to close remark screen/alert
					fcubs.closeRemarkPopUp();
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					// fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for
					// next test case
					fcubs.closeInfoPopUp();
					//fcubs.closeScreen();

					data.setTestCaseResult("SUCCESS");
				}
			} catch (Exception ex) {
				errorMsg = fcubs.checkUIFormatError();
				if (fcubs.validInput(errorMsg)) {
					data.setTestCaseResult(errorMsg);
				} else if (fcubs.validInput(ex.getMessage())) {
					data.setTestCaseResult(ex.getMessage());
				}
				ex.printStackTrace();
				resultList.add(data);
				// to update the status as failed
				// fcubs.updateTestCaseExecutionAsFailed();
			}

		}

	}

	@AfterClass
	public void destroy() throws Exception {
		System.out.println("before destroying opened session");
		fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (LCDTRONL data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}


/*@Test(priority = 1)
public void execute() throws Exception{
	Iterator<LCDTRONL> it = screenList.iterator();
	while (it.hasNext()) {
		screen = it.next();
		setData(screen);
		Thread.sleep((1000*10));
	}
	Thread.sleep((1000*10));
}

private void setData(LCDTRONL screen) {
	driver.findElement(By.linkText("Enter Query")).click();								// Enter Query
	driver.findElement(By.id("BLK_CONTRACT_DETAILS__CONREFNO")).sendKeys(screen.getContractReferenceNumber());		// Contract Reference
	driver.findElement(By.linkText("Execute Query")).click();							// Execute Query
	driver.findElement(By.id("BLK_AUTH_DETAILS__BTN_AUTH")).click(); 					// Authorize Button
	
}
	
public void destroy() throws Exception {
	System.out.println("before destroying opened session");
	
	fcubs.destroy();
}*/