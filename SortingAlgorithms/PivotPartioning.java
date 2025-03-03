package SortingAlgorithms;
import java.util.*;

public class PivotPartioning {
    public static void main(String[] args) {
        int[] arr = {9, 12, 5, 10, 14, 3, 10};

        int low = 0;
        int equal = 0;
        int pivot = 10;

        // Count occurrences of elements < pivot and == pivot
        for (int num : arr) {
            if (num < pivot) {
                low++;
            } else if (num == pivot) {
                equal++;
            }
        }

        int[] temp = Arrays.copyOf(arr, arr.length); // Copy original array
        int lowIndex = 0;
        int equalIndex = low;
        int highIndex = low + equal;

        for (int num : temp) {
            if (num < pivot) {
                arr[lowIndex++] = num;
            } else if (num == pivot) {
                arr[equalIndex++] = num;
            } else {
                arr[highIndex++] = num;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
