package Ex20072024;
import java.util.Scanner;

public class Lab085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age <= 100){
            System.out.println("Alive!!");
        } else{
            System.out.println("Not Alive!!");
        }
    }
}