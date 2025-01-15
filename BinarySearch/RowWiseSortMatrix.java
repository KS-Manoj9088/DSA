package BinarySearch;

public class RowWiseSortMatrix {
    public static void main(String[] args) {
        int[][] arr = { {10,20,30,40}, {15,25,35,45}, {28,29,37,49}, {33,34,38,50}};
        int target = 37;
        int[] result = rowWiseSearch(arr, target);
        System.out.println("Index of element " + target + " is [" + result[0] +","+result[1]+"]");

    }

    public static int[] rowWiseSearch(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr[-0].length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            else if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
    
}
