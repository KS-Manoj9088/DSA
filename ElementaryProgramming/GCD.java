package ElementaryProgramming;
import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 vales to find GCD : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is : "+gcd);
        sc.close();
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }  
}
