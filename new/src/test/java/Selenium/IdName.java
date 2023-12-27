package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdName {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement emailElement = driver.findElement(By.id("email"));
        emailElement.sendKeys("NIT9PM@gmail.com");

        WebElement passwordElement = driver.findElement(By.name("pass"));
        passwordElement.sendKeys("1234567890");

        System.out.println("Before login");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
