package com.slokam.automation.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TERTC {

	String url = "https://tsrtconline.in";
	public void test1() {
		/*System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		// launch url
		driver.get(url);
		WebElement element = driver.findElementByXPath("//a[@href='/oprs-web/ticket/waitlist.do']");
		element.click();
		
		driver.findElementById("id").sendKeys("1233");
		driver.findElementById("mobileNo").sendKeys("1231231231");
		driver.findElementById("searchBtn").click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		
		alert.accept();
		//alert.dismiss();
		
		driver.findElementById("mobileNo").sendKeys("7207541801");
		driver.findElementById("searchBtn").click();
		String text = driver.findElementById("errorMsg").getText();
		System.out.println(text);
		//driver.close();
		
		
	}
	
	
	
	public static void main(String[] args) {
		TERTC exa= new TERTC();
		exa.test1();
	}
	
}
