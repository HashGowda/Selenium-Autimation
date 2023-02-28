package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class ScreenShot {
    ExtentReports extent;
    public WebDriver driver;

    @BeforeSuite
    public void setUp(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Add Screenshot Report.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Screenshot Report");
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        extent.flush();
    }

    @BeforeClass
    public void launch(){
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void login() throws InterruptedException, IOException {
        ExtentTest test = extent.createTest("Sample Test");
        driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
        test.info("Username Entered");
        driver.findElement(By.name("password")).sendKeys("admin12");
        test.info("Password entered");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        test.info("Login button clicked");
        Thread.sleep(4000);
        test.pass((Markup) MediaEntityBuilder.createScreenCaptureFromPath(getScreenShot()).build());
        test.pass((Markup) MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotBase64()).build());
        test.pass((Markup) MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
    }

    public String getScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"/ScreenShots/image.png";
        FileUtils.copyFile(file, new File(path));
        return path;
    }
    public String getScreenShotBase64() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"/ScreenShots/image.png";
        FileUtils.copyFile(file, new File(path));
        byte[] image= IOUtils.toByteArray(new FileInputStream(path));
        return Base64.getEncoder().encodeToString(image);
    }
    public String getBase64(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
