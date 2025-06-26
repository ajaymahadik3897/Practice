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

    static void addition(){
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter value of a: ");
        int a = scanner.nextInt();  //scanner is used to take input from the user

        System.out.println("Enter value of b: ");
        int b = scanner.nextInt();

        int Sum = a+b;
        System.out.println("Addition of a and b is : " + Sum);  // Print the sum of a and b
    }

    public static void main (String [] ar){
        integer();
        string();
        addition();

    }

}
//nextInt() method is used to read an integer value
//nextLine() method is used to read a string value
//nextDouble() method is used to read a double value
//nextBoolean() method is used to read a boolean value
//nextFloat() method is used to read a float value
//nextByte() method is used to read a byte value
//nextShort() method is used to read a short value


