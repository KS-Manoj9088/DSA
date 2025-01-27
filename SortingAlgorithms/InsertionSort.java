package SortingAlgorithms;
import CommonMethods.*;
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[] {9,7,33,65,12,10,34,57};

        System.out.println("Original Array: ");
        commonMethods.printArray(arr);
        
        System.out.println("Sorted Array : ");
        commonMethods.printArray(insertionSort(arr));
    }

    public static int[] insertionSort(int[] arr){
        
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j-1]>=arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    
}
