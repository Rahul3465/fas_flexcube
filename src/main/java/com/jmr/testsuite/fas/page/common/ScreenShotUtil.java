package com.jmr.testsuite.fas.page.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.testsuite.fas.AppConfig;

@Component
public class ScreenShotUtil {

	@Autowired
	private WebDriver driver;

	private String datePattern = "dd-MM-yyyy hh:mm:ss";

	public void takeScreenShot(String fileName) {
		String location = AppConfig.reportLocation;
		String outputFile = "";
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
			Date date = new Date();
			fileName = fileName + "_" + dateFormat.format(date).replaceAll(" ", "_").replaceAll(":", "_")
					+ AppConfig.sreenShotType;
			outputFile = location + "/" + fileName;
			System.out.println("file name===>" + fileName);
			System.out.println("file name and location ==========>" + outputFile);
			FileUtils.copyFile(sourceFile, new File(outputFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
