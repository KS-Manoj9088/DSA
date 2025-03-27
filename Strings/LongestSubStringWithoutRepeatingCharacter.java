package Strings;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingCharacter {
    

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int startIndex = 0;

        for (int end = 0; end < s.length(); end++) 
		{
            char currentChar = s.charAt(end);

            for (int i = start; i < end; i++)
			{
                if (s.charAt(i) == currentChar) 
				{
                    start = i + 1;
                    break;
                }
            }

            if (end - start + 1 > maxLength) 
			{
                maxLength = end - start + 1;
                startIndex = start;
            }
        }

          String longestSubstring = s.substring(startIndex, startIndex + maxLength);
          return longestSubstring.length();
        
    }


    public static int lengthOfLongestSubstringOptimal(String s) {
        int maxLength = 0;
        int left = 0;
        int n = s.length();

        HashMap<Character, Integer> hm = new HashMap<>();
        String longestString = "";
        for(int  right = 0; right < n; right++){
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch,0)+1);

            while(hm.get(ch)>1){
                char ch1 = s.charAt(left);
                hm.put(ch1, hm.get(ch1)-1);
                left++;
            }

            if(right-left+1>maxLength){
                maxLength = right-left+1;
                longestString = s.substring(left, right+1);
            }
        }

        System.out.println(longestString);
        return maxLength;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringOptimal("abcabcbb")); // 3
    }
}
