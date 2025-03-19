package SlidingWindowAnd2Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {

        public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());  // Added empty arrayList

        for(int num : nums){
            int outerlist_size = outer.size();    

            for(int i = 0;i<outerlist_size;i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(outer.contains(internal)){
                    continue;
                }
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(subsetsWithDup(nums));
    }
    
}
