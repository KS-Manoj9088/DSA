package SlidingWindowAnd2Pointer;

public class NoOfSubArraysOfLengthKandAverageGreaterThanorEqualToThreshold {
    public static void main(String[] args) {
        int[] arr = new int[] {11,13,17,23,29,31,7,5,2,3};
        int windowLength = 3;
        int threshold = 5;
        int count = findCount(arr, windowLength, threshold);
        System.out.println(count);

    }

    public static int findCount(int[] arr,int k,int threshold){
        int n = arr.length;
        int left = 0;
        int count = 0;
        int sum = 0;
        for(int right = 0; right<n; right++){
            sum+=arr[right];

            if(right-left==k){
                int num = arr[left];
                sum = sum-num;
                left++;   //Important ra chala sarlu missing nuvvu.
            }

            if(right-left+1==k){
                float avg = sum/k;
                if(avg>=threshold){
                    count++;
                }
            }
        }

        return count;
    }



    public static int findCountApproach2(int[] arr, int k, int threshold) {
        int n = arr.length;
        int left = 0, count = 0, sum = 0;
        int requiredSum = k * threshold; // Since avg >= threshold, sum should be >= k * threshold

        // Initialize the first window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Check the first window
        if (sum >= requiredSum) {
            count++;
        }

        // Sliding window technique
        for (int right = k; right < n; right++) {
            sum += arr[right];      // Add new element to window
            sum -= arr[left];       // Remove leftmost element from window
            left++;                 // Move window forward

            if (sum >= requiredSum) {
                count++;
            }
        }

        return count;
    }
}
