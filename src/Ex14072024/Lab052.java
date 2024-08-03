package Ex14072024;

public class Lab052 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion

        // Widening - Implicit, Explicit - lossless
        byte b = 127;
        int a = b; // VALID – Implicit Casting - JVM
        System.out.println(a);
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        // Narrowing - Implicit, Explicit(with data type), loss
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        //System.out.println(b1);
        byte c1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(c1);
    }
}