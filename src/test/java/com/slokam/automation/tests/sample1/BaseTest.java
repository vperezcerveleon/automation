package com.slokam.automation.tests.sample1;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void setup(ITestContext context) {
		ITestNGMethod[]  methods = context.getAllTestMethods();
		for (ITestNGMethod iTestNGMethod : methods) {
			iTestNGMethod.setRetryAnalyzer(new CustomRetry());
		}
	}
}
