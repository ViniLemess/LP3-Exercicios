package org.fundatec.vinilemess.pokemonapiresttemplate.controller;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class HealthControllerIntegrationTest {

    @Test
    void mustHealthCheckSuccessfully() {
        given()
                .get("http://localhost:8085/api/v1/health")
                .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("Hello, i am Pokemon API Rest Template"));
    }
}