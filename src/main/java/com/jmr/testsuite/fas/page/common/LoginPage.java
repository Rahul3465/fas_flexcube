package com.jmr.testsuite.fas.page.common;

import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet(value = "Login")
public class LoginPage {

	@SheetColumn(value = "Username")
	private String userName;

	@SheetColumn(value = "Password")
	@FindBy(id = "txtPassword")
	private String passWord;

	@SheetColumn(value = "Link")
	private String link;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	private static void doLogin() {

	}

	@Override
	public String toString() {
		return "LoginPage [userName=" + userName + ", passWord=" + passWord + ", link=" + link + "]";
	}

}