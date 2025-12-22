package Candelatest;

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ransomeNote = sc.nextLine();
        String magazine = sc.nextLine();

        boolean result = checkhelper(ransomeNote, magazine);

        System.out.println(result);

        sc.close();
    }

    public static boolean checkhelper(String ransomeNote, String magazine){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(char ch : ransomeNote.toCharArray()){
            if(!hm.containsKey(ch)){
                return false;
            }
            else{
                hm.put(ch, hm.get(ch)-1);
                if(hm.get(ch) == 0){
                    hm.remove(ch);
                }
            }
        }

        return true;
    }
    
}
