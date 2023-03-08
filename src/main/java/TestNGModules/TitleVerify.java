package TestNGModules;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TitleVerify {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void verifyTitle(){
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        assertEquals(actualTitle,expectedTitle);
        System.out.println("Actual title is "+actualTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
