package API_Tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;

public class Example01 {

    @Test
    public void demo1(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getContentType());
        System.out.println(response.prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void demo2(){
        Response response = RestAssured.get("https://www.google.com");
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void demo3(){
        Response response = get("https://www.google.com");
        System.out.println(response.getBody().prettyPrint());
    }

}
