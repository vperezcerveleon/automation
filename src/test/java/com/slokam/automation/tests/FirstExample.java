package com.slokam.automation.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {

	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// launch url
		driver.get("https://demo.opencart.com/admin/");
		
		WebElement userele  = driver.findElementById("input-username");
		userele.sendKeys("demo");
		
		WebElement passwordEle = driver.findElementByName("password");
		passwordEle.sendKeys("demo");
		
		WebElement btnEle = driver.findElementByXPath("//button[@type='submit']");
		btnEle.click();
	}
	
	public static void main(String[] args) {
		FirstExample exa= new FirstExample();
		exa.test1();
	}
}
