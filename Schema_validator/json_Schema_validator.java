package Schema_validator;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
public class json_Schema_validator {
 @Test
	void json_Schema_validator()
	{
		given()
		
		.when()
		.get("http://localhost:3000/Students")
		.then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonschema.json"));
}
}
