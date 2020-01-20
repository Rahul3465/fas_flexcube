package com.jmr.testsuite.fas.page.common;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPageAction {
	
	private WebDriverWait waitDriver;

	@Autowired
	private WebDriver driver;
	@Autowired
	private LoginPage loginPage;
	
	@FindBy(id = "LOGINUSERID")
	private WebElement userName;

	@FindBy(id = "user_pwd")
	private WebElement paswd;

	@FindBy(id = "BTN_OK")
	private WebElement okBTN;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnLogin;
	
	@PostConstruct
	public void init() {
		waitDriver = new WebDriverWait(driver,5);
	}

	public void doLogin() throws Exception {
		PageFactory.initElements(driver, this);
		userName.sendKeys(loginPage.getUserName());
		paswd.sendKeys(loginPage.getPassWord());
		driver.findElement(By.name("frmLogin")).submit();
		waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		Thread.sleep(5000);
		waitDriver.until(ExpectedConditions.elementToBeClickable(okBTN));
		okBTN.click();
	}

}
