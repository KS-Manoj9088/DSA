package ElementaryProgramming;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 vales to find LCM : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int lcm = findLCM(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is : "+ (int)(a*b/GCD.findGCD(a, b)));
        sc.close();
    }
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (max % min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return min;
    }
    
}
