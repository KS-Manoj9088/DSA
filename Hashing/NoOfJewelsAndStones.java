package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NoOfJewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        Map<Character, Integer> stoneCount = new HashMap<>();

        for(char c : stones.toCharArray()){
            stoneCount.put(c, stoneCount.getOrDefault(c,0)+1);
        }

        int ans = 0;
        for(int i = 0;i < jewels.length();i++){
            if(stoneCount.containsKey(jewels.charAt(i))){
                ans+=stoneCount.get(jewels.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int count = numJewelsInStones("aA", "aAAbbb");
        System.out.println(count);

        String s = "hanoj";
        int ascii = 'h'+ 0;
        System.out.println(s.codePointAt(0));
        System.out.println(ascii);
    }
}
