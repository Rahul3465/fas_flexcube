package com.jmr.testsuite.fas;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.jmr.testsuite.fas.page.common.LoginPage;

import io.github.millij.poi.ss.reader.XlsxReader;

@Configuration
@ComponentScan(basePackages = "com.jmr.testsuite.fas")
public class SpringConfiguration {

	@Bean(autowire = Autowire.BY_TYPE)
	@Required
	public WebDriver webDriver() {
		System.setProperty("webdriver.chrome.driver", "fas/chromedriver_latest.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * System.setProperty("webdriver.firefox.marionette","lib/geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	@Bean
	@Required
	public XlsxReader xlsxReader() {
		return new XlsxReader();
	}

	@Bean
	@Required
	public LoginPage loginPage() throws Exception {
		LoginPage loginPage = null;
		File file = new File(AppConfig.testFileLocation);
		XlsxReader xlsReader = new XlsxReader();
		List<LoginPage> loginList = xlsReader.read(LoginPage.class, file, 0);
		loginPage = loginList.get(0);
		System.out.println(loginPage);
		return loginPage;
	}

	@Bean
	public FlexcubeCommon fcubs() {
		return new FlexcubeCommon();
	}

	/*@Bean
	@Required
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@192.168.1.92:1521:fcarb01");
		driverManagerDataSource.setUsername("flexcubeauto");
		driverManagerDataSource.setPassword("flexcubeauto");
		return driverManagerDataSource;
	}*/
}
