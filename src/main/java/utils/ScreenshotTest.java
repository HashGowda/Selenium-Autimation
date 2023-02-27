package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {

    WebDriver driver;

    @Test
    public void captureScreenshot() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        Thread.sleep(2000);
        UtilityTest.captureScreenshot(driver, "BrowserStarted");
        driver.findElement(By.xpath("//*[text()='Me']")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus()){
            UtilityTest.captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }
}
