package Recursion.RecursionBasics;
import java.util.*;

public class SelectionSortRecursion {

    public static void main(String[] args) {
        int[] arr = {2,1,1,1,1,91,1,3,1,2};
        int[] res = selectionSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(res));
    }
    

    public static int[] selectionSort(int[] arr,int start,int end){
        if(start >= end){
            return arr;
        }
        int maxIndex = findMaxIndex(arr, start, end);
        swap(arr, maxIndex, end);
        
        return selectionSort(arr, start, end-1);
    }

    public static int findMaxIndex(int[] arr,int start,int end){
        int max= arr[start];
        int maxIndex=start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
