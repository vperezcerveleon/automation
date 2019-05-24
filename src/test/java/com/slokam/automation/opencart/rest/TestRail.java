package com.slokam.automation.opencart.rest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class TestRail {

	@Test
	public void test1() {
		
		Response response = given()
				.auth()
				.preemptive()
				.basic("bharath@slokamqa.com", "OXDLexAwYTV0TUoBwIW4-II8cSOccgvhGbWh4xpcC")
				.header("Content-Type", "application/json")
		.get("https://ct3.testrail.io/index.php?/api/v2/get_run/2");
		
		System.out.println(response.getStatusCode());
		String st = response.getBody().asString();
		System.out.println(st);
	}
	
	@Test
	public void test2() {
		
		String json  = "{\r\n" + 
				"	\"status_id\": 5,\r\n" + 
				"	\"comment\": \"This test failed\",\r\n" + 
				"	\"elapsed\": \"15s\",\r\n" + 
				"	\"defects\": \"TR-7\",\r\n" + 
				"	\"version\": \"1.0 RC1 build 3724\",\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"	\"custom_step_results\": [\r\n" + 
				"		{\r\n" + 
				"			\"content\": \"Step 1\",\r\n" + 
				"			\"expected\": \"Expected Result 1\",\r\n" + 
				"			\"actual\": \"Actual Result 1\",\r\n" + 
				"			\"status_id\": 1\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"content\": \"Step 2\",\r\n" + 
				"			\"expected\": \"Expected Result 2\",\r\n" + 
				"			\"actual\": \"Actual Result 2\",\r\n" + 
				"			\"status_id\": 2\r\n" + 
				"		}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"	]\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}";
		
		Response response = given()
				.auth()
				.preemptive()
				.basic("bharath@slokamqa.com", "OXDLexAwYTV0TUoBwIW4-II8cSOccgvhGbWh4xpcC")
				.header("Content-Type", "application/json")
				.body(json)
		.post("https://ct3.testrail.io/index.php?/api/v2/add_result/3");
		
		
		System.out.println(response.getStatusCode());
		String st = response.getBody().asString();
		System.out.println(st);
	}
}
