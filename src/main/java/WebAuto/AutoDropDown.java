package WebAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutoDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[text()='1 Adult']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']")).click();
//        Thread.sleep(2000);
        WebElement currency = driver.findElement(By.xpath("//div[text()='Currency']"));
        currency.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='EUR']")).click();
//        Actions keyDown = new Actions(driver);
//        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
//        Thread.sleep(4000);
//        Select select = new Select(currency);
//        List<WebElement> list = select.getOptions();
//        for (WebElement opt:list){
//            System.out.println(opt.getText());
//        }
//        select.selectByVisibleText("EUR");
//        select.selectByIndex(3);
        System.out.println("Currency has been selected");
        Thread.sleep(2000);
        driver.close();
    }
}
