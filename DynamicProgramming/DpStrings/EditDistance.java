package DynamicProgramming.DpStrings;
import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];

        for(int i = 0;i <= n; i++){
            Arrays.fill(dp[i], -1);
        }

        int minOperations = helper(s1, s2, dp, n, m);
        System.out.println(minOperations);
    }

    public static int helper(String s1, String s2, int[][] dp, int i, int j){
        if(i == 0){
            return j;
        }

        if(j == 0){
            return i;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i-1) == s2.charAt(j-1)){
            return dp[i][j] = 0 + helper(s1, s2, dp, i-1, j-1);  // Decrease the string matching space
        }
        else{
            int insertions = 1 + helper(s1, s2, dp, i, j-1);
            int deletions = 1 + helper(s1, s2, dp, i-1, j);
            int replacements = 1 + helper(s1, s2, dp, i-1, j-1);

            return dp[i][j] = Math.min(insertions, Math.min(replacements, deletions));
        }
    }
}
