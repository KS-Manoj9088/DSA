package Hashing;
import java.util.Scanner;
import CommonMethods.*;

public class countOfArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of values required for array : ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }

                int[] freq_arr = frequencyCount(arr);
                commonMethods.printArray(freq_arr);
                sc.close();
    }

    public static int[] frequencyCount(int[] arr){
                int getMax = commonMethods.findMaximumInArray(arr);
                int[] freq_arr = new int[getMax+1];
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 0) {
                        freq_arr[arr[i]]++;
                    }
                }
                return freq_arr;
    }
}