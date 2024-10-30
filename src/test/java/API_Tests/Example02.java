package API_Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Example02 {

    @Test
    public void testCaseOne(){
        baseURI = "https://reqres.in";

        given()
                .get("api/users?page=2")
                .then()
                .statusCode(200);
    }

    @Test
    public void testCaseTwo(){
        baseURI = "https://reqres.in";

        given()
                .get("api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[0].id", equalTo(7))
                .body("support.url", equalTo("https://reqres.in/#support-heading"))
                .body("data.first_name", hasItems("Michael", "Lindsay", "Byron"));
    }

    @Test
    public void testCaseThree(){
        Response response = get("https://reqres.in/api/users?page=2");
        int totalPages = response.path("total_pages");
        System.out.println(totalPages);
        String supportURL = response.path("support.url");
        System.out.println(supportURL);
        List<String> emails = response.path("data.email");
        String singleEmail = response.path("data[0].email");
        System.out.println(emails);
        System.out.println(singleEmail);
        List<String> listOfEmails = response.jsonPath().getList("data.email");//jsonPath() provides more options/methods for collections.
        System.out.println(listOfEmails);
        Assert.assertEquals(singleEmail,"michael.lawson@reqres.in");
    }
}
