package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;
import java.util.*;


public class SubArrayWithKDifferentIntegers{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(arr, k));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums,k) - atMostKDistinct(nums, k-1);
    }

    public static int atMostKDistinct(int[] nums, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int n = nums.length;
        int count = 0;

        for(int right = 0; right < n; right++){
            int num = nums[right];
            hm.put(num, hm.getOrDefault(num,0)+1);

            while(hm.size() > k){
                int num_left = nums[left];
                hm.put(num_left, hm.get(num_left)-1);
                if(hm.get(num_left)==0){
                    hm.remove(num_left);
                }
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
}