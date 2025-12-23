package SPRole;

import java.util.*;

public class S1 {

     public static void main(String[] args) {
        String s = "nellimarla";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i = n - 1;i >= 0; i--){
            char ch = s.charAt(i);
            if(!hm.containsKey(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        String res = sb.reverse().toString();
        System.out.println(res);

        LinkedHashMap<Character, Integer> hm1 = new LinkedHashMap<>();

        hm1.put('s', 1);
        hm1.put('a', 2);
        hm1.put('i', 1);
        hm1.put('m', 1);

        LinkedHashMap<Integer, Character> hm2 = new LinkedHashMap<>();

        for(Map.Entry<Character, Integer> entry : hm1.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();


            if(hm2.containsKey(value)){
                hm2.put(value, key);
            }
            hm2.put(value, key);
        }

        for(Map.Entry<Character, Integer> entry : hm1.entrySet()){
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }

        for(Map.Entry<Integer, Character> entry : hm2.entrySet()){
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
     }
}