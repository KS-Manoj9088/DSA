package Recursion.RecursionBasics;

public class ReverseNum{

    static int sum = 0;
    public static void reverseNum(int n){
        if(n == 0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverseNum(n/10);
    }

    public static void main(String[] args) {
        int num = 1234501;
        reverseNum(num);
        System.out.println(sum);

        int num_len = Integer.toString(num).length();
        int reversed_num = reverseNum1(num, num_len);
        System.out.println(reversed_num);
    }

    public static int reverseNum1(int n,int arg){
        if(arg == 0) {
            return n;
        }
        int rem = n % 10;
        return rem*( (int)Math.pow(10, arg-1)) + reverseNum1(n/10, arg-1); 
    }
}