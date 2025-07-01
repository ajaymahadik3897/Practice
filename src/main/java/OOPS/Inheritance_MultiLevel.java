package OOPS;

class animal {
    public void A1() {
        System.out.println("animal is a super class");
    }
}

class dog extends animal { // dog is a sub class of animal
    public void B() {
        System.out.println("dog is a sub class of animal");

    }
}

class puppy extends dog { // puppy is a sub class of dog
    public  void C() {
        System.out.println("puppy is a sub class of dog");
    }
    // puppy is a sub class of dog and dog is a sub class of animal
//    public static void main(String[] args) {
//        puppy obj = new puppy();
//        obj.A1(); // calling method of super class animal
//        obj.B(); // calling method of sub class dog
//        obj.C(); // calling method of sub class puppy
}

public class Inheritance_MultiLevel extends puppy { // Inheritance_MultiLevel is a sub class of puppy
    public static void main(String[] args) {
        Inheritance_MultiLevel obj = new Inheritance_MultiLevel();
        obj.A1(); // calling method of super class animal // animal to dog to puppy to Inheritance_MultiLevel
        obj.B(); // calling method of sub class dog  // dog to puppy to Inheritance_MultiLevel
        obj.C(); // calling method of sub class puppy // puppy to Inheritance_MultiLevel
    }
}
