package TestNG;

import TestNG.ParallelEx1;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParallelEx2 extends ParallelEx1 {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='JAVA']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='JAVA']")).click();
        Thread.sleep(2000);
    }
}
