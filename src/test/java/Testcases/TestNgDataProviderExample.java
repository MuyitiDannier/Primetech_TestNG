package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviderExample {

    @DataProvider(name = "data-provider-example")
    public String[] dataProvider(){
        String[] userName = {"user1", "user2"};
        return userName;
    }

    @Test(dataProvider = "data-provider-example")
    public void myTest(String name){
        System.out.println(name);
    }

    @DataProvider(name = "data-provider-username-password")
    public Object[][] dataProviderForUserNameAndPassword(){
        Object[][] userNameAndPassword = {{"primetech", "primepassword"}};
        return userNameAndPassword;
    }

    @Test(dataProvider = "data-provider-username-password")
    public void loginUsingUserNameAndPassword(String username, String password){
        System.out.println("User name is: " +username);
        System.out.println("Password is: " +password);
    }
}
