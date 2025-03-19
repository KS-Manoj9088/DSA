package SlidingWindowAnd2Pointer;
import java.util.*;

public class SubarrayIntegers{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        List<List<Integer>> subArrays = printSubArrays(arr);
        for (List<Integer> subArray : subArrays) {
            System.out.println(subArray);
        }

    }

    public static List<List<Integer>> printSubArrays(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        for(int i = 0;i < arr.length; i++){
            List<Integer> inner = new ArrayList<>();
            for(int j = i;j<arr.length;j++){
                inner.add(arr[j]); // [1]
                outer.add(new ArrayList<>(inner)); //   [[1]]
            }
        }

        return outer;
    }
    
}
