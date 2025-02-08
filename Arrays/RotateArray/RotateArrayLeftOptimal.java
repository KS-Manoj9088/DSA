package Arrays.RotateArray;
import CommonMethods.*;

public class RotateArrayLeftOptimal {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Array before left rotation:");
        commonMethods.printArray(arr);

        rotateLeft(arr, d);

        System.out.println("Array after left rotation:");
        commonMethods.printArray(arr);
    }

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n

        Arrays.reverseArray.reversedArray(arr, 0, d - 1);   // Reverse first d elements
        reverse(arr, d, n - 1);   // Reverse remaining n-d elements
        reverse(arr, 0, n - 1);   // Reverse entire array
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
