package Strings;
import java.util.*;

public class StringReverse{
    public static void main(String[] args) {
        String reversedString = reverseStringUsingStacks("^^I am OpThunder**");
        System.out.println("Reversed String: " + reversedString); 
 }

    public static String reverseStringUsingStacks(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for(char c : chars){
            stack.push(c);
        }
        for(int i = 0; i<str.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}