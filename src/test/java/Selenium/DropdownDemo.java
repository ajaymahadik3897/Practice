package Selenium;

import Collection.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
    public static void main (String [] ab) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
        // Open the website
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize(); // Maximize the browser window
        WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        //By using Select class to interact with the dropdown
        Select obj = new Select(Dropdown);  // Create a Select object to interact with the dropdown
        // Check if the dropdown is a multi-select dropdown
        obj.selectByVisibleText("USD");
        Thread.sleep(2000);
        // Select the dropdown option by index
        obj.selectByIndex(2);
        Thread.sleep(2000);
        // Select the dropdown option by value
        obj.selectByValue("INR");
        System.out.println(obj.getFirstSelectedOption().getText());  // Print the first selected option from the dropdown //above code is used to select the dropdown option by visible text, index and value


     //Another dropdown example without Select class
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        // Increase the number of adults by clicking on the plus button
        for (int i = 1; i < 5; i++) {  // Loop to increase the number of adults to 5
            driver.findElement(By.id("hrefIncAdt")).click(); // Click on the plus button to increase the number of adults
        }
        //click on the done button to close the dropdown
        driver.findElement(By.id("btnclosepaxoption")).click(); // Click on the done button to close the dropdown
        Thread.sleep(2000);
        // Print the number of adults selected
        String adults = driver.findElement(By.id("divpaxinfo")).getText(); // Get the text of the div containing the number of adults
        System.out.println("Number of adults selected: " + adults); // Print the number of adults selected


    }

}
