package com.davivienda;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CarResourceTest {

    @Test
    public void testGetEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200);
    }
}