package restassured_practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class pathparams_queryparams {
	@Test
	void pathparams_queryparams()
	{
		given()
		.pathParam("mypath","users")
		.queryParam("page", 2)
		.when()
		.get("https://reqres.in/api/{mypath}")
		.then()
		.log().all();
}
}