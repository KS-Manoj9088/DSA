package ElementaryProgramming;
import CommonMethods.commonMethods;

public class ArmstrongNum {
    public static void main(String[] args) {
        int[] arr = {153,121,1634};
        for(int i = 0;i < arr.length;i++){
            if(isArmstrongNo(arr[i])){
                System.out.println(arr[i] + " is a Armstrong Number");
            }
            else{
                System.out.println(arr[i] + " is not a Armstrong Number");
            }
        }
    }

    public static boolean isArmstrongNo(int num){
        int len = commonMethods.getNumLength(num);
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum + (int)Math.pow(rem, len);
            temp = temp / 10;
        }
        
        return sum == num;
    }
}
