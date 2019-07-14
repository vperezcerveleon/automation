package com.slokam.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tsrtc {

	String url = "https://tsrtconline.in";
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get(url);
		WebElement element = driver.findElement(By.xpath("//a[@href='/oprs-web/ticket/waitlist.do']"));
		element.click();
		String newUrl = driver.getCurrentUrl();
		WebDriver newDriver = driver.switchTo().newWindow(WindowType.TAB);
		newDriver.get(newUrl);
		WebDriver newDriver1 = driver.switchTo().newWindow(WindowType.WINDOW);
		newDriver1.get(newUrl);
		/*
		driver.findElement(By.id("id")).sendKeys("1233");
		driver.findElement(By.id("mobileNo")).sendKeys("1231231231");
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		
		alert.accept();
		//alert.dismiss();
		
		driver.findElement(By.id("mobileNo")).sendKeys("6202654121");
		driver.findElement(By.id("searchBtn")).click();
		String text = driver.findElement(By.id("errorMsg")).getText();
		System.out.println(text);
		
		
		driver.quit();*/
	}
	
	
	
}
