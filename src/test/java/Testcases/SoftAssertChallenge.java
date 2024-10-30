package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertChallenge {

    @Test
    public void verifyLabelsInMainPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        Thread.sleep(5000);

        //Find actualBackpackLabel and assert it against the AC value
        String expectedBackpackLabel = "Sauce Labs";
        String actualBackpackLabel = driver.findElement(By.xpath("//div[@class='inventory_item_name ' and text()='Sauce Labs Backpack']")).getText();
        //Find actualBikeLightLabel and assert it against the AS value
        String expectedBikeLightLabel = "Sauce Labs Bike Light";
        String actualBikeLightLabel = driver.findElement(By.xpath("//div[@class='inventory_item_name ' and text()='Sauce Labs Bike Light']")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualBackpackLabel, expectedBackpackLabel);
        softAssert.assertEquals(actualBikeLightLabel, expectedBikeLightLabel);

        driver.close();

        softAssert.assertAll();

    }
}
