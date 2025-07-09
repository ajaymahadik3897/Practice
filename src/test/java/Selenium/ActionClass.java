package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html"); // Open the website
        driver.manage().window().maximize(); // Maximize the browser window
        // Perform actions on the page as needed
        Actions actionObj = new Actions(driver); // Create an instance of the Action class

        WebElement Textbox = driver.findElement(By.xpath("//*[@placeholder ='First Name']")); // Find the element to interact with
        actionObj.moveToElement(Textbox).sendKeys("Ajay").perform();  // Hover over the "First Name" textbox and type "Ajay"
        Thread.sleep(10000); // Wait for 2 seconds to see the action performed


        WebElement element = driver.findElement(By.linkText("SwitchTo")); // Find the element to interact with
        actionObj.moveToElement(element).click().perform(); // hover and click on the "SwitchTo" link
        driver.findElement(By.linkText("Alerts")).click(); // Click on the "Alerts" link


        /* OR we can use the below code to hover and click on the "Alerts" link //first we need to hover on the "SwitchTo" link and then click on the "Alerts" link
        actionObj.moveToElement(switchTo).build().perform();  //build() is used to create the action sequence
        WebElement alerts = driver.findElement(By.linkText("Alerts"));
       alerts.click(); */

        /*diiferent actions example
          actionObj.contextClick().perform();
            actionObj.doubleClick().perform();  // Double click on the current element
            actionObj.dragAndDrop(source, target).perform();  // Drag and drop from source to target
            actionObj.clickAndHold(element).moveToElement(target).release().perform();  // Click and hold an element, move to target, and release
        actionObj.sendKeys("text").perform(); // Send keys to an element  // This will type "text" into the currently focused element
        actionObj.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // Example of holding down a key
        actionObj.pause(2000).perform(); // Pause for 2 seconds
        actionObj.clickAndHold(element).moveByOffset(100, 100).release().perform(); // Drag and drop by offset
        actionObj.dragAndDropBy(source, 100, 100).perform(); // Drag and drop by offset
        actionObj.moveToElement(element, 10, 20).perform(); // Move to an element with offset
        actionObj.scrollToElement(element).perform(); // Scroll to an element
        actionObj.scrollByAmount(0, 500).perform(); // Scroll by a specific amount
        actionObj.click().perform(); // Click on the current element
        actionObj.clickAndHold().perform(); // Click and hold the current element
        actionObj.release().perform(); // Release the current element
        actionObj.dragAndDrop(source, target).perform(); // Drag and drop from source to target
        actionObj.moveToElement(element).clickAndHold().moveToElement(target).release().perform(); // Move to an element, click and hold, move to target, and release

         */

    }
}
