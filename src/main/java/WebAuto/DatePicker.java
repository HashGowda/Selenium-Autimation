package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;
import java.util.Set;

public class DatePicker {

    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        DatePicker datePick=new DatePicker();
        datePick.launchBrowser();
        datePick.datePicker();
        datePick.dateAndTime();
    }

    void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker");
        Thread.sleep(3000);
    }

    void datePicker() throws InterruptedException {
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        Thread.sleep(3000);

        WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
        Select select=new Select(month);
        select.selectByValue("6");
        Thread.sleep(3000);

        WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
        Select select1=new Select(year);
        select1.selectByVisibleText("1994");
        Thread.sleep(3000);

        WebElement day=driver.findElement(By.xpath("//*[text()='27']"));
        day.click();
        Thread.sleep(3000);

        WebElement date=driver.findElement(By.xpath("(//*[@type='text'])[1]"));
        String Date=date.getAttribute("value");
        System.out.println("Selected date : "+Date);
        Thread.sleep(3000);
        driver.quit();
    }

    void dateAndTime() throws InterruptedException {
        driver.findElement(By.id("dateAndTimePickerInput")).click();
        Thread.sleep(3000);

    }
}
