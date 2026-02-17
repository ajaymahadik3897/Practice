package NewPractice2;

import java.sql.SQLOutput;

public class Variables {
    int a=  10;      // Global Variables
    int b;
    static int d = 50;   // static variable\
    int c=50;

    void Anna(){
        System.out.println(c);  // no need tp create object in non static method for instance variable
    }
    Variables(int b){
        this.b=b;   //this.b referes instance variable and b referes consructor parameter
    }
    public static void main (String [] arg)
    {
       Variables ab = new Variables(20);
        System.out.println(ab.b);  // use this keyword for output
        System.out.println(ab.a); // Need to create object for Global variable in static method
        System.out.println(d);   // no need to create object for static variable

        ab.Anna();  //use non static method

        int k =100;   //local Variables
        System.out.println(k);

    }}
