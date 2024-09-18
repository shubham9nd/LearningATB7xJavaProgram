package Ex27072024;
import java.util.Scanner;

public class Lab143 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//      System.out.println(marks[10]); // AIOBE
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(i + " -> " + marks[i]);
        }
        sc.close();
    }
}