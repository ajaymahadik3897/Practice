package OOPS;
class Transport {
    public static void move() {
        System.out.println("Transport is moving");
    }
}

class Car extends Transport {
    public static void move() {
        System.out.println("Car is moving");
    }
}

public class Casting {
    static void primitiveCasting() {
        // Implicit casting (widening conversion)
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit casting (narrowing conversion)
        double anotherDoubleValue = 123.45;
        float anotherFloatValue = (float) anotherDoubleValue; // double to float
        long anotherLongValue = (long) anotherFloatValue; // float to long
        int anotherIntValue = (int) anotherLongValue; // long to int
        System.out.println("\nExplicit Casting:");
        System.out.println("double to float: " + anotherFloatValue);
        System.out.println("float to long: " + anotherLongValue);
        System.out.println("long to int: " + anotherIntValue);

    }

        static void  nonprimitiveCasting() {

        //upcasting - this is when a subclass object is assigned to a superclass reference
            Transport transport = new Car(); // Upcasting: Transport reference to Car object
            transport.move(); // Trasport is moving, calls the static method in Transport class, if its non static it will call the move method in Car class //we see the method from the Transport class because it is static and belongs to the class, not the instance

        // downcasting - this is when a superclass reference is cast back to a subclass reference
            Car car = (Car) transport; // Downcasting: Transport reference back to Car
            car.move(); // Calls Car's move method

            // Uncommenting the following line will cause a ClassCastException at runtime
            // Transport anotherTransport = new Transport();
            // Car anotherCar = (Car) anotherTransport; // This will throw an exception

    }
    public static void main(String[] args) {
        System.out.println("Primitive Casting:");
        primitiveCasting();
        System.out.println("\nNon-Primitive Casting:");
        nonprimitiveCasting();
    }
}
