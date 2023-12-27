package Framework.testCases;

import Framework.Functions.POMFrameworkFunctions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC003_openFBAndRegister {
    POMFrameworkFunctions fwf = new POMFrameworkFunctions();
    @BeforeMethod
    public void startBrowser() throws Exception {
        fwf.openBrowser();
    }

    @Parameters("lastName")
    @Test
    public void TC003(String s) throws Exception{
        fwf.openApplication(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("URL"));
        fwf.clickCreateAccount();
        fwf.WaitWithTime(5);
        fwf.enterFirstName(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("firstName"));
        fwf.enterLastName(s);
        fwf.enterMobileNumberOnFB(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("phonenumber"));
        fwf.createNewPassword(POMFrameworkFunctions.readPropertyFile("TC003").getProperty("newpassword"));
        fwf.selectGender();
        fwf.selectBirthday("value");
        fwf.takeScreenshot("TC003"+POMFrameworkFunctions.getCurrentDateTime());
    }

    @AfterMethod
    public void stopBrowser() throws Exception {
        fwf.closeTheBrowser();
    }
}
