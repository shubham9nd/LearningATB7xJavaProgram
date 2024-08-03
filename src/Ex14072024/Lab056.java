package Ex14072024;

public class Lab056 {
    public static void main(String[] args) {
        //pre - increment
        int a = 100;
        int b = ++a; // a = a+1
        System.out.println(a);
        System.out.println(b);

        int c = 50;
        System.out.println(++c);

        //post - increment
        int a_post = 20;
        System.out.println(a_post++);
        System.out.println(a_post);

        // pre - decrement
        int d = 100;
        int e = --d;
        System.out.println(d);
        System.out.println(e);

        int f = 50;
        System.out.println(--f);

        //post - decrement
        int h = 70;
        int i = h--;
        System.out.println(h);
        System.out.println(i);

        int j = 40;
        System.out.println(j--);
        System.out.println(j);
    }
}
