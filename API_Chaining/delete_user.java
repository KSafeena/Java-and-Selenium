package API_Chaining;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
public class delete_user {
	@Test
	void delete_user(ITestContext context)
	{
		String token="6fd518cb49162db9390825169ea1fef09e904a6bb0827fada15f4a52a5d1dbe1";
		int id=(Integer) context.getAttribute("user_id");
		given()
		.header("Authorization", "Bearer "+token)
		.pathParam("id",id)
		.when()
		.delete("https://gorest.co.in/public/v2/users/{id}")
		
		
		.then()
		.statusCode(204)
		.log().all();
	}

	
	
}
