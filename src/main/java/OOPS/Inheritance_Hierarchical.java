package OOPS;
class tiger extends animal { // dog is a sub class of animal // animal class is present in Inheritance_MultiLevel class
    public void B() {
        System.out.println("tiger is a sub class of animal");
    }
}

class cat extends animal { // cat is a sub class of animal //animal class is present in Inheritance_MultiLevel class
    public void D() {
        System.out.println("cat is a sub class of animal");
    }
}

public class Inheritance_Hierarchical  { // Inheritance_Hierarchical is a sub class of dog

    public static void main(String[] args) {
        tiger t = new tiger();  // creating object of tiger class
        t.A1();  // calling method of super class animal which is present in Inheritance_MultiLevel class
        t.B();  // calling method of sub class tiger

        System.out.println("-----------------");


        cat c = new cat(); // creating object of cat class
        c.A1();  // calling method of super class animal which is present in Inheritance_MultiLevel class
        c.D();   // calling method of sub class cat

    }
}