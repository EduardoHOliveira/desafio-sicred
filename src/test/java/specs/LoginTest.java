package specs;

import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import commons.BaseTest;

public class LoginTest extends BaseTest{
	 @Test
	    public void postLoginSucessfulTest() {
	        Map<String, String> bodyJson = new HashMap<String, String>();
	        bodyJson.put("username", "kminchelle");
	        bodyJson.put("password", "0lelplR");
	        given().
	                spec(spec).
	                contentType("application/json").
	                body(bodyJson).
	                post("/auth/login").
	                then().
	              assertThat().
	                	statusCode(201).
	                	body("\"id\": 15,\r\n"
	                		+ "    \"username\": \"kminchelle\",\r\n"
	                		+ "    \"email\": \"kminchelle@qq.com\",\r\n"
	                		+ "    \"firstName\": \"Jeanne\",\r\n"
	                		+ "    \"lastName\": \"Halvorson\",\r\n"
	                		+ "    \"gender\": \"female\",\r\n"
	                		+ "    \"image\": \"https://robohash.org/autquiaut.png\",\r\n"
	                		+ "    \"token\": \" ",null);       
	     
	    }

}
