package Ex14072024;

public class Lab069 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        String str4 = str1.concat(str3);
        String str5= str1.concat(str2);// Hello Guys
        System.out.println(str5);
        System.out.println(str4);
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }
}
