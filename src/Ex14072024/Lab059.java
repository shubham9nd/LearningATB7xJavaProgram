package Ex14072024;

public class Lab059 {
    public static void main(String[] args) {
        int a = 30;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A - a++  -> Exp = 30 | a = 31
        // + - operator
        // B- a++  -> Exp = 32 | a = 32
        // A + B -> 30 + 32 = 62
    }
}