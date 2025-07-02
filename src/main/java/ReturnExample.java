public class ReturnExample {  // Class definition for ReturnExample
    public static int add(int a, int b) {
        return a + b; // returns the sum to the caller
    }

    public static void main(String[] args) {
        //int result = add(5, 3);  //static method call without creating an instance of the class
        //System.out.println("Sum: " + result); // Output: Sum: 8

        ReturnExample re = new ReturnExample(); // Create an instance of ReturnExample to call the add method --if the method is not static
        int result = re.add(5, 3); // Call the add method and store the result
        System.out.println("Sum: " + result); // Output: Sum: 8  or System.out.println("Sum: " + re.add(5, 3)); --without storing the result in a variable
        // The add method returns the sum of a and b, which is then printed to the console
        // Note: If the add method were static, you could call it directly using the class name without creating an instance.
    }
}
