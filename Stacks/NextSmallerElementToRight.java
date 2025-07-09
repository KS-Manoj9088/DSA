import java.util.*;

public class NextSmallerElementToRight {
        public static void main(String[] args) {
        int[] arr = {1,4, 6, 7, 3, 7, 8, 1};
        int[] result = nextSmallestElementToRight(arr);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] nextSmallestElementToRight(int[] arr){
        int[] nsr = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            int num = arr[i];

            while(!st.isEmpty() && st.peek()>=num){
                st.pop();
            }

            nsr[i] = st.isEmpty()==true ? -1 : st.peek();
            st.push(num);
        }

        return nsr;
    }
}
