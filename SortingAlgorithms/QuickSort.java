package SortingAlgorithms;
import CommonMethods.commonMethods;
public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3,2,4,1,7,1,8,6};
        System.out.println("Array Before Sorting :- ");
        commonMethods.printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("Array After Sorting :- ");
        commonMethods.printArray(arr);
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex = helperSort(arr,low,high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    public static int helperSort(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            // To keep elements smaller than or equal to pivot to the left side of pivot
            while( (arr[i]<=pivot) && (i <=high-1) ){
                i++;
            }

            // To keep elements greater than pivot to right side to right side of pivot

            while( (arr[j]>pivot) && (j>=low+1)){
                j--;
            }

            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    public static void swap(int[] arr,int start,int high){
        int temp = arr[start];
        arr[start] = arr[high];
        arr[high] = temp;
    }
}