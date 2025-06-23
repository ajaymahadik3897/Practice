import java.util.Scanner;

public class ScannerDemo {
    static void integer(){
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.println("Enter the value: ");
        int value = scanner.nextInt();  // Read an integer input from the user
        System.out.println("Entered value is : " + value);


    }
    static void string(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String value = scanner.nextLine();  // Read a string input from the user
        System.out.println("Entered String value is : " + value);
    }

    public static void main (String [] ar){
        integer();
        string();  // Call the methods to demonstrate integer and string input

    }

}
