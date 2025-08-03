package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class ZeroOneKnapSack {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};

        int maxWeight = 7; //kg

        // Our aim is to fill knapsack upto maxKnapSackCapacity i.e maxWeight in such a way that we need to achieve max profit...

        int n = weight.length;

        int[][] dp = new int[n][maxWeight + 1];  // Why 2d array because the values of item index and weight of knapsack changes ...
        
        for (int i = 0; i < n; i++) {     // Fill dp array with -1 initially.
            Arrays.fill(dp[i], -1);
        }

        int maxprofit = knapsack(weight, val, dp, n - 1, maxWeight);
        System.out.println(maxprofit);
    }

    public static int knapsack(int[] weight, int[] val, int[][] dp, int index, int maxWeight) {

        // Base Case -->
        // if no item in the store ... that is index == 0 ---- we can take the 0th item if it fits
        // if knapsack is fully filled at one particular index -- the maxWeight param becomes Zero(0). --- then return 0

        if (index == 0) {
            if (weight[0] <= maxWeight) {    // Visting the last item
                return val[0];
            } else {
                return 0;  // No item in store
            }
        }

        if (dp[index][maxWeight] != -1) {
            return dp[index][maxWeight];
        }

        // For every item we have 2 choices - check if current index item weight is less than or equal to maxWeight of knapsack

        // Not taking the element at current index
        int notTake = knapsack(weight, val, dp, index - 1, maxWeight);

        // Taking the element at current index (only if it fits)
        int take = 0;
        if (weight[index] <= maxWeight) {
            take = val[index] + knapsack(weight, val, dp, index - 1, maxWeight - weight[index]);
        }

        // What we need -->  we need to return maxProfit considering the above 2 cases in taking an item
        dp[index][maxWeight] = Math.max(take, notTake);
        return dp[index][maxWeight];
    }
}


/*
    HashMap approach 

    package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class ZeroOneKnapSack_HashMapMemo {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int maxWeight = 7;

        // Our aim is to fill knapsack upto maxKnapSackCapacity i.e maxWeight in such a way that we need to achieve max profit...

        Map<String, Integer> memo = new HashMap<>();
        int maxProfit = knapsack(weight, val, memo, weight.length - 1, maxWeight);
        System.out.println(maxProfit);
    }

    public static int knapsack(int[] weight, int[] val, Map<String, Integer> memo, int index, int maxWeight) {

        // Base Case -->
        if (index == 0) {
            if (weight[0] <= maxWeight) return val[0];
            return 0;
        }

        // Create a unique key for current state
        String key = index + "-" + maxWeight;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int notTake = knapsack(weight, val, memo, index - 1, maxWeight);

        int take = 0;
        if (weight[index] <= maxWeight) {
            take = val[index] + knapsack(weight, val, memo, index - 1, maxWeight - weight[index]);
        }

        int result = Math.max(take, notTake);
        memo.put(key, result);
        return result;
    }
}
 */


 /*
  * 
         ArrayList<ArrayList<Integer>> resDp = new ArrayList<>();

        for (int i = 0; i < dp.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < dp[i].length; j++) {
                row.add(dp[i][j]); // Autoboxing from int to Integer
            }
            resDp.add(row);
        }
        
        System.out.println(resDp);
  */
