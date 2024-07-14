package org.api;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GroceryApiWithoutBaseClass {
	Object logToken;
	Object apiKey;
	String baseUri = "https://omrbranch.com/api";

	@Test(priority = 0, enabled = true)
	public void postmanBasicAuthLogin() {
		RequestSpecification requestSpecification;
		requestSpecification = RestAssured.given().header("accept", "application/json");
		requestSpecification = RestAssured.given().auth().preemptive().basic("srinipmps@gmail.com", "8@ndHEw5TfaLm5e");
		Response response = requestSpecification.post("https://omrbranch.com/api/postmanBasicAuthLogin");
		System.out.println(response.getStatusCode());
//		System.out.println(response.asPrettyString());
		JSONObject jsonObject = new JSONObject(response.asPrettyString());
		JSONObject jsonObject2 = jsonObject.getJSONObject("data");
		logToken = jsonObject2.get("logtoken");
		apiKey = jsonObject2.get("api_key");
		Assert.assertEquals(200, response.getStatusCode(), "Verify the status code");
	}

	@Test(priority = 1, enabled = false)
	public void login() {
		String endPont = "/login";
		JSONObject requestBody = new JSONObject();
		requestBody.put("email", "srinipmps@gmail.com");
		requestBody.put("pass", "8@ndHEw5TfaLm5e");
		requestBody.put("device_id", "34567887");
		requestBody.put("device_type", "Windows");
		requestBody.put("device_token", "45678-98765");
		Response post = RestAssured.given().baseUri(baseUri).contentType(ContentType.JSON).body(requestBody.toString())
				.post(endPont);
		System.out.println(post.getStatusCode());
//		System.out.println(post.asPrettyString());
	}

	@Test(priority = 2, enabled = false)
	public void loginWithApiKey() {
		String endPoint = "/loginWithApiKey";
		JSONObject requestBody = new JSONObject();
		requestBody.put("api_key", apiKey);
		requestBody.put("device_id", "34567887");
		requestBody.put("device_type", "Windows");
		requestBody.put("device_token", "45678-98765");
		Response response = RestAssured.given().baseUri(baseUri).contentType(ContentType.JSON)
				.body(requestBody.toString()).post(endPoint);
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
	}

	@Test(priority = 3, enabled = false)
	public void accessToken() {
		String endPoint = "/accessToken";
		List<Header> header = new ArrayList<Header>();
		header.add(new Header("accept", "application/json"));
		header.add(new Header("Content-Type", "application/json"));
		Headers headers = new Headers(header);
		JSONObject requestBody = new JSONObject();
		requestBody.put("email", "srinipmps@gmail.com");
		requestBody.put("password", "8@ndHEw5TfaLm5e");
		Response response = RestAssured.given().headers(headers).baseUri(baseUri).contentType(ContentType.JSON)
				.body(requestBody.toString()).post(endPoint);
//		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
	}

	@Test(priority = 4, enabled = true)
	public void forgotPassword() {
		String endPoint = "/forgotPassword";
		List<Header> headers = new ArrayList<Header>();
		headers.add(new Header("accept", "application/json"));
		headers.add(new Header("Content-Type", "application/json"));
		Headers headers2 = new Headers(headers);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("forgot_email", "srinipmps@gmail.com");
		Response response = RestAssured.given().headers(headers2).contentType(ContentType.JSON).baseUri(baseUri)
				.body(jsonObject.toString()).post(endPoint);
//		System.out.println(response.asPrettyString());
		JSONObject object = new JSONObject(response.asPrettyString());
		Assert.assertEquals("Password Reset Link sent on your mail id.", object.get("message"),
				"Verify the success message");
		System.out.println(response.getStatusCode());

	}

	@Test(priority = 5, enabled = true)
	public void updateDevice() {
		String endPoint = "/updateDevice";
		List<Header> header = new ArrayList<Header>();
		header.add(new Header("accept", "application/json"));
		header.add(new Header("Content-Type", "application/json"));
		header.add(new Header("Authorization", "Bearer " + logToken));
		Headers headers = new Headers(header);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("device_id", ",kjhbgvfcdsfghj");
		jsonObject.put("device_token", "sdfghjhgfd");
		Response response = RestAssured.given().headers(headers).contentType(ContentType.JSON)
				.body(jsonObject.toString()).baseUri(baseUri).put(endPoint);
		JSONObject jsonObject2 = new JSONObject(response.asPrettyString());
		Assert.assertEquals("Device ID updated successfully", jsonObject2.get("message"), "Verify the success message");
		System.out.println(response.getStatusCode());
	}

}
