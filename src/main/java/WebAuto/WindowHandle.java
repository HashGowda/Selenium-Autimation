package WebAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/popup.php");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();
        String mainWindow = driver.getWindowHandle();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> itr = window.iterator();

        while (itr.hasNext()) {
            String childWindow = itr.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                Thread.sleep(2000);
                driver.findElement(By.name("emailid")).sendKeys("testuser@gmail.com");
                Thread.sleep(2000);
                driver.findElement(By.name("btnLogin")).click();
                Thread.sleep(2000);
            }
        }

            driver.switchTo().window(mainWindow);
            Thread.sleep(3000);
            driver.close();
        }
    }

