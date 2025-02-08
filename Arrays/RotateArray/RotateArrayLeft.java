package Arrays.RotateArray;
import CommonMethods.*;

public class RotateArrayLeft {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Array before left rotation:");
        commonMethods.printArray(arr);

        rotateLeft(arr, d); // In-place modification

        System.out.println("Array after left rotation:");
        commonMethods.printArray(arr);
    }

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n

        int[] temp = new int[d];

        // Step 1: Store the first d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift elements left
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        // Step 3: Copy the temp array elements to the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
