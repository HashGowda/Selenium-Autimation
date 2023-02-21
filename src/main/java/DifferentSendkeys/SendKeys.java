package DifferentSendkeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import java.util.Set;

public class SendKeys {
    public WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        SendKeys sendKeys = new SendKeys();
        sendKeys.launchBrowser();
        sendKeys.javaScriptKeys();
        sendKeys.normalKeys();
        sendKeys.actionKeys();
        sendKeys.javaScriptKey();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    void javaScriptKeys() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='Admin';", userName);
        Thread.sleep(2000);
        userName.clear();
    }

    void normalKeys() throws InterruptedException {
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        Thread.sleep(2000);
        password.clear();
    }

    void actionKeys() throws InterruptedException {
        WebElement usrNme = driver.findElement(By.xpath("//input[@name='username']"));
        Actions actions = new Actions(driver);
        actions.sendKeys(usrNme,"Admin").perform();
        Thread.sleep(2000);
        usrNme.clear();
    }

    void javaScriptKey() throws InterruptedException {
        WebElement pswrd = driver.findElement(By.xpath("//input[@name='password']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click().click();", pswrd);
        Thread.sleep(2000);
    }
}
