package SortingAlgorithms.CyclicSortPattern;
import CommonMethods.*;

public class CyclicSort {

    public static void main(String[] args){
        int[] arr = new int[] {3,5,2,1,4};
        // Array Should be in Range of 1 to "N";      **
        System.out.println("Original Array: ");
        commonMethods.printArray(arr);

        System.out.println("Sorted Array: ");
        commonMethods.printArray(cyclicSort(arr));

    }

    public static int[] cyclicSort(int[] arr){
        for(int i = 0;i < arr.length;){
            int correctIndex = arr[i] - 1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    } 
    
}
