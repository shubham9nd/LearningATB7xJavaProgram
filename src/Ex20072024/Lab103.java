package Ex20072024;
import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);
        switch (user_input) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}