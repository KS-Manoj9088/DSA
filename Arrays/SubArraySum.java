package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SubArraySum {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		ArrayList<Integer> l1 = new ArrayList<>();
		for(int i = 0;i < a.length;i++)
		{
			int sum = 0;
			for(int j = i;j<a.length;j++)
			{
				sum+=a[j];
				l1.add(sum);
			}
		}
		Collections.sort(l1);
		System.out.println(l1);
		for(int i = 0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		int minSubArraySum = Collections.min(l1);
        System.out.println("Minimum SubArray Sum : " + minSubArraySum);
		int maxSubArraySum = Collections.max(l1);
		System.out.println("Maximum SubArray Sum :"+ maxSubArraySum);
		if(l1!=null)
		{
			System.out.println("true");
		}

	}

	public static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // Find the maximum sum ending at index i by either extending 
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
          
            // Update res if maximum subarray sum ending at index i > res
            res = Math.max(res, maxEnding);
        }
        return res;
    }

}
