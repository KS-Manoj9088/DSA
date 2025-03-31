package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;

public class BinarySubArrayWithKSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal) - helper(nums,goal-1);
    }

    public static int helper(int[] nums, int goal){
        int left = 0;
        int sum = 0;
        int  n = nums.length;
        int ans = 0;
        for(int right = 0; right < n; right++){
            int num = nums[right];
            sum+=num;

            while(left<=right && sum>goal){
                int num_left = nums[left];
                sum-=num_left;
                left++;
            }

            ans+=(right-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}
