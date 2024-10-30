package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependencyExample {

    @Test
    public void login(){
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"login"})
    public void verifyDashboard(){
        System.out.println("Passed");
    }
}
