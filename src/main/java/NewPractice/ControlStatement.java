package NewPractice;

import java.util.Scanner;

public class ControlStatement {
    int k = 50;
    int s =60;
    int r;



     void king(){
         if (k==s){
             System.out.println("K is qual to s");
         } else if (k>s) {
             System.out.println("K is greater than s");
         } else if (k<s) {
             System.out.println("K is less than s");
         } else
         {
             System.out.println("Statement is incorrect");
         }
    }

       void Raju() {
         if (k==50){
             if(k==s){
                 System.out.println("we are correct");
             }
             else {
                 System.out.println("we are wrong");
             }
         }
         else{
             System.out.println("Wrong data");
         }

       }

    public static void main(String[]arg){

        ControlStatement obj = new ControlStatement();
        obj.king();
        obj.Raju();
    }
}
