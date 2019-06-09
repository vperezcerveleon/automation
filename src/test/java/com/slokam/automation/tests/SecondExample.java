package com.slokam.automation.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondExample {

	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch url
		driver.get("https://demo.opencart.com/");
		
		WebElement comp = driver.findElementByXPath("//a[text()='Components']");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(comp).build().perform();
		
		driver.findElementByXPath("//a[text()='Monitors (2)']").click();
	}
	
	public static void main(String[] args) {
		SecondExample se= new SecondExample();
		se.test1();
	}
}
