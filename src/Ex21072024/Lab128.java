package Ex21072024;
import java.util.Scanner;

public class Lab128 {
    public static void main(String[] args) {
        // Factorial Program
        //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number,will print Factorial");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}