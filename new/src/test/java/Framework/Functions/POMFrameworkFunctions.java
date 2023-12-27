package Framework.Functions;

import Framework.Elements.PFMElements;
import Framework.Elements.POMElements;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalTime;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static Framework.Elements.PFMElements.*;
import static Framework.Elements.POMElements.*;

public class POMFrameworkFunctions {

    WebDriver driver;

//    public frameworkFunctions(WebDriver driver){this.driver = driver;}

    public void openBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver","");
        driver = new ChromeDriver();
        log().info("Opening the Chrome Browser");
        driver.manage().window().maximize();
    }

    public void enterFBUserName(String uname){
        driver.findElement(userName).sendKeys(uname);
    }
    public void enterFBPwd(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickFBLogin(){
        driver.findElement(loginButton).click();
    }

    public static Properties readPropertyFile(String fileName) throws Exception{
        File file= new File(System.getProperty("user.dir")+"\\src\\test\\java\\Framework\\testData\\"+fileName+".properties");
        FileInputStream fis= new FileInputStream(file);
        log().info("The file is present here: "+file);
        Properties p = new Properties();
        p.load(fis);
        return p;
    }

    public static String getCurrentDateTime(){
        System.out.println(LocalTime.now().toString().replace(".","-").replace(":","-"));
        return "-"+LocalTime.now().toString().replace(".","-").replace(":","-");
    }

    public void openApplication(String s) throws Exception {
        driver.get(s);
        log().info("We have opened the Application: "+s);
    }

    public static Logger log() throws Exception{
        Properties props = new Properties();
        props.load(new FileInputStream("src/log4j.properties"));
        PropertyConfigurator.configure(props);
        BasicConfigurator.configure();
        return Logger.getLogger(POMFrameworkFunctions.class.getName());
    }

    public void clickCreateAccount() throws Exception{
        driver.findElement(createAccount).click();
        log().info("Clicked on Create Account button");
    }

    public void enterFirstName(String s) throws Exception{
        driver.findElement(firstName).sendKeys(s);
        log().info("Entered are the First name as "+s);
    }

    public void enterLastName(String s) throws Exception{
        driver.findElement(lastName).sendKeys(s);
        log().info("Entered are the Last name as "+s);
    }

    public void enterFirstName(String s, int waitTime){
        WebDriverWait wait= new WebDriverWait(driver,waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(s);
    }

    public void Wait() throws InterruptedException{
        //This method waits for 30 Seconds by default
        Thread.sleep(30000);
    }

    public void WaitWithTime(int timeInSeconds) throws InterruptedException{
        //This method wait for any number of seconds of our choice
        Thread.sleep((timeInSeconds)* 1000L);
    }

    public void randomClick(){
        Actions actions = new Actions(driver);
        Action builder =  actions.moveByOffset(10,10).click().build();
        builder.perform();
    }

    public void goToHotelsPage() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(hotels))).click();
        Assert.assertTrue(driver.getTitle().contains("Hotel"));
        log().info("The Hotels Page is opened");
    }

    public void goToFlightsPage() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(flights))).click();
        Assert.assertTrue(driver.getTitle().contains("Flight"));
        log().info("The Flights Page is opened");
    }

    public void goToTrainsPage() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(trains))).click();
        Assert.assertTrue(driver.getTitle().contains("Train"));
        log().info("The Trains Page is opened");
    }

    public void typeUsingJavaScript(String Id, String value, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementByClassName("+Id+").value("+value+")", element);
    }

    public JavascriptExecutor javascriptExecutor(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        return executor;
    }
    public void checkPNR(String PNR) throws Exception {
        log().info("PNR to check for the status : " + PNR);
        driver.findElement(checkPNR).click();
        WaitWithTime(5);
        driver.findElement(enterPNR).sendKeys(PNR);
        driver.findElement(PNRStatusButton).click();
    }

    public void selectATrip(String typeOfTrip) throws Exception {
        if(typeOfTrip.equalsIgnoreCase("one way trip")){
            driver.findElement(oneWayTrip).click();
            log().info("One Way Trip Selected");
        }

        else if(typeOfTrip.equalsIgnoreCase("round trip")){
            driver.findElement(roundTrip).click();
            log().info("Round Trip Selected");
        }

        else{
            driver.findElement(multiCityTrip).click();
            System.out.println("Multi City Trip Selected");
        }
    }

    public void selectCity(String CityName, String place){
        Actions actions = new Actions(driver);
        if(place.equalsIgnoreCase("from")){
            driver.findElement(fromCityFlight).click();
            driver.findElement(fromCityFlight).sendKeys(CityName);
            Action builder = actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).build();
            builder.perform();
        }

        else{
            driver.findElement(toCityFlight).click();
            driver.findElement(toCityFlight).sendKeys(CityName);
            Action builder = actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).build();
            builder.perform();
        }
    }

    public void searchForFlight(String CityName, String place){
        selectCity(CityName, place);
        driver.findElement(searchFlight).click();
        List<WebElement> flights = driver.findElements(By.xpath("//div[@class='listingCard']"));
        System.out.println("We have found "+flights.size()+" for you");
    }

    public WebElement moveToElement(By element) throws InterruptedException{
        Thread.sleep(3000);
        WebElement newElement =  webDriverWait(30).until(ExpectedConditions.visibilityOf(driver.findElement(element)));
        javascriptExecutor().executeScript("arguments[0].scrollIntoView",newElement);
        return newElement;
    }

    public WebDriverWait webDriverWait(int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        return wait;
    }

    public void enterMobileNumberOnMMT(String mobileNumber) throws InterruptedException{
        moveToElement(phoneNumber).sendKeys(mobileNumber);
        Thread.sleep(3000);
        webDriverWait(30).until(ExpectedConditions.visibilityOf(driver.findElement(getAppLink))).click();
    }

    public void switchToMMTIFrame() throws Exception{
        driver.switchTo().frame(driver.findElement(mmtIFrame));
        log().info("Switched to MMT Iframe");
    }

    public void closeMMTIFrame(){
        driver.findElement(mmtCloseBtn).click();
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void comeOutOfFrames(){
        driver.switchTo().defaultContent();
    }

    public void takeScreenshot(String fileName) throws Exception{
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        String destination = "./"+fileName+".jpg";
        FileUtils.copyFile(file,new File(destination));
        log().info("Screenshot name is "+fileName+" and is present here: "+destination);
    }
    public void enterMobileNumberOnFB(String mobilenumber)throws Exception{
        driver.findElement(phonenumber).sendKeys(mobilenumber);
        log().info("Entered Mobile Number is : "+mobilenumber);
    }
    public void createNewPassword(String Newpassword)throws Exception{
        driver.findElement(newpassword).sendKeys(Newpassword);
        log().info("Entered New Password as : "+Newpassword);
    }
    public void selectGender(){
        driver.findElement(Gender).click();
    }
    public void selectBirthday(String s) throws Exception {
        Select selectDay = new Select(driver.findElement(Day));
        Select selectMonth = new Select(driver.findElement(Month));
        Select selectYear = new Select(driver.findElement(Year));
        if (s.equalsIgnoreCase("Index")) {
            selectDay.selectByIndex(Integer.parseInt(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("day")));
            selectMonth.selectByIndex(Integer.parseInt(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("month")));
            selectYear.selectByIndex(Integer.parseInt(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("year")));
        }
        if (s.equalsIgnoreCase("VisibleText")){
            selectDay.selectByVisibleText(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("dob"));
            selectMonth.selectByVisibleText(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("mob"));
            selectYear.selectByVisibleText(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("yob"));
        }
        if (s.equalsIgnoreCase("Value")) {
            selectDay.selectByValue(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("dayvalue"));
            selectMonth.selectByValue(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("monthvalue"));
            selectYear.selectByValue(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("yearvalue"));
        }
    }

    public void closeTheBrowser() throws Exception {
        log().info("Closing the Browser");
        driver.quit();
    }


}
