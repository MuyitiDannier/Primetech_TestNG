package Testcases;

import org.testng.annotations.Test;

public class TestNgGroupsExample {

    @Test(groups = "smokeTest")
    public void verifyLogin(){
        System.out.println("Verify Login");
    }

    @Test(groups = "smokeTest")
    public void verifySignOut(){
        System.out.println("Verify Signout");
    }

    @Test(groups = "regression")
    public void verifyDashboard(){
        System.out.println("verify dashboard");
    }
}
