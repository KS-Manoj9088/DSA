package DynamicProgramming.Dp2D;
import java.util.*;

public class Talentio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] prices = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prices[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        // Base case: first row is same as prices
        for (int j = 0; j < m; j++) {
            dp[0][j] = prices[0][j];
        }

        // Fill dp table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = dp[i - 1][j];
                int left = (j > 0) ? dp[i - 1][j - 1] : 0;
                int right = (j < m - 1) ? dp[i - 1][j + 1] : 0;

                dp[i][j] = prices[i][j] + Math.max(up, Math.max(left, right));
            }
        }

        // Find max in last row
        int maxVal = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxVal = Math.max(maxVal, dp[n - 1][j]);
        }

        System.out.println(maxVal);
        sc.close();
    }
}