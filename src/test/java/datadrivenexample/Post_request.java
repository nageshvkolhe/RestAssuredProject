package datadrivenexample;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post_request {
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {

		Object[][] data = new Object[2][3];
		data[0][0] = "Pranav";
		data[0][1] = "Patil";
		data[0][2] = 2;

		data[1][0] = "Nitin";
		data[1][1] = "Gujar";
		data[1][2] = 1;
		return data;

	}

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
}
