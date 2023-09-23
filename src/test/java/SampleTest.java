import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import jdk.internal.net.http.ResponseBodyHandlers;

public class SampleTest {
	@Test
	void test_01() {
		Response response = RestAssured.get("https://reqres.in//api/users?page=2");

		response.getBody();
		response.getHeaders();
		int Res = response.statusCode();
		Assert.assertEquals(Res, 404);
	}

	@Test
	public void test_2() {
		given();
		RestAssured.get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}
}
