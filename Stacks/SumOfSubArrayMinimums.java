import java.util.*;

public class SumOfSubArrayMinimums {
        public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        long sum = sumOfSubArrayMinimums(arr);
        System.out.println(sum);
    }

    public static long sumOfSubArrayMinimums(int[] arr){

        if (arr.length == 0) return 0;
        int mod = (int) Math.pow(10,9)+7;
        
        // here for a small change NSL (Next Smaller Element To lEft) and NSR(Next Smaller element to right) array's 
        // Calculate chesthunnapudu we store the index of Next Smaller element in stack.

        int[] NSL = findNSLArray(arr);
        int[] NSR = findNSRArray(arr);

        //long[] product = new long[arr.length];
        
        long sum = 0;
        for(int i = 0;i < arr.length; i++){
            long countOfSubArraysToLeft = i - NSL[i];
            long countOfSubArraysToRight = NSR[i]-i;
            long ways  = countOfSubArraysToLeft * countOfSubArraysToRight;
            sum=(sum + ways*arr[i])%mod;
        }
        return sum;
    }

    public static int[] findNSLArray(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] NSL =new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            int num = arr[i];

            while(!st.isEmpty() && arr[st.peek()] >= num){
                st.pop();
            }

            NSL[i] = st.isEmpty() == true ? -1 : st.peek();   // Why '-1' since we are checking on left side --- 
            //if no element is smaller than the current element in left then it results into a condition where st.isEmpty() == true therefore we store '-1'.
            st.push(i);
        }

        return NSL;
    }

    public static int[] findNSRArray(int[] arr){
        int[] NSR = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            int num = arr[i];

            while(!st.isEmpty() && arr[st.peek()]>num){
                st.pop();
            }

            NSR[i] = st.isEmpty() == true ? arr.length : st.peek();
            st.push(i);
        }

        return NSR;
    }


}
