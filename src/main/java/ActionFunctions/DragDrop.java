package ActionFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        DragDrop dragDrop = new DragDrop();
        dragDrop.launchBrowser();
        dragDrop.dragDrop();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(2000);
    }

    void dragDrop() throws InterruptedException {
        WebElement source = driver.findElement(By.id("box4"));
        WebElement target = driver.findElement(By.xpath("//div[text()='Denmark']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).build().perform();

        Thread.sleep(2000);
        WebElement target1 = driver.findElement(By.id("capitals"));
        actions.dragAndDrop(source, target1).perform();
        driver.quit();
    }
}
