package Framework.testCases;

import Framework.Functions.POMFrameworkFunctions;

public class sampleTestCase {
    public static void main(String[] args) throws Exception{
        POMFrameworkFunctions functions = new POMFrameworkFunctions();
        functions.openBrowser();
        functions.openApplication("https://www.facebook.com/");
        functions.clickCreateAccount();
        functions.enterFirstName("NIT9PM",5);
        functions.enterLastName("9PM October 2023");
        functions.takeScreenshot("FB Register");
    }
}
