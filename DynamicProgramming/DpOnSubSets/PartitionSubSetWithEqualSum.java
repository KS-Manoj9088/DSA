package DynamicProgramming.DpOnSubSets;
import java.util.*;

public class PartitionSubSetWithEqualSum {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};
        int[] arr1 = {1,1,1,9};

        // Inorder to partition the array into 2 subsets having equal sum --> we need to have the sum of whole array 
        //should be a Even number , so that we could split the array into 2 halfs.

        // Eg:- Arr[] = {1,2,3,4,5} here sum = 15 , then how would we split array into 2 half's with equal sum.
        // Therefore an array with totalSum as an Odd Number is not possible to split into 2 partitons of equal sum.

        int totalSum = 0;

        for(int num : arr1){
            totalSum += num;
        }

        if(totalSum % 2 != 0){
            System.out.println("Can't partition array into 2 parts");
            return; // ✅ fix: return early to avoid continuing with invalid case
        }

        // If totalSum is even we can split array as 2 subsets having s1, s2

        // s1  == s2 (partition sums) 
        // Since,       s1+s2 = totalSum  and s1 == s2
        // we can tell s1 = s2 == totalSum/2

        // If we are able to find one subset with Sum == totalSum/2... then we can surely tell that there exists another subset with sam "Sum".
        // Use "SubSet equals to Target" to find if a subset exists with our required sum.

        int target = totalSum / 2;

        int n = arr1.length;
        HashMap<String, Boolean> memo = new HashMap<>();

        boolean canPartition = helper(arr1, memo, n - 1, target);
        System.out.println(canPartition + " - Partioning the array");
    }

    public static boolean helper(int[] arr, HashMap<String, Boolean> memo, int index, int target) {

        // Base Case's
        if (target == 0) {
            return true;
        }

        if (index == 0) {
            return arr[0] == target;  // ✅ fix: only return true if arr[0] equals target
        }

        String key = index + "|" + target;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Consider not taking the index 
        boolean notTake = helper(arr, memo, index - 1, target); 

        // consider taking the element if element is less than or equal to target.
        boolean take = false;
        if (arr[index] <= target) {
            take = helper(arr, memo, index - 1, target - arr[index]);
        }

        boolean result = take || notTake;
        memo.put(key, result);
        return result;
    }
}
