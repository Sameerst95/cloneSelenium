package Skeerti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class menuList {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/siddhu/IdeaProjects/PracticeJavaPrograms/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        List<WebElement> li = driver.findElements(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_')]"));

        System.out.println("Total no of elements in the top menu:"+li.size());
        System.out.println("List of elements:");
        for(WebElement w:li)
            System.out.print(w.getText()+"\t");

    }
}