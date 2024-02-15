package ru.netology;


import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @Test
    void shouldReturnSendData(){
        String text = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));

    }

}
