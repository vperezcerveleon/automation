package com.slokam.automation.opencart.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCategories extends TestBase{

	@Test(groups= {"regression"})
	public void verifyAllcategories() {
		login();
		String expected = "Dashboard";
		String title = driver.getTitle();
		Assert.assertEquals(title, expected);
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
		String cat = driver.findElement(By.xpath("//form[@id='form-category']//tbody/tr/td[2]")).getText();
		Assert.assertEquals(cat, "Cameras");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='form-category']//tbody/tr/td[2]")));
		List<WebElement> list = driver.findElements(By.xpath("//form[@id='form-category']//tbody/tr/td[2]"));
		System.out.println(list.size());
		for(WebElement w : list) {
			System.out.println(w.getText());
		}
	}
}
