package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData(){
        given()
                .baseUri("https://postman-echo.com")
                .body("09.09.1999")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",equalTo("09.09.1999"));
    }

}
