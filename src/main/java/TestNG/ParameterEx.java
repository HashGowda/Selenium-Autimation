package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class ParameterEx {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeTest
    @Parameters({"appium"})
    public void beforeTest(String version){
        System.out.println("Before Test");
        System.out.println("Appium : "+version);
    }

    @Parameters({"selenium"})
    @Test
    public void test1(String version){
        try {
            System.out.println("My Test Case1");
            System.out.println("Selenium : "+version);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
