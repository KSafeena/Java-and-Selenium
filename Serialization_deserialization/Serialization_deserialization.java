package Serialization_deserialization;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Serialization_deserialization {
	@Test
	void Serialization_deserialization() throws JsonProcessingException
	{
		POJOCLASS pj=new POJOCLASS();
		pj.setId(67);
		pj.setName("Martin");
		pj.setAge(62);
		pj.setMajor("Science");
		ObjectMapper obj=new ObjectMapper();
		String jsondata=obj.writerWithDefaultPrettyPrinter().writeValueAsString(pj);
		System.out.println(jsondata);
	}	
	void convertjson_to_pojo() throws JsonMappingException, JsonProcessingException
	{
		String jsondata="{\r\n"
				+ "  \"id\" : 67,\r\n"
				+ "  \"name\" : \"Martin\",\r\n"
				+ "  \"age\" : 62,\r\n"
				+ "  \"major\" : \"Science\"\r\n"
				+ "}";
		ObjectMapper obj=new ObjectMapper();
		POJOCLASS data=obj.readValue(jsondata, POJOCLASS.class);
		data.getId();
		data.getName();
		data.getClass();
		data.getAge();
		data.getMajor();
	}
}
