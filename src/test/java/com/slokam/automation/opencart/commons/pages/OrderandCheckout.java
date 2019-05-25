package com.slokam.automation.opencart.commons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderandCheckout {

	WebDriver driver;

	public OrderandCheckout(WebDriver driver) {
		this.driver = driver;

	}
	public void orderPhone() {
			driver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs')]")).click();
			driver.findElement(By.xpath("//div[@class='button-group']//following-sibling::button[2][contains(@data-original-title,'Add to Wish List')]")).click();
			driver.findElement(By.id("wishlist-total")).click();
			driver.findElement(By.xpath(".btn-primary")).click();
			
	}
}
