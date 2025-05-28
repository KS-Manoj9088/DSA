package DynamicProgramming;

import java.util.Arrays;

/**
 * Robber cannot rob adjacent houses 
 * Robber cannot rob first and last house
 * - since the house are in circular format
 * 
 */
public class HouseRobber2 {
    public static void main(String[] args) {
        int[] lootInHouses = {1,2,3,1};
        int maxLoot = rob(lootInHouses);
        System.out.println(maxLoot);
    }

     public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0]; // Handle single house case
        int ans1 = helper(Arrays.copyOfRange(nums, 1, nums.length));  // Excluding 0th index and looting in rest of houses
        int ans2 = helper(Arrays.copyOfRange(nums, 0, nums.length - 1)); // Excluding last index and looting in rest of houses
        return Math.max(ans1, ans2);
    }

    public static int helper(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // If no houses
        if (n == 1) return nums[0]; // if only 1 house

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
            // dp[i] = Math.max(dont take curent index, take currentIndex)
        }

        return dp[n - 1];
    }
}
