package Candelatest;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean res = checkIfExists(arr);
        System.out.println(res);

        sc.close();
    }

    public static boolean checkIfExists(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        //int len = 2;
        //int count = 0;

        for(int i = 0;i < n-1; i++){
            int sum = arr[i] + arr[i+1];

            if(hm.containsKey(sum)){
                return true;
            }
            
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }

        return false;
    }
}
