package DynamicProgramming.DpOnStocks;
import java.util.*;

public class BestTimeToSellAndBuyStocks2 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int days = prices.length;

        int[][] dp = new int[days][2]; // To hold the buyStock status

        for(int i = 0;i < days; i++){
            Arrays.fill(dp[i], -1);
        }

        int maxProfit  = helper(prices, dp, 0, 1);
        System.out.println(maxProfit);
    }

    public static int helper(int[] prices,int[][] dp, int day,int buyStatus){
        // base case

        if(day == prices.length){
            return 0;     // Because on the last day by buying the stock doesn't make up for any profit.
        }

        if(dp[day][buyStatus]!=-1){
            return dp[day][buyStatus];
        }

        int profit;
        if(buyStatus == 1){
            int buyStock = -prices[day] + helper(prices, dp, day+1, 0);  // we are buying the stock means we are losing our money ... After buyinh the stock the buyStatus changes to 0 as we need to sell the stock before buying another stock
            int skipBuying = 0 + helper(prices, dp, day+1, 1);     // Skip buying the stock on current day and try to buy the stock on following days

            profit = Math.max(buyStock, skipBuying);
        }
        else{
            int sellStock = prices[day] + helper(prices, dp, day+1, 1);  // We are selling our holding stock we are gaining some amount irrespective of the cost of stock on the current day. After selling the stock the buyStatus changes to 1 and now on we can proceed with buying another stock.
            int holdStock = 0 + helper(prices, dp, day+1, 0);  // Hold the stock you are having and try to sell in succesive days

            profit = Math.max(sellStock, holdStock);
        }

        return dp[day][buyStatus] = profit;
    }
}
