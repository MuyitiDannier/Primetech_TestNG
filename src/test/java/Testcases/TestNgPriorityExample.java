package Testcases;

import org.testng.annotations.Test;

public class TestNgPriorityExample {

    @Test
    public void test1(){
        System.out.println("Test 1 Execution");
    }

    @Test
    public void test3(){//We have test 3 at the middle, but TestNG will execute this one at 3rd place because it follows numerical and alphabetical order
        System.out.println("Test 3 Execution");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 Execution");
    }

}
