package restapi;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.http.HttpResponse.BodyHandler;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;
public class diff_methods_of_adding_request {
	
//	@Test(priority = 1)
	void createuser()
	{
		HashMap data=new HashMap();
		data.put("name", "john");
		data.put("job", "Tester");
		given()
		  .contentType("application/json")
		  .body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
	}
//	@Test
	void delete_user()
	{
		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
		   .statusCode(204)
		   .log().all();
	}
//	@Test
	void createusers()
	{
		JSONObject data=new JSONObject();
		data.put("name", "Json");
		data.put("job", "trainee");
		given()
			.contentType("application/json")
			.body(data.toString())
		
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.log().all();
		
	}
//	@Test
	void deleteuser()
	{
		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
		   .statusCode(204)
		   .log().all();
	}
//	@Test
	void createuser_pojo()
	{
		POJO_CLASS data=new POJO_CLASS();	
		data.setName("John");
		data.setJob("Trainee");
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();	
	}
//	@Test
	void delete()
	{
		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
		   .statusCode(204)
		   .log().all();
	}
	@Test
void createuser_json() throws FileNotFoundException
{
	File f=new File("C:\\Users\\REDMI\\Documents\\Effigo Intern\\RestassureAPI_demo\\src\\test\\java\\restapi\\body.json");
	FileReader fr=new FileReader(f);
	JSONTokener tc=new JSONTokener(fr);
	JSONObject data=new JSONObject(tc);
	given()
	.contentType("application/json")
	.body(data.toString())
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201)
	.log().all();	
}
//	@Test
	void deleteusers()
	{
		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
		   .statusCode(204)
		   .log().all();
	}
	
}
