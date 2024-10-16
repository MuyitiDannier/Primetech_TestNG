package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void calculatorTest(){
        System.out.println("This is test1.");
    }

    @Test
    public void calculatorTest2(){
        System.out.println("This is test2.");
    }

    @Test
    public void loginWithValidCredentials(){
        WebDriver driver = new ChromeDriver();
        driver.get("sauce demo url");
    }

}
