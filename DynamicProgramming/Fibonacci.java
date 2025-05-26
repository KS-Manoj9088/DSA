package DynamicProgramming;
import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        int n = 6; // Get 5th fibonacci number
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int findFiboNum = fibonacci2(n, dp);
        System.out.println(findFiboNum);
    }

    // memoisation
    public static int fibonacci(int n,int[] dp){

        if(n<=1){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        return dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
    }

    // tabulation
    public static int fibonacci2(int n,int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2;i <= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}