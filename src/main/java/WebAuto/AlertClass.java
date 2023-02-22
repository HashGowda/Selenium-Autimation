package WebAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.id("alertButton"));
        element.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        String text = driver.switchTo().alert().getText();
        System.out.println("Text : "+text);
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        Thread.sleep(2000);
        String text1=driver.switchTo().alert().getText();
        System.out.println("Text1 : "+text1);
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
