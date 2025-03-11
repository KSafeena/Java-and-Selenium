package restapi;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.response.Response;
public class cookies_demo {
	@Test
	void cookies_demo()
	{
		Response res=given()
		.when()
		  .get("https://www.google.com/");
		//get single cookie info
//		String cookie=res.getCookie("AEC");
//		System.out.println("Cookie info"+cookie);
		//getting multiple cookies data
		Map<String, String> Cookies=res.getCookies();	
//		System.out.println("The Key values"+Cookies.keySet());
//			System.out.println(Cookies.entrySet());
			System.out.println(Cookies.values());
			for(int i=0;i<Cookies.values().size();i++)
			{
				System.out.println(Cookies.entrySet());
			}			
	}
}
