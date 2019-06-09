package com.slokam.automation.tests.sample1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example5 {

	int i =0;
	//@Test(retryAnalyzer=CustomRetry.class)
	public void varifySample21() {
		i++;
		System.out.println("I am verifySample21");
		if(i!=3) {
			Assert.fail();
		}
		
	}
}
