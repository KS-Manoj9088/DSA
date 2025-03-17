package Arrays;


/**
 * 
 * LEETCODE 2016
 */
public class MaximumDifferenceinIncreasingArray{
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6};

        MaximumDifferenceinIncreasingArray md = new MaximumDifferenceinIncreasingArray();
        int maxDiff = md.maximumDifference(arr);
        System.out.println(maxDiff);
    }

    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int minElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minElement) {
                int diff = nums[i] - minElement;
                maxDiff = Math.max(maxDiff, diff);
            } else {
                minElement = Math.min(minElement, nums[i]);
            }
        }

        return maxDiff;
    }
}