package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZohoTest {

    @Test
    public void zohoSignIn() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zoho.com/peopleplus/?zsrc=fromproduct");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()='SIGN IN'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login_id")).sendKeys("devaraj.godi@xitadel.com");
        Thread.sleep(2000);
        driver.findElement(By.id("nextbtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[contains(@id,'password')])[1]")).sendKeys("2ka14me013@123");
        Thread.sleep(5000);
        driver.findElement(By.id("nextbtn")).click();
        Thread.sleep(12000);
        driver.findElement(By.id("mfa_otp"));
        Thread.sleep(5000);
        driver.findElement(By.id("nextbtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn blue trustdevice trustbtn']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[text()='Remind me later']")).click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Home']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("ZPD_Top_Att_Stat")).click();
        Thread.sleep(3000);
        System.out.println("Login successful");
        driver.quit();
    }
}
