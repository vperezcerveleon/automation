package com.slokam.automation.opencart.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {


	String browser = "chrome";
	String url = "http://localhost/opencart/admin";
	String username = "user";
	String password = "user123";
	WebDriver driver = null;
	
	@BeforeMethod
	public void launchBrowser() {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\USEER\\Desktop\\jars3\\gecko_driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test
	public void login() {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
