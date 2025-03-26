package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;


//Leetcode 1004. => 

/*Given a binary array nums and an integer k,
 return the maximum number of consecutive 1's
  in the array if you can flip at most k 0's.
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

public class MaxConsecutiveOnesIII {


    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int maxlen = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }

            while(zeroCount>k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            maxlen = Math.max(maxlen, right-left+1);
        }
        
        return maxlen;
    }

    // Ee question similar to "MaximumSubArrayLengthWithKones"..
    // Ekkada manam flip chesam anukoni "zero(0) encounter ayyina prathisari `zeroCount` ni increment chestham...
    // Eppudaithe `zeroCount` vaadu ecchina threshold(k) ni daatuthaadho 
    // manam left pointer ni malla "zeoCount" kanna thakkuva ayyinantha varuku decrement chestham.
}
