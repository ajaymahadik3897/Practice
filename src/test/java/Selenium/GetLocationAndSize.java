package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationAndSize {

    public static void main(String[] args) throws InterruptedException {
        // This class is intended
        WebDriver driver = new ChromeDriver(); // Create an instance of ChromeDriver

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");  // Open the website
        WebElement element = driver.findElement(By.id("username")); // Replace with the actual ID of the element you want to locate

        // Get the location of the element
        int x = element.getLocation().getX(); // Get the X coordinate of the element
        int y = element.getLocation().getY(); // Get the Y coordinate of the element
        System.out.println("Element Location: X = " + x + ", Y = " + y); // Print the location of the element

        // Get the size of the element
        int width = element.getSize().getWidth(); // Get the width of the element
        int height = element.getSize().getHeight(); // Get the height of the element
        System.out.println("Element Size: Width = " + width + ", Height = " + height); // Print the size of the element
        Thread.sleep(2000);  // Pause for 2 seconds to allow the page to load


    }
}
