package Collection;

class animal1 {
    public static void A() {
        System.out.println("animal is a super class");

    }
}

public class Inheritance_SingleLevel extends animal1 {  // Inheritance_SingleLevel is a sub class of animal //only one public class can be there in a file
    public static void B() {
        System.out.println("Inheritance_SingleLevel is a sub class");
    }

    public static void main(String[] args) {
        A(); // Calling method from super class  // Note: Static method that why we can call it directly
        B(); // Calling method from sub class
    }


}
