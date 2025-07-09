package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for the ChromeDriver if necessary (not needed for recent versions)
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();  //no need to set property for ChromeDriver for new versions
        driver.get("https://demoqa.com/droppable"); //open the website
        driver.manage().window().maximize(); //maximize the browser window

        Actions actionObj = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable")); //find the draggable element
        WebElement target = driver.findElement(By.id("droppable")); //find the droppable target

        actionObj.dragAndDrop(source, target).perform(); //perform drag and drop action
        Thread.sleep(2000); //wait for 2 seconds to see the action performed

        // Alternatively, you can use the clickAndHold and moveToElement methods to perform drag and drop
        //actionObj.moveToElement(source).clickAndHold().moveToElement(target).release().perform(); //alternative way to perform drag and drop using clickAndHold and release
        driver.quit(); //close the browser
    }
}
