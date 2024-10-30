package Testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterExample {

    @Test
    @Parameters({"fName", "lName"})
    public void demoTest(String firstName, String lastName){
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
