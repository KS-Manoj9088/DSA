package SlidingWindowAnd2Pointer;

import java.util.HashMap;

// LEETCODE 1876
public class CountGoodSubStrings {

    public static void main(String[] args) {
        String str = "xyaabcaa";
        int goodStringsCount = countGoodSubstrings(str);
        System.out.println("Good Substrings Count: " + goodStringsCount); //3 ["xya", "abc", "bca"]
    }
    

    public static int countGoodSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i <= n - 3; i++) 
        {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            if (a != b && b != c && a != c) 
            {
                count++;
            }
        }
        return count;
    }

    public static int optimalApproach(String s){
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        int left = 0;
        for(int right = 0; right < s.length();right++){

            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            if(right-left == 3){
                char ch1 = s.charAt(left);
                hm.put(ch1, hm.get(ch1)-1);

                if(hm.get(ch1)==0){
                    hm.remove(ch1);
                }
                left++;
            }

            if(hm.size()==3){
                count++;
            }
        }
        
        return count;
    }
}
