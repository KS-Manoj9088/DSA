package SortingAlgorithms;
import CommonMethods.*;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] arr = new int[] {65,23};

        System.out.println("Original Array: ");
        commonMethods.printArray(arr);
        
        System.out.println("Sorted Array : ");
        commonMethods.printArray(selectionSort(arr));
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i= 0; i < n-1;i++){
            int lastIndex = n-i-1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }

        return arr;
    }

    public static int getMaxIndex(int[] arr,int low,int high){
        int maxIndex = low;
        for(int i = low+1;i<=high;i++){
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
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
