package Ex14072024;

public class Lab061 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 21 , a = 21
        //  Part ->  B -> a++ , Exp2 = 21 , a = 22
        //  Part ->  C -> a++, Exp3 = 22 , a = 23
        // op ->  exp1+ exp2+exp3
        // op =   21 + 21 + 22 = 64
    }
}