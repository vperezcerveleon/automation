package com.slokam.automation.opencart.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminLoginPagePF;

public class TestLoginPF extends TestBase{

	@Test
	public void test1() {
		
		
		AdminLoginPagePF admin = PageFactory.initElements(driver, AdminLoginPagePF.class);
		admin.login("user", "user123");
	}
}
