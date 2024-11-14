package Arrays;
import CommonMethods.*;


public class reverseArray {
    
    public static void main(String[] args) {

        int arr[] = new int[] {1, 2 ,3 , 5, 6, 7, 8, 9};
        int result[] = reversedArray(arr, 0, arr.length-1);
        commonMethods.printArray(result);
    }

    public static int[] reversedArray(int a[], int start, int end){

        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
}
