package com.slokam.automation.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ThirdExample {

	public void test1(String browser ) {
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--fullPageScreenshot");
			System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		// launch url
		driver.get("https://demo.opencart.com/");
		WebElement comp = driver.findElement(By.xpath("//a[text()='Components']"));
		File file = null;
		if(driver instanceof FirefoxDriver) {
			file = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		}else if(driver instanceof ChromeDriver) {
			file = ((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
		}
		
		File file2 = new File("D:\\sample.jpeg");
		try {
			FileUtils.copyFile(file, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public static void main(String[] args) {
		ThirdExample se= new ThirdExample();
		se.test1("chrome");
	}
}
