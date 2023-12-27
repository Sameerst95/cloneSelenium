package Framework.testCases;

import Framework.Functions.POMFrameworkFunctions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004_openFBAndLogin {
    POMFrameworkFunctions fwf = new POMFrameworkFunctions();
    @BeforeMethod
    public void startBrowser() throws Exception {
        fwf.openBrowser();
    }

    @Test
    public void TC004() throws Exception{
        fwf.openApplication("https://www.facebook.com/");
        fwf.enterFBUserName(POMFrameworkFunctions.readPropertyFile("TC004").getProperty("userName"));
        fwf.enterFBPwd(POMFrameworkFunctions.readPropertyFile("TC004").getProperty("password"));
        fwf.clickFBLogin();
        fwf.takeScreenshot("TC004"+POMFrameworkFunctions.getCurrentDateTime());
    }

    @AfterMethod
    public void stopBrowser() throws Exception {
        fwf.closeTheBrowser();
    }
}
