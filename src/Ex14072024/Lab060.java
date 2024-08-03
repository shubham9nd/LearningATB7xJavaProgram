package Ex14072024;

public class Lab060 {
    public static void main(String[] args) {
        int a = 60;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A -> ++a , Exp = 61    |  a = 61
        // + -> addition
        // B -> ++a  Exp =  62 | a = 62
        // Exp = A+B = 61 + 62 = 123 , a = 62
    }
}