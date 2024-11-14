package Arrays;
import java.util.*;
import CommonMethods.*;

public class RemoveEvenNo {
    public static void main(String[] args) {

        int array1[] = new int[] {1,2,3,4,4,5,5,6,6,7,8,8,8,6,10,11,13,15,17,19};
        int[] oddArray = removeEven(array1); 
        printArray(oddArray);
        System.out.println("---------------");


        // Using ArrayList
        List<Integer> oddList = new ArrayList<>();
        for (int num : array1) {
            if(num%2 != 0){
                oddList.add(num);
            }
        }

        commonMethods.printIntegerList(oddList);
    }

    public static int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2!= 0){
                oddCount++;
            }
        }
        int result[] = new int[oddCount];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 != 0){
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.println(num);
        } 
    }


}

