package TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// this class implements ITestListener to listen to test events in TestNG
// we use this class to log the test events like test start, test success, test failure, etc.
// we use this Listener class for ListenersTestClass.java
// Listeners.xml file is used to run this Listeners for ListnersTestClass.java

public class ListnerClass implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("Test started: " + context.getName());
    }
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
        System.out.println("Error: " + result.getThrowable().getMessage());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
        System.out.println("Reason: " + result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext context) {

        System.out.println("Test finished: " + context.getName());
    }

}
