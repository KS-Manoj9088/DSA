package DynamicProgramming.DpStrings;

public class LCSTabulation {

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "bdgfe";

        int n = str1.length();
        int m = str2.length();

        if (n == 0 || m == 0) {
            System.out.println("LCS length: 0");
            System.out.println("LCS: ");
            return;
        }

        int[][] dp = buildDPTable(str1, str2, n, m);

        int lenOfLCS = dp[n][m];
        System.out.println("Length of LCS: " + lenOfLCS);

        System.out.println("\nDP Table:");
        printDPTable(dp, n, m);

        String LCS = reconstructLCS(dp, str1, str2, n, m);
        System.out.println("\nLCS: " + LCS);
    }

    // Builds the DP table using bottom-up tabulation
    public static int[][] buildDPTable(String str1, String str2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // match: take diagonal + 1
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // no match: take max of top or left
                }
            }
        }

        return dp;
    }

    // Reconstructs the LCS string from the DP table
    public static String reconstructLCS(int[][] dp, String str1, String str2, int n, int m) {
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return sb.reverse().toString();
    }

    // Prints the DP table for debugging or visualization
    public static void printDPTable(int[][] dp, int n, int m) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}