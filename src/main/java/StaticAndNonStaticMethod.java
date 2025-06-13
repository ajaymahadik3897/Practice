public class StaticAndNonStaticMethod {
    public static void myClass(){  //static method
        System.out.println("Print static class");
    }
    public void secondClass(){
        System.out.println("Print Non-static class");
        System.out.println(33 + "A");  //if only single digit is provided then we can right like '3' also
    }
    public static void main(String []arg){
        StaticAndNonStaticMethod obj = new StaticAndNonStaticMethod();  //Create object for run nonstatic method
        myClass();         //No need to object //Static method
        obj.secondClass(); //Object.method name //Nonstatic Method
        //

    }
}
