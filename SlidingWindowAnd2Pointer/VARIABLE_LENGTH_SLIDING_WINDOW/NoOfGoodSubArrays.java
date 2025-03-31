package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;

public class NoOfGoodSubArrays{

    public static int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }

    public static int helper(int[] nums, int k){        
        int left = 0;
        int n = nums.length;
        int oddCount = 0;
        int count = 0;

        for(int right = 0; right < n; right++){
            int num = nums[right];

            if(num%2==1){
                oddCount++;
            }

            while(oddCount>k){
                int num_left = nums[left];
                if(num_left%2==1){
                    oddCount--;
                }
                left++;
            }

            count+=(right-left+1); //observation: Every valid window contributes (right - left + 1) subarrays.
        }
        return count;
        
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(arr, k));
    }
}