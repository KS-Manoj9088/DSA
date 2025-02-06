package Strings;
import java.util.*;

public class isValidAnagrams {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();  //listen
        String s2 = sc.nextLine();  //silent

        boolean result = isAnagrams3(s1, s2);
        System.out.println(result);

        sc.close();

    }

    public static boolean isAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray()){
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }

        return hm1.equals(hm2);
    }

    public static boolean isAnagrams1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }

        return charCount.isEmpty();
    }

    public static boolean isAnagrams2(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

       public static boolean isAnagrams3(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();
        
        for (char c : s1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s2.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }

        return true;
    }
}
