package com.slokam.automation.opencart.testscripts;

import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.OrderandCheckout;
@Test
public class TestOrderCheckout extends TestBase {
	public void VerifyIphone() {

	OrderandCheckout orderandCheckout = new OrderandCheckout(driver);
	orderandCheckout.orderPhone();
	}
}
