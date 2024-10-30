package API_Tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Assignment_1 {

    @Test
    public void testCase1(){

        baseURI = "https://petstore.swagger.io/v2/pet/22112";

        given()
                .pathParam("petId", 22112)
                .then()
                .statusCode(200)
                .contentType("application.json")
                .body("name", equalTo("booboo"))
                .body("status", equalTo("available"));
    }

    @Test
    public void testCase2(){

        given()
                .baseUri("https://petstore.swagger.io/v2/pet/201029")
                .pathParam("petId", 201029)
                .then()
                .statusCode(404)
                .contentType("application.json")
                .body("message", equalTo("Pet not found"));
    }
}
