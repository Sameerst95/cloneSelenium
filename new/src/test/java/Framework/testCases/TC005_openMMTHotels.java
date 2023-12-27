package Framework.testCases;

import Framework.Functions.POMFrameworkFunctions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC005_openMMTHotels {
    POMFrameworkFunctions fwf = new POMFrameworkFunctions();
    @BeforeMethod
    public void startBrowser() throws Exception {
        fwf.openBrowser();
    }

    @Test
    public void TC005() throws Exception {
        fwf.openApplication("https://www.makemytrip.com/");
        fwf.WaitWithTime(5);
        fwf.switchToMMTIFrame();
        fwf.closeMMTIFrame();
        fwf.WaitWithTime(5);
        fwf.goToHotelsPage();
        fwf.enterMobileNumberOnMMT("0123456789");
        fwf.takeScreenshot("TC005"+POMFrameworkFunctions.getCurrentDateTime());
    }

    @AfterMethod
    public void stopBrowser() throws Exception {
        fwf.closeTheBrowser();
    }
}
