package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class CountPartitionsWithGivenDifference {
    public static void main(String[] args) {
        int arr[] = {5,2,6,4};
        int diff = 3;
        int n = arr.length;
        int totalSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        int s2 = (totalSum - diff)/2;
        HashMap<String, Integer> memo = new HashMap<>();


        int ways = helper(arr, memo, n-1, s2);
        System.out.println("No of partitions : "+ways);
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
