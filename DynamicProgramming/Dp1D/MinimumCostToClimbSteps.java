package DynamicProgramming.Dp1D;

import java.util.Arrays;

public class MinimumCostToClimbSteps {
    public static void main(String[] args) {
        int[] cost = new int[]{20,10,30,40};
        int min_cost = minCostClimbingStairs(cost);
        System.out.println(min_cost);
    }

    // Tabulation
    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) return cost[0];
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }

        // Correct way to return the result
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

    // Memoisation
    public static int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1]; // Create memoization array
        Arrays.fill(dp, -1); // Fill it with -1 to indicate uncomputed values
        return Math.min(helper(n - 1, cost, dp), helper(n - 2, cost, dp));
    }

    public static int helper(int index, int[] cost, int[] dp) {
        if (index < 0) return 0; // Base case: No cost if there's no step
        if (index == 0 || index == 1) return cost[index]; // Base cases for the first two steps

        if (dp[index] != -1) return dp[index]; // Return already computed value

        int left = helper(index-1,cost,dp);
        int right = helper(index-2, cost, dp);
        return dp[index] = cost[index] + Math.min(left, right);
    }
}
