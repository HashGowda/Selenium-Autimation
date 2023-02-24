package TestNG;

import org.testng.annotations.*;

public class SimpleAnnotations {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before test");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Before class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before method");
    }
    @Test
    void beforeTest1(){
        System.out.println("Before test1");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After suite");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After test");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After class");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("After method");
    }
}
