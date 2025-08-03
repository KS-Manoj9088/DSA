package DynamicProgramming.DpOnSubSets;
import java.util.*;
public class PartitionArrayIntoTwoSubSetsWithMinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4};
        
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int n = nums.length;
        Map<String, Boolean> memo = new HashMap<>();

        Set<Integer> possibleSums = new HashSet<>();

        for (int s1 = -Math.abs(totalSum); s1 <= Math.abs(totalSum); s1++) {
            if (helper(n - 1, s1, nums, memo)) {
                possibleSums.add(s1);
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for (int s1 : possibleSums) {
            int s2 = totalSum - s1;
            minDiff = Math.min(minDiff, Math.abs(s2 - s1));
        }

        System.out.println("Minimum absolute difference: " + minDiff);
    }

    public static boolean helper(int index, int target, int[] nums, Map<String, Boolean> memo) {
        if (target == 0) return true;
        if (index < 0) return false;

        String key = index + "," + target;
        if (memo.containsKey(key)) return memo.get(key);

        boolean notTake = helper(index - 1, target, nums, memo);
        boolean take = helper(index - 1, target - nums[index], nums, memo);

        boolean res = take || notTake;
        memo.put(key, res);
        return res;
    }
}

/*
 * 
 * For Only Positive Integer Array
 * 
 * package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class PartitionArrayIntoTwoSubSetsWithMinimumAbsoluteDifference {
    public static void main(String[] args) {
        // Only Positive Integers are allowed.
        int[] nums = {1, 2, 3, 4};

        // Step 1: Calculate total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int n = nums.length;
        int target = totalSum / 2;  // We only check subset sums up to totalSum / 2 for minimum difference
        int[][] dp = new int[n][target + 1];

        // Step 2: Initialize the dp array with -1 (indicating uncomputed)
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Step 3: Call helper to populate dp table (memoization)
        helper(n - 1, target, nums, dp);

        int minimum = Integer.MAX_VALUE;

        // Step 4: Try all possible subset sums from 0 to target
        for (int s1 = 0; s1 <= target; s1++) {
            // If it's possible to make a subset with sum s1
            if (dp[n - 1][s1] == 1) {
                int s2 = totalSum - s1;  // s2 will be the remaining part of the array
                minimum = Math.min(minimum, Math.abs(s2 - s1));  // track minimum absolute difference
            }
        }

        // Step 5: Output the result
        System.out.println("The minimum absolute difference : " + minimum);
    }

    // Memoized Recursive Function to check if a subset sum of 'target' is possible using elements from 0 to 'index'
    public static boolean helper(int index, int target, int[] nums, int[][] dp) {
        // Base case: If target becomes 0, a valid subset has been found
        if (target == 0) return true;

        // Base case: Only one element left to check
        if (index == 0) return nums[0] == target;

        // Check if the result is already computed
        if (dp[index][target] != -1) {
            return dp[index][target] == 1;
        }

        // Option 1: Do not take the current element
        boolean notTake = helper(index - 1, target, nums, dp);

        // Option 2: Take the current element (only if it does not exceed the target)
        boolean take = false;
        if (nums[index] <= target) {
            take = helper(index - 1, target - nums[index], nums, dp);
        }

        // Store the result in dp array (1 = true, 0 = false)
        dp[index][target] = (take || notTake) ? 1 : 0;

        // Return whether the target sum is achievable
        return take || notTake;
    }
}
 */