package Framework.testCases;

import Framework.Functions.POMFrameworkFunctions;

import java.util.Properties;

public class sampleTestCase1 {
    public static void main(String[] args) throws Exception {
        POMFrameworkFunctions functions = new POMFrameworkFunctions();
        Properties p = POMFrameworkFunctions.readPropertyFile("sampleTestCase");
        String url = p.getProperty("url");
        String fName = p.getProperty("firstName");
        String sName = p.getProperty("secondName");
        functions.openBrowser();
        functions.openApplication(url);
        functions.clickCreateAccount();
        functions.enterFirstName(fName,5);
        functions.enterLastName(sName);
        functions.takeScreenshot(POMFrameworkFunctions.getCurrentDateTime());
    }
}
