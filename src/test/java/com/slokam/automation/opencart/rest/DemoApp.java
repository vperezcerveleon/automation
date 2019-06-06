package com.slokam.automation.opencart.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DemoApp {

	@Test
	public void test1() {
		
		Response response = given()
		.header("Content-Type", "application/json")
		.body("{\r\n" + 
				"	\"username\":\"user\",\r\n" + 
				"	\"password\":\"password\"\r\n" + 
				"}")
		.post("http://localhost:8080/auth/signin");
		
		System.out.println(response.getStatusCode());
		String token = response.body().jsonPath().getString("token");
		 System.out.println(token);
		response = given().header("Authorization", "Bearer "+ token).get("http://localhost:8080/me");
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asString());
	}
}
