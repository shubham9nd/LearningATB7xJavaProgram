package Ex27072024;

public class Lab155 {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        String s1 = new String("Sachin"); // Heap Area
        String s2 = "sachin"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}