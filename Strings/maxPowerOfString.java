package Strings;
import java.util.*;

public class maxPowerOfString {


    public static int maxPower(String s) {
        Stack<Character> st = new Stack<>();
        int maxLen = 1, count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                count++;  // Increment the count for consecutive characters
            } else {
                count = 1;  // Reset count for a new character
                st.clear(); // Clear stack since we encountered a different character
            }

            st.push(ch); // Push current character onto stack
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }

    public static int maxPowerOptimal(String s) {
        int maxLen = 1, count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                maxLen = Math.max(maxLen, count);
            } else {
                count = 1; // Reset count for a new character
            }
        }
        
        return maxLen;
    }


    public static void main(String[] args) {
        System.out.println(maxPower("leetcode")); // Output: 2
        System.out.println(maxPowerOptimal("abbcccddddeeeeedcba")); // Output: 5
    }
}

