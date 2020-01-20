package com.jmr.testsuite.fas.util;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;

@ContextConfiguration(classes = SpringConfiguration.class)
public class ElementCollectorUtil extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver driver;
	@Autowired
	private FlexcubeCommon fcubs;
	private String screenId = "STDCUSTD";
	private String screenName = "Deposit Account Booking";

	@PostConstruct
	public void init1() {
		System.out.println("");
	}

	@Test(priority = 0)
	public void init() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
		fcubs.launchScreen(screenId);
	}

	@Test(priority = 1)
	public void getAllInputElement() throws Exception {
		String id, type, label_value, title, readOnly;
		// fcubs.switchToFrameByTitle(screenName);
		List<WebElement> list = driver.findElements(By.xpath("//*/input"));
		System.out.println("Title\tLabel\tId\tType");
		for (WebElement element : list) {
			type = element.getAttribute("type");
			id = element.getAttribute("id");
			label_value = element.getAttribute("label_value");
			title = element.getAttribute("title");
			readOnly = element.getAttribute("readOnly1");
			readOnly = readOnly == null ? "false" : "true";

			if (!readOnly.equalsIgnoreCase("true")) {
				System.out.println(title + "\t" + label_value + "\t" + id + "\t" + type + "\tfcubs.populateTextById(\""
						+ id + "\",\"\")");
			}
		}

	}

	@PreDestroy
	public void destroy() throws Exception {
		Thread.sleep(300 * 1000);
		fcubs.destroy();
	}

}
