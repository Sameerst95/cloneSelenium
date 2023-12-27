package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws Exception{
        String filePath = System.getProperty("user.dir");
        //Retrieves the path from where the program is being executed
        System.out.println(filePath);
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get(filePath+"/test.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@name='alert']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='confirm']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='prompt']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("NIT 9PM");
        driver.switchTo().alert().dismiss();
        System.out.println(driver.switchTo().alert().getText());
    }
}
