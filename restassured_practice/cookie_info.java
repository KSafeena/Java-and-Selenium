package restassured_practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.response.Response;
public class cookie_info {
@Test
void cookies()
{
	Response res=given()
	.when()
	.get("https://www.google.com/");
//	System.out.println(res.getCookie("AEC"));
	//getting multible cookies data
	Map<String, String> cookies=res.getCookies();
	for(int i=0;i<cookies.size();i++)
	{
		System.out.println(cookies.keySet()+"   "+cookies.values());
//		System.out.println(cookies.entrySet());
	}
	
	
}
}
