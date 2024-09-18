package Ex27072024;

public class Lab156 {
    public static void main(String[] args) {
        // Strings - immutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta
        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
    }
}