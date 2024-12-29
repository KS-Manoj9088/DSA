package ElementaryProgramming;
import CommonMethods.commonMethods;

public class reversedNumbers {
    public static void main(String[] args) {
        int[] arr = {121,133,35,67,878908,123454321};
        System.out.print("The Original Array is : ");
        commonMethods.printArray(arr);
        System.out.print("The Reversed Array is : ");
        commonMethods.printArray(getReversedNumbers(arr));
        
    }
    
    public static int[] getReversedNumbers(int arr[]){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int reversedNumber = 0;
            int originalNumber = arr[i];
            while (originalNumber != 0) {
                int rem = originalNumber%10;
                reversedNumber = reversedNumber*10 + rem;
                originalNumber = originalNumber/10;
            }
            reversed[i] = reversedNumber;
        }
        return reversed;
    }
}
