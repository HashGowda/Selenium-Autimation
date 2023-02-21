package Dropdown;

import ActionFunctions.DragDrop;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        DropDown dropDown = new DropDown();
        dropDown.launchBrowser();
        dropDown.handleDropdown();
        dropDown.handleBySelectClass();
        dropDown.handleDropdownSugg();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
    }

    void handleDropdown() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Select Option']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='A root option']")).click();
        Thread.sleep(2000);
    }

    void handleBySelectClass() throws InterruptedException {
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(element);
        select.selectByVisibleText("Indigo");
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("5");
        Thread.sleep(2000);
    }

    void handleDropdownSugg() throws InterruptedException {
        List<WebElement> list = driver.findElements(By.id("oldSelectMenu"));
        for (int i=0; i<list.size();i++){
            String colors = list.get(i).getText();
            System.out.println("Colors list:\n"+colors);
            Thread.sleep(2000);
        }
    }
}
