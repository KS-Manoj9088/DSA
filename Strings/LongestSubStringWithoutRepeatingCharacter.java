package Strings;

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
    
}
