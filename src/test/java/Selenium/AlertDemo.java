package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        // This class is intended
        WebDriver driver = new ChromeDriver(); // Create an instance of ChromeDriver
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize(); // Maximize the browser window
        driver.findElement(By.linkText("Alert with OK")).click(); // Click on the "Alert with OK" link))
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click(); // Click the button to trigger the alert
        Thread.sleep(2000); // Wait for the alert to appear
        // Switch to the alert
        Alert alert = driver.switchTo().alert(); // Switch to the alert
        // Get the text of the alert
        System.out.println("Alert text is: " + alert.getText()); // Print the text of the alert
        // Accept or dismiss the alert
        alert.accept(); // Accept the alert (click OK)


        //Alert with text input
        driver.findElement(By.linkText("Alert with Textbox")).click(); // Click on the "Alert with Textbox" link
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click(); // Click the button to trigger the alert with text input
        Thread.sleep(2000); // Wait for the alert to appear
        Alert textAlert = driver.switchTo().alert(); // Switch to the alert with text input
        // Get the text of the alert
        System.out.println("Alert text is: " + textAlert.getText()); // Print the text of the alert
        // Send text to the alert
        textAlert.sendKeys("Hello, this is a test!"); // Send text to the alert
        Thread.sleep(2000); // Wait for 2 seconds to see the action performed
        // Accept the alert with text input
        textAlert.accept(); // Accept the alert (click OK)





    }
}
