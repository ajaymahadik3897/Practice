public class TypesOfVariables {
    int a = 100;   //Instance variable/global variable - non-static variable
    char c = 'M';  //Instance variable/global variable
    static float b = 101.0f;  //static variable

    static void staticMethod(){
        System.out.println("Static Types of variable is " + b);
        TypesOfVariables obj = new TypesOfVariables();
        System.out.println("Non Static Type of variable run in static method by using object " + obj.a);
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
