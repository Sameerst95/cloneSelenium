package Framework.Elements;

import Framework.Functions.POMFrameworkFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PFMElements {
    WebDriver driver;
    public PFMElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@id='search']")
    public WebElement youTubeSearchField;

    @FindBy(xpath="//button[@id='search-icon-legacy']")
    public WebElement youTubeSearchButton;

    @FindBy(xpath="//a[@id='video-title']")
    public WebElement firstResult;

    public void WaitPFM() throws InterruptedException{
        //This method waits for 5 Seconds by default
        Thread.sleep(5000);
    }

    public WebDriver openBrowserPFM() throws Exception {
        System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
        driver = new ChromeDriver();
        POMFrameworkFunctions.log().info("Opening the Chrome Browser");
        driver.manage().window().maximize();
        return driver;
    }

    public static Properties readPropertyFilePFM(String fileName) throws Exception{
        File file= new File(System.getProperty("user.dir")+"\\src\\test\\java\\Framework\\testData\\"+fileName+".properties");
        FileInputStream fis= new FileInputStream(file);
        POMFrameworkFunctions.log().info("The Data file is present here: "+file);
        Properties p = new Properties();
        p.load(fis);
        return p;
    }

    public void openApplicationPFM(String s) throws Exception {
        driver.get(s);
        POMFrameworkFunctions.log().info("We have opened the Application: "+s);
    }

    public void searchYouTube(String s){
        youTubeSearchField.sendKeys(s);
        youTubeSearchButton.click();
    }

    public void clickFirstResult(){
        firstResult.click();
    }

    public void closeTheBrowserPFM() throws Exception {
        POMFrameworkFunctions.log().info("Closing the Browser");
        driver.quit();
    }
}
