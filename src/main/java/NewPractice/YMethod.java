package NewPractice;

public class YMethod {

    YMethod(){
        System.out.println("King is back");
    }
    YMethod(int b){
        System.out.println("Value of b is : " + b);
    }
    public static void main (String[]arg){
        XMethod.Anna();                    //static method calling from Xmethod class
        XMethod obj = new XMethod();
        obj.kalu();                       //nonstatic method calling from Xmethod class
        obj.kalu(10);                  //nonstatic method calling from Xmethod class //method overloading example

        //constructors in same class
        new YMethod();
        new YMethod(50);



    }
}
