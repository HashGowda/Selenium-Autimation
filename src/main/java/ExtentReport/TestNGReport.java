package ExtentReport;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReport {
    @Test
    void test1(){
        Reporter.log("First test case");
    }
    @Test
    void test2(){
        Reporter.log("Second test case");
    }
    @Test
    void test3(){
        Reporter.log("Third test case");
    }
    @Test
    void test4(){
        Reporter.log("Fourth test case");
    }
}
