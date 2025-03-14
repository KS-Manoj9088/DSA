package Strings;

public class LongestIncreasingSubsequence{
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] subseq = new int[nums.length];
        int max_length = 0;
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    subseq[i] = j;
                }
            }
        }
        int len = 0;
        for(int i : dp){
            if(i>len){
                len = i;
            }
        }

        return len+1;
    }
}