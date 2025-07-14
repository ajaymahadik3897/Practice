package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExelFile {
    public static void main(String[] args) throws IOException {
       String exelfilepath ="C:\\Users\\mahadik.santosh\\Desktop\\QADEMOEXEL.xlsx";

        FileInputStream fileInputStream = new FileInputStream(exelfilepath);
        // You can use Apache POI or any other library to read the Excel file here
        System.out.println("File found successfully: " + exelfilepath);

        // Create a workbook instance to read the Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        // You can now read sheets, rows, and cells from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet
        int rowCount = sheet.getLastRowNum();  // Get the number of rows in the sheet
        System.out.println("Number of rows in the sheet: " + rowCount);

        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of columns in the first row: " + columnCount);

        //Print the  Header row second value
        String headerValue = sheet.getRow(0).getCell(1).toString();
        System.out.println("Header value in the first row, second column: " + headerValue);


        // Iterate through the rows and columns to read data
        for (int i = 0; i <= rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                String cellValue = sheet.getRow(i).getCell(j).toString();
                System.out.print(cellValue + "\t"); // Print cell value with a tab space
            }
            System.out.println(); // New line after each row
        }

        // Close the workbook and file input stream
        workbook.close();
        fileInputStream.close();
        System.out.println("Excel file read successfully.");




    }
}
