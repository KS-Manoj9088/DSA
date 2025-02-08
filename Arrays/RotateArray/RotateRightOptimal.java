package Arrays.RotateArray;
import CommonMethods.*;

public class RotateRightOptimal {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        RotateRightOptimal rro = new RotateRightOptimal();
        rro.rotate(nums, 2);
        commonMethods.printArray(nums);

    }

    public void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n

        Arrays.reverseArray.reversedArray(arr, 0, n - 1);   // Step 1: Reverse the entire array
        reverse(arr, 0, d - 1);   // Step 2: Reverse first d elements
        reverse(arr, d, n - 1);   // Step 3: Reverse the remaining elements
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
