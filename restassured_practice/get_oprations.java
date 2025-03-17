package restassured_practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.PrettyPrinter;
import io.restassured.response.Response;
public class get_oprations {
	@Test
	void get_data()
	{
		Response res=given()
		.when()
		.get("http://localhost:3000/Students");
		//Printing the complete data
//		System.out.println(res.prettyPrint());
//		Printing the particular record
		JSONArray array=new JSONArray(res.getBody().asString());
		for(int i=0;i<array.length();i++)
		{
			JSONObject obj=array.getJSONObject(i);
			if(obj.get("id").toString().equals("3"))
			{
				System.out.println("The Student data:"+obj);
			}
		}
	}
}
