package Hashing;
import java.util.*;

public class NoOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        Map<Integer, Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for(int key : hm.keySet()){
            int count = hm.get(key);
            if(count > 1){
                ans += (count * (count - 1)) / 2;
            }
        }
        
        System.out.println(ans);
    }
    
}

/*
 * Logic enti antae same ga unna nos annitini oka array lo store chesaav anuko ...
 * [1,2,3,1,1,3]  -> [1,1,1],[2],[3,3]
 * 
 * Observation enti antae eppudu oka "num"->"k" times appear ayyindi anuko .... No of goods pairs formed can be n*(n-1)/2  where n=no.of times the no appeared.
 * 
 * [1] => 3  by formulae = 3
 * [2] => 0
 * [3] => 2  by formulae = 1
 * 
 * adding results 3+1 = 4.  That is the result.
 * 
 */
