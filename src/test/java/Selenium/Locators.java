package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main (String [] arg ) throws InterruptedException {
        //Types of Locators in Selenium WebDriver
        // 1. ID Locator - findelement(By.id("elementId"))
        // 2. Name Locator - findelement(By.name("elementName"))
        // 3. Class Name Locator - findelement(By.className("className"))
        // 4. Tag Name Locator - findelement(By.tagName("tagName"))
        // 5. Link Text Locator - findelement(By.linkText("linkText"))
        // 6. Partial Link Text Locator - findelement(By.partialLinkText("partialLinkText"))
        // 7. CSS Selector Locator - findelement(By.cssSelector("cssSelector"))
        // 8. XPath Locator - findelement(By.xpath("xpathExpression"))  //xpathExpression - //tag[@attribute='value'] or //tag[contains(@attribute,'value')]

        // Example usage of locators in Selenium WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get ("https://rahulshettyacademy.com/locatorspractice/");
        // Open the website
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Using different locators to interact with elements on the page
        driver.findElement(By.id("inputUsername")).sendKeys("Ajay");//ID locator
        driver.findElement(By.name("inputPassword")).sendKeys("Ajay");  //Name locator
        Thread.sleep(2000);
        driver.findElement(By.className("signInBtn")).click();  //or //xpath("//*[@text()='Sign In']") is used to select the button with text 'Sign In' //Class Name locator
        Thread.sleep(2000);
        //get the title of error message
        WebElement error = driver.findElement(By.xpath("//*[@class='error']"));
        System.out.println("On clickong login button i got this error: " + error.getText()); //or System.out.println(driver.findElement(By.xpath("//*[@class='error']")).getText());
// click on forgot password link
        driver.findElement(By.linkText("Forgot your password?")).click(); //Link Text locator
        Thread.sleep(2000);

        //add new password details
        driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Ajay");
        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("Ajay@aj.com");
        driver.findElement(By.xpath("//input[@type ='text'][3]")).sendKeys("9000000000"); //input[@type ='text'][3] is used to select the third input field with type text //sometimes the input field is not unique, so we can use index [] to select the input field
        driver.findElement(By.className("reset-pwd-btn")).click();
        Thread.sleep(2000);
        //get the success message
        System.out.println(driver.findElement(By.tagName("p")).getText()); //Tag Name locator is used to select the first paragraph element on the page
    }
}
