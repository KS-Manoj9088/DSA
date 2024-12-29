package ElementaryProgramming;
import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Number of digits in the number is " + getCountofDigits(n));
        sc.close();
    }
    public static int getCountofDigits(int n){
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
