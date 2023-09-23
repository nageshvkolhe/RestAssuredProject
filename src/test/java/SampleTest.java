import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

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
		RestAssured.get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8))
//		body("data.id[1]", hasItems())
				.log().all();
	}

	private RestAssured given() {
		// TODO Auto-generated method stub
		return null;
	}
}
