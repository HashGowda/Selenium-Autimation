package TestNG;

import org.testng.annotations.*;

public class Sample {

    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }

    @Test
    void test1(){
        System.out.println("Test1");
    }

    @Test
    void test2(){
        System.out.println("Test2");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }
}
