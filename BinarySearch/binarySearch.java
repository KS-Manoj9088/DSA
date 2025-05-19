package BinarySearch;

public class binarySearch{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int result = new binarySearch().binarySearching(arr, target);
        System.out.println("The index of target is : "+result);
    }

    public int binarySearching(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
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
        return -1; 
    }

}
