package DynamicProgramming;
import java.util.*;

public class FrogJump2Steps {
    public static void main(String[] args) {
        int[] height = new int[]{30, 10, 60, 10, 60, 50};
        int[] dp = new int[height.length]; // No need for height.length + 1
        Arrays.fill(dp, -1);

        // By memoisation
        int min_energy = findMinimumEnergy(height.length - 1, height, dp);
        System.out.println(min_energy);

        // By tabulation 
        int min_energy2 = findMinimumEnergy2(height, dp);
        System.out.println(min_energy2);
    }

    // Memoization approach
    public static int findMinimumEnergy(int index, int[] arr, int[] dp) {
        if (index == 0) {
            return 0;
        }

        if (index == 1) {
            return Math.abs(arr[1] - arr[0]); // Fixed subtraction logic
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        // Move 1 step backwards
        int left = findMinimumEnergy(index - 1, arr, dp) + Math.abs(arr[index] - arr[index - 1]);
        int right = Integer.MAX_VALUE;

        // Ensure index - 2 does not go out of bounds
        if (index > 1) {
            right = findMinimumEnergy(index - 2, arr, dp) + Math.abs(arr[index] - arr[index - 2]);
        }

        // Store computed result in dp array before returning
        return dp[index] = Math.min(left, right);
    }

    // tabulation
public static int findMinimumEnergy2(int[] arr, int[] dp) {
    dp[0] = 0;
    dp[1] = Math.abs(arr[1] - arr[0]); // Fix: Ensure absolute difference

    for (int i = 2; i < arr.length; i++) {
        dp[i] = Math.min(dp[i - 1] + Math.abs(arr[i] - arr[i - 1]), 
                         dp[i - 2] + Math.abs(arr[i] - arr[i - 2]));
    }
    return dp[arr.length - 1];
}
}