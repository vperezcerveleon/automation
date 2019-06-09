package com.slokam.automation.tests.sample1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetry implements IRetryAnalyzer{

	int count = 0;
	int maximumRetryCount= 3;
	@Override
	public boolean retry(ITestResult result) {
		count++;
		if(maximumRetryCount==count) {
			return false;
		}else {
			return true;
		}
	}

}
