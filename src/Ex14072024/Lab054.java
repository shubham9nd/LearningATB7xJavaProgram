package Ex14072024;

public class Lab054 {
    public static void main(String[] args){
        int shirt_price = 1000;
        float GST = 18.52F;
        //int shirt_total_price = shirt_price+GST; // Implicit Narrowing - JVM
        int shirt_total_price = shirt_price+(int)GST; // Explicit narrowing - REAL time - money loss
        System.out.println(shirt_total_price);
        float shirt_total_pricee = shirt_price+GST;
        System.out.println(shirt_total_pricee);
    }
}