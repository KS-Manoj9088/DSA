package DynamicProgramming.Dp2D;
import java.util.*;

public class Talentio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] prices = new int[n][m];
        for(int i = 0;i < n;i ++){
            for(int j =0;j < m; j++){
                prices[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        for(int i = 0;i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i = 0;i < m; i++){
            dp[0][i] = prices[0][i];
        }

        for(int i = 1;i < n; i++){
            for(int j = 0;j < m; j++){
                int left = 0;
                int right = 0;
                int up = 0;

                if(i - 1 > 0){
                    up = dp[i-1][j];
                }

                if(i > 0 && j > 0){
                    left = dp[i-1][j-1];
                }

                if(i > 0 && j < m-1){
                    right = dp[i-1][j+1];
                }

                dp[i][j] = prices[i][j] + Math.max(up, Math.max(left, right));
            }
        }

        int maxVal = Integer.MIN_VALUE;

        for(int i = 0;i < m; i++){
            maxVal = Math.max(dp[n-1][i], maxVal);
        }

        System.out.println(maxVal);

        sc.close();
    }
}