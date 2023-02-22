package SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImpExpWait {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ImpExpWait impExpWait = new ImpExpWait();
        impExpWait.launch();
        impExpWait.enterDetails();
    }

    void launch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
    }

    void enterDetails(){
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[contains(@class,'oxd-button')]")).click();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));

        element.click();
        System.out.println("Clicked on admin tab successfully");

        driver.close();
    }
}
