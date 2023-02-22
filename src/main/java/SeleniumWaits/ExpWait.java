package SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExpWait {
    protected WebDriver driver;

    @Test
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/guru99home/");
    }

    @Test
    public void title(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String eTitle = "Demo Guru99 Page";
        String aTitle = "";

        //get the actual value of title
        aTitle = driver.getTitle();

        //compare the actual title with th expected title
        if (aTitle.equals(eTitle)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        WebElement element;
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='New Tours']")));
        element.click();

        driver.close();
    }
}
