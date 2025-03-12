package authorization;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class OAuth2 {
	@Test
	void OAuth2()
	{
		given()
		.header("Aythorization","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")
		.when()
		.get("https://api.github.com/users/repos")
		.then()
		.statusCode(200)
		.log().all();
	}

}
