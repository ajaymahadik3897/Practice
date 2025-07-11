package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
    public static void main(String[] args) throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // Run in headless mode (optional)
        //or options.setHeadless(true); // Set headless mode to true (deprecated in newer versions)
        options.addArguments("--incognito"); // Run in incognito mode (optional)
        
        WebDriver driver = new ChromeDriver(options);  // Create an instance of ChromeDriver with options for headless mode
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize(); // Maximize the browser window
        // Here you would typically take a screenshot using a method like:
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to a desired location
        File destination = new File("C:\\Users\\mahadik.santosh\\Desktop\\QA Academy\\screenshot.png");

        FileHandler.copy(screenshot, destination); // Copy the screenshot to the destination file
        System.out.println("Screenshot taken and saved to: " + destination.getAbsolutePath());

        
    }
}
