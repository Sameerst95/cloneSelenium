package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int workingLink = 0;
        for(int i=0;i<links.size();i++){
//            System.out.println(links.get(i).getAttribute("href"));
            String link = links.get(i).getAttribute("href");
            try {
                URL url = new URL(link);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                if(con.getResponseCode()>399){
                    System.out.println(link+" is a broken link");
                }
                else if(con.getResponseCode()<400){
                    System.out.println(link + " is a working link");
                    workingLink++;
                }
                else{
                    System.out.println(link+" neither broken nor working");
                }
            }
            catch (Exception e){}
        }
        System.out.println("Total Working Links: "+workingLink );
    }
}
