package DynamicProgramming.DpStrings;

public class ShortestCommonSuperSequence {
    public static void main(String[] args) {
        Solution s = new Solution();
        String superSequenceString = s.shortestCommonSupersequence("ace", "bce");
        System.out.println(superSequenceString);
    }
}

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // Step 1: Build the LCS DP table
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // Characters match: extend LCS
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // Characters don't match: take max of excluding one character
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 2: Reconstruct the Shortest Common Supersequence using the DP table
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                // If characters match, include it once
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                // Take character from str1
                sb.append(str1.charAt(i - 1));
                i--;
            } else {
                // Take character from str2
                sb.append(str2.charAt(j - 1));
                j--;
            }
        }

        // Step 3: Append remaining characters from str1 or str2
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }

        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        // Step 4: Reverse the result to get correct order
        return sb.reverse().toString();
    }
}
