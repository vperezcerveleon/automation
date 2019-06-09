package com.slokam.automation.tests.testng;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.listeners.CustomListener;
import com.slokam.automation.opencart.commons.listeners.CustomRetry;
@Listeners(value=CustomListener.class)
public class Example3 {
	int i = 0;
	int j = 0;
	@Test
	public void test1() {
		i++;
		System.out.println("I am test1");
		if(i!=4) {
			Assert.fail("failed case");
		}
		
	}
	@Test
	public void test2() {
		j++;
		System.out.println("I am test1");
		if(j!=6) {
			Assert.fail("failed case");
		}
		
	}
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite(ITestContext context) {
			for (ITestNGMethod method : context.getAllTestMethods()) {
				method.setRetryAnalyzer(new CustomRetry());
			}
	}
	
	
}
