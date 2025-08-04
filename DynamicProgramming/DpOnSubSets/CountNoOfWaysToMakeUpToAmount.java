package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class CountNoOfWaysToMakeUpToAmount {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 6;
        int n = coins.length;

        int[][] dp = new int[n][amount+1];

        for(int i = 0;i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        int ways = helperWays(coins, dp, n-1, amount);
        System.out.println("No of Ways to make upto Amount : "+ways);
    }

    public static int helperWays(int[] coins,int[][] dp, int index, int amount){
        //Base Case 

        if(index == 0){
            if(amount%coins[0] == 0){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }

        // Dont take the coin 
        int notTake = helperWays(coins, dp, index-1, amount);

        // Take the coin if coins[index]<=amount
        int take = 0;

        if(coins[index]<=amount){
            take = helperWays(coins, dp, index, amount - coins[index]);
        }

        return dp[index][amount] = (take + notTake);
    }
}
