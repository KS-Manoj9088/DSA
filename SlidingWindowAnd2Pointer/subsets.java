package SlidingWindowAnd2Pointer;

import java.util.ArrayList;
import java.util.List;

public class subsets {

    public static List<List<Integer>> generatesubsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());  // Added empty arrayList

        for(int num : nums){
            int outerlist_size = outer.size();    

            for(int i = 0;i<outerlist_size;i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        
        return outer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = generatesubsets(nums);

        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
    
}
