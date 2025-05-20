package BinarySearch;
public class SingleElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,4,5,5,6,6};
        int res = new SingleElement().singleNonDuplicate(arr);
        System.out.println(res);
    }

    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        //Base case's
        if(nums.length == 1) return nums[0];

        if(nums[0]!=nums[1]) return nums[0];

        if(nums[len-1]!=nums[len-2]) return nums[len-1];

        int low = 1; // Since we use if conditions for 0th index
        int high = len-2; // Since we used if condition for the Last Index

        while(low<=high){
            int mid = low + (high-low)/2;

            if( (nums[mid-1]!=nums[mid]) && (nums[mid]!=nums[mid+1]) ){
                return nums[mid];
            }

            if( (mid%2==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid-1]==nums[mid]) ){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
