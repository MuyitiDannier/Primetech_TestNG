package Testcases;

import org.testng.annotations.Test;

public class TestNgDescriptionExample {

    @Test(description = "Positive test case")
    public void test(){
        System.out.println("Test Example");
    }
}
