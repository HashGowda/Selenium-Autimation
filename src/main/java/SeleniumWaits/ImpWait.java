package SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImpWait {
    protected WebDriver driver;

    @Test
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void title(){
        String eTitle = "Demo Guru99 Page";
        String aTitle = "";

        //get the actual value of title
        aTitle = driver.getTitle();

        //compare the actual title with th expected title
        if (aTitle.equals(eTitle)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        driver.close();
    }
}
