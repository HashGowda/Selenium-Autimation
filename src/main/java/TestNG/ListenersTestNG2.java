package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListenersTestNG2 {
    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
}
