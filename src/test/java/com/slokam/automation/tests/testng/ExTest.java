package com.slokam.automation.tests.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.examples.NameNotValidException;
import com.slokam.examples.Result;

public class ExTest {

	@Test
	public void test1() throws Exception {
		String name = "bharath";
		int marks = 50;
		String expected = "pass";
		Result  re = new Result();
		String actual = re.result(name, marks);
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(expectedExceptions=NameNotValidException.class,expectedExceptionsMessageRegExp="name not valid")
	public void test2() throws Exception {
		String name = "";
		int marks = 50;
		Result  re = new Result();
		String actual = re.result(name, marks);
	}
}
