package OOPS;

class home {
    public void TV() {
        System.out.println("home is a super class");
    }
}

class kitchen extends home { // kitchen is a sub class of home
    public void fridge() {
        System.out.println("kitchen is a sub class of home");
    }

}

public class Practice_Inheritance extends kitchen { // Practice_Inheritance is a sub class of kitchen

    public static void main(String[] args) {
        home k = new kitchen(); // creating object of kitchen class using home class reference //upcasting
        k.TV(); // calling method of super class home
        // k.fridge(); // this line will give error because fridge() is not a method of home class
        //this is shows only the methods of home class // we can run only super class methods using super class object
        System.out.println("----------------------------------"); // just for separation in output



        Practice_Inheritance obj = new Practice_Inheritance();
        obj.TV(); // calling method of super class home
        obj.fridge(); // calling method of sub class kitchen

    }

}
