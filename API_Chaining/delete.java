package API_Chaining;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;
public class delete {
	@Test
	void delete(ITestContext context)
	{
		int id=(Integer) context.getAttribute("userid");
		given()
		.pathParam("id", id)
		.when()
		.delete("http://localhost:3000/Students/{id}")
		.then()
		.log().all();
	}

}
