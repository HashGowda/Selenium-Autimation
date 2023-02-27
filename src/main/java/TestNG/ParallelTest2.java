package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bstackdemo.com/");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void testTitle() throws InterruptedException {
        System.out.println("The thread ID for testTitle Edge is "+Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "StackDemo");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void clickOffers() throws InterruptedException {
        System.out.println("The thread ID for clickOffers Edge is "+Thread.currentThread().getId());
        WebElement offers = driver.findElement(By.xpath("//*[text()='Offers']"));
        offers.click();
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.xpath("//*[text()='Log In']"));
        Assert.assertTrue(loginBtn.isDisplayed());
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void clickOrders() throws InterruptedException {
        driver.navigate().to("https://www.bstackdemo.com/");
        System.out.println("The thread ID for clickOrders Edge is "+Thread.currentThread().getId());
        Thread.sleep(2000);
        WebElement orders = driver.findElement(By.xpath("//*[text()='Orders']"));
        orders.click();
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.xpath("//*[text()='Log In']"));
        Assert.assertTrue(loginBtn.isDisplayed());
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
