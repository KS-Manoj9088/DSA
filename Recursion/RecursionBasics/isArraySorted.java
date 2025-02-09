package Recursion.RecursionBasics;

public class isArraySorted {
    
    static int first = 0;
    public static void main(String[] args) {
        
        int[] arr = new int[] {1};

        boolean result = isSorted(arr,first);
        System.out.println(result);
    }

    public static boolean isSorted(int[] arr,int first){

        if(first==arr.length-1){
            return true;
        }
        if(arr[first]>arr[first+1]){
            return false;
        }
        return isSorted(arr,first+1);
    }


    public static boolean isSorted1(int[] arr,int first){

        if(first==arr.length-1){
            return true;
        }
        return arr[first]<arr[first+1] && isSorted(arr,first+1);
    }

}
