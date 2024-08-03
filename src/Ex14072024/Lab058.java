package Ex14072024;

public class Lab058 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A - a++  -> Exp = 20 | a = 21
        // + - operator
        // B- a++  -> Exp = 22 | a = 22
        // A + B -> 20 + 22 = 42
    }
}