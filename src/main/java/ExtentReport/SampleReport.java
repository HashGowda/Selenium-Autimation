package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class SampleReport {
    @Test
            void generateExtentReport(){
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Reports.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("My Report");
        spark.config().setReportName("Selenium Report");

        ExtentTest test = extent.createTest("First Test");
        ExtentTest node1 = test.createNode("Node 1");
        node1.info("Username is entering");
        node1.info("Password is entering");
        node1.pass("Login button is clicking");

        ExtentTest node2 = test.createNode("Node 2");
        node2.info("Username is entered");
        node2.info("Password is entered");
        node2.pass("Login button is clicked");

        extent.flush();
    }
}
