package SortingAlgorithms;

public class ArrayOperation {
    class Solution {

        public static int[] applyOperations(int[] nums) {
            int n = nums.length;
            int[] modifiedNums = new int[n];
            int zeroCount = 0;
    
            // Step 1: Apply operations on the array
            for (int index = 0; index < n - 1; index++) {
                if (nums[index] == nums[index + 1] && nums[index] != 0) {
                    nums[index] *= 2;
                    nums[index + 1] = 0;
                }
            }
    
            // Step 2: Move non-zero elements to the front
            for (int num : nums) {
                if (num != 0) {
                    modifiedNums[zeroCount++] = num;
                }
            }
    
            // Step 3: Append zeros to maintain the original size
            while (zeroCount < n) {
                modifiedNums[zeroCount++] = 0;
            }
    
            return modifiedNums;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 0, 3, 3,5};
        int[] result = Solution.applyOperations(nums);
        System.out.println(java.util.Arrays.toString(result));
    }
}
