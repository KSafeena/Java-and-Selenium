package authorization;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Bearer_token {
	@Test
 void bearer_token()
 {
		String token="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";
	given()
	.header("Authorization","Bearer"+token)
	.when()
	.get("https://api.github.com/users/repos")
	.then()
	.statusCode(200)
	.log().all();
	 
 }
}
