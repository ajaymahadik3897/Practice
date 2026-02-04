package NewPractice;

public class Loops {
    public static void main(String[]a){
        int i = 0;
        for(i =0; i<5; i++){
            System.out.println(i);
        }
//i is start from 5 in while loop becz in for loop i is 4 now due to incremental
        while (i<10){
            System.out.println(i);
            i++;
        }
        int p=5;
        do {
            System.out.println(p);
        }while (p<4);
    }
}
