package API_Chaining;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
public class create {
	@Test
	void create(ITestContext context)
	{
		JSONObject data=new JSONObject();
		data.put("id", "56");
		data.put("name","fqs");
		data.put("age", "45");
		data.put("major", "science");
		int id=given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("http://localhost:3000/Students")
		.jsonPath().getInt("id");	
		context.setAttribute("userid", id);
	}
}
