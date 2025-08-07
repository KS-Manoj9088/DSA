package DynamicProgramming.DpOnSubSets;
import java.util.*;


public class UnBoundedKnapSack{
    public static void main(String[] args) {
        int[] weight = {2,4,6};
        int[] values = {5,11,13};

        int maxWeight = 10;

        int n = 3;
        int[][] dp = new int[n][maxWeight+1];

        for(int i = 0;i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        int maxprofit = knapsack(weight, values, dp, n-1, maxWeight);
        System.out.println(maxprofit);
    }

    public static int knapsack(int[] weight, int[] values,int[][] dp, int index, int maxWeight){
        if(index == 0){
            return (int)(maxWeight / weight[0]) * values[0];
        }

        if(dp[index][maxWeight]!=-1){
            return dp[index][maxWeight];
        }

        int notTake = knapsack(weight, values, dp, index-1, maxWeight);

        int take = Integer.MIN_VALUE;

        if(weight[index]<=maxWeight){
            take = values[index] + knapsack(weight, values, dp, index, maxWeight - weight[index]);
        }

        return dp[index][maxWeight] = Math.max(take, notTake);
    }
}