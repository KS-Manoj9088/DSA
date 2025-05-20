package CommonMethods;
import java.util.*;

public class commonMethods{
    Scanner sc =new Scanner(System.in);
    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void printIntegerList(List<Integer> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }

    public static int findMinimumInArray(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                }
        }
        return min;
    }

    public static int findMaximumInArray(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                }
        }
        return max;
    }

    public static int getNumLength(int num){
        int count = 0;
        int temp = num;
        while(temp != 0){
            count++;
            temp = temp / 10;
        }
        return count;
    }

    public int[] readArrayValues(int[] arr,int n){

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
