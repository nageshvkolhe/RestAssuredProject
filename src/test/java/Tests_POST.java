import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_POST {
	@Test
	public void test_post() {
//		Map<String, Object> map = new HashMap<String, Object>();	
//		map.put("name", "Nagesh");
//		map.put("job", "SDET");
//		System.out.println(map);
		JSONObject request = new JSONObject();

		request.put("name", "Nagesh");
		request.put("job", "SDET");

		System.out.println(request);
		System.out.println(request.toJSONString());

		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users").then().statusCode(201)
		.log().all();
	}
}
