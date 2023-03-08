package Framework2;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return dr.get();
    }

    public static void setDriver(WebDriver driver){
        dr.set(driver);
    }
}
