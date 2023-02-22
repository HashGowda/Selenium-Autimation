package WebAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(2000);

        //to click the radio button
        WebElement radioBtn = driver.findElement(By.xpath("//*[text()='Yes']"));
        radioBtn.click();
        System.out.println("Radio button has been selected");
        Thread.sleep(2000);

        //to print the message that displays after clicking the radio button
        WebElement txt = driver.findElement(By.xpath("//*[@class='mt-3']"));
        Thread.sleep(2000);
        String msg = txt.getText();
        System.out.println("Message : "+msg);
        Thread.sleep(2000);
        driver.close();
    }
}
