package Strings.StringBuilderStringBuffer;
 import java.util.StringJoiner;
public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("-");
        sj.add("20").add("o3").add("2025");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(" ");
        sj2.setEmptyValue("data is empty");

        System.out.println(sj2.toString());
        sj2.add("hi");
        System.out.println(sj2.toString());
     }
    
}
