package Ex14072024;

public class Lab047 {
    public static void main(String[] args) {
        // Arithmetic Operators
        // +,-,%,/,*
        int a = 95;
        int b = 32;
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // Compound Assignment Operators
        // +=, -=, /=, *=
        int c = 85;
        c+= 10;
        System.out.println(c);
        c-= 5;
        System.out.println(c);
        c/= 9;
        System.out.println(c);
        c*= 40;
        System.out.println(c);

        // Relational Operators
        // > , < , >= <=, !, != , == (compare two value)
        int d = 50;
        int e = 40;
        boolean f = (d>e);
        System.out.println(f);
        boolean g = (d<e);
        System.out.println(g);
        boolean h = (d >= e);
        System.out.println(h);
        boolean i = (d <= e);
        System.out.println(i);
        boolean j = (d != e);
        System.out.println(j);
        boolean k = (d == e);
        System.out.println(k);
    }
}

