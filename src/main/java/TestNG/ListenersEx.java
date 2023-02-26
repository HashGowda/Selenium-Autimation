package TestNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenersEx extends TestListenerAdapter {

    public void onTestSuccess(ITestResult tr){
        System.out.println("Testcase pass");
    }

    public void onTestFailure(ITestResult tr){
        System.out.println("Testcase fail");
    }
}
