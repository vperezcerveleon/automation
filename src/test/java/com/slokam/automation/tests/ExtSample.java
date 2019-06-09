package com.slokam.automation.tests;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ExtSample {
	@Test
	public void test1() {
		ChromeOptions chrome = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
		File file = new File("D:\\extension_12_5_20_1.crx");
		chrome.addExtensions(file);
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.get("chrome-extension://hehijbfgiekmjfkfjpbkbammjbdenadd/nhc.htm#url=https://www.facebook.com/");
	}
	
	public void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
