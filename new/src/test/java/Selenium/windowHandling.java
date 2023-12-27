package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandling {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Instagram")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        String window = driver.getWindowHandle();
        System.out.println(window);

        Set<String> windows = driver.getWindowHandles();

        for(String s: windows){
            driver.switchTo().window(s);
            Thread.sleep(5000);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            driver.close();
        }
    }
}
