package BinarySearch;

public class ColumnWiseSortMatrix {

    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50} };
        int target = 37;
        int[] result = columnWiseSearch(arr, target);
        
        if (result[0] != -1) {
            System.out.println("Index of element " + target + " is [" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
    
    public static int[] columnWiseSearch(int[][] arr, int target) {
        int row = arr.length - 1; // Start from the last row
        int col = 0; // Start from the first column
        
        while (row >= 0 && col < arr[0].length) { // Use arr[0].length for columns
            if (arr[row][col] == target) {
                return new int[] { row, col }; // Target found
            } else if (arr[row][col] < target) {
                col++; // Move to the next column
            } else {
                row--; // Move up to the previous row
            }
        }
        
        return new int[] { -1, -1 }; // Target not found
    }
}
