package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleDemo {
    public static void main (String [] arg ) throws InterruptedException {  // Main method to execute the program // throws InterruptedException allows the method to pause execution for a specified time

        WebDriver driver = new ChromeDriver(); // Create an instance of ChromeDriver

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");  // Open the website
        driver.manage().window().maximize();  // Maximize the browser window
        driver.findElement(By.className("blinkingText")).click(); // Click on the link to open a new window
        Thread.sleep(2000);  // Pause for 2 seconds to allow the new window to open
        // Get the current window handle
        String parentWindowHandle = driver.getWindowHandle(); // Store the current window handle
        System.out.println("Parent Window Handle: " + parentWindowHandle); // Print the parent window handle
        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles(); // Get all window handles // This returns a Set of window handles
        System.out.println("All Window Handles: " + allWindowHandles); // Print all window handles

        // Iterate through all window handles
        for (String windowHandle : allWindowHandles) {
            System.out.println("Window Handle: " + windowHandle); // Print each window handle
            if (!windowHandle.equals(parentWindowHandle)) { // Check if the window handle is not the parent window handle  //ParentWindoHandle comes not match the current window handle
                driver.switchTo().window(windowHandle); // Switch to the new window
                System.out.println("Switched to new window with title: " + driver.getTitle()); // Print the title of the new window
                driver.close(); // Close the new window
                break; // Exit the loop after closing the new window
            }
            //or
            /*
            Set<String> allWindowHandles = driver.getWindowHandles();
            Iterator<String> iterator = allWindowHandles.iterator();
            String parentWindowHandle = iterator.next(); // Get the parent window handle
            String childWindowHandle = iterator.next(); // Get the child window handle   // Assuming there are only two windows, the first is the parent and the second is the child
            driver.switchTo().window(childWindowHandle); // Switch to the child window
            System.out.println("Switched to child window with title: " + driver.getTitle()); // Print the title of the child window
            driver.close(); // Close the child window
            driver.switchTo().window(parentWindowHandle); // Switch back to the parent window
             */
        }
    }
}
