package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
        Actions actions = new Actions(driver);
        Action action = actions.sendKeys(email,"NIT9PM")
                .keyDown(Keys.CONTROL).sendKeys("a")
                .sendKeys("c").keyUp(Keys.CONTROL).click(pwd)
                .keyDown(Keys.CONTROL).sendKeys("v").build();
        action.perform();
    }
}

/*
Keyboard Actions

sendKeys() - type
keyDown() - Pressing the key
keyUp() - Releasing the key
 */