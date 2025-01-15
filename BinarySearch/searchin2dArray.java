package BinarySearch;

public class searchin2dArray {
    public static void main(String[] args) {
        int[][] arr = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int target = 5;
        int[] result = getIndex(arr, target);
        if (result[0] != -1) {
            System.out.println("Index of target element is: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Target element not found.");
        }
    }

    public static int[] getIndex(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Corrected the condition to arr[i].length
                if (arr[i][j] == target) {
                    return new int[] { i, j }; // Return a 1D array with row and column indices
                }
            }
        }
        return new int[] { -1, -1 }; // Return {-1, -1} if the target is not found
    }
}
