package Hashing;

import java.util.HashMap;

public class CountCommonWordsWithOneOccurence {

    public static void main(String[] args){
        String[] w1 = {"leetcode","is","amazing","as","is"};
        String[] w2 = {"amazing","leetcode","is"};
        System.out.println(countWords(w1,w2));
    }
    
    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> freq1 = new HashMap<>();
        HashMap<String, Integer> freq2 = new HashMap<>();

        // Count frequencies in words1
        for (String word : words1) {
            freq1.put(word, freq1.getOrDefault(word, 0) + 1);
        }

        // Count frequencies in words2
        for (String word : words2) {
            freq2.put(word, freq2.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        // Check for words that appear exactly once in both arrays
        for (String word : freq1.keySet()) {
            if (freq1.get(word) == 1 && freq2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
