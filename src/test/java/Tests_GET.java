import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Tests_GET {

	@Test
	public void test_2() {
		given();
		RestAssured.get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8))
				.log().all();
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}
}
