package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(3000);
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));

        day.selectByValue("12");
        month.selectByIndex(9);
        year.selectByVisibleText("1979");
    }
}
