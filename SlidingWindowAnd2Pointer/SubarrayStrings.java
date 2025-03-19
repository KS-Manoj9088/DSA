package SlidingWindowAnd2Pointer;

import java.util.ArrayList;
import java.util.*;


//LOGIC -- SubString of String ani adigithae go for .substring() method.

public class SubarrayStrings {

    public static void main(String[] args) {
        String s = "abcd";
        List<List<String>> output = printSubArrays(s);
        System.out.println(output);
    }

    public static List<List<String>> printSubArrays(String s){
        List<List<String>> outer = new ArrayList<>();

        for(int i = 0;i < s.length(); i++){
            List<String> inner = new ArrayList<>();
            for(int j = i;j<s.length();j++){
                inner.add(Character.toString(s.charAt(j))); // [a]
                outer.add(new ArrayList<>(inner)); //   [[a]]         
            }
        }

        return outer;
    }

    public static List<List<String>> printSubArrays1(String s){
        List<List<String>> outer = new ArrayList<>();

        for(int i = 0;i < s.length(); i++){
            for(int j = i;j<s.length();j++){
                List<String> inner = new ArrayList<>();
                String substr = s.substring(i, j+1);
                inner.add(substr);
                outer.add(new ArrayList<>(inner));
            }
        }

        return outer;
    }
    
}
