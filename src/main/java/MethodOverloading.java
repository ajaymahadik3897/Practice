class Method1{
    public void display() {
        System.out.println("Method with no parameters");
    }

    public void display(int a) {
        System.out.println("Method with one integer parameter: " + a);
    }

    public void display(int a, String b) {
        System.out.println("Method with one integer and one string parameter: " + a + ", " + b);
    }
}

public class MethodOverloading {  // Example of method overloading in the same class and different class
    void ABC() {
        System.out.println("This is a method in MethodOverloading class");
    }
    void ABC(int a) {
        System.out.println("This is an overloaded method in MethodOverloading class with parameter: " + a);
    }

    public static void main(String[] args) {

        // Example of method overloading in the same class
        MethodOverloading obj1 = new MethodOverloading(); //same class
        obj1.ABC();
        obj1.ABC(5); // Calls the overloaded method with an integer parameter
        System.out.println("--------------------------------");

        // Example of method overloading in Java //we pull methods from another class to this class
        Method1 obj = new Method1(); //different class // Create an instance of Method1 to call its methods present in another class
        obj.display(); // Calls the method with no parameters
        obj.display(5); // Calls the method with one integer parameter
        obj.display(10, "Hello"); // Calls the method with one integer and one string parameter

    }
}
/* In Java, only one top-level class can be declared as public in a single .java file, and the file name must match the public class name.
   If you try to declare two public classes in the same file, you will get a compile-time error.
    Other classes in the same file must not be public.
 */
