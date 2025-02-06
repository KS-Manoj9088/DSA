package Recursion.RecursionBasics;

public class PlayWithDigits {

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Sum of digits of " + n + " is " + sumOfDigits(n));
        System.out.println("Product of digits of "+n+" is "+ productOfDigits(n));
        System.out.println("Reverse of Number "+ n + " is " +reverseNumber(n,0));
    }

    public static int sumOfDigits(int n){

        if(n==0){
            return 0;
        }

        return (n%10) + sumOfDigits(n/10);
    }

    public static int productOfDigits(int n){
        if(n==0||n==1){
            return n;
        }
        return (n%10)*productOfDigits(n/10);
    }

    public static int reverseNumber(int n,int rev) {
        if (n == 0) {
            return rev;
        }
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }
    
}
