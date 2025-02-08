package Arrays;
import CommonMethods.*;

public class RotateArrayRight {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Array before right rotation:");
        commonMethods.printArray(arr);

        rotateRight(arr, d); // In-place modification

        System.out.println("Array after right rotation:");
        commonMethods.printArray(arr);
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle d > n cases

        int[] temp = new int[d];

        // Step 1: Store the last d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }

        // Step 2: Shift elements from right to left
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }

        // Step 3: Copy elements from temp to the beginning
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
}
