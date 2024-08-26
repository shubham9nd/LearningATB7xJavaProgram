package Ex20072024;

public class Lab094 {
    public static void main(String[] args) {
        int itemCode = 005;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Hello!");
        }
    }
}