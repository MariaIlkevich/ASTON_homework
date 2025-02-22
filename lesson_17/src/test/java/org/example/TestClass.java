package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.devtools.v129.network.model.Response;

import io.restassured.RestAssured;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {
    
    @Test
    public void testGetRequest() {
        // Отправка GET-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        String foo1 = response.jsonPath().getString("args.foo1");
        String foo2 = response.jsonPath().getString("args.foo2");
        assertEquals("bar1", foo1);
        assertEquals("bar2", foo2);
    }

    @Test
    public void testPostRequest() {
        // Тело запроса
        String requestBody = "{\"name\": \"John\", \"age\": 30}";

        // Отправка POST-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/post");


        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        String name = response.jsonPath().getString("json.name");
        int age = response.jsonPath().getInt("json.age");
        assertEquals("John", name);
        assertEquals(30, age);
    }

    @Test
    public void testPutRequest() {
        // Тело запроса
        String requestBody = "{\"id\": 1, \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";

        // Отправка PUT-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/put");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        int id = response.jsonPath().getInt("json.id");
        String title = response.jsonPath().getString("json.title");
        String body = response.jsonPath().getString("json.body");
        int userId = response.jsonPath().getInt("json.userId");
        assertEquals(1, id);
        assertEquals("foo", title);
        assertEquals("bar", body);
        assertEquals(1, userId);
    }

    @Test
    public void testDeleteRequest() {
        // Отправка DELETE-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .when()
                .delete("/delete");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа (если нужно)
        String data = response.jsonPath().getString("data");
        assertEquals("", data); // Пустое тело ответа
    }

    @Test
    public void testPatchRequest() {
        // Тело запроса
        String requestBody = "{\"name\": \"Jane\", \"age\": 25}";

        // Отправка PATCH-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .patch("/patch");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка тела ответа
        String name = response.jsonPath().getString("json.name");
        int age = response.jsonPath().getInt("json.age");
        assertEquals("Jane", name);
        assertEquals(25, age);
    }

    @Test
    public void testHeadRequest() {
        // Отправка HEAD-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .when()
                .head("/head");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка заголовков (опционально)
        String contentType = response.getHeader("Content-Type");
        assertEquals("application/json; charset=utf-8", contentType);
    }

    @Test
    public void testOptionsRequest() {
        // Отправка OPTIONS-запроса
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .when()
                .options("/options");

        // Проверка кода ответа
        assertEquals(200, response.getStatusCode());

        // Проверка заголовков (опционально)
        String allowHeader = response.getHeader("Allow");
        assertEquals("HEAD, GET, POST, PUT, DELETE, PATCH, OPTIONS", allowHeader);
    }
}
