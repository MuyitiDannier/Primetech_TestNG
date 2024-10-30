package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAsset_SoftAssertDemo {

    @Test
    public void hardAssertExample(){
        //Verification 1
        Assert.assertTrue(2==2);//will pass since it's true, but if this 1st one is NOT true, whole page won't execute
        //Verification 2
        Assert.assertTrue(6>5);// if Verification 1 is not true, Verification 2 also won't execute
    }

    @Test
    public void softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        //Verification 1
        softAssert.assertTrue(2==3);
        //Verification 2
        softAssert.assertTrue(6>5);// this line will execute even Verification 1 is NOT true
    }

}
