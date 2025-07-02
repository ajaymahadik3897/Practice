package OOPS;

// Encapsulation is a fundamental concept in object-oriented programming (OOP) that restricts direct access to an object's data and methods.
// It is achieved by using access modifiers to control visibility and access to class members (fields and methods).
// Encapsulation helps in hiding the internal state of an object and only exposing a controlled interface for interaction.

class Person {
    private String name;  // Private field, not accessible outside this class
    private int age;    // Private field, not accessible outside this class

 String getName (){
     return name;  // Public method to get the name, allows controlled access
 }
 int getAge() {
     return age;  // Public method to get the age, allows controlled access
 }

 void setName (String name){
     this.name = name;  // Public method to set the name, allows controlled access
 }
    void setAge(int age) {
        if (age > 0) {  // Validation before setting the age
            this.age = age;  // Public method to set the age, allows controlled access
        } else {
            System.out.println("Age must be positive.");
        }
    }

}
//use public access modifier for methods to allow access to the class and its members from outside the class //in this case, we are not using public  methods because we are not use this in another class

public class Encapsulation {
    public static void main (String [] arg){
        Person person = new Person();  //Create an instance of Person //another class cannot access private fields directly
        person.setName("John Doe");  // Set the name using the public method
        person.setAge(30);  // Set the age using the public method
        System.out.println("Name: " + person.getName());  // Get the name using the public method
        System.out.println("Age: " + person.getAge());  // Get the age using the public method
        person.setAge(-5);  // Attempt to set an invalid age, will trigger validation
        // person.name = "Jane Doe";  // This line would cause a compilation error because name is private
        // person.age = -10;  // This line would cause a compilation error because age is private

    }
}
