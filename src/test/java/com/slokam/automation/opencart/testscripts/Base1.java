package com.slokam.automation.opencart.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Base1 {

	String browser = "chrome";
	String url = "http://localhost/opencart/";
	WebDriver driver = null;
	@BeforeMethod
	public void launchBrowser() {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\java-jars\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
}
