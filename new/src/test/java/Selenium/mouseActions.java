package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        Actions actions = new Actions(driver);
        Action action = actions.sendKeys(email,"NIT9PM")
                .doubleClick().contextClick().build();
        action.perform();
        driver.navigate().to("https://www.amazon.in/");
        WebElement imdb = driver.findElement(By.xpath("//a[text()='IMDb']"));
        action = actions.moveToElement(imdb).build();
        action.perform();
        imdb.click();
        driver.navigate().to("https://emicalculator.net/");
        WebElement amount = driver.findElement(By.xpath("//div[@id='loanamountslider']"));
        action = actions.dragAndDropBy(amount,50,0).build();
        action.perform();
    }
}
/*
Mouse Actions:

click()
contextClick() - right click
clickAndHold(), release()
doubleClick()
moveToElement()
dragAndDrop()
dragAndDropBy()
 */