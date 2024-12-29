package ElementaryProgramming;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPerfectNumber(n);
        System.out.println(n + " is a perfect number: " + result);
        sc.close();
    }
    public static boolean isPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum = sum + i;
            }
        }
        return sum == num;
    }
    
}
