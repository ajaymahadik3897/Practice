package OOPS;

interface demo {  // interface // An interface is a reference type in Java, similar to class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields. The methods in interfaces are abstract by default.
    void CD();
}

public class InterfaceDemo implements demo {
    @Override
    public void CD() {  // implementing the method from interface
        System.out.println("Run CD method in InterfaceDemo class");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.CD();  // calling the implemented method

    }
}



