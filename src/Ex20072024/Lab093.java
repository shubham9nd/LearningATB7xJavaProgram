package Ex20072024;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the itemcode");
        int itemcode = sc.nextInt();
        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("None");
        }
    }
}