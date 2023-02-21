package ActionFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        MouseHover mouseHover = new MouseHover();
        mouseHover.launchBrowser();
        mouseHover.mouseHover();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    void mouseHover() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        Actions actions = new Actions(driver);
        actions.sendKeys(userName,"Admin").perform();
        Thread.sleep(2000);
        actions.sendKeys(password,"admin123").perform();
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        actions.click(loginButton).perform();
        Thread.sleep(2000);

        WebElement adminTab = driver.findElement(By.xpath("//*[text()='Admin']"));
        actions.moveToElement(adminTab).build().perform();
        Thread.sleep(2000);
        actions.click(adminTab).perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
