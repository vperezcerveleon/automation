package com.slokam.automation.tests.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.listeners.CustomListener;


public class Example1 {

	@BeforeSuite
	public void bs() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("after suite");
	}
	@BeforeClass
	public void bc() {
		System.out.println("bc");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("ac");
	}
	@BeforeMethod
	public void login() {
		System.out.println("I am login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@Test(groups= {"regression"})
	public void verifySample1() {
		System.out.println("verifySample1");
	}
	
	@Test(groups= {"regression","sanity"})
	public void verifySample2() {
		System.out.println("verifySample2");
	}
	@Test(groups= {"sanity"})
	public void verifySample3() {
		System.out.println("verifySample3");
	}
}
