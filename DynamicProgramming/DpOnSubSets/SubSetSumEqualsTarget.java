package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class SubSetSumEqualsTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        // Our aim is to return True -- if a subsequence with sum == target appears...   , else return false

        // what does helper(index, target) means ---> can i achieve the sum == target , bu using all the elements in between the 0 and index.
        
        int n = arr.length;
        int[][] dp = new int[n][target+1];  // Why dp array of length '2' -- since we have only 2 parameters changing...

        for(int i = 0;i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        boolean subSetExists = helper(arr, dp, n-1, target); // Only last 2 params change in helper function.

        System.out.println(subSetExists);
    }

    public static boolean helper(int[] arr, int[][] dp, int index, int target){
        // BaseCase's 

        // If at any instance if our target becomes 'Zero' then return True

        if(target == 0){
            return true;
        }

        if(index == 0){
            return (arr[index]==target);      // we have reached our last index and we need to achieve a particular target.. 
                                              // Inorder to achieve the target our element at 0th index should be equals to target.
        }

        if(dp[index][target]!=-1){
            return dp[index][target] == 0 ? false : true; 
        }

        // For every index - we have 2 options whether to take the element or not taking it.

        boolean notTake = helper(arr, dp, index-1, target);

        boolean take = false;   // Consider initially false.
        
        if(arr[index]<=target){
            take = helper(arr, dp, index-1, target-arr[index]);
        }

        dp[index][target] = (notTake || take) ? 1 : 0;
        return take || notTake; 
    }
}

/*
 * 
package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class SubSetSumWithNegatives {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 7};
        int target = 5;

        Map<String, Boolean> memo = new HashMap<>();

        boolean result = helper(arr, arr.length - 1, target, memo);
        System.out.println(result);
    }

    public static boolean helper(int[] arr, int index, int target, Map<String, Boolean> memo) {
        // Base Cases
        if (target == 0) return true;
        if (index < 0) return false;

        String key = index + "|" + target;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Not take current element
        boolean notTake = helper(arr, index - 1, target, memo);

        // Take current element
        boolean take = helper(arr, index - 1, target - arr[index], memo);

        boolean result = take || notTake;
        memo.put(key, result);
        return result;
    }
}
 */