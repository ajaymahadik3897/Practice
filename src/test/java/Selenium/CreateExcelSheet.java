package Selenium;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class CreateExcelSheet {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "C:\\Users\\mahadik.santosh\\Desktop\\Newfile.xlsx";
        FileOutputStream file = new FileOutputStream(excelFilePath);
        // You can use Apache POI or any other library to create an Excel file here
        System.out.println("File created successfully: " + excelFilePath);
        // Note: You would typically use a library like Apache POI to create and write to an Excel file.
        // For example, you can create a workbook, add sheets, rows, and cells using Apache POI.
        // Here is a simple example using Apache POI to create an Excel file:
         XSSFWorkbook workbook = new XSSFWorkbook();
         XSSFSheet sheet = workbook.createSheet("Sheet1");

        // Create a row and add some data
          XSSFRow row1 = sheet.createRow(0); // Create the first row //iw we want only one cell then sheet.createRow(0).createCell(0).setCellValue("Hello World");
            // Add some data to the first row
          row1.createCell(0).setCellValue("Hello");
            row1.createCell(1).setCellValue("World");
            row1.createCell(2).setCellValue("This is a test");

            // Create another row and add some data
            XSSFRow row2 = sheet.createRow(1);
            row2.createCell(0).setCellValue("Row 2, Cell 1");
            row2.createCell(1).setCellValue("Row 2, Cell 2");
            row2.createCell(2).setCellValue("Row 2, Cell 3");

            /*
            //add data to sheet manually by using scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data for the first row (comma-separated): ");
            String[] rowData = scanner.nextLine().split(",");
            XSSFRow userRow = sheet.createRow(2); // Create a new row for user input
            for (int i = 0; i < rowData.length; i++) {
                userRow.createCell(i).setCellValue(rowData[i].trim()); // Add user input to the row
            }
            scanner.close();

            //add data by using array
            String[][] data = {
                {"Header1", "Header2", "Header3"},
                {"Data1", "Data2", "Data3"},
                {"More Data1", "More Data2", "More Data3"}
            };
            for (int i = 0; i < data.length; i++) {
                XSSFRow row = sheet.createRow(i);
                for (int j = 0; j < data[i].length; j++) {
                    row.createCell(j).setCellValue(data[i][j]);
                }
            }

             */

          workbook.write(file);
            workbook.close();
        // Close the file output stream


        //
    }
}
