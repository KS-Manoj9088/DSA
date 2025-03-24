package SlidingWindowAnd2Pointer;
import java.util.*;

public class CountDistinctElementsInWindow{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 3, 5, 6};
        int windowLen= 4;
        ArrayList<Integer> res = countDistinctElementsInWindow(arr,windowLen);
        System.out.println(res);
    }

    public static ArrayList<Integer> countDistinctElementsInWindow(int[] arr, int k){
        ArrayList<Integer> res = new ArrayList<>();

        int left = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int right = 0;right < n; right++){
            int num = arr[right];
            map.put(num, map.getOrDefault(num,0)+1);

            if(map.get(num)==1){
                count++;
            }

            if(right-left+1>k){
                int num1 = arr[left];
                map.put(num1, map.get(num1)-1);
                if(map.get(num1)==0){
                    map.remove(num1);
                    count--;
                }
                left++;
            }

            if(right-left+1 == k){
                res.add(count);
            }
        }

        return res;
    }
}