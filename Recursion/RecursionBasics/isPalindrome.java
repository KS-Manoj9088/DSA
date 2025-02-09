package Recursion.RecursionBasics;

public class isPalindrome {

    static int rev = 0;

    static boolean palindrome(int num){
        if(num == rev){
            return true;
        }

        int rem = num%10;
        rev = rev*10 + rem;
        return palindrome(num/10);
    }


    public static void main(String[] args) {
        
        System.out.println(palindrome(12321)); // true
    }
    
}
