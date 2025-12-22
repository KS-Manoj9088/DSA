package Arrays;
import java.util.*;

public class MaxValueToRightOfArray {
    public static int[] findMaxToRight(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        result[n - 1] = -1; // Last element has no right-side elements

        int maxRight = -1;
        for (int i = n - 2; i >= 0; i--) {
            maxRight = Math.max(maxRight, arr[i + 1]);
            result[i] = maxRight;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
        int[] maxRight = findMaxToRight(arr);
        System.out.println(Arrays.toString(maxRight)); // Output: [7, 7, 3, 3, -1]
    }
}