package API_Chaining;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
public class update {
	@Test
	void update(ITestContext context)
	{
		int id=(Integer) context.getAttribute("userid");
		JSONObject data=new JSONObject();
		data.put("id", "56");
		data.put("name","fqs");
		data.put("age", "45");
		data.put("major", "science");
		given()
		.contentType("application/json")
		.pathParam("id", id)
		.body(data.toString())
		.when()
		.put("http://localhost:3000/Students/{id}")
		.then()
		.log().all();	
	}
}
