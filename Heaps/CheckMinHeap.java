package Heaps;
//import java.util.*;

public class CheckMinHeap {
    public static boolean isMinHeap(int[] arr) {
        int n = arr.length;

        // Only need to check internal nodes (i.e., nodes with at least one child)
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[i] > arr[left]) return false;
            if (right < n && arr[i] > arr[right]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        if (isMinHeap(arr)) {
            System.out.println("Is a Min Heap");
        } else {
            System.out.println("Not a Min Heap");
        }
    }
}