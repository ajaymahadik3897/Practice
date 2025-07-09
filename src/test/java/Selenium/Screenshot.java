package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;


public class Screenshot {
    public static void main(String[] args) throws IOException {
        System.out.println("Screenshot functionality will be implemented here.");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize(); // Maximize the browser window
        // Here you would typically take a screenshot using a method like:
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to a desired location
        File destination = new File("C:\\Users\\mahadik.santosh\\Desktop\\QA Academy\\screenshot.png");

        FileHandler.copy(screenshot, destination); // Copy the screenshot to the destination file
        
    }
}
