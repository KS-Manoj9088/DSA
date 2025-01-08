package BinarySearch;

public class FloorOfANumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,11};
        int target = 10;
        int result = floorSearch(arr, target);
        System.out.println("The index of target is : "+ arr[result]);
    }

    public static int floorSearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }
    
}
