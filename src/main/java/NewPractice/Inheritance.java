package NewPractice;

public class Inheritance extends XMethod {
   public void kalu() {
        System.out.println("Inheritance method");
    }
    public static void Anna(){
        System.out.println("Inheritance Anna");
    }
    public static void Raj(){
        System.out.println("Inheritance Raj");
    }

    public static void main (String[]a) {
        XMethod obj = new Inheritance();
        obj.kalu();
        obj.Anna();
        obj.kalu(10);

    }

}
