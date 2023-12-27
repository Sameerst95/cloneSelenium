package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkPartialLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Store")).click();
    }
}
