package Framework.testCases;

import Framework.Elements.PFMElements;
import Framework.Functions.POMFrameworkFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002_openYouTubeAndSearch {
    WebDriver driver;

    PFMElements pfmElements;
    @BeforeMethod
    public void startBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
        driver = new ChromeDriver();
        POMFrameworkFunctions.log().info("Opening the Chrome Browser");
        driver.manage().window().maximize();
    }

    @Test
    public void TC002() throws Exception{
        pfmElements = new PFMElements(driver);
        pfmElements.openApplicationPFM(POMFrameworkFunctions.readPropertyFile("ObjectRepository").getProperty("URL"));
        pfmElements.searchYouTube("News");
        pfmElements.WaitPFM();
        pfmElements.clickFirstResult();
    }

    @AfterMethod
    public void stopBrowser() throws Exception {
        pfmElements.closeTheBrowserPFM();
    }
}
