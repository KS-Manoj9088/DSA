package Strings;
import java.util.*;
import CommonMethods.commonMethods;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = nextGreaterElement(arr);
        commonMethods.printArray(result);
    }

    public static int[] nextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek();
            }
            else{
                result[i] = -1;
            }
            stack.push(arr[i]);
        }
        return result;
    }
    
}
