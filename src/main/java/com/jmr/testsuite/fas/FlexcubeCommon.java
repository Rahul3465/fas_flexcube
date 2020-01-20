package com.jmr.testsuite.fas;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.testsuite.fas.page.common.LoginPage;
import com.jmr.testsuite.fas.page.common.LoginPageAction;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.fas.page.common.UIFormatException;

import io.github.millij.poi.ss.reader.XlsxReader;

@Component
public class FlexcubeCommon {

	@Autowired
	private WebDriver driver;
	private WebDriverWait waitDriver;
	@Autowired
	private LoginPage loginPage;
	@Autowired
	private LoginPageAction loginAction;
	@Autowired
	private ScreenShotUtil screenShotUtil;
	/*@Autowired
	private TransactionManager txManager;*/
	@Autowired
	private XlsxReader xlsReader;

	private Actions actions;
	private WebElement element;

	private String screenName;
	private String testCaseId;
	private boolean isChildScreenOpened = false;
	private String dateFormat;
	private JavascriptExecutor jsExecutor;

	@PostConstruct
	public void postConstruct() {
		actions = new Actions(driver);
		waitDriver = new WebDriverWait(driver, 5);
		jsExecutor = (JavascriptExecutor) driver;
	}

	/**
	 * to cancel any main screen opened without any
	 * Information/Confirmation/Override/Remark/Error Message popup and child-screen
	 * opened
	 * 
	 * @throws Exception
	 */
	public void cancelMainScreen() throws Exception {
		try {
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
		} catch (ElementClickInterceptedException ex) {
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
		} catch (NoSuchElementException ex1) {
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
		} catch (Exception ex2) {
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
		}
	}

	private boolean checkElementNValue(String elementId, String value) {
		if ((value != null && !value.equalsIgnoreCase("")) && (elementId != null && !elementId.equalsIgnoreCase(""))) {
			return true;
		}
		return false;
	}

	public String checkUIFormatError() throws Exception {
		String msg = "";
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			switchToFrameByTitle(screenName);
			if (isChildScreenOpened) {
				driver.switchTo().frame("ifrSubScreen");
			}
			switchToFrameByTitle("Information Message");
			msg = driver.findElement(By.xpath(("//*[@id=\"ERRTBL\"]/tbody"))).getText();
			if (validInput(msg)) {
				screenShotUtil.takeScreenShot(this.testCaseId);
				clickBtnOk();
			}
			if (isChildScreenOpened) {
				closeChildScreen();
			}
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
			updateTestCaseExecutionAsFailed();
		} catch (Exception ex) {
			driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			switchToFrameByTitle(screenName);
			if (isChildScreenOpened) {
				driver.switchTo().frame("ifrSubScreen");
			}
			List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
			for (WebElement iframe : iframes) {
				System.out.println("frame title " + iframe.getAttribute("title"));
				String text = iframe.getAttribute("title");
				if (text.contains("List of Values")) {
					screenShotUtil.takeScreenShot(this.testCaseId);
					waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
					waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("WNDbuttons"))))
					.click();
					if (isChildScreenOpened) {
						driver.switchTo().defaultContent();
						driver.switchTo().parentFrame();
						switchToFrameByTitle(screenName);
						driver.switchTo().frame("ifrSubScreen");
						closeChildScreen();
						driver.switchTo().defaultContent();
						switchToFrameByTitle(screenName);
						clickBtnCancel();
						closeConfirmaPopUp();
						clickBtnCancel();
						updateTestCaseExecutionAsFailed();
						return "No Records Found for the Specified Criteria " + text;
					}
					msg = "No Records Found for the Specified Criteria " + text + " entered";
					driver.switchTo().defaultContent();
					switchToFrameByTitle(screenName);
					clickBtnCancel();
					closeConfirmaPopUp();
					clickBtnCancel();
					updateTestCaseExecutionAsFailed();
				}
			}
		}
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			switchToFrameByTitle(screenName);
			if (isChildScreenOpened) {
				driver.switchTo().frame("ifrSubScreen");
			}
			switchToFrameByTitle("Error Message");
			msg = driver.findElement(By.xpath(("//*[@id=\"ERRTBL\"]/tbody"))).getText();
			if (msg != null && !msg.equalsIgnoreCase("")) {
				screenShotUtil.takeScreenShot(this.testCaseId);
				clickBtnOk();
			}
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
			updateTestCaseExecutionAsFailed();
		} catch (Exception ex) {

		}
		return msg;
	}

	/**
	 * Clear all the data in multi-entry list
	 * 
	 * @param multiEntryElementIdText
	 *            - list of html element ids
	 * @param multiEntryElementValueText
	 *            - list of html element value/input/data
	 * @param multiEntryElementType
	 *            - list of html element type
	 */
	public void clearMultiEntryList(List<String> multiEntryElementIdText, List<String> multiEntryElementValueText,
			List<String> multiEntryElementType) {
		multiEntryElementType.clear();
		multiEntryElementIdText.clear();
		multiEntryElementValueText.clear();
	}

	/**
	 * To close or cancel the current active screen/child screen
	 */
	public void clickBtnCancel() {

		waitDriver.until(ExpectedConditions.presenceOfElementLocated(By.id("BTN_EXIT_IMG")));
		try {
			driver.findElement(By.id("BTN_EXIT_IMG")).click();
		} catch (ElementClickInterceptedException ex1) {
			driver.findElement(By.id("BTN_EXIT_IMG")).click();
		} catch (NoSuchElementException ex2) {
			driver.findElement(By.id("BTN_EXIT_IMG")).click();
		} catch (Exception ex) {
			driver.findElement(By.id("BTN_EXIT_IMG")).click();
		}
	}

	/**
	 * to click ok button
	 */
	public void clickBtnOk() throws Exception {
		element = driver.findElement(By.id("BTN_OK"));
		element.click();
	}

	/**
	 * Click on any button available in active screen html attribute - id
	 * 
	 * @param elementId
	 *            - html id of button
	 */
	public void clickButtonById(String elementId) {
		if (validInput(elementId)) {
			element = driver.findElement(By.id(elementId));
			actions.moveToElement(element).build().perform();
			jsExecutor.executeScript("arguments[0].click();", element);
		}
	}

	/**
	 * Click on any available button in active screen using html xpath of the
	 * element
	 * 
	 * @param elementId
	 *            - html id of button
	 */
	public void clickButtonByXpath(String xpath) {
		if (validInput(xpath)) {
			element = driver.findElement(By.xpath(xpath));
			actions.moveToElement(element).build().perform();
			jsExecutor.executeScript("arguments[0].click();", element);
		}
	}

	/**
	 * To click Enter Query button
	 */
	public void clickEnterQuery() {
		waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Enter Query"))))
		.click();
	}

	/**
	 * To click Execute Query button
	 */
	public void clickExecuteQuery() {
		waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Execute Query"))))
		.click();
	}

	/**
	 * To click New action button
	 */
	public void clickNew() throws Exception {
		waitDriver.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New")));
		try {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("New")))).click();
		} catch (ElementClickInterceptedException ex) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("New")))).click();
		}
	}

	/**
	 * To click Save action button
	 */
	public void clickSave() {
		try {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Save")))).click();
		} catch (ElementClickInterceptedException ex) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Save")))).click();
		} catch (NoSuchElementException ex1) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Save")))).click();
		} catch (Exception ex2) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Save")))).click();
		}
	}

	public void clickUnlock() {
		try {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Unlock"))))
			.click();
		} catch (ElementClickInterceptedException ex) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Unlock"))))
			.click();
		} catch (NoSuchElementException ex1) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Unlock"))))
			.click();
		} catch (Exception ex2) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Unlock"))))
			.click();
		}
	}

	public void closeChildScreen() throws Exception {
		clickBtnOk();
		switchToFrameByTitle(screenName);
		isChildScreenOpened = false;
	}

	/**
	 * To close Confirmation Message Alert Window
	 * 
	 * @throws Exception
	 */
	public void closeConfirmaPopUp() throws Exception {
		try {
			switchToFrameByTitle("Confirmation Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (ElementClickInterceptedException ex) {
			switchToFrameByTitle("Confirmation Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (NoSuchElementException ex1) {
			switchToFrameByTitle("Confirmation Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (Exception ex2) {
			switchToFrameByTitle("Confirmation Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		}
	}

	/**
	 * To close Information Message - Alert Window
	 * 
	 * @throws Exception
	 */
	public void closeInfoPopUp() throws Exception {
		try {
			switchToFrameByTitle("Information Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (ElementClickInterceptedException ex) {
			switchToFrameByTitle("Information Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (NoSuchElementException ex1) {
			switchToFrameByTitle("Information Message");
			Thread.sleep(4000);
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (Exception ex2) {
			switchToFrameByTitle("Information Message");
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		}
	}

	/**
	 * Closes the Main Screen Launched
	 * 
	 * @throws Exception
	 */

	public void closeMainScreen() throws Exception {
		try {
			driver.switchTo().parentFrame();
			clickBtnCancel();
			closeConfirmaPopUp();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			// driver.switchTo().frame("ifr_LaunchWin");
		} catch (ElementClickInterceptedException ex) {
			driver.switchTo().parentFrame();
			clickBtnCancel();
			closeConfirmaPopUp();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			// driver.switchTo().frame("ifr_LaunchWin");
		} catch (NoSuchElementException ex1) {
			driver.switchTo().parentFrame();
			clickBtnCancel();
			closeConfirmaPopUp();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			// driver.switchTo().frame("ifr_LaunchWin");
		} catch (Exception ex2) {
			driver.switchTo().parentFrame();
			clickBtnCancel();
			closeConfirmaPopUp();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			// driver.switchTo().frame("ifr_LaunchWin");
		}
	}

	/**
	 * To Accept and close Override screen
	 * 
	 */
	public void closeOverridePopUp() throws Exception {
		try {
			// switch to subscreen
			switchToFrameByTitle("Override Message");
			clickButtonById("BTN_ACCEPT");
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (ElementClickInterceptedException ex) {
			// switch to subscreen
			switchToFrameByTitle("Override Message");
			clickButtonById("BTN_ACCEPT");
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (NoSuchElementException ex1) {
			// switch to subscreen
			switchToFrameByTitle("Override Message");
			clickButtonById("BTN_ACCEPT");
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (Exception ex2) {
			// switch to subscreen
			switchToFrameByTitle("Override Message");
			clickButtonById("BTN_ACCEPT");
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		}
	}

	/**
	 * To close remark screen
	 * 
	 */
	public void closeRemarkPopUp() throws Exception {
		try {
			// switch to subscreen
			element = driver.findElement(By.xpath("//*[@src='Remarks.jsp?iframeLaunch=true']"));
			driver.switchTo().frame(element);
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (ElementClickInterceptedException ex) {
			// switch to subscreen
			element = driver.findElement(By.xpath("//*[@src='Remarks.jsp?iframeLaunch=true']"));
			driver.switchTo().frame(element);
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (NoSuchElementException ex1) {
			// switch to subscreen
			element = driver.findElement(By.xpath("//*[@src='Remarks.jsp?iframeLaunch=true']"));
			driver.switchTo().frame(element);
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		} catch (Exception ex2) {
			// switch to subscreen
			element = driver.findElement(By.xpath("//*[@src='Remarks.jsp?iframeLaunch=true']"));
			driver.switchTo().frame(element);
			clickBtnOk();
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
		}
	}

	/**
	 * Close the Main Screen Opened
	 */
	public void closeScreen() {
		try {
			driver.findElement(By.id("WNDbuttons")).click();
		} catch (ElementClickInterceptedException ex) {
			driver.findElement(By.id("WNDbuttons")).click();
		} catch (NoSuchElementException ex1) {
			driver.findElement(By.id("WNDbuttons")).click();
		} catch (Exception ex2) {
			driver.findElement(By.id("WNDbuttons")).click();
		}
	}

	/**
	 * destroy the current session opened
	 */
	public void destroy() {
		clickButtonByXpath("//li[contains(text(),'Sign Off')]");
		driver.navigate().refresh();
		//		driver.close();
		//		driver.quit();
	}

	public void focusToElement(WebElement element) {
		actions.moveToElement(element).perform();
	}

	/**
	 * Get all the error message displayed in alert window and close the alert
	 * window
	 */
	public String getAllErrorMsgAndClose(String fileName) throws Exception {
		String msg = "";
		try {
			switchToFrameByTitle("Error Message");
			msg = driver.findElement(By.xpath(("//*[@id=\"ERRTBL\"]/tbody"))).getText();
			if (msg != null && !msg.equalsIgnoreCase("")) {
				screenShotUtil.takeScreenShot(fileName);
				clickBtnOk();
			}
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			clickBtnCancel();
			closeConfirmaPopUp();
			clickBtnCancel();
			updateTestCaseExecutionAsFailed();
		} catch (Exception ex) {
			// System.out.println("unable to locate the error message popup - No Error Found
			// returning empty string");
		}
		return msg;
	}

	public void getdateFormat() {
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		dateFormat = (String) jsExecutor.executeScript("return systemDateFormat");
	}

	/**
	 * Lunch Oracle FLEXCUBE application and do login
	 * 
	 * @throws Exception
	 */
	public void launchApp() throws Exception {
		driver.get(loginPage.getLink());
		loginAction.doLogin();
		getdateFormat();
	}

	/**
	 * To lunch FLEXCUBE Screen using Screen Id
	 * 
	 * @param screenId
	 *            - Function Id of FLEXCUBE Screen
	 * @throws Exception
	 */
	public void launchScreen(String screenId) throws Exception {
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("fastpath")).clear();
		driver.findElement(By.id("fastpath")).sendKeys(screenId);
		driver.findElement(By.id("btnGo")).click();
		waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.switchTo().activeElement()));
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
		Thread.sleep(2000);
		//txManager.updateTestProgCaseExecStatAsWIP(this.testCaseId);
	}

	/**
	 * Move only control and scroll to a webelement
	 * 
	 * @param element
	 * @return
	 */
	public Actions moveToElement(WebElement element) {
		Coordinates coordinates = ((Locatable) element).getCoordinates();
		coordinates.inViewPort();
		actions.moveToElement(element).perform();
		return actions.moveToElement(element);
	}

	/**
	 * To handle and create multi-entry records in any Oracle FLEXCUBE screens
	 * 
	 * @param multiRowAddId
	 *            - html element id of multi-entry record add button
	 * @param multiRowAddXpath
	 *            - html element xpath of multi-entry record add button
	 * @param elementTypeList
	 *            - type of html element available in screen
	 * @param elementIdList
	 *            - html element id of field in screen
	 * @param elementValueList
	 *            - input/value/data provided for the screen
	 * @throws Exception
	 */
	public void MultiEntryFieldById(String multiRowAddId, String multiRowAddXpath, List<String> elementTypeList,
			List<String> elementIdList, List<String> elementValueList) throws UIFormatException, Exception {

		Iterator<String> itElementId = elementIdList.iterator();
		Iterator<String> itElementType = elementTypeList.iterator();
		Iterator<String> itElementValue = elementValueList.iterator();
		List<String> recordList = null;
		String elementId, elementValue, elementType = "";
		int elmntIdTemp = 0, recordCount = 0;
		String incTemp = "";
		boolean isAnyValueNotNull = false;
		Map<String, List<String>> recordMap = new HashMap<String, List<String>>();
		// checking for any field value is not null
		for (String val : elementValueList) {
			if (validInput(val)) {
				isAnyValueNotNull = true;
				break;
			}
		}
		if (isAnyValueNotNull) {
			while (itElementValue.hasNext()) {
				elementValue = itElementValue.next();
				if (validInput(elementValue) && elementValue.contains("\n")) {
					String[] splitValue = elementValue.split("\n");
					for (String value : splitValue) {
						recordCount = recordCount + 1;
						if (recordMap.containsKey("RECORD" + recordCount)) {
							recordList = recordMap.get("RECORD" + recordCount);
							recordList.add(value);
						} else {
							recordList = new ArrayList<>();
							recordList.add(value);
						}
						recordMap.put("RECORD" + recordCount, recordList);
					}
					recordCount = 0;
				} else {
					// multi-entry has only one data therefore recordcount should be always 1
					if (recordMap.isEmpty()) {
						recordList = new ArrayList<>();
						recordList.add(elementValue);
						recordMap.put("RECORD" + 1, recordList);
					} else {
						for (String key : recordMap.keySet()) {
							recordList = recordMap.get(key);
							recordList.add(elementValue);
							recordMap.put(key, recordList);
						}
					}
				}
				int i = 2;
				while (i <= recordMap.size()) {
					if (recordMap.get("RECORD1").size() != recordMap.get("RECORD" + i).size()) {
						recordList = recordMap.get("RECORD" + i);
						recordList.add(null);
						recordMap.put("RECORD" + i, recordList);
					}
					i = i + 1;
				}
			}
			// sorting the multi-entry records
			recordMap = new TreeMap<>(recordMap);
			// System.out.println("Multi-Entry Block Value \n" + recordMap);
			if ((validInput(multiRowAddId) || validInput(multiRowAddXpath))) {
				for (String key : recordMap.keySet()) {
					if (validInput(multiRowAddId)) {
						clickButtonById(multiRowAddId);
					} else {
						clickButtonByXpath(multiRowAddXpath);
					}
					itElementValue = recordMap.get(key).iterator();
					while (itElementId.hasNext() && itElementValue.hasNext() && itElementType.hasNext()) {
						elementType = itElementType.next();
						elementType = elementType.toLowerCase();
						elementId = itElementId.next();
						elementId = elementId + incTemp;
						elementValue = itElementValue.next();
						switch (elementType) {
						case "text":
							populateTextById(elementId, elementValue);
							break;
						case "input":
							populateTextById(elementId, elementValue);
							break;
						case "date":
							populateDateField(elementId, elementValue);
							break;
						case "flag":
							selectFlag(elementId, elementValue);
							break;
						case "checkbox":
							selectFlag(elementId, elementValue);
							break;
						case "radio":
							selectRadioBtn(elementId, elementValue);
							break;
						case "select":
							selectDropdownByText(elementId, elementValue);
							break;
						case "dropdown":
							selectDropdownByText(elementId, elementValue);
							break;
						case "lov":
							if (validInput(elementValue) && elementValue.contains(":")) {
								clickButtonByXpath(
										elementId.split(":")[0].replace("row", String.valueOf(elmntIdTemp + 1)));
								switchToActiveFrame();
								for (int i = 1; i <= elementValue.split(":").length; i++) {
									populateTextById(elementId.split(":")[i], elementValue.split(":")[i - 1]);
								}
								clickButtonByXpath("//button[contains(text(),'Fetch')]");
								waitDriver.until(ExpectedConditions
										.presenceOfElementLocated(By.xpath("//div[@id='LovDiv']//tr[1]")));
								try {
									driver.findElement(
											By.xpath("//a[contains(text(),'" + elementValue.split(":")[0] + "')]"))
									.click();
									switchToActiveFrame();
								} catch (Exception ex) {
									String msg = "No Records Found for the Specified Criteria - "
											+ elementValue.split(":")[0];
									waitDriver
									.until(ExpectedConditions
											.elementToBeClickable(driver.findElement(By.id("WNDbuttons"))))
									.click();
									screenShotUtil.takeScreenShot(this.testCaseId);
									driver.switchTo().defaultContent();
									switchToFrameByTitle(screenName);
									clickBtnCancel();
									closeConfirmaPopUp();
									clickBtnCancel();
									throw new UIFormatException(msg);
								}
							} else {
								elementId = elementId.split(":")[elementId.split(":").length - 1];
								populateTextById(elementId, elementValue);
							}
							break;
						default:
							populateTextById(elementId, elementValue);
							break;
						}
					}
					elmntIdTemp = +1;
					incTemp = "RC" + elmntIdTemp;
					itElementId = elementIdList.iterator();
					itElementType = elementTypeList.iterator();
				}
			}
		}
	}

	/**
	 * Open sub-screen or child-screen using Name found in the FLEXCUBE Main Screen
	 * Footer area
	 * 
	 * @param subScreenName
	 *            - Child Screen name Eg. Interest, Event Entries
	 * @throws Exception
	 */
	public void openChildScreenByTitle(String subScreenName) throws Exception {
		try {
			driver.findElement(By.linkText(subScreenName)).click();
			isChildScreenOpened = true;
			switchToActiveFrame();
			Thread.sleep(100);
		} catch (Exception ex) {
			// expand sub screen section
			clickButtonById("BtnSubSysNav");
			driver.findElement(By.linkText(subScreenName)).click();
			isChildScreenOpened = true;
			switchToActiveFrame();
			Thread.sleep(100);
		}
		try {
			closeInfoPopUp();
			WebElement element = driver.findElement(By.id("ifrSubScreen"));
			driver.switchTo().frame(element);
		} catch (Exception ex) {
		}
	}

	/**
	 * to input date field
	 * 
	 * @param elementId
	 *            - html attribute id of element
	 * @param text
	 *            - value to be input
	 */

	@SuppressWarnings("deprecation")
	public void populateDateField(String elementId, String text) throws UIFormatException {
		if (checkElementNValue(elementId, text)) {
			element = driver.findElement(By.id(elementId));
			moveToElement(element);
			String attr = element.getAttribute("title");
			if (validInput(text)) {
				SimpleDateFormat format = new SimpleDateFormat(dateFormat);
				text = format.format(new Date(text));
			}
			if (validInput(element.getAttribute("value"))) {
				element.click();
				element.clear();
				element.sendKeys(text);
				element.sendKeys(Keys.TAB);
			} else {
				element.click();
				element.sendKeys(text);
				element.sendKeys(Keys.TAB);
			}
		}
	}

	/**
	 * To input any text/lov field
	 * 
	 * @param elementId
	 *            - html attribute id of element
	 * @param text
	 *            - value to be input
	 */
	public void populateTextById(String elementId, String text) throws UIFormatException {
		if (checkElementNValue(elementId, text)) {
			element = driver.findElement(By.id(elementId));
			focusToElement(element);
			if (validInput(element.getAttribute("value"))) {
				element.click();
				element.clear();
				element.sendKeys(text);
				element.sendKeys(Keys.TAB);
			} else {
				element.click();
				element.sendKeys(text);
				element.sendKeys(Keys.TAB);
			}
		}
	}

	/*
	 * public void switchToMainScreen() { driver.switchTo().parentFrame(); }
	 */

	/**
	 * Select dropdown using the visible text available in dropdown options
	 * 
	 * @param elementId
	 *            - HTML ID of the select html tag
	 * @param text
	 *            - Visible Text available in dropdown list
	 * 
	 */
	public void selectDropdownByText(String elementId, String text) throws UIFormatException, Exception {
		if (validInput(text)) {
			element = driver.findElement(By.id(elementId));
			focusToElement(element);
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
	}

	/**
	 * Enable or Disable a Flag
	 * 
	 * @param fieldId
	 *            - HTML id of the flag
	 * @param value
	 *            - Allowed values Yes/Y - Enable Flag. No/N - Disable Flag
	 */
	public void selectFlag(String fieldId, String value) throws Exception {
		element = driver.findElement(By.id(fieldId));
		if (checkElementNValue(fieldId, value)) {
			if ((value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) && !element.isSelected()) {
				focusToElement(element);
				Thread.sleep(2000);
				jsExecutor.executeScript("arguments[0].click();", element);
			} else if ((value.equalsIgnoreCase("No") || value.equalsIgnoreCase("N")) && element.isSelected()) {
				focusToElement(element);
				jsExecutor.executeScript("arguments[0].click();", element);
			}
		}
	}

	/**
	 * To click Search button
	 */
	public void clickSearchButton() {
		waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Search"))))
		.click();
	}

	/**
	 * To click Reset button
	 */
	public void clickResetButton() {
		waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Reset"))))
		.click();
	}

	/**
	 * to select radio button
	 * 
	 * @param tagName
	 *            - html attribute name of radio button
	 * @param keyValue
	 *            - html attribute label value of element
	 */
	public void selectRadioBtn(String tagName, String keyValue) {
		if (checkElementNValue(tagName, keyValue)) {
			List<WebElement> elementList = driver.findElements(By.name(tagName));
			for (WebElement element : elementList) {
				if (element.getAttribute("label_value").equalsIgnoreCase(keyValue) && !element.isSelected()) {
					// moveToElement(element).click().build().perform();
					focusToElement(element);
					jsExecutor.executeScript("arguments[0].click();", element);
				}
			}
		}
	}

	public void setScreenDetails(String screenId, String screenName) {
		this.screenName = screenName;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	/**
	 * Switch Control to tab using Tab name available in current active window
	 * 
	 * @param tabName
	 */
	public void switchTab(String tabName) throws Exception {
		waitDriver.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'" + tabName + "')]"))))
		.click();
	}

	public void switchToActiveFrame() throws Exception {
		driver.switchTo().frame(driver.switchTo().activeElement());
		// Thread.sleep(1000);
	}

	/**
	 * Switch the Control to Iframe using the title attribute in iframe html tag
	 * 
	 * @param frameTitle
	 *            - Title found in the screen title bar without any space or special
	 *            character
	 * @throws Exception
	 */
	public void switchToFrameByTitle(String frameTitle) throws Exception {
		WebElement element = driver.switchTo().activeElement();
		String activeFrame = element.getAttribute("title");
		if (!activeFrame.equalsIgnoreCase(""))
			activeFrame = activeFrame.substring(0, activeFrame.length() - 1);
		if ((frameTitle != null && activeFrame != null) && (frameTitle.equalsIgnoreCase(activeFrame)))
			switchToActiveFrame();
		else {
			if (frameTitle.equalsIgnoreCase("Information Message")
					|| frameTitle.equalsIgnoreCase("Confirmation Message")
					|| frameTitle.equalsIgnoreCase("Error Message")
					|| frameTitle.equalsIgnoreCase("Override Message")) {
				frameTitle = "//*[@title='" + frameTitle + "']";
				waitDriver.until(
						ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath(frameTitle))));
			} else if (!frameTitle.equalsIgnoreCase(screenName)) {
				waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
						driver.findElement(By.xpath("//*[@title='" + frameTitle + "&nbsp;']"))));
			}
		}
	}

	/**
	 * Switch to a particular Iframe using the Xpath
	 * 
	 * @param xPath
	 *            - Xpath of the Iframe Eg. switchToFrame("//*[title='Information
	 *            Message']")
	 * @throws Exception
	 */
	public void switchToFrameByXpath(String xPath) throws Exception {
		WebElement element = driver.findElement(By.xpath(xPath));
		driver.switchTo().frame(element);
		Thread.sleep(2000);
	}

	public void takeScreenShot(String fileName) {
		screenShotUtil.takeScreenShot(fileName);
	}

	/**
	 * Validate input for Null and Empty String
	 * 
	 * @param value
	 * @return
	 */
	public boolean validInput(String value) {
		if (value != null && !value.equalsIgnoreCase("")) {
			return true;
		}
		return false;
	}

	public void testLOVAccountInput(String lovXpath, String accNo, String brnNo, String ccy, String accNoId,
			String brnNoId, String ccyId) throws Exception {
		clickButtonByXpath(lovXpath);
		switchToActiveFrame();
		populateTextById(accNoId, accNo);
		populateTextById(brnNoId, brnNo);
		populateTextById(ccyId, ccy);
		clickButtonByXpath("//button[@class='BTNtextH']");
		clickButtonByXpath("//div[@id='LovDiv']//tr[1]//td[1]");
	}

	public void closeAllScreen() throws Exception {
		screenShotUtil.takeScreenShot(testCaseId);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		switchToFrameByTitle(screenName);
		if (isChildScreenOpened) {
			driver.switchTo().frame("ifrSubScreen");
			closeChildScreen();
			// TODO Auto-generated catch block
		}
		clickBtnCancel();
		closeConfirmaPopUp();
		clickBtnCancel();
	}

	private String screenType(WebElement scrElement) {
		String tmp = String.valueOf(scrElement.getAttribute("onclick").replaceAll("fnSubScreenMain", "")
				.replace("(", "").replace(")", "").split(",")[0].charAt(3));
		if (tmp.equalsIgnoreCase("c")) {
			return "callform";
		} else if (tmp.equalsIgnoreCase("D")) {
			return "mainscreen";
		}
		return "";
	}

	public void updateTestCaseExecutionAsSuccess() throws SQLException {
		//txManager.updateTestProgCaseExecStatAsProceedAndResultAsSuccess(this.testCaseId); // commenting due to
		// unavailable data
	}

	public void updateTestCaseExecutionAsFailed() throws SQLException {
		//txManager.updateTestProgCaseExecStatAsProceedAndResultAsFailed(this.testCaseId);
	}

	@SuppressWarnings({ "unchecked", "resource", "rawtypes" })
	public <T> List<T> loadDataFromExcel(Class clazz, String sheetName) throws Exception {
		FileInputStream file = new FileInputStream(new File(AppConfig.testFileLocation));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		int sheetIndex = workbook.getSheetIndex(sheetName);
		file.close();
		List<T> list = (List<T>) xlsReader.read(clazz, new File(AppConfig.testFileLocation), sheetIndex);
		return list;
	}

	/// Newly added by naveen

	public void launchScreen1(String screenId) throws Exception {
		driver.switchTo().defaultContent();
		driver.findElement(By.id("fastpath")).clear();
		driver.findElement(By.id("fastpath")).sendKeys(screenId);
		driver.findElement(By.id("btnGo")).click();
		driver.switchTo().frame(1);
		// driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@id='ifr_LaunchWin")));

		/*
		 * try { driver.switchTo().frame(1); } catch (Exception ex) {
		 * waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
		 * driver.findElement(By.xpath("//[title='" + screenName + "&nbsp;']")))); }
		 */
	}

	public void LOVButton() {
		driver.findElement(By.xpath("//div[@id='TAB_MAIN__SEC_11__PART_1__FLD1__1']//span[@class='ICOlov']")).click();
	}

	public void switchtosubscreensframe() {
		driver.switchTo().frame("ifrSubScreen");

	}

	public void switchframes() throws Exception {

		driver.switchTo().frame(1);
	}

	public void switchframes0() throws Exception {

		driver.switchTo().frame(0);
	}

	public void assignframe() throws Exception {
		driver.switchTo().frame("ifr_AlertWin");

	}

	public void closeOverridePopUp1() throws Exception {
		// switch to subscreen
		switchToFrameByTitle("Override Message");
		clickButtonById("BTN_ACCEPT");
		driver.switchTo().defaultContent();

	}

	public void popupalert() {
		driver.switchTo().frame("ifr_AlertWin");
		driver.findElement(By.id("BTN_OK")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
	}

	public void switchTab1(String tabName) throws Exception {
		waitDriver
		.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]"))))
		.click();
	}

	public void clearField(String fieldId, String value) throws Exception {
		element = driver.findElement(By.id(fieldId));
		if (checkElementNValue(fieldId, value)) {
			if ((value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y")) && !element.isSelected()) {
				moveToElement(element).click().build().perform();
			} else if ((value.equalsIgnoreCase("No") || value.equalsIgnoreCase("N")) && element.isSelected()) {
				moveToElement(element).click().build().perform();
			}
		}
	}

	public void LOVData(String xpath1, String xpath2, String xpath3, String xpath4, String xpath5, String element) {
		driver.findElement(By.xpath(xpath1)).click();
		driver.switchTo().frame("ifrSubScreen");
		driver.findElement(By.xpath(xpath2)).clear();
		driver.findElement(By.xpath(xpath3)).sendKeys(element);
		driver.findElement(By.xpath(xpath4)).click();
		driver.findElement(By.xpath(xpath5)).click();
	}

	/**
	 * Below method added by Rahul
	 */
	public void LOVDataNew(String xpath1, String xpath2, String xpath3, String xpath4, String xpath5, String xpath6, String element1, String element2) {
		driver.switchTo().frame("ifrSubScreen");
		driver.findElement(By.xpath(xpath1)).clear();
		driver.findElement(By.xpath(xpath2)).sendKeys(element1);
		driver.findElement(By.xpath(xpath3)).clear();
		driver.findElement(By.xpath(xpath4)).sendKeys(element2);
		waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath5)))).click();
		driver.findElement(By.xpath(xpath6)).click();
	}

	public void getTextById(String element)
	{
		driver.findElement(By.id(element)).getText();
	}

	public void SignatureVerify(String xpath1, String xpath2) throws Exception {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath2));
		driver.findElement(By.xpath(xpath1)).click();
		action.sendKeys(Keys.F12).perform();
		driver.switchTo().frame(element);
		driver.findElement(By.id("BTN_OK")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);

	}

	public void reportscreen(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		driver.switchTo().frame(element);
	}

	public void clickdetail() throws Exception {
		waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Details")))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void defaultframe() {
		driver.switchTo().defaultContent();
	}

	public void popupinformationclose() {
		driver.switchTo().frame("ifr_AlertWin");
		driver.findElement(By.cssSelector("#BTN_OK")).click();
		driver.switchTo().parentFrame();
	}


	public void clickDelete() {
		try {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Delete"))))
			.click();
		} catch (ElementClickInterceptedException ex) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Delete"))))
			.click();
		} catch (NoSuchElementException ex1) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Delete"))))
			.click();
		} catch (Exception ex2) {
			waitDriver.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Delete"))))
			.click();
		}
	}

	public void closeChildScreen1() throws Exception {
		try {
			clickBtnOk();
		}catch(Exception e) {

		}
		switchToFrameByTitle(screenName);
		isChildScreenOpened = false;
	}


	public void popupalert1() throws Exception {
		switchToFrameByTitle("Information Message");
		clickButtonById("BTN_OK");
		driver.switchTo().defaultContent();
	}


	public void clickBtnAuthorisebtn() throws Exception {
		element = driver.findElement(By.id("BLK_AUTHORIZE__BTN_AUTHORIZE"));
		element.click();
	}

	public void clickBtnAuthorisebtnPayment() throws Exception {
		element = driver.findElement(By.id("BLK_ACC__BTN_AUTH"));
		element.click();
	}

	public void clickBtnAuthorisebtnCLVAMI() throws Exception {
		element = driver.findElement(By.id("BLK_ACCOUNTDETAILS__BTN_AUTH"));
		element.click();
	}


	public void clickBtnAuthorisebtnMMDTRONL() throws Exception {
		element = driver.findElement(By.id("BLK_MMVWS_AUTH_DETAILS__BTN_AUTH"));
		element.click();
	}
}
