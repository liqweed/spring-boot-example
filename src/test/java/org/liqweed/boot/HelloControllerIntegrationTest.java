/*
 User: ophir
 Date: 27/01/14
 Time: 00:04
 */
package org.liqweed.boot;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HelloControllerIntegrationTest {

	@Before
	public void setUp() {
		SpringApplication.run(ServerStarter.class, "");
	}

	@Test
	public void sayHello() {
		given().port(9000).get("/hello").then().body(equalTo("hello"));
	}
}
