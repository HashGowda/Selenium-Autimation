package ClassRobot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClass2 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.ENTER); //simulate pressing Enter key
        Thread.sleep(2000);

        //simulate scrolling down the page
        Robot robot = new Robot();
        robot.mouseWheel(1);

        //simulate copying text to clipboard
        StringSelection selection = new StringSelection("Hello World!");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        //simulate pasting text from clipboard
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        driver.close();
    }
}
