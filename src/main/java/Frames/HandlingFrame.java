package Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        HandlingFrame h = new HandlingFrame();
        h.launch();
        h.handleFrames();
    }

    void launch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
    }
    void handleFrames() throws InterruptedException {
        WebElement frame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Heading : "+text);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[text()='Alerts']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
