package SortingAlgorithms;
import CommonMethods.*;

public class BubblesSort {

    public static void main(String[] args) {
        
        int[] arr = new int[] {9,7,33,65,12,10,34,57};

        System.out.println("Original Array: ");
        commonMethods.printArray(arr);
        
        System.out.println("Sorted Array : ");
        commonMethods.printArray(bubbleSort(arr));
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            for(int j = 1;j <= n-i-1;j++){
                if(arr[j-1] >= arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
}
