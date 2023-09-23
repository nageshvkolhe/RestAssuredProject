package datadrivenexample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DataDrivenEx extends DataForTests {

	@Test(dataProvider = "DataForPost")
	public void test_post(String firstName, String lastName, int SubjectId) {
		JSONObject request = new JSONObject();

		request.put("firstName", firstName);
		request.put("lastName", lastName);
//		request.put("SubjectId", SubjectId);

		System.out.println(request);
		System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).body(request.toJSONString())
				.when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}

	@Parameters("userId")
	@Test
	public void get_data(String  userId) {
		given().get("https://reqres.in/api/users"+userId).then().statusCode(200).log().all();
	}
}
