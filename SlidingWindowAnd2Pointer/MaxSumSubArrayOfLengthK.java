package SlidingWindowAnd2Pointer;
//import java.util.*;

public class MaxSumSubArrayOfLengthK {

    public static void main(String... args){
        int[] arr = {1, 2, 3, 4};
        long res = maximumSubarraySum(arr,3);
        System.out.println(res);

        int res1 = optimalApproach(arr, 3);
        System.out.println(res1);

    }

    public static int optimalApproach(int[] arr, int windowLength){
        int windowSum = 0;
        int max = 0;
        int left = 0;
        int n = arr.length;

        for(int right = 0;right < n;right++){
            windowSum+=arr[right];

            if(right-left == windowLength){
                windowSum-=arr[left];
                left++;
            }

            if(right-left+1 == windowLength){
                max = Math.max(max,windowSum);
            }
        }

        return max;
    }

    public static long maximumSubarraySum(int[] nums, int k) {

        long max = 0;
        for(int i = 0; i < nums.length-k+1; i++){
            long sum = 0;
            for(int j = i; j < i+k; j++){
                sum+=nums[j];
                max = Math.max(max,sum);
            }
        }

        return max;        
    }
    
}
