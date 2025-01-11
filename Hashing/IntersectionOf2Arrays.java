package Hashing;
import java.util.*;
import CommonMethods.*; //Package

public class IntersectionOf2Arrays {

    public static void main(String[] args){
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] arr3 = intersection(arr1, arr2);
        commonMethods.printArray(arr3);      //className.methodName
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Set<Integer> s1 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }

        for(int i = 0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                s1.add(nums2[i]);
            }
        }
        
        int[] result = new int[s1.size()];
        int index = 0;
        for(int num : s1){
            result[index++] = num;
        }
        return result;
    }
    
}



