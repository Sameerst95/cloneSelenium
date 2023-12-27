package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTagName {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/");
        driver.manage().window().maximize();
        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        System.out.println(inputElements.size());
        WebElement element = driver.findElement(By.className("chkavailabilityBtn"));
        element.click();
    }
}
