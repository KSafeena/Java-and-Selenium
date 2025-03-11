package restapi;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class header_demo {
	@Test
	void header_demo()
	{
		Response res=given()
		.when()
		.get("https://www.google.com/");
//		System.out.println(res.getHeader("Server"));
//		System.out.println(res.getHeader("Content-Type"));
		Headers data=res.getHeaders();
		for(Header k:data)
		{
			System.out.println(k.getName()+"   "+k.getValue());
		}			
	}
}
