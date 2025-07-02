package OOPS;
// Abstraction // Abstraction is a process of hiding the implementation details and showing only the essential features of the object. // It is a way to reduce complexity and increase efficiency. // In Java, abstraction can be achieved using abstract classes and interfaces.


abstract class demo {   // abstract class //incomplete method is present thats why we use abstract class or we can say that abstract class is a class that cannot be instantiated and may contain abstract methods (methods without a body) as well as concrete methods (methods with a body).
    abstract void AB () ; //inccomplete method that why we use abstract keyword, this method must be implemented in the subclass

    void test (){  // non-abstract method in abstract class
        System.out.println("Run Test method in abstract class");
    }
    static void D () {  // static method in abstract class
        System.out.println("Run static D method in abstract class");
    }
}

public class Abstraction extends demo {  //concrete class that extends abstract class demo
    void AB (){    // complete abstract method in demo class
        System.out.println("complete abstract method in Abstraction class");
    }
    public static void main (String [] arg){
        Abstraction obj = new Abstraction();
        obj.AB();
        obj.test();
        Abstraction.D(); //demo.D // obj.D //we can run static method of abstract class using object of subclass or class name

    }
}
