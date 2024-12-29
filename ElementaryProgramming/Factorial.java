package ElementaryProgramming;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            long factorial = getFactorial(n);
            System.out.println("Factorial of " + n + " is " + factorial);
            
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static long getFactorial(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        return num*getFactorial(num-1);
    }

}
