public class Constructor2 {
    int a ;
    int b ;
    int sum ;

    Constructor2(int a, int b) {  //use this keyword in this program //this keyword is used to refer the current class instance variable //Constructor name should be same as class name //if no argument is available in constructor then we called as default constructor
        this.a =a;
        this.b =b;
        this.sum = a+b; //Addition of a and b //this keyword is used to refer the current class instance variable //this.sum = a+b; we can run without this keyword also but it is confusing thats why we use this keyword
    }

    public static void main (String [] arg){
       Constructor2 obj = new Constructor2(10 , 20);

        System.out.println("a value is: " + obj.a); //Print the value of a //use object with variable becz variables are non static
        System.out.println("b value is: " + obj.b); //Print the value of b
        System.out.println("Addition of a and b is: " + obj.sum); //remo line 9 and we can use this also obj.sum = obj.a + obj.b; // Correct way  //Print the value of sub
    }

}
