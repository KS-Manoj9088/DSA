package ElementaryProgramming;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n+" is Neon Number : "+isNeonNumber(n));
        sc.close();
    }
    public static boolean isNeonNumber(int num){
        int num_squ = (int)Math.pow(num,2);
        int num_squ_sum = SumOfDigits.getNumSum(num_squ);
        return num_squ_sum == num;
    }
    
}
