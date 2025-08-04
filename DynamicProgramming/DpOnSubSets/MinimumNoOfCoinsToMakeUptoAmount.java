package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class MinimumNoOfCoinsToMakeUptoAmount {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 12;
        int n = coins.length;

        int[][] dp = new int[n][amount+1];

        for(int i = 0;i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        int noOfCoins = helper(coins, dp, n-1, amount);

        if(noOfCoins>=(int) (1e9)){
            System.out.println("Make make upto the amount");
        }
        else{
            System.out.println("No of coins to makeup to amount : "+noOfCoins);
        }
    }

    public static int helper(int[] coins, int[][] dp, int index, int amount){
                //Base Case 

        if(index == 0){
            if(amount%coins[0] == 0){
                return amount/coins[0];
            }
            else{
                return (int)(1e9);
            }
        }

        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }

        // Dont take the coin 
        int notTake = helper(coins, dp, index-1, amount);

        // Take the coin if coins[index]<=amount
        int take = (int) (1e9);

        if(coins[index]<=amount){
            take = 1 + helper(coins, dp, index, amount - coins[index]);
        }

        return dp[index][amount] = Math.min(take, notTake);
    }
}
