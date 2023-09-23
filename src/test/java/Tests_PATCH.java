import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_PATCH {
	@Test
	public void test_patch() {
		JSONObject request = new JSONObject();

		request.put("name", "Mahesh");
		request.put("job", "SDE");

		System.out.println(request);
		System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).body(request.toJSONString())
				.when().patch("https://reqres.in/api/users/").then().statusCode(200).log().all();
	}
}
