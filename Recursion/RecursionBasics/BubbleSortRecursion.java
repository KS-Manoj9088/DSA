package Recursion.RecursionBasics;
import java.util.*;

public class BubbleSortRecursion{

    public static void main(String[] args) {
        int[] arr = {9,3,4,5,7,1,2,22,11,22,44,16,71};
        int res[] = bubbleSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(res));

    }

    public static int[] bubbleSort1(int[] arr, int start, int end) {
        if (end == 1) { // Base case: Sorting is complete
            return arr;
        }

        if (start >= end - 1) {
            // Move to the next pass with a reduced end
            return bubbleSort1(arr, 0, end - 1);
        }

        // Swap adjacent elements if out of order
        if (arr[start] > arr[start + 1]) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;
        }

        // Continue within the current pass
        return bubbleSort1(arr, start + 1, end);
    }

    public static int[] bubbleSort(int[] arr, int end) {
        if (end == 1) { // Base case: Only one element left
            return arr;
        }
    
        for (int i = 0; i < end - 1; i++) { // Perform one pass of Bubble Sort
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    
        return bubbleSort(arr, end - 1); // Recursive call for next pass
    }
    

}