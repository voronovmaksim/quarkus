package org.acme.greeting.extension.deployment;

import io.quarkus.test.QuarkusUnitTest;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.hamcrest.Matchers.containsString;

@QuarkusTest
public class GreetingExtensionTest {

    @Test
    public void testGreeting() {
        RestAssured.when().get("/greeting").then().statusCode(200).body(containsString("Hello"));
    }

}