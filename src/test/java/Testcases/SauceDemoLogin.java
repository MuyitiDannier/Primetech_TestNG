package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoLogin {

    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));

        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        Thread.sleep(3000);

        String expectedLabel = "Products";
        WebElement productLabel = driver.findElement(By.xpath("//span[text()='Products']"));
        String actualLabel = productLabel.getText();

        Assert.assertEquals(actualLabel, expectedLabel);

        driver.close();

    }
}
