import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;

public class Tests_POST {
	@Test
	public void test_post() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Nagesh");
		map.put("job", "SDET");

		System.out.println(map);
		JSONObject req = new JSONObject(map);
		System.out.println(req);
	}
}
