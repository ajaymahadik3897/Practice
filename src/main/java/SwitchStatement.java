import java.util.Scanner;

public class SwitchStatement {
    public static void main (String []arg){
        //scanner for user input
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); // Read an integer input from the user

        switch (number) { // Switch statement to handle different cases based on the input number
            case 1:   // If the input is 1, it will print "Monday" // and so on for other cases // if we use case "monday" then it will not work because case is used for numbers then we need to use String //case 1 replaces with case "monday" and so on
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Day");
        }

    }
}
