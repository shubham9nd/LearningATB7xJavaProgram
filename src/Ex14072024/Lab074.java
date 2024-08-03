package Ex14072024;

public class Lab074 {
    public static void main(String[] args) {
        String password  = "Sachin@1234";
        String pass_w = password.toLowerCase();
        System.out.println(pass_w);
        // pass_w = password
        System.out.println(pass_w == password);
        System.out.println(pass_w.equals(password));
        System.out.println(pass_w.equalsIgnoreCase(password));
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('c'));
        System.out.println(password.length());
    }
}