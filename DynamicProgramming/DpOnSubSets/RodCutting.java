package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class RodCutting {
    public static void main(String[] args) {
        int len = 5;  // Total rod length
        int[] prices = {2, 5, 7, 8, 10}; // prices[i] = price of rod of length i+1

        int n = prices.length;
        int[][] dp = new int[n][len + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int maxCost = helper(prices, dp, len, n - 1);
        System.out.println(maxCost);
    }

    public static int helper(int[] prices, int[][] dp, int len, int index) {
        if (index == 0) {
            return prices[0] * len; // Only 1-length pieces available
        }

        if (dp[index][len] != -1) {
            return dp[index][len];
        }

        // Don't take the current piece
        int notTake = helper(prices, dp, len, index - 1);

        // Take the current piece (length = index + 1)
        int take = Integer.MIN_VALUE;
        if (index + 1 <= len) {
            take = prices[index] + helper(prices, dp, len - (index + 1), index);
        }

        return dp[index][len] = Math.max(notTake, take);
    }
}