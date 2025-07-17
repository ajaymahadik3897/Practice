package TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


// This class implements ITestListener to listen to test events in TestNG
// We use this class to generate an Extent Report for the test results
//we use ListnerExtentReport.xml file to run this class with the ExtentReoportManager.java  // we can run any test class with this listener to generate the report
public class ExtentReoportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;  // This is the reporter that generates the HTML report // UI reporter that generates the report in HTML format
    public ExtentReports extent;               // This is the main class that manages the report // it holds the configuration and the tests // populating common report information
    public ExtentTest test;                    // This is the class that represents a single test in the report // it is used to log the test events and results


    public void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter("C:\\Users\\mahadik.santosh\\Desktop\\QA Academy\\Practice\\Report\\ExtentReport.html"); // Initialize the Spark reporter with the report file name  //ExtentReport.html file will be generated in the specified path so everytime you run the tests, a same report will be update because we are using the same file name
        sparkReporter.config().setReportName("Automation Test Results"); // Set the report name
        sparkReporter.config().setDocumentTitle("Extent Report"); // Set the document title for the report
        sparkReporter.config().setTheme(Theme.STANDARD); // Set the theme for the report

        extent = new ExtentReports(); // Initialize the ExtentReports object
        extent.attachReporter(sparkReporter); // Attach the Spark reporter to the ExtentReports object

        extent.setSystemInfo("OS", "Windows 11"); // Set system information for the report
        extent.setSystemInfo("Browser", "Chrome"); // Set browser information for the report
        extent.setSystemInfo("Tester", "Santosh Mahadik"); // Set tester information for the report
        extent.setSystemInfo("Environment", "QA"); // Set environment information for the report
        System.out.println("Test started: " + context.getName()); // Log the start of the test
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new test in the report with the name of the test that passed
        test.pass("Test passed: " + result.getName()); // Log the success of the test
        test.log(Status.PASS, "Test passed: " + result.getName()); // Log the success of the test in the report
        System.out.println("Test passed: " + result.getName()); // Print to console
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new test in the report with the name of the test that failed
        test.fail("Test failed: " + result.getName()); // Log the failure of the test
        test.log(Status.FAIL, "Test failed: " + result.getName()); // Log the failure of the test in the report
        test.log(Status.FAIL, "Error: " + result.getThrowable().getMessage()); // Log the error message in the report
        System.out.println("Test failed: " + result.getName()); // Print to console
        System.out.println("Error: " + result.getThrowable().getMessage()); // Print error message to console
    }

    public void onTestSkipped(ITestResult result) {
       test = extent.createTest(result.getName()); // Create a new test in the report with the name of the test that was skipped
       test.log(Status.SKIP, "Test skipped: " + result.getName()); // Log the skip event in the report
    }

    public void onFinish(ITestContext context) {
        extent.flush(); // Flush the report to write all the logs to the report file
        System.out.println("Test finished: " + context.getName()); // Print to console
        System.out.println("Extent Report generated successfully!"); // Print success message to console

    }
}
