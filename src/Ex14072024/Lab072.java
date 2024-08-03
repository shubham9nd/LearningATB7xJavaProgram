package Ex14072024;

public class Lab072 {
    public static void main(String[] args) {
        String s1 = "Sachin";
        //String s1 = "S a c h i n";
        //            |0|1|2|3|4|5|
        char c = s1.charAt(4);
        char d = s1.charAt(5);
        System.out.println(c);
        System.out.println(d);
        s1 = s1.concat("Sharma"); // Sachin Sharma
        System.out.println(s1);
    }
}