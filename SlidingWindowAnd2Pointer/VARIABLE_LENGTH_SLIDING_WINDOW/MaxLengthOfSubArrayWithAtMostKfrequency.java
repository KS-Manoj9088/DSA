package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;

import java.util.HashMap;

public class MaxLengthOfSubArrayWithAtMostKfrequency{
    public static void main(String[] args) {


        int nums1[] = {1,2,1,2,1,2,1,2};
        int k1 = 1;

        int nums2[] = {1,2,2,1,3};
        int k2 = 1;

        int res1 = maxSubarrayLength(nums1, k1);
        int res2 = maxSubarrayLength(nums2, k2);

        System.out.println(res1);
        System.out.println(res2);

    }

    public static int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int right = 0; right < n; right++){
            int num = nums[right];
            hm.put(num, hm.getOrDefault(num, 0)+1);

            while(hm.get(num)>k){
                hm.put(nums[left], hm.get(nums[left])-1);
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}