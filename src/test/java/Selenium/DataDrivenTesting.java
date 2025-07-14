package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTesting {
        public static void main(String[] args) throws IOException {

            // Set up path to Excel file
            String exelfilepath ="C:\\Users\\mahadik.santosh\\Desktop\\QADEMOEXEL.xlsx";
            FileInputStream fis = new FileInputStream(exelfilepath);

            // Open Excel workbook
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(2); // Third Sheet (index 2)

            // Loop through rows (skip header)
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                // Read username and password from Excel
                Row row = sheet.getRow(i);
                String username = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();

                // Run test with this data
                runLoginTest(username, password);
            }

            workbook.close();
            fis.close();
        }

        public static void runLoginTest(String username, String password) {

            // Set path to chromedriver

            WebDriver driver = new ChromeDriver();

            try {
                driver.get("https://example.com/login"); // Replace with your URL
                driver.findElement(By.id("username")).sendKeys(username);
                driver.findElement(By.id("password")).sendKeys(password);
                driver.findElement(By.id("loginBtn")).click();

                // You can add simple check here
                System.out.println("Test run with: " + username + " / " + password);

            } catch (Exception e) {
                System.out.println("Error with user: " + username);
                e.printStackTrace();
            } finally {
                driver.quit(); // Always close the browser
            }
        }
}


