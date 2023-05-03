package Framework2;


import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Listeners({TestListener.class})
public class BaseClass extends TestListener {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        ExtentManager.configExtentTest(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
        launchDriver();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        DriverManager.getDriver().close();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method name) {
        ExtentManager.startTest(name);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws NullPointerException {
        testResultsCapture(result);
    }
}
