package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    public void Setup() {
        System.out.println("This is a setup method that runs before any test methods.");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
// This class demonstrates the use of TestNG's DataProvider feature // DataProvider allows you to run the same test method with different sets of data
// This is useful for testing the same functionality with multiple inputs // and helps in reducing code duplication // The DataProvider can be used to supply parameters to test methods // and can be defined in the same class or in a separate class
    @Test (dataProvider = "dp")  // This test method uses the DataProvider named "dp"
    public void Login(String Username , String Password ) throws InterruptedException {  // This method takes two parameters: Username and Password . it will be called multiple times with different sets of data provided by the DataProvider
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys(Username);  // This line finds the username input field by its ID and enters the provided Username
        driver.findElement(By.name("password")).sendKeys(Password);  // This line finds the password input field by its name and enters the provided Password
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.xpath("//*[text()='Logged In Successfully']")).isDisplayed(); // This line checks if the text "Logged In Successfully" is displayed on the page
        Thread.sleep(2000);
            if (status == true){  // If the text is displayed, it means the login was successful

                driver.findElement(By.linkText("Log out")).click();
                System.out.println("Login successful with Username: " + Username + " and Password: " + Password);
                Thread.sleep(2000);

                Assert.assertTrue(true); // This assertion passes if the login was successful
            }
            else {
                Assert.fail();
            }
    }

    @AfterClass
    public void TearDown() {
        driver.quit();
    }

    @DataProvider(name = "dp")  // This is the name of the DataProvider
     // @DataProvider(name = "dp" , indices = {1 ,2})  -- This can be used to specify which rows of data to use from the DataProvider. only the rows with indices 1 and 2 will be used for the test method


    Object[][] logindata() {    // This method returns a 2D Object array containing the test data // Object[][] is a 2D array where each row represents a set of parameters for a test method  //we can add as many rows as we want //each row can have different data types, such as String, int, etc.

        Object data [][] ={ {"Ajay" , "Pass123"}, //everytime we use 2D array for Dataprovider
                {"Vijayay" , "Pass12113"},
                {"student" , "Password123"},
                {"Ram" , "Pass12300"},
                {"student" , "Password123"}

        };
        return data;  // This returns the 2D Object array to the DataProvider

    }

}
