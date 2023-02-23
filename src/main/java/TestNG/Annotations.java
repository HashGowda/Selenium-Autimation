package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Annotations {
    public WebDriver driver;


    @BeforeTest
    public void launchApp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.calculator.net");
    }

    @Test
    public void calculatePercentage(){
        driver.findElement(By.xpath("//*[text()='Math Calculators']")).click();

        driver.findElement(By.xpath("//*[text()='Percentage Calculator']")).click();

        driver.findElement(By.id("cpar1")).sendKeys("10");
        driver.findElement(By.id("cpar2")).sendKeys("50");
        driver.findElement(By.xpath("(//*[contains(@value,'Calculate')])[1]")).click();

        String result = driver.findElement(By.xpath("//*[@class='h2result']")).getText();
        System.out.println(result);

        if (result.equals("Result: 5")){
            System.out.println("The result is pass");
        } else {
            System.out.println("The result is fail");
        }
    }

    @AfterTest
    public void terminate(){
        driver.close();
    }
}
