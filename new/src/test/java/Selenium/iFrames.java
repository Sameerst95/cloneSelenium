package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir");
        //Retrieves the path from where the program is being executed
        System.out.println(filePath);
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get(filePath + "/test.html");
        driver.manage().window().maximize();
//        driver.switchTo().frame(0); //Switching based on index of iframe
//        driver.switchTo().frame("iFrame"); //Switching based on name attribute's value of iframe tag
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iFrame']")));
        driver.findElement(By.xpath("//input[@id='IframeText']")).sendKeys("NIT9PM");
        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='checkbox']")).click();
    }
}
