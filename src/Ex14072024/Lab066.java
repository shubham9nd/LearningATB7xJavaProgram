package Ex14072024;

public class Lab066 {
    public static void main(String[] args) {
        String s1 = new String("Sachin");
        String s2 = new String("Sachin");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Sachin
        System.out.println(s3);
        //System.out.println(s1);
        //System.out.println(s2);
    }
}
