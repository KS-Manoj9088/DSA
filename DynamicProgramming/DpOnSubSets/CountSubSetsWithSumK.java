package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class CountSubSetsWithSumK {
    public static void main(String[] args) {
        // int[] arr = {0, 0, 1};  // Edge case   target = 1   --> it return's 4 subsets with sum '1'.  {0,1}, {0,1}, {0,0,1}, {1}
        int[] arr1 = {1,2,3,4};

        int n = arr1.length;
        int target = 5;

        HashMap<String, Integer> memo = new HashMap<>();

        int countOfSubsets = helper(arr1, memo, n - 1, target);

        System.out.println(countOfSubsets);  // Output should be 4
    }

    public static int helper(int[] arr, HashMap<String, Integer> memo, int index, int target) {
        // Base Case
        if (index == 0) {
            int ways = 0;
            if (target == 0) ways++;              // Exclude the element
            if (arr[0] == target) ways++;         // Include if it matches
            return ways;
        }

        // Memoization key
        String key = index + "," + target;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Not taking the current element
        int notTake = helper(arr, memo, index - 1, target);

        // Taking the current element (only if it's ≤ target)
        int take = 0;
        if (arr[index] <= target) {
            take = helper(arr, memo, index - 1, target - arr[index]);
        }

        int result = take + notTake;
        memo.put(key, result);  // Store result

        return result;
    }
}
