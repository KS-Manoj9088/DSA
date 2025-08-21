package DynamicProgramming.DpOnStocks;
import java.util.*;

public class BestTimeToSellAndBuyStocksWithKTransactions {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int days = prices.length;

        int k = 3;  // No of Transactions

        int[][][] dp = new int[days][2][k+1]; // To hold the buyStock status and having the count of transaction completed

        for(int[][] stock : dp){
            for(int[] row : stock){
                Arrays.fill(row, -1);
            }
        }

        int maxProfit  = helper(prices, dp, 0, 1, k);
        System.out.println(maxProfit);
    }

    public static int helper(int[] prices,int[][][] dp, int day,int buyStatus,int transCount){
        // base case

        if(transCount == 0){
            return 0;
        }

        if(day == prices.length){
            return 0;     // Because on the last day by buying the stock doesn't make up for any profit.
        }

        if(dp[day][buyStatus][transCount]!=-1){
            return dp[day][buyStatus][transCount];
        }

        int profit;
        if(buyStatus == 1){
            int buyStock = -prices[day] + helper(prices, dp, day+1, 0, transCount);  // we are buying the stock means we are losing our money ... After buyinh the stock the buyStatus changes to 0 as we need to sell the stock before buying another stock
            int skipBuying = 0 + helper(prices, dp, day+1, 1, transCount);     // Skip buying the stock on current day and try to buy the stock on following days

            profit = Math.max(buyStock, skipBuying);
        }
        else{
            int sellStock = prices[day] + helper(prices, dp, day+1, 1, transCount-1);  // We are selling our holding stock we are gaining some amount irrespective of the cost of stock on the current day. After selling the stock the buyStatus changes to 1 and now on we can proceed with buying another stock.
            int holdStock = 0 + helper(prices, dp, day+1, 0, transCount);  // Hold the stock you are having and try to sell in succesive days

            profit = Math.max(sellStock, holdStock);
        }

        return dp[day][buyStatus][transCount] = profit;
    }
}
