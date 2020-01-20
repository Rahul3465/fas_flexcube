package com.jmr.testsuite.fas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
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

import com.jmr.testsuite.fas.page.common.LoginPageAction;
import com.jmr.testsuite.fas.page.common.LoginPage;
import com.jmr.testsuite.fas.page.common.ScreenShotUtil;

@Component
public class FlexcubeCommon1 {

	private Actions actions;
	@Autowired
	private WebDriver driver;
	private WebElement element;
	@Autowired
	private LoginPageAction loginAction;
	@Autowired
	private LoginPage loginPage;
	private String screenId;
	private String screenName;

	@Autowired
	private ScreenShotUtil screenShotUtil;
	private WebDriverWait waitDriver;

	private boolean checkElementNValue(String elementId, String value) {
		if ((value != null && !value.equalsIgnoreCase("")) && (elementId != null && !elementId.equalsIgnoreCase(""))) {
			return true;
		}
		return false;
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
	 * Click on any button available in active screen html attribute - id
	 * 
	 * @param elementId
	 *            - html id of button
	 */
	public void clickButtonById(String elementId) {
		if (validInput(elementId)) {
			element = driver.findElement(By.id(elementId));
			Coordinates coordinates = ((Locatable) element).getCoordinates();
			coordinates.inViewPort();
			actions.moveToElement(element).click().build().perform();
		}
	}

	public void clickButtonByXpath(String xpath) {
		if (validInput(xpath)) {
			element = driver.findElement(By.xpath(xpath));
			Coordinates coordinates = ((Locatable) element).getCoordinates();
			coordinates.inViewPort();
			actions.moveToElement(element).build().perform();
			element.click();
		}
	}

	/**
	 * To close or cancel the current active screen/child screen
	 */
	public void clickCancelBTN() {
		driver.findElement(By.id("BTN_EXIT_IMG")).click();
	}

	public void clickEnterQuery() {
		driver.findElement(By.linkText("Enter Query")).click();
	}

	public void clickExecuteQuery() {
		driver.findElement(By.linkText("Execute Query")).click();
	}

	public void clickNew() {
		driver.findElement(By.linkText("New")).click();
	}

	public void clickOKBTN() throws Exception {
		element = driver.findElement(By.id("BTN_OK"));
		element.click();
		Thread.sleep(1000);
	}

	public void clickSave() {
		driver.findElement(By.linkText("Save")).click();
	}

	/**
	 * To close Confirmation Message Alert Window
	 * 
	 * @throws Exception
	 */
	public void closeConfirmaWin() throws Exception {
		switchToFrameByTitle("Confirmation Message");
		clickOKBTN();
		driver.switchTo().defaultContent();
		switchToFrameByTitle(screenName);
	}

	/**
	 * To close Information Message - Alert Window
	 * 
	 * @throws Exception
	 */
	public void closeInfoWindow() throws Exception {
		switchToFrameByTitle("Information Message");
		clickOKBTN();
		driver.switchTo().defaultContent();
		switchToFrameByTitle(screenName);
	}

	/**
	 * Closes the Main Screen Launched
	 * 
	 * @throws Exception
	 */
	public void closeMainScreen() throws Exception {
		driver.switchTo().parentFrame();
		clickCancelBTN();
		closeConfirmaWin();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("ifr_LaunchWin");
	}

	/**
	 * To Accept and close Override screen
	 * 
	 */
	public void closeOverrideScreen() throws Exception {
		// switch to subscreen
		switchToFrameByTitle("Override Message");
		clickButtonById("BTN_ACCEPT");
	}

	/**
	 * To close remark screen
	 * 
	 */
	public void closeRemarkScreen() throws Exception {
		// switch to subscreen
		element = driver.findElement(By.xpath("//*[@src='Remarks.jsp?iframeLaunch=true']"));
		driver.switchTo().frame(element);
		clickOKBTN();
		driver.switchTo().defaultContent();
		switchToFrameByTitle(screenName);
	}

	/**
	 * Close the Main Screen Opened
	 */
	public void closeScreen() {
		driver.findElement(By.id("WNDbuttons")).click();
	}

	/**
	 * destroy the current session opened
	 */
	public void destroy() {
		driver.close();
		driver.quit();
	}

	public void focusToElement(WebElement element) {
		actions.moveToElement(element).build().perform();
	}

	/**
	 * Get all the error message displayed in alert window and close the alert
	 * window
	 */
	public String getAllErrorMsg(String fileName) throws Exception {
		String msg = "";
		try {
			switchToFrameByTitle("Error Message");
			msg = driver.findElement(By.xpath(("//*[@id=\"ERRTBL\"]/tbody"))).getText();
			if (msg != null && !msg.equalsIgnoreCase("")) {
				screenShotUtil.takeScreenShot(fileName);
				clickOKBTN();
			}
			driver.switchTo().defaultContent();
			switchToFrameByTitle(screenName);
			clickCancelBTN();
			closeConfirmaWin();
			clickCancelBTN();
			lunchScreen(screenId);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("No Error Found returning empty string");
		}
		return msg;
	}

	/**
	 * Lunch Oracle FLEXCUBE application and do login
	 * 
	 * @throws Exception
	 */
	public void lunchApp() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(loginPage.getLink());
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//span[@class='fonts']//li[2]")).click(); //this
		// is for setting small text size for Flexcube 12.3/4
		// setting page content to 80% for better visiblity
		loginAction.doLogin();
	}

	/**
	 * To lunch FLEXCUBE Screen using Screen Id
	 * 
	 * @param screenId
	 *            - Function Id of FLEXCUBE Screen
	 * @throws Exception
	 */
	public void lunchScreen(String screenId) throws Exception {
		driver.switchTo().defaultContent();
		driver.findElement(By.id("fastpath")).clear();
		driver.findElement(By.id("fastpath")).sendKeys(screenId);
		driver.findElement(By.id("btnGo")).click();
		try {
			switchToFrameByTitle(screenName);
		} catch (Exception ex) {
			waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
					driver.findElement(By.xpath("//[title='" + screenName + "&nbsp;']"))));
		}
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
	public void MultiEntryFieldById(String multiRowAddId,String multiRowAddXpath, List<String> elementTypeList, List<String> elementIdList,
			List<String> elementValueList) throws Exception {
		Iterator<String> itElementId = elementIdList.iterator();
		Iterator<String> itElementType = elementTypeList.iterator();
		Iterator<String> itElementValue = elementValueList.iterator();
		List<String> recordList= null;
		String elementId, elementValue, elementType = "";
		int elmntIdTemp = 0, recordCount = 0;
		String incTemp = "";
		HashMap<String, List<String>> recordMap = new HashMap<String, List<String>>();
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
			} else if (!validInput(elementValue)) {
				for (String val : recordMap.keySet()) {
					recordList = recordMap.get(val);
					recordList.add(elementValue);
				}
			}else {
				//multi-entry has only one data therefore recordcount should be always 1
				recordCount = 1;
				if(recordMap.isEmpty()) {
					recordList = new ArrayList<>();
					recordList.add(elementValue);	
				}else {
					if(recordMap.containsKey("RECORD" + recordCount)) {
						recordList = recordMap.get("RECORD" + recordCount);
						recordList.add(elementValue);
					}
				}
				recordMap.put("RECORD" + recordCount, recordList);
			}
		}
		for (String key : recordMap.keySet()) {
			System.out.println(key + "\t\t" + recordMap.get(key));
		}
		if (validInput(multiRowAddId) || validInput(multiRowAddXpath)) {
			for (String key : recordMap.keySet()) {
				System.out.println("Adding MultiEntry " + key);
				if(validInput(multiRowAddId)) {
					clickButtonById(multiRowAddId);	
				}else {
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

	/**
	 * Open sub-screen or child-screen using Name found in the FLEXCUBE Main Screen
	 * Footer area
	 * 
	 * @param subScreenName
	 *            - Child Screen name Eg. Interest, Event Entries
	 * @throws Exception
	 */
	public void openSubScreenByTitle(String subScreenName) throws Exception {
		driver.findElement(By.linkText(subScreenName)).click();
		switchToActiveFrame();
		Thread.sleep(1000);
	}

	public void populateDateField(String elementId, String text) {
		if (checkElementNValue(elementId, text)) {
			element = driver.findElement(By.id(elementId));
			if (validInput(element.getAttribute("value"))) {
				element.clear();
				element.sendKeys(text);
			} else {
				element.sendKeys(text);
			}
		}
	}

	/*
	 * public void switchToMainScreen() { driver.switchTo().parentFrame(); }
	 */

	public void populateTextById(String elementId, String text) {
		if (checkElementNValue(elementId, text)) {
			element = driver.findElement(By.id(elementId));
			element.sendKeys(text);
		}
	}

	@PostConstruct
	public void postConstruct() {
		actions = new Actions(driver);
		waitDriver = new WebDriverWait(driver, 5);
	}

	/**
	 * Select dropdown using the visible text available in dropdown options
	 * 
	 * @param elementId
	 *            - HTML ID of the select html tag
	 * @param text
	 *            - Visible Text available in dropdown list
	 * 
	 */
	public void selectDropdownByText(String elementId, String text) {
		if (validInput(text)) {
			element = driver.findElement(By.id(elementId));
			moveToElement(element);
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
				moveToElement(element).click().build().perform();
			} else if ((value.equalsIgnoreCase("No") || value.equalsIgnoreCase("N")) && element.isSelected()) {
				moveToElement(element).click().build().perform();
			}
		}
	}

	public void selectRadioBtn(String tagName, String keyValue) {
		if (checkElementNValue(tagName, keyValue)) {
			List<WebElement> elementList = driver.findElements(By.name(tagName));
			for (WebElement element : elementList) {
				if (element.getAttribute("label_value").equalsIgnoreCase(keyValue) && !element.isSelected()) {
					moveToElement(element).click().build().perform();
				}
			}
		}
	}

	public void setScreenDetails(String screenId, String screenName) {
		this.screenId = screenId;
		this.screenName = screenName;
	}

	/**
	 * Switch Control to tab using Tab name available in current active window
	 * 
	 * @param tabName
	 */
	public void switchTab(String tabName) throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'" + tabName + "')]")).click();
		Thread.sleep(1000);
	}

	public void switchToActiveFrame() throws Exception {
		driver.switchTo().frame(driver.switchTo().activeElement());
		Thread.sleep(1000);
	}

	/**
	 * Switch to a particular Iframe using the Xpath
	 * 
	 * @param xPath
	 *            - Xpath of the Iframe Eg. switchToFrame("//*[title='Information
	 *            Message']")
	 * @throws Exception
	 */
	public void switchToFrame(String xPath) throws Exception {
		WebElement element = driver.findElement(By.xpath(xPath));
		driver.switchTo().frame(element);
		Thread.sleep(2000);
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
		waitDriver = new WebDriverWait(driver, 5);
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
}
