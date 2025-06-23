public class ConditionalStatement {
    static void ifStatement() {
        System.out.println("************* If Statement *************");
        int a = 10;
        if (a > 5) { // Check if a is greater than 5
            System.out.println("a is greater than 5");
        } else {  // If the condition is false, this block will execute
            System.out.println("a is not greater than 5");
        }
    }

    static void nestedIfStatement() {
        System.out.println("************* Nested If Statement *************"); //if statement inside another if statement
        int a = 7;
        if (a > 5){ // Check if a is greater than 5
            System.out.println("a is greater than 5");

            if (a < 15){ // Check if a is less than 15 //if first condition is true, then this block will execute
                System.out.println("a is not greater than 15");
            }
            else {  //if first condition is true, but second condition is false, then this block will execute
                System.out.println("a is greater than 15");
            }
        }
        else {  // If the first condition is false, this block will execute
            System.out.println("a is not greater than 5");
        }
    }

    static void ifelseifelseStatement() {
        System.out.println("************* If-Else If-Else Statement *************");
        int a = 17;
        if (a < 5) {
            System.out.println("a is less than 5");
        } else if (a < 15) { // Check if a is less than 15
            System.out.println("a is between 5 and 15");
        } else if (a < 20) { // Check if a is less than 20
            System.out.println("a is between 15 and 20");
        } else {  // If all previous conditions are false, this block will execute
            System.out.println("a is greater than or equal to 20");
        }
    }

    static void nestedIfElseIfStatement() {
        System.out.println("************* Nested If-Else If Statement *************"); //if-else inside another if-else statement
        int a = 10;
        if (a > 5) { // Check if a is greater than 5
            System.out.println("a is greater than 5");

            if (a < 15) { // Check if a is less than 15
                System.out.println("a is between 5 and 15");
            } else { // If the second condition is false, this block will execute
                System.out.println("a is greater than or equal to 15");
            }
        } else { // If the first condition is false, this block will execute
            System.out.println("a is not greater than 5");
        }
    }



 // Main method to run the examples
    public static void main (String [] a)
        {
        ifStatement();
        nestedIfStatement();
        ifelseifelseStatement();
    }
}
