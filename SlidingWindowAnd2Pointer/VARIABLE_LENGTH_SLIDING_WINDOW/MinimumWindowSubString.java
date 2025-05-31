package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;
import java.util.*;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";

        String resString = minimumWindowSubString(s, t);
        System.out.println(resString);
    }

    public static String minimumWindowSubString(String s, String t) {
        int left = 0, startIndex = -1, count = 0, minLength = Integer.MAX_VALUE;
        int len_s = s.length(), len_t = t.length();
        
        if (len_t > len_s) return "";

        // Preload hashmap with frequency of characters in t
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : t.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int right = 0; right < len_s; right++) {
            char ch = s.charAt(right);
            if (hm.containsKey(ch)) { // Ensure existence before modifying
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) >= 0) {
                    count++; // Increase count only when valid
                }
            }

            while (count == len_t) { // Valid window found
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                // Reduce window size from the left
                char ch_left = s.charAt(left);
                if (hm.containsKey(ch_left)) {
                    hm.put(ch_left, hm.get(ch_left) + 1);
                    if (hm.get(ch_left) > 0) {
                        count--; // Reduce matched characters count
                    }
                }
                left++; // Shrink window
            }
        }
        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
    }
}