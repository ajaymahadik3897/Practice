package TestNG;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// This code will run by using a xml file (ParameterizationA.xml) to pass the parameters
// We run multiple browser parallelly using TestNG


public class Parameterization {
    WebDriver driver;
    @BeforeClass
    @Parameters ({"browser"})  // This is used to get the browser name from the xml file
    public void Setup(String br) {   // Sting br is used to get the browser name (value) from the xml file // this is parameterization

        switch(br) {  // Switch is used to select the browser based on the value passed from the xml file
            case "chrome": driver = new ChromeDriver(); break;
            case "firefox": driver = new FirefoxDriver(); break;
            case "edge": driver = new EdgeDriver(); break;
            default: System.out.println("Browser not supported"); return;  // If the browser is not supported, it will print the message and return without executing the test
              //return; meas it will not execute the test if the browser is not supported
        }
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void VerifyLogo() throws InterruptedException {
        boolean status = driver.findElement(By.xpath("//a[@class='custom-logo-link']")).isDisplayed();
        if (status == true) {
            System.out.println("Logo is displayed on the page.");
            Assert.assertTrue(true);
        } else {
            System.out.println("Logo is not displayed on the page.");
            Assert.fail();
        }
        // Assert.assertTrue(status, True);  --use this for replacing the above if-else statement
        Thread.sleep(2000);
    }

    @Test (priority = 2)
    public void Title(){
        Assert.assertEquals(driver.getTitle(), "Test Login | Practice Test Automation");
    }

    @Test (priority = 3)
    public void VerifyUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");
    }

    @AfterClass
    public void TearDown() {
        driver.quit();
    }
}
