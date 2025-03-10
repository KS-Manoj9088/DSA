package Strings;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        String word = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(word, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if (str.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String s1 = str[i];

            if (!map1.containsKey(c1) && !map2.containsKey(s1)) {
                map1.put(c1, s1);
                map2.put(s1, c1);
            }

            if (map1.containsKey(c1) && !map1.get(c1).equals(s1)) {
                return false;
            }

            if (map2.containsKey(s1) && map2.get(s1) != c1) {
                return false;
            }
        }
        return true;
    }
}
