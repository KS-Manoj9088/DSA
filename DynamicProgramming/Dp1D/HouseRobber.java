package DynamicProgramming.Dp1D;
import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        int[] lootInHouses = {2, 7, 9, 3, 1};
        // Robber cannot rob adjacent houses...
        // we need to find maximum loot they can rob.


        // By tabulation
        int maxLoot = findMaxLootRobbed(lootInHouses);
        System.out.println(maxLoot);

        // By memoisation
        int[] dp = new int[lootInHouses.length];
        Arrays.fill(dp, -1);
        int maxLoot2 = findMaxLootRobbed2(lootInHouses.length - 1,lootInHouses, dp);
        System.out.println(maxLoot2);
    }
    // Tabulation
    public static int findMaxLootRobbed(int[] loot){
        int[] dp = new int[loot.length+1];

        // Initialise Base Cases
        dp[0] = loot[0];

        // We shouldn't take adjacenty index loot - caution!!!
        for(int i = 1;i < loot.length; i++){
            int take = loot[i];
            if(i > 1){
                take+=dp[i-2];
            }
            int notTake = 0 + dp[i-1];

            dp[i] = Math.max(take, notTake);
        }

        return dp[loot.length - 1];
    }

    // Memoisation

    public static int findMaxLootRobbed2(int index,int[] loot, int[] dp){

        // Base conditions
        if(index == 0) return loot[0];
        if(index < 0) return 0;

        // Check in memo array
        if(dp[index]!=-1){
            return dp[index];
        };

        int take = loot[index] + findMaxLootRobbed2(index-2, loot, dp);
        int notTake = findMaxLootRobbed2(index-1, loot, dp);

        return dp[index] = Math.max(take, notTake);
    }
}
