package com.amadeus.API;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestAPI {
	
	@BeforeTest
	public void setup()
	{
		
	}

	@Test
	@Parameters({"PNR","Authorization"})
	public void requestTest(String PNR, String accessToken) throws ParseException
	{
		RestAssured.baseURI = "http://193.23.185.67:25025/1ASIUJCPTRUSTU/v2/purchase/orders";
		RequestSpecification httpRequest = RestAssured.given().header("Authorization", accessToken);
		
		Response response = httpRequest.request(Method.GET, "/"+PNR);
		JSONParser parser = new JSONParser();
		JSONObject responseBody = (JSONObject) parser.parse(response.getBody().asString());
		
		JSONObject responseData = (JSONObject) responseBody.get("data");
		JSONArray travelers = (JSONArray)responseData.get("travelers");
		
		JSONObject travelerData = (JSONObject) ((JSONArray)(((JSONObject) (travelers.get(0))).get("names"))).get(0);
		String lastname = (String) travelerData.get("lastName");
		System.out.println(lastname);
	}
	
	@AfterTest
	public void tearDown()
	{
		
	}
}
