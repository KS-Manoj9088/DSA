package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;

public class MaxLengthOfSubArrayWithKones {

    public static void main(String[] args) {
        int[] arr = {0,1,3,1,1,6,7,1,0,1};
        int k =2;

        int maxLen = maxLengthSubArray(arr, k);
        System.out.println("Maximum length of subarray with k ones is " + maxLen);
    }

    public static int maxLengthSubArray(int[] arr,int k){
        int left = 0;
        int maxLen = 0;
        int countOnes = 0;
        int n = arr.length;
        for(int right = 0; right < n; right++){
            if(arr[right]==1){
                countOnes++;
            }
            
            while(countOnes>k){
                if(arr[left]==1){
                    countOnes--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
    
}
