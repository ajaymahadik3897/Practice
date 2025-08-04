package TestNG.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() throws InterruptedException {
        POMClass pom = new POMClass(driver);  // Create an instance of the POMClass with the WebDriver

        // Enter username and password using the POM methods
        pom.enterUsername("student");    // method comes from POMClass.java
        pom.enterPassword("Password123");  // method comes from POMClass.java

        // Click the submit button
        pom.clickSubmit();   // method comes from POMClass.java

        // Optionally, you can add assertions to verify successful login
        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/" ); // Verify the URL after login
        System.out.println("Login successful, current URL: " + driver.getCurrentUrl());
        Thread.sleep(2000); // Adding a sleep to ensure the page loads completely before assertions
    }

    @AfterClass
    public void tearDown() {

            driver.quit();

    }
}
