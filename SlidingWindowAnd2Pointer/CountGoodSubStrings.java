package SlidingWindowAnd2Pointer;


// LEETCODE 1876
public class CountGoodSubStrings {
    

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
}
