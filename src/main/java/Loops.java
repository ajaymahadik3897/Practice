public class Loops {

    public static void forLoop(){  //use when you know the number of iterations in advance
        System.out.println("************* For Loop *************");
        for (int i = 0; i < 5; i++) { // Loop from 0 to 4
            System.out.println("Iteration: " + i);
        }
    }

    public static void whileLoop(){ //use when you don't know the number of iterations in advance
        System.out.println("************* While Loop *************");
        int i = 0; // Initialize the counter
        while (i < 5) { // Loop while i is less than 5
            System.out.println("Iteration: " + i);
            i++; // Increment the counter

        }
    }
    public static void doWhileLoop(){  //use when you want to execute the loop at least once
        System.out.println("************* Do-While Loop *************");
        int i = 0; // Initialize the counter
        do {
            System.out.println("Iteration: " + i);
            i++; // Increment the counter
        } while (i < 5); // Loop while i is less than 5
    }
    public static void main(String[] args) {
        forLoop(); // Call the for loop method
        whileLoop(); // Call the while loop method
        doWhileLoop(); // Call the do-while loop method
    }

}
