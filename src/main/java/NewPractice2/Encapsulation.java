package NewPractice2;

public class Encapsulation {
    private int a;
    private String s;

    void setA(int a){
        this.a=a;
    }

    void setS(String s){
        this.s=s;
    }
    public int getA(){
        return a;
    }
    public String getS(){
        return s;
    }


    public static void main (String [] Arg){
        Encapsulation obj = new Encapsulation();
        obj.setA(10);
        obj.setS("Ajay");
        System.out.println(obj.getA());
        System.out.println(obj.getS());



    }

}
