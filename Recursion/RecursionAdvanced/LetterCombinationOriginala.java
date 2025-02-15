package Recursion.RecursionAdvanced;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOriginala {

    static List<String> list = new ArrayList<>();
    static int count = 0;
    public static void main(String[] args) {
        String digits = "23"; // Input digits
        letterCombinations("", digits);
        System.out.println(list); // Print all letter combinations
        System.out.println("Count : "+count);
    }

    static void letterCombinations(String p, String up) {
        // Base condition: when the unprocessed string becomes empty
        if (up.isEmpty()) {
            if (!p.isEmpty()) { // Ensure non-empty combinations are added
                //System.out.println(p);
                count+=1;
                list.add(p);
                System.out.println(list);
                return;
            }
        }

        int digit = up.charAt(0) - '0'; // Extract first digit and convert to integer

        if (digit == 1 || digit == 0) {
            return; // Skip processing for digit '1' (no letter mapping)
        }

        // Starting index of letters mapped to the digit
        int startIndex = (digit - 2) * 3;
        int letterCount = 3; // Default letter count

        // Handling special cases where digits 7 and 9 have 4 letters
        if (digit == 9) {
            startIndex += 1;  // Adjust index to account for extra letter
            letterCount = 4;  // Increase letter count
        }

        if(digit == 7){
            letterCount = 4;
        }

        // Iterating through the mapped characters for the current digit
        for (int i = startIndex; i < startIndex + letterCount; i++) {
            char ch = (char) ('a' + i); // Convert index to corresponding letter
            letterCombinations(p + ch, up.substring(1)); // Recursive call with next digit
        }
    }
}
