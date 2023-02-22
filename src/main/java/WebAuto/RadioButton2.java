package WebAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        //to click the radio buttons
        WebElement radioBtn1 = driver.findElement(By.xpath("//*[text()='Male']"));
        radioBtn1.click();
        System.out.println("Radio button 1 clicked successfully");
        Thread.sleep(2000);
        WebElement radioBtn2 = driver.findElement(By.xpath("//*[text()='Music']"));
        radioBtn2.click();
        System.out.println("Radio button 1 clicked successfully");
        Thread.sleep(2000);

        //to select the dropdown
        WebElement list =driver.findElement(By.xpath("//*[text()='Select State']"));
        list.click();
        System.out.println("Dropdown clicked successfully");
        driver.findElement(By.xpath("//*[text()='Haryana']")).click();
//        Thread.sleep(2000);
//        Select select = new Select(list);
//        select.selectByVisibleText("Haryana");
        System.out.println("State has been selected successfully");
        Thread.sleep(2000);
        driver.close();
    }
}
