package Selenium;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Script;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html"); // Open the website
        driver.manage().window().maximize(); // Maximize the browser window
        JavascriptExecutor JS = (JavascriptExecutor) driver; // Create a JavascriptExecutor instance
        JS.executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
        Thread.sleep(2000); // Wait for 2 seconds to see the action performed
        JS.executeScript("window.scrollBy(0, -500);"); // Scroll back up by 500 pixels
        // scroll to right
        // JS.executeScript("window.scrollBy(500, 0);"); // Scroll right by 500 pixels
        // scroll to left
        // JS.executeScript("window.scrollBy(-500, 0);"); // Scroll left by 500 pixels
        Thread.sleep(2000);
        //set zoom level of the page
        JS.executeScript("document.body.style.zoom = '10%';"); // Zoom in the page by 150%

    }

}
