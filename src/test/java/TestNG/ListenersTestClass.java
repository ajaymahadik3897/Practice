package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


// we use this class to run the tests with TestNG listeners
// this class will run the tests and log the test events using the ListnerClass.java
// Listners.xml file is used to run this class with the ListnerClass.java



//without xml file, we can use the @Listeners annotation to link the ListnerClass to this test class as per below
// @Listeners(Package.ListenerClassname.class)
// @Listeners(TestNG.ListnerClass.class) // This annotation links the ListnerClass to this test class
public class ListenersTestClass {

    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {

        driver = new ChromeDriver(); // Assuming ChromeDriver is set up in your environment
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        Thread.sleep(2000); // Adding a sleep to ensure the page loads completely before tests run
    }

    @Test(priority = 1)
    public void VerifyLogo() {
        boolean status = driver.findElement(By.xpath("//a[@class='custom-logo-link']")).isDisplayed();
        Assert.assertEquals(status, true);  // Using Assert.assertEquals for better readability
    }

    @Test (priority = 2)
    public void Title() {
        Assert.assertEquals(driver.getTitle(), " Practice Test Automation");
    }

    @Test (priority = 3 , dependsOnMethods = "Title") // This test will run after VerifyLogo
    public void VerifyUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");
    }

    @AfterClass
    public void TearDown() {

        driver.quit();
    }

}



