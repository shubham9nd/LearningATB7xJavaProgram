package Ex14072024;

public class Lab050 {
    public static void main(String[] args) {
        byte a = 127;
        byte b = 123;
        int c = a+b;
        System.out.println(c);

        char d1 = 'D';
        char f1 = 'F';
        int g1 = d1+f1; // DF ->character
        System.out.println(g1); //(68+70)
        System.out.println('D' == 68);
        System.out.println('F' == 70);
    }
}