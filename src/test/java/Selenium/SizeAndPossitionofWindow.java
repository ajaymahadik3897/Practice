package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndPossitionofWindow {
    public static void main (String [] arg ) throws InterruptedException {  // Main method to execute the program // throws InterruptedException allows the method to pause execution for a specified time

        WebDriver driver = new ChromeDriver(); // Create an instance of ChromeDriver

        driver.get("https://demoqa.com/");  // Open the website

        // Set the size of the browser window
       Dimension d = new Dimension(1000, 1080); // Create a Diamention object with width and height
        System.out.println("Size of the browser window is : " + d); // Print the size of the browser window
        System.out.println("Width of the browser window is : " + d.getWidth()); // Print the width of the browser window
        System.out.println("Height of the browser window is : " + d.getHeight()); // Print the height of the browser window
        System.out.println("Position of the browser window is : " + driver.manage().window().getPosition()); // Print the position of the browser window
        System.out.println("Size of the browser window is : " + driver.manage().window().getSize()); // Print the size of the browser window
        Thread.sleep(2000);  // Pause for 2 seconds to allow the page to load
        driver.manage().window().setSize(d);  // Maximize the browser window

        System.out.println("---------------------------------------");


        // Set the position of the browser window
        Point p = new Point(50, 100); // Create a Point object with x and y coordinates
        System.out.println("New Position of the browser window is : " + p); // Print the position of the browser window
        driver.manage().window().setPosition(p);
        System.out.println("New Position of the browser window is : " + driver.manage().window().getPosition()); // Print the new position of the browser window



    }
}
