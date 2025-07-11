package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.out.println("File upload functionality will be implemented here.");

        WebDriver driver = new ChromeDriver(); // Create an instance of ChromeDriver
        driver.get("https://demo.automationtesting.in/Register.html"); // Open the website
        driver.manage().window().maximize(); // Maximize the browser window
        driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\mahadik.santosh\\Desktop\\QA Academy\\06.09.2022_10.53.18_REC.png"); // Click on the file upload button
    }
}
