package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {

	WebDriver driver;
	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnOrders() {
		driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
	}
	public void clickOnCategories() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
	}
	
	public void clickOnStatistics() {
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Statistics')]")).click();
	}
	
	public void clickOnProducts() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
}
