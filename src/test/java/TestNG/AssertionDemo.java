package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

    @Test
    void TestAssertion(){  //Assertion shows test result in the console // if the assertion is true, the test will pass and print the success message
        //Hard Assert - it will stop the execution of the test if the assertion fails
        String expected = "Hello World";  // Expected value
        String actual = "Hello King";  // Intentionally incorrect to demonstrate assertion failure

       // Assert.assertEquals(expected , actual);  // Assertion to compare expected and actual values //if both values are not equal, the test will fail // and an AssertionError will be thrown

     if (expected.equals(actual)){
            System.out.println("Assertion passed: " + expected + " equals " + actual);  // This will print the success message
            Assert.assertTrue(true);  // This will pass the test  // if the assertion is true, the test will pass
     }
        else {
                System.out.println("Assertion failed: " + expected + " does not equal " + actual);  // This will print the failure message
                Assert.assertFalse(true);  // This will fail the test  // if the assertion is false, the test will fail
            }
        //if we are not use assertion then test will pass even if the expected and actual values are not equal becz it shows only failure message in the console but when we use assertion then it will show the test result in the console
        System.out.println("This line will not execute if the assertion fails.");  // This will not print if the assertion fails
    }

    @Test
    void TestAssertion2(){
        //Soft Assert - it will not stop the execution of the test if the assertion fails
        String expected = "Hello World";  // Expected value
        String actual = "Hello King";  // Intentionally incorrect to demonstrate assertion failure

        SoftAssert softAssert = new SoftAssert();  // Create an instance of SoftAssert
        softAssert.assertEquals(expected, actual);  // Assertion to compare expected and actual values //if both values are not equal, the test will fail // and an AssertionError will be thrown
        System.out.println("This line will still execute even if the assertion fails.");  // This will print the message even if the assertion fails

        softAssert.assertAll();  // This will report all assertion failures at the end of the test
    }
}
