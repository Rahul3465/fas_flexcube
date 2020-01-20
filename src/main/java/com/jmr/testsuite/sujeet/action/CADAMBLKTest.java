package com.jmr.testsuite.sujeet.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;

import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.fas.page.common.UIFormatException;
import com.jmr.testsuite.fas.page.st.STDCUSAC_Page;
import com.jmr.testsuite.sujeet.page.CADAMBLK;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class CADAMBLKTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver driver;
	private WebDriverWait driverWait;
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	private String testCaseId;

	private String errorMsg = "";

	@Autowired
	private ScreenShotUtil screenShotUtil;

	private CADAMBLK data;
	private List<CADAMBLK> dataList;
	private final String screenId = "CADAMBLK";
	private final String screenName = "Amount Block Input";

	private List<CADAMBLK> resultList;
	private String actualResult;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CADAMBLK.class, screenId);
		resultList = new ArrayList<>();

	}

	/*@Test(priority = 1)
	public void executeTestCase() throws Exception {
		for (CADAMBLK data : dataList) {

			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					fcubs.clickNew();
					Thread.sleep(5000);
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__ACCOUNT", data.getAccount());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__AMOUNTI", data.getAmount());
					Thread.sleep(5000);
//					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__AMOUNT_BLOCK_TYPE", data.getAmountBlockType());
					fcubs.selectDropdownByText("BLK_AMOUNT_BLOCKS__AMOUNT_BLOCK_TYPE", data.getAmountBlockType());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__HOLD_CODE", data.getHoldCode());

					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__REMARKS", data.getRemarks());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__EFFECTIVE_DATEI", data.getEffectiveDate());
					Thread.sleep(5000);
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__EXPIRY_DATEI", data.getExpiryDate());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__REFERENCE_NO", data.getReferenceNumber());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__REMARKS", data.getRemarks());
					Thread.sleep(5000);
					
					fcubs.clickSave();
					Thread.sleep(5000);
//					fcubs.closeOverridePopUp();
					
					fcubs.closeInfoPopUp();
					
					fcubs.closeScreen();
					
					fcubs.switchToActiveFrame();
					fcubs.clickBtnOk();
					Thread.sleep(5000);
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
	*/
	
	
	
	
	
	@Test()
	public void executeTestCase() throws Exception {

		for (CADAMBLK data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);				
					fcubs.clickNew();
				
					
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__ACCOUNT", data.getAccount());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__AMOUNTI", data.getAmount());
					Thread.sleep(5000);
//					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__AMOUNT_BLOCK_TYPE", data.getAmountBlockType());
					fcubs.selectDropdownByText("BLK_AMOUNT_BLOCKS__AMOUNT_BLOCK_TYPE", data.getAmountBlockType());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__HOLD_CODE", data.getHoldCode());

					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__REMARKS", data.getRemarks());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__EFFECTIVE_DATEI", data.getEffectiveDate());
					Thread.sleep(5000);
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__EXPIRY_DATEI", data.getExpiryDate());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__REFERENCE_NO", data.getReferenceNumber());
					fcubs.populateTextById("BLK_AMOUNT_BLOCKS__REMARKS", data.getRemarks());
					Thread.sleep(5000);
					
					fcubs.clickSave();

					// added to close remark screen/alert
					try {
						
						fcubs.closeInfoPopUp();
						
						fcubs.closeScreen();
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("no such pop up exists");
					}
					
			
				
		
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
					//fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for next test case
				//	fcubs.closeInfoPopUp();
				//	fcubs.closeScreen();

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
		for (CADAMBLK data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}
}

/*
 * @Test(priority = 0) // TestCase - 01 public void FlexcubeTestForCADAMBLK01()
 * throws Exception { String xlpath =
 * "E:\\workspace\\FlexcubeAutomationPOM\\TestData.xlsx"; String sheet =
 * "CADAMBLK";
 * 
 * Log.startReport("Amount Block Input"); FlexcubeUtils.launchApp(driver,
 * configFileReader.getApplicationUrl()); Thread.sleep(1000);
 * driver.switchTo().frame(0); oentrydata.okentrybutton();
 * driver.switchTo().defaultContent();
 * 
 * String un = excel.getcellvalue(xlpath, sheet, 1, 1); oentrydata.Username(un);
 * String pwd = excel.getcellvalue(xlpath, sheet, 1, 2);
 * oentrydata.password(pwd);
 * 
 * driver.findElement(By.id("submit")).click(); driver.switchTo().frame(0);
 * 
 * Thread.sleep(1000); oentrydata.okentrybutton(); oentrydata.defaultreturn();
 * Thread.sleep(1000);
 * 
 * String fp = excel.getcellvalue(xlpath, sheet, 1, 3); // CADAMBLK Screen
 * oentrydata.fastpathscreen(fp); oentrydata.gobtn();
 * 
 * driver.switchTo().frame(0); Thread.sleep(2000);
 * 
 * driver.findElement(By.linkText("New")).click(); Thread.sleep(2000);
 * 
 * String accNo = excel.getcellvalue(xlpath, sheet, 1, 4); //account Number
 * oCAdetails.accntNumber(accNo);
 * 
 * String amount = excel.getcellvalue(xlpath, sheet, 1, 5); //amount
 * oCAdetails.amtNumber(amount);
 * 
 * //Save oentrydata.savedata();
 * 
 * //Accept WebElement frameTwo =
 * driver.findElement(By.xpath("//iframe[@id='ifr_AlertWin']")); // ifr_AlertWin
 * driver.switchTo().frame(frameTwo); WebElement AcceptButton =
 * driver.findElement(By.id("BTN_ACCEPT")); AcceptButton.click(); }
 */