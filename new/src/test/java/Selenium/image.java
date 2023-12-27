package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class image {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/electricity-bill-payment");
        driver.manage().window().maximize();
        String url1 = driver.getCurrentUrl();
        String title1 = driver.getTitle();
        WebElement imgElement = driver.findElement(By.xpath("//a[contains(@href,'/')]"));
        imgElement.click();
        String url2 = driver.getCurrentUrl();
        String title2 = driver.getTitle();
        Assert.assertNotEquals(url1,url2);
        Assert.assertNotEquals(title1,title2);
        System.out.println("Test Case has passed");
    }
}
