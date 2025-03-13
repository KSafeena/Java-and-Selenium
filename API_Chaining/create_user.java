package API_Chaining;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
public class create_user {
	@Test
	void create_user(ITestContext context)
	{
		Faker faker=new Faker();
		JSONObject data=new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender", "male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "active");
		String token="6fd518cb49162db9390825169ea1fef09e904a6bb0827fada15f4a52a5d1dbe1";			
		int id=given()
		.headers("Authorization","Bearer "+token)
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("https://gorest.co.in/public/v2/users")
		.jsonPath().getInt("id");	
		System.out.println("The genarated response is:"+id);
		context.setAttribute("user_id", id);
	}
}
