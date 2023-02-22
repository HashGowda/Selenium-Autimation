package ClassRobot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class RobotClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
