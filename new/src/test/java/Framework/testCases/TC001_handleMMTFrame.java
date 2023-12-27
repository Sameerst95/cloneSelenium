package Framework.testCases;

import Framework.Functions.POMFrameworkFunctions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001_handleMMTFrame {

    POMFrameworkFunctions fwf = new POMFrameworkFunctions();
    @BeforeMethod
    public void startBrowser() throws Exception {
        fwf.openBrowser();
    }

    @Test
    public void TC001() throws Exception{
        fwf.openApplication("https://www.makemytrip.com/");
        fwf.WaitWithTime(5);
        fwf.switchToMMTIFrame();
        fwf.closeMMTIFrame();
        fwf.WaitWithTime(5);
        fwf.enterMobileNumberOnMMT("1234567890");
        fwf.takeScreenshot("TC001"+POMFrameworkFunctions.getCurrentDateTime());
    }

    @AfterMethod
    public void stopBrowser() throws Exception {
        fwf.closeTheBrowser();
    }
}
