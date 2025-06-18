public class Constructor {
    String name;
    int a;
    Constructor(){    //non argument constructor
        name = "ajay";
        a =10;
        System.out.println(name);
        System.out.println(a);
    }
    Constructor(int a , int b){   //Argument constructor
        int p = a +b ;
        System.out.println(p);

    }
    public static void main (String[]a){
       new Constructor();  // Constructor obj = new Constructor();
       new Constructor(10 , 50); // Constructor obj = new Constructor(10 , 50);
    }
}
