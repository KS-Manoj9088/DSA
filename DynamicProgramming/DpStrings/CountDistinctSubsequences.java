package DynamicProgramming.DpStrings;
import java.util.*;

public class CountDistinctSubsequences {
    public static void main(String[] args) {
        String s1 = "babgbag";
        String s2 = "bag";

        int n = s1.length();
        int m = s2.length();

        // dp[i][j] = number of distinct subsequences in s1[0..i] that match s2[0..j]
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0;i <=n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int count = helper(s1, s2, dp, n, m);
        System.out.println(count);
    }

    public static int helper(String s1, String s2, int[][] dp, int i, int j) {
        // Base Case: If target string is empty, one valid subsequence is found
        if (j == 0) return 1;

        // Base Case: If source string is empty but target isn't, no match possible
        if (i == 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            // Match: include this char or skip it
            dp[i][j] = helper(s1, s2, dp, i - 1, j - 1) + helper(s1, s2, dp, i - 1, j);
        } else {
            // No match: skip current char in s1
            dp[i][j] = helper(s1, s2, dp, i - 1, j);
        }

        return dp[i][j];
    }
}