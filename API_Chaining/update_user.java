package API_Chaining;
import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
public class update_user {
	@Test
	void update_user(ITestContext context)
	{
		Faker faker=new Faker();
		JSONObject data=new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender", "male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "active");
		String token="6fd518cb49162db9390825169ea1fef09e904a6bb0827fada15f4a52a5d1dbe1";
		int id=(Integer) context.getAttribute("user_id");
		 given()
		.headers("Authorization","Bearer "+token)
		.contentType("application/json")
		.body(data.toString())
		.pathParam("id", id)
		.when()
		.put("https://gorest.co.in/public/v2/users/{id}")
		.then()
	    .statusCode(200)
	    .log().all();	
		System.out.println("The genarated response is:"+id);
	}
}
