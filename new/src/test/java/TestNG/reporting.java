package TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reporting {

    ExtentHtmlReporter reporter;
    ExtentReports reports;
    ExtentTest tests;

    @BeforeTest
    public void generateReport(){
        reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\report.html");
        reports = new ExtentReports();
        reports.attachReporter(reporter);
        reporter.config().setChartVisibilityOnOpen(true);
        reporter.config().setDocumentTitle("Sample Report");
        reporter.config().setReportName("Sample Report");
        reporter.config().setTestViewChartLocation(ChartLocation.TOP);
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    @Test
    public void a(){
        tests = reports.createTest("Test");
        System.out.println("Hello");
    }

    @AfterTest
    public void b(){
        reports.flush();
    }
    @AfterMethod
    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            tests.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            tests.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            tests.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
            tests.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            tests.skip(result.getThrowable());
        }
    }

}
