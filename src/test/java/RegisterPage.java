import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class RegisterPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        // Add First Name and Last Name
        WebElement FirstName = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
        FirstName.sendKeys("Ajay");
        WebElement LastName = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
        LastName.sendKeys("Mahadik");

        //Add Address of user
        WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        Address.sendKeys("My Address is Pune, Maharashtra, 412207");

        //Add Email of user
        WebElement EmailAddress = driver.findElement(By.xpath( "//*[contains(@type , 'email')]"));  // use dynamic expath here
        EmailAddress.sendKeys("ajay@gmail.com");

        //Add Mobile number
        WebElement MobileNumber = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        MobileNumber.sendKeys("9090909090");

        //Click radio Button by adding gender ( We can use if else with  scanner statement also)
        String Gender = "Male";
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='"+Gender+"']"));
        if (!radioButton.isSelected()) {
            radioButton.click();
        }


        //Select language in dropdown
        WebElement dropdown = driver.findElement(By.id("msdd"));
        dropdown.click();
        /*we cant use Select class here because no select HTML is available in page
        We use scanner class for select language manually
        Scanner Language = new Scanner(System.in);
        System.out.println("Select language please: ");
        String Data = Language.nextLine(); */
        driver.findElement(By.xpath("//*[text()='English']")).click();  // use //*[text()='"+ Data +"'] if i use scanner

        //Select Skill in dropdown
        WebElement skills = driver.findElement(By.id("Skills"));
         // there is select is available in HTML page so we use select class
        Select s = new Select(skills);
        s.selectByVisibleText("Analytics");

        Thread.sleep(2000);

        driver.quit(); // close browser



    }
}
