public class TypesOfVariables {
    int a = 100;   //Instance variable/global variable - non-static variable  // Each object has its own copy of instance variables, and they can have different values for each object.
    char c = 'M';  //Instance variable/global variable
    static float b = 101.0f;  //static variable  //Each time a new object is constructed, the same static count is incremented.

    static void staticMethod(){
        System.out.println("Static Types of variable is " + b);
        TypesOfVariables obj = new TypesOfVariables();
        System.out.println("Non Static Type of variable run in static method by using object " + obj.a); //we can run non static variable in static method by using object
        System.out.println("--------------------------------");
    }
    void nonStaticMethod(){
        System.out.println("Static Types of variable is " + b); //we can run staic veriable in any method
        System.out.println("Non Static Type of variable is " + c);
        System.out.println("--------------------------------");
    }

    public static void main (String []arg){
        double d =12.9d; // local variable present inside the method

        TypesOfVariables obj = new TypesOfVariables(); //create obj for run nonstatic method
        staticMethod();  // no obj is required for static method
        obj.nonStaticMethod();
        System.out.println("local variable value is " + d);

    }
}

/*
class Counter {
    int count = 0;  //static int count=0

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

Output:
1
1
1
//int count  	    Instance	        Each object has its own count → prints 1 each time //create separate object with new memory allocation
//static int count	Class (shared)	     ll objects share one count → prints 1 2 3   //static variable is shared among all instances of the class, so it retains its value across different objects.
 */
