package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n]; // Allocate only n columns

        // Generate Pascal's Triangle
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1; // First element in each row is 1
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    arr[i][j] = 1; // Last element in each row is 1
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        // Print Centered Pascal's Triangle
        System.out.println("Centered Pascal's Triangle:");
        for (int i = 0; i < n; i++) {
            // Print leading spaces for better formatting
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }
            // Print the values in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

        // Print Right-Angled Pascal's Triangle
        System.out.println("\nRight-Angled Pascal's Triangle:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generatePascalLeetCode(int numRows) {
        int[][] arr = new int[numRows][numRows];

        for(int i =0; i < numRows;i++){
            arr[i][0] = 1;

            for(int j = 1; j<=i;j++){
                if(i==j){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        List<List<Integer>> outer = new ArrayList<>();

        for(int i = 0; i < numRows;i++){
            List<Integer> inner = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
                inner.add(arr[i][j]);
            }
            outer.add(inner);
        }

        return outer;
    }
}
