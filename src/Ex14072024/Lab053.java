package Ex14072024;

public class Lab053 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // Implicit Narrowing - JVM
        short s = (short) phone_no;
        System.out.println(s);
    }
}
