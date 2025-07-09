package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver (make sure ChromeDriver is in your system PATH or use WebDriverManager)
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        // ==========================
        // PART 1: Single Iframe
        // ==========================
        // Click the "Single Iframe" tab (if not already default)
        driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
        Thread.sleep(1000);

        // Switch to single iframe by name or index
        driver.switchTo().frame(driver.findElement(By.id("singleframe")));  //Webelement is innerFrame we can directly use ID , name or index
        // Perform actions inside the single iframe
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajay");
        Thread.sleep(2000);

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // ==========================
        // PART 2: Nested Iframes
        // ==========================
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        Thread.sleep(1000);

        // Switch to the outer iframe
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);

        // Switch to the inner iframe
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);  //Webelement is innerFrame we can directly use ID , name or index

        // Perform actions inside the inner iframe
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajay");
        Thread.sleep(2000);

        // Switch back to the main page
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}
