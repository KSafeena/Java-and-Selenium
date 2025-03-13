package API_Chaining;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import javax.naming.Context;
import org.testng.ITestContext;
import org.testng.annotations.Test;
public class get_user {
	@Test
	void get_user(ITestContext context)
	{
		int id=(Integer) context.getAttribute("user_id");
		
		String token="6fd518cb49162db9390825169ea1fef09e904a6bb0827fada15f4a52a5d1dbe1";
		given()
		.headers("Authorization","Bearer "+token)
		.pathParam("id", id)
		.when()
		.get("https://gorest.co.in/public/v2/users/{id}")
		.then()
		.statusCode(200)
		.log().all();
	}

}
