package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    // This class demonstrates the use of TestNG's dependsOnMethods feature //if dependent methods are not executed if the method they depend on fails //this is useful for controlling the execution flow of tests based on the success or failure of previous tests
   //if we are not use dependsOnMethods then all the tests will be executed //there is no control over the execution flow of tests //if a test fails, the subsequent tests will still be executed //this can lead to false positives in test results //and make it difficult to identify the root cause of failures

    @Test (priority = 1)   // This test will run first //set the priority to 1 so that it runs before the Login test
    public void OpenApp () {
        System.out.println("Search method executed.");
        Assert.fail();   // This will cause the test to fail // and prevent the dependent tests from running
    }

    @Test (priority = 2 , dependsOnMethods = {"OpenApp"})  // This test will only run if OpenApp passes // and will be skipped if OpenApp fails
    public void Login () {
        System.out.println("Login method executed.");
    }

    @Test(priority = 3, dependsOnMethods = {"Login","OpenApp"})  // This test will only run if Login and OpenAPP passes // and will be skipped if Login fails
    //if any of the dependent methods fail, this test will be skipped
    public void Search () {
        System.out.println("Search method executed.");
        //Assert.fail();    //from here the test will fail // and prevent the Logout test from running //not afect the Login test because it is not dependent on Search
    }
    @Test(priority = 4, dependsOnMethods = {"Search"})  // This test will only run if Search passes // and will be skipped if Search fails
    public void Logout () {
        System.out.println("Logout method executed.");
    }

    // The output will show that the OpenApp test fails, and as a result, the Login, Search, and Logout tests will be skipped.
    // This demonstrates how TestNG's dependsOnMethods feature works, allowing you to control the execution flow of your tests based on the success or failure of previous tests.
}
