package Strings.StringBuilderStringBuffer;
//import java.util.*;

public class StringBuilderDemo{
    public static void main(String[] args) {

        // 3 type of StringBuilder Constructors exist.

        StringBuilder sb = new StringBuilder();     // 'sb' length default ga 16 characters.
        System.out.println(sb.capacity()); //16


        StringBuilder sb1 = new StringBuilder(10);
        System.out.println(sb1.capacity());

        sb.append("QWERTYUIOPASDFGHJKLZXCVBNM");

        System.out.println(sb.capacity());

        // formulae to calculate capicity of 'sb' 
        // capacity = current_capity*2+2


        // String Builder is not a thread-safe class. -- Unsynchronised methods
        // String Buffer is a thread-safe class.
    }
}

