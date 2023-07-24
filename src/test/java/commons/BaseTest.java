package commons;
 
import org.junit.Before;

import io.qameta.allure.restassured.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
	protected RequestSpecification spec;
	
	@Before
    public void baseTest() {
        RestAssured.baseURI = "https://dummyjson.com";
        spec = new RequestSpecBuilder()
                .setContentType("application/json")
                .addFilter(new AllureRestAssured())
                .build();
    }
}
