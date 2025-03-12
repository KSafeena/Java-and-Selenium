package authorization;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Basic {
	@Test(priority=1)
	void basic_auth() {	
	given()
	.auth().basic("postman", "password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then()
	.statusCode(200)
	.body("authenticated",equalTo(true))
	.log().all();
	}
	@Test(priority=2)
	void digestauth()
	{
		given()
		.auth().digest("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
	}
	@Test(priority=3)
	void preemptive()
	{
		given()
		.auth().preemptive().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();
	}	
}
