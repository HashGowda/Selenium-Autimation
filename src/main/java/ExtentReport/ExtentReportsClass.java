package ExtentReport;

import Reports.ExtentLogger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import static SeleniumWaits.ImpExpWait.driver;

public class ExtentReportsClass {
    ExtentReports extent;
    ExtentTest test;
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        //downgrade extentreports version to 4.0.9 to attach a screenshot to the report

//        ExtentHtmlReporter reporter = new ExtentHtmlReporter("ExtentReport/ScreenshotTest.html");
//        extent = new ExtentReports();
//        extent.attachReporter(reporter);
//        test = extent.createTest("Login Test");


        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/ScreenshotTest.html");
        extent.attachReporter(spark);
        test = extent.createTest("Login Test");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Test");
        spark.config().setReportName("Selenium Test");

        test = extent.createTest("Screenshot Test").assignAuthor("Harish").assignCategory("Sanity").assignDevice("Chrome");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException, InterruptedException {
        if (ITestResult.FAILURE==result.getStatus()){
            String temp = UtilityTest.getScreenshot(driver);
            test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        }
        extent.flush();
        Desktop.getDesktop().browse(new File("ExtentReport/ScreenshotTest.html").toURI());
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        System.out.println("Title is "+driver.getTitle());
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Harish"));
    }
}
