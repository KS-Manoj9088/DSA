package Recursion.RecursionAdvanced;
import java.util.*;

public class LetterCombination {

    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String digits = "12";
        letterCombinations("",digits);
        System.out.println(list);
    }

    static void letterCombinations(String p, String up){

        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.println(p);
                list.add(p);
                return;
            }
        }

        int digit = up.charAt(0) - '0'; // Convert '2' into 2

        
        for(int i = (digit-1)*3; i < (digit*3); i++){
            char ch = (char)('a' + i);
            letterCombinations(p+ch, up.substring(1));
        }
    }
    
}
