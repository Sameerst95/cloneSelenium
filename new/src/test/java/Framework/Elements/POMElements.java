package Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMElements {
    WebDriver driver;
    public POMElements(WebDriver driver){
        this.driver=driver;
    }

    public static final By userName=By.xpath("//input[@id='email']");
    public static final By password=By.xpath("//input[@id='pass']");
    public static final By loginButton=By.xpath("//button[@name='login']");
    public static final By createAccount=By.xpath("//a[@data-testid='open-registration-form-button']");
    public static final By firstName=By.xpath("//input[@name='firstname']");
    public static final By lastName=By.xpath("//input[@name='lastname']");
    public static final By closePopUp = By.xpath("//i[contains(@class,'close')]");
    public static final By mmtCloseBtn = By.xpath("//a[@class='close']");
    public static final By mmtIFrame = By.xpath("//iframe[contains(@title,'notification')]");
    public static final By flights = By.xpath("//li[@data-cy = 'menu_Flights']");
    public static final By hotels = By.xpath("//li[@data-cy = 'menu_Hotels']");
    public static final By trains = By.xpath("//li[@data-cy = 'menu_Trains']");
    public static final By buses = By.xpath("//li[@data-cy = 'menu_Buses']");
    public static final By cabs = By.xpath("//li[@data-cy = 'menu_Cabs']");
    public static final By oneWayTrip = By.xpath("//li[@data-cy = 'oneWayTrip']");
    public static final By roundTrip = By.xpath("//li[@data-cy = 'roundTrip']");
    public static final By multiCityTrip = By.xpath("//li[@data-cy = 'mulitiCityTrip']");
    public static final By phoneNumber = By.xpath("//input[contains(@placeholder,'Enter Mobile')]");
    public static final By getAppLink = By.xpath("//button[@class='getAppLinkBtn']");
    public static final By checkPNR = By.xpath("//span[@data-cy='checkPnrStatus']");
    public static final By enterPNR = By.xpath("//input[@data-cy = 'enterPnr']");
    public static final By PNRStatusButton = By.xpath("//a[contains(@data-cy,'checkStatus')]");
    public static final By fromCityFlight = By.xpath("//input[@data-cy = 'fromCity']");
    public static final By toCityFlight = By.xpath("//input[@data-cy = 'toCity']");
    public static final By searchFlight = By.xpath("//a[text()='Search']");
    public static final By phonenumber = By.xpath("//input[@aria-label='Mobile number or email address']");
    public static final By newpassword = By.xpath("//input[@autocomplete='new-password']");
    public static final By Gender = By.xpath("//input[@value='2']");
    public static final By Day = By.xpath("//select[@id='day']");
    public static final By Month = By.xpath("//select[@id='month']");
    public static final By Year = By.xpath("//select[@id='year']");

}
