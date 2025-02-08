package Arrays;
//import java.util.Scanner;

public class RotateArray90Degree{

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Transpose the array.
		a = transposeArray(a);

		//ReverseRow Operation
		a = reverseRow(a);
		printArray(a);
	}

	public static int[][] transposeArray(int[][] arr){
		int n = arr.length;
		for(int i = 0;i < n;i++){
			for(int j = i+1;j < n;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		return arr;
	}

	public static int[][] reverseRow(int[][] arr){
		int n = arr.length;
		// Reverse each row
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n / 2; j++) {           // Swap matrix[i][j] with matrix[i][n - j - 1]
					int temp = arr[i][j];
					arr[i][j] = arr[i][n - j - 1];
					arr[i][n - j - 1] = temp;
				}
		}
		return arr;
	}

	//Print the array.
	public static void printArray(int[][] arr){
		int n = arr.length;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
