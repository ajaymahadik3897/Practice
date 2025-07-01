package OOPS;
// Runtime polymorphism // Method overriding // methods are differentiated by the type of object that calls them
public class MethodOverriding {

    public class travel {
        public void travel() {  // Method to travel
            System.out.println("Traveling by travel");
        }
    }
    public class travelByCar extends travel {
        @Override
        public void travel() {  // Overriding the travel method
            System.out.println("Traveling by car");
        }
    }
    public static void main(String[] args) {
        MethodOverriding mo = new MethodOverriding(); // Create an instance of MethodOverriding //methods are non-static that's why we need to create an instance of MethodOverriding
        travel myTravel = mo.new travelByCar(); // Create an instance of travelByCar // if methods were static, we could call them directly without creating an instance ex.mo.travelByCar();
        myTravel.travel(); // Calls the overridden method in travelByCar
    }
    
    //if methods are static, we cannot override them. // Static methods are not polymorphic, they are resolved at compile time.
    // Static methods are not overridden, they are hidden. // If we try to override a static method, it will not give an error, but it will not work as expected.
    // Static methods are not polymorphic, they are resolved at compile time.
    //if methods are static then they run travel class method not travelByCar class method
}
