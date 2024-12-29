package Hashing;
import java.util.HashMap;

public class countUsingHashing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4,5};
        getCount(arr);
    }

    public static HashMap<Integer,Integer> getCount(int arr[]){
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        for(int key : hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }
        return hm;
    } 
}
