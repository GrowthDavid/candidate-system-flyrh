package com.company.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import jakarta.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
class CandidateControllerTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/candidate")
                .then()
                .statusCode(200)
                .contentType(MediaType.TEXT_HTML)
                .body(containsString("<html>"))
                .body(containsString("Candidate-se para a vaga"));  // Outra parte do HTML a verificar
    }

}
