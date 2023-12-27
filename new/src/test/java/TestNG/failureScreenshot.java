package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class failureScreenshot {

    ChromeDriver driver;
    @Test
    void a(){
        System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Assert.assertTrue(driver.getTitle().contains("abcd"));
    }

    @AfterMethod
    void takeAScreenshot(ITestResult result) throws Exception{
        if(result.getStatus()==ITestResult.FAILURE){
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            System.out.println(source);
            FileUtils.copyFile(source, new File("./failure.png"));
        }
    }
}
