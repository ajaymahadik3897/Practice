package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Screenshot functionality will be implemented here.");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize(); // Maximize the browser window
        WebElement element = driver.findElement(By.xpath("//div[@class='top']//div[@class='row']")); // Replace with actual element ID
        // Here you would typically take a screenshot using a method like:
        //takescreenshot for web element
        File screenshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);  // Cast the element to TakesScreenshot // to take a screenshot of the specific element //(TakesScreenshot) element: Casts the element to the TakesScreenshot interface. //.getScreenshotAs(OutputType.FILE): Captures the screenshot and stores it as a File.
        // Save the screenshot to a desired location
        File destination = new File("C:\\Users\\mahadik.santosh\\Desktop\\QA Academy\\screenshot_element.png");
        FileHandler.copy(screenshot, destination); // Copy the screenshot to the destination file
        System.out.println("Screenshot taken and saved to: " + destination.getAbsolutePath());
        // Close the driver
        driver.quit(); // Close the browser
        System.out.println("Browser closed.");
    }
}
