package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir");
        //Retrieves the path from where the program is being executed
        System.out.println(filePath);
        System.setProperty("webdriver.chrome.driver", "");
        ChromeDriver driver = new ChromeDriver();
        driver.get(filePath + "/test.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('text').value='NIT9PM'"); //Alternative for sendKeys()
        js.executeScript("document.getElementById('Male').checked=true");
        js.executeScript("document.getElementById('checkbox').click()");
    }
}
