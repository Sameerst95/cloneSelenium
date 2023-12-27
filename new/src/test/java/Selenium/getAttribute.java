package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement gamesElement = driver.findElement(By.xpath("//a[text()='Games']"));
        System.out.println(gamesElement.getAttribute("title"));
    }
}
