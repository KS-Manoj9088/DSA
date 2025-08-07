package DynamicProgramming.DpStrings;
import java.util.*;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bdc";

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];

        for(int i = 0;i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        int maxLen = LCS(s1, s2, dp, n-1, m-1);
        String longestCommonSubSequence = longestCommonSubsequence(s1, s2);

        System.out.println("Length of Longest Common SubSequence : "+maxLen);
        System.out.println("Longest Common SubSequence : "+longestCommonSubSequence);
    }

    public static String longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Fill dp table using memoized recursion
        LCS(text1, text2, dp, n - 1, m - 1);

        // Reconstruct LCS from dp table
        return buildLCS(text1, text2, dp);
    }

    public static int LCS(String s1, String s2, int[][] dp, int i, int j) {
        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + LCS(s1, s2, dp, i - 1, j - 1);
        } else {
            dp[i][j] = Math.max(
                LCS(s1, s2, dp, i - 1, j),
                LCS(s1, s2, dp, i, j - 1)
            );
        }

        return dp[i][j];
    }

    public static String buildLCS(String s1, String s2, int[][] dp) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        StringBuilder lcs = new StringBuilder();

        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                lcs.append(s1.charAt(i));
                i--;
                j--;
            } else {
                int up = (i > 0) ? dp[i - 1][j] : 0;
                int left = (j > 0) ? dp[i][j - 1] : 0;

                if (up >= left) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        return lcs.reverse().toString();
    }

}
