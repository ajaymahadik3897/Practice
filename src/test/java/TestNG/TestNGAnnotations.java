package TestNG;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @Test()  // TestNG annotation to mark this method as a test method
    public void ATest() {
        System.out.println("Test A is executed.");
    }

    @Test()  // Another test method
    public void BTest() {
        System.out.println("Test B is executed.");
    }

    @BeforeTest()  // This method will run before any test methods in the class
    public void beforeTest() {
        System.out.println("This is executed before the test methods.");
    }
    @AfterTest()  // This method will run after all test methods in the class
    public void afterTest() {
        System.out.println("This is executed after the test methods.");
    }

    @BeforeClass()  // This method will run before the class is loaded
    public void beforeClass() {
        System.out.println("This is executed before the class.");
    }
    @AfterClass() // This method will run after the class is loaded
    public void afterClass() {
        System.out.println("This is executed after the class.");
    }
    @BeforeMethod()  // This method will run before each test method
    public void beforeMethod() {
        System.out.println("This is executed before each test method.");
    }
    @AfterMethod()  // This method will run after each test method
    public void afterMethod() {
        System.out.println("This is executed after each test method.");
    }
    @BeforeSuite() // This method will run before the test suite starts
    public void beforeSuite() {
        System.out.println("This is executed before the test suite.");
    }
    @AfterSuite() // This method will run after the test suite ends
    public void afterSuite() {
        System.out.println("This is executed after the test suite.");
    }

}
