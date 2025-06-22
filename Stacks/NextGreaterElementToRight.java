import java.util.*;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        int[] nge = nextGreaterElementToRight(arr);
        for (int i : nge) {
            System.out.print(i+" ");
        }

    }

public static int[] nextGreaterElementToRight(int[] arr) {
    int len = arr.length;
    int[] nge = new int[len];
    Stack<Integer> stack = new Stack<>();

    for (int i = len - 1; i >= 0; i--) {
        int ele = arr[i];

        while (!stack.isEmpty() && stack.peek() <= ele) {
            stack.pop();
        }

        nge[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(ele);
    }

    return nge;
}


}
