import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_DELETE {
	@Test
	public void put_test() {
		JSONObject request = new JSONObject();

		request.put("name", "Pritesh");
		request.put("job", "SDE");

		System.out.println(request);
		System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).body(request.toJSONString())
				.when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
	}
}
