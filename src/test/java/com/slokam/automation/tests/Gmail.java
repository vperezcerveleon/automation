package com.slokam.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
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
