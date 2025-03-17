package restassured_practice;
//1. We have the 3 methods given(),when() and then()
//2.different methods of adding the post data.
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class basic {
	//1.using hashmap
//	@Test(priority=1)
	void basic()
	{
		HashMap map=new HashMap();
		map.put("id", "5");
		map.put("name", "Andrew");
		map.put("age", "30");
		map.put("major", "project");
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post("http://localhost:3000/Students")
		.then()
		.statusCode(201)
		.log().all();
	}
//	@Test(priority=2)
	void using_jsonobject()
	{
		JSONObject data=new JSONObject();
		data.put("id", "6");
		data.put("name","pojo");
		data.put("age", "100");
		data.put("major", "testing");
		
		given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("http://localhost:3000/Students")
		.then()
		.statusCode(201)
		.log().all();
	}
//	@Test(priority=3)
	void pojo()
	{
		pojo_class pojo=new pojo_class();
		pojo.setId(7);
		pojo.setName("Grish");
		pojo.setAge(90);
		pojo.setMajor("Developer");
		
		given()
		.contentType("application/json")
		.body(pojo)
		.when()
		.post("http://localhost:3000/Students")
		.then()
		.statusCode(201)
		.log().all();
	}
	@Test
	void json_file() throws FileNotFoundException
	{
		File f=new File("C:\\Users\\REDMI\\Documents\\Effigo Intern\\Sellinium practice workspace\\practice\\src\\test\\java\\restassured_practice\\data.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		given()
		.contentType("application/json")
		.body(jo.toString())
		.when()
		.post("http://localhost:3000/Students")
		.then()
		.statusCode(201)
		.log().all();
		
	}

}
