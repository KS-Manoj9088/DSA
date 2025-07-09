import java.util.*;

public class NextSmallestElementToLeft {
    public static void main(String[] args) {
        int[] arr = {1,4, 6, 7, 3, 7, 8, 1};
        int[] result = nextSmallestElementToLeft(arr);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] nextSmallestElementToLeft(int[] arr){
        int[] nsl = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i < arr.length; i++){
            int num = arr[i];

            while(!st.isEmpty() && st.peek()>=num){
                st.pop();
            }

            nsl[i] = st.isEmpty()==true ? -1 : st.peek();
            st.push(num);
        }

        return nsl;
    }
}

