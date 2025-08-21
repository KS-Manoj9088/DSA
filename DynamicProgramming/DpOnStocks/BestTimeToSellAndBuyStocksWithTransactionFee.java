package DynamicProgramming.DpOnStocks;

import java.util.Arrays;

public class BestTimeToSellAndBuyStocksWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int days = prices.length;

        int[][] dp = new int[days][2];

        for(int i = 0;i < days; i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(prices, dp,fee, 0, 1);
    }

    public static int helper(int[] prices,int[][] dp,int fee, int day, int buyStatus){
        // Base case 
        if(day == prices.length){
            return 0;
        }

        if(dp[day][buyStatus]!=-1){
            return dp[day][buyStatus];
        }

        int profit;

        if(buyStatus == 1){
            int buyStock = -prices[day] + helper(prices, dp, fee, day+1, 0);
            int skipBuying = 0 + helper(prices, dp, fee, day+1, 1);

            profit = Math.max(buyStock, skipBuying);
        }
        else{
            int sellStock = (prices[day] - fee) + helper(prices, dp, fee, day+1, 1);  // When buying the stock remove the transaction fee from profit since one selling instnce results in completing on complete transaction
            int holdStock = 0 + helper(prices, dp, fee, day+1, 0);

            profit = Math.max(sellStock, holdStock);
        }

        return dp[day][buyStatus] = profit;
    }   
}
