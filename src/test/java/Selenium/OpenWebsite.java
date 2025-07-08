package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {
 // This program demonstrates how to open a website using Selenium WebDriver in Java
    public static void main (String [] arg ) throws InterruptedException {  // Main method to execute the program // throws InterruptedException allows the method to pause execution for a specified time

        WebDriver driver = new ChromeDriver(); // Create an instance of ChromeDriver

        driver.get("https://demoqa.com/");  // Open the website

        driver.manage().window().maximize();  // Maximize the browser window

        String Title = driver.getTitle();  // Get the title of the current page
        System.out.println("Titel of website is : " + Title); //  System.out.println("Titel of website is : " + driver.getTitle());

        String URL = driver.getCurrentUrl();  // Get the current URL of the page
        System.out.println("URL of Website is : " + URL);
        Thread.sleep(2000);  // Pause for 2 seconds to allow the page to load


        //Open another website
        driver.navigate().to("https://demo.automationtesting.in/Register.html");  // Navigate to another URL
        System.out.println("Titel of website is : " + driver.getTitle());  // Print the title of the new page
        System.out.println("URL of Website is : " +driver.getCurrentUrl());  // Print the URL of the new page
        // System.out.println("Page source of Website is  : " +driver.getPageSource());  // Print the page source of the new page
        Thread.sleep(2000);

        driver.navigate().back(); // Go back to the previous page
        driver.navigate().forward(); // Go forward to the next page
        Thread.sleep(2000);
        driver.navigate().back();  //back to previous page
        Thread.sleep(2000);
        driver.navigate().refresh(); // Refresh the current page
        Thread.sleep(2000);

        driver.close();  // Close the current window
        System.out.println("Close the window succefully");

        driver.quit(); // Close all browser windows and end the WebDriver session
        System.out.println("Close the browser succefully");
    }
}
