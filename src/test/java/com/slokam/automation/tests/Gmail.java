package com.slokam.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail {

	public void test1() {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("user-data-dir=C:/Users/bkristip/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// launch url
		driver.get("https://gmail.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("identifierId").sendKeys("bharath.selenium26");
		driver.findElementByXPath("//span[text()='Next']").click();
		
		driver.findElementByName("password").sendKeys("asdasasd");
		driver.findElementByXPath("//span[text()='Next']").click();
	}
	
	public static void main(String[] args) {
		Gmail g = new Gmail();
		g.test1();
	}
	
}
