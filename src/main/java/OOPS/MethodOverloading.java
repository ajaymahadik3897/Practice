package OOPS;

//compiletime polymorphism //methods are differentiated by the number of parameters or the type of parameters
public class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {  // This method adds two integers
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {  // This method adds three integers
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {  // This method adds two doubles
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {  // This method adds an integer and a double
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading(); // Create an instance of MethodOverloading

        System.out.println("Sum of 5 and 10: " + mo.add(5, 10)); // Calls first method
        System.out.println("Sum of 5, 10 and 15: " + mo.add(5, 10, 15)); // Calls second method
        System.out.println("Sum of 5.5 and 10.5: " + mo.add(5.5, 10.5)); // Calls third method
        System.out.println("Sum of 5 and 10.5: " + mo.add(5, 10.5)); // Calls fourth method
    }
}
