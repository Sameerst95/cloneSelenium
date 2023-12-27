package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeDriver driver = new ChromeDriver();
//        FirefoxDriver driver1 = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//        driver.close();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
