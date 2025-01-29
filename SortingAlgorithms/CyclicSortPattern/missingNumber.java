package SortingAlgorithms.CyclicSortPattern;

public class missingNumber {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 7, 6, 0};

        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;

        // Cyclic sort using for loop
        for (int i = 0; i < n; ) {
            if (arr[i] < n && arr[i] != arr[arr[i]]) {
                // Swap arr[i] with arr[arr[i]]
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            } else {
                i++; // Increment only if no swap is needed
            }
        }

        // Find the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        // If no missing number is found, return n
        return n;
    }
}
