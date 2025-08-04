package TestNG.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClass {
    WebDriver driver;

    // Define locators for the elements you want to interact with
        By usernameField = By.xpath("//*[@name='username']");
        By passwordField = By.xpath("//*[@name='password']");
        By SubmitButton =  By.xpath("//*[@id='submit']");

        /*  -- Alternative way to use @FindBy annotation if you are using PageFactory
    // Initialize all elements using @FindBy
    @FindBy(xpath = "//*[@name='username']")  // This is an alternative way to use PageFactory
    WebElement usernameField;

    @FindBy(xpath = "//*[@name='password']")  // syntax - @FindBy(locatorType = "xpath", locatorValue = "value")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id='submit']")
    WebElement submitButton;
         */


    // Constructor to initialize the WebDriver
    public POMClass(WebDriver driver) {
        this.driver = driver;

        /*
        // If using PageFactory, you would initialize the elements like this:
        this.driver = driver;
        PageFactory.initElements(driver, this);
         */
    }


    // Actions on the page can be defined as methods in this class
    // Method to enter username
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    // Method to click the submit button
    public void clickSubmit() {
        driver.findElement(SubmitButton).click();
    }

    /*
    // Alternative methods if using PageFactory
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        submitButton.click();
    }
     */

}
