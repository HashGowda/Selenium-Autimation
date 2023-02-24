package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BasicReport {
    @Test
    public void basicReport() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Basic Report.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Basic Report");
        spark.config().setReportName("Selenium Report");

        ExtentTest test = extent.createTest("Login Test");
        ExtentTest node = test.createNode("Login");
        node.pass("Login test started");
        node.info("Entered username");
        node.info("Entered password");
        node.info("Login button clicked");
        node.pass("Login test completed");

        ExtentTest node1 = test.createNode("Logout");
        node1.pass("Logout test started");
        node1.info("Logout button clicked");
        node1.pass("Logout test completed");

        ExtentTest test1 = extent.createTest("Home Page Test").assignAuthor("Harish").assignCategory("Sanity").assignDevice("Firefox");
        test1.pass("HomePage test started");
        test1.info("Navigated to homepage");
        test1.info("Validated homepage");
        test1.fail("Homepage test failed");

        extent.flush();
        Desktop.getDesktop().browse(new File("ExtentReport/Basic Report.html").toURI());

    }
}
