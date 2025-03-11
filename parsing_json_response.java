package restapi;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONArray;
import org.json.JSONObject;
public class parsing_json_response {
//	@Test
	void parsing_json_response()
	{
		given()
		.when()
		 .get("http://localhost:3000/Students")
		.then()
		  .statusCode(200)
		  .log().all();
	}
	@Test
    void parsing_reponse_by_variable() {  
        Response res = given()
                .when()
                .get("http://localhost:3000/Students");      
        System.out.println("The Status code is " + res.getStatusCode());       
        JSONArray jsonArray = new JSONArray(res.getBody().asString());     
//        String name = jsonArray.getJSONObject(1).getString("name");
//        System.out.println("The name of the second student: " + name);       
//        Assert.assertEquals(name, "Jane Smith");       
        for (int i = 0; i < jsonArray.length(); i++) {
        	
            JSONObject student = jsonArray.getJSONObject(i);
            String id = student.get("id").toString(); 
            System.out.println("Student ID: " + id);  
        }
    }
}
