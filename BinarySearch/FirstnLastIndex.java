package BinarySearch;

public class FirstnLastIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        int target = 2;

        /*
        // Find the first occurrence
        int first = findFirstOccurrence(arr, target);

        // Find the last occurrence
        int last = findLastOccurrence(arr, target);
        */
        int first = search(arr,target,true);  // This function will check the 1st occurence of our target in left sub array - after finding a initial solution.
        int last = search(arr,target,false);  // This function will check the 1st occurence of our target in right sub array - after finding a initial solution.

        // Output results
        System.out.println("First Index: " + first);
        System.out.println("Last Index: " + last);
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid; // Save the current index
                high = mid - 1; // Move left to find the first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid; // Save the current index    // Ekkada 1st occurence vacchaka next SubArray lo check chestham.
                low = mid + 1; // Move right to find the last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int search(int[] arr,int target, boolean findStart){
        int ans = -1;  //Stationary Answer Say
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(target<arr[mid]){
                high = mid-1;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                ans = mid;
                if(findStart){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return ans;
    }
}
