package Ex21072024;

public class Lab136 {
    public static void main(String[] args) {
        final boolean b1 = true;
        for (int i = 0; b1; i++) {// there is no impact of variable b1 in this loop.
            System.out.println("Hi");
        }
    }
}