//package OrangeHR;
//
//import Reports.ExtentTestManager;
//import com.aventstack.extentreports.Status;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestResult;
//
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.sql.DriverManager;
//
//import static com.aventstack.extentreports.model.service.MediaService.getBase64;
//
//public class BaseClassConfig {
//    public WebDriver driver;
//
//    public BaseClassConfig() {
//        this.driver = DriverManager.getDriver();
//    }
//
//    public void launchDriver() {
//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        DriverManager.setDriver(driver);
//    }
//
//    public String testResultCapture(ITestResult result) throws NullPointerException {
//        System.out.println("======================Check Status======================" + result.getStatus());
//
//        //Success Block
//        if (result.getStatus() == ITestResult.SUCCESS) {
//            ExtentTestManager.getExtentTest().log(Status.PASS, result.getMethod().getMethodName() + " Passed ");
//        }
//
//        //Failure Block
//        if (result.getStatus() == ITestResult.FAILURE) {
//            if (result.getThrowable().getMessage().contains("Skipped by retry")) {
//                ExtentTestManager.getExtentTest().getExtent().removeTest(ExtentTestManager.getExtentTest());
//            } else {
//                StringWriter exceptionInfo = new StringWriter();
//                result.getThrowable().printStackTrace(new PrintWriter(exceptionInfo));
//
//                String methodClassName = result.getThrowable().getMessage();
//                for (StackTraceElement stack : result.getThrowable().getStackTrace()) {
//                    if (stack.getClassName().contains("Pages.PageActions")) {
//                        methodClassName = methodClassName + " Failed in Class: " + stack.getClassName() + ", in Method: " + stack.getMethodName() + ", in Line: " + stack.getLineNumber();
//                        break;
//                    }
//                }
//                ExtentTestManager.getExtentTest().fail(methodClassName);
//                ExtentTestManager.getExtentTest().addScreenCaptureFromBase64String(getBase64());
//            }
//        }
//    }
//
//
//        //Capture screenshot
//        //@return
//        public String getBase64 () {
//            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//        }
//    }
