package ElementaryProgramming;

public class Palindrome {
    
    public static void main(String[] args) {
        int[] arr = {121,133,9889,77777,80008,123454321};
        for(int i = 0;i < arr.length;i++){
            if(isPalindromeUsingStrings(arr[i])){
                System.out.println(arr[i] + " is a palindrome");
            }
            else{
                System.out.println(arr[i] + " is not a palindrome");
            }
        }
    }
    public static boolean isPalindrome(int num){ 
        int temp = num;
        int reversed = 0;
        while(temp != 0){
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp = temp / 10;
        }
        return num == reversed;
    }

    public static boolean isPalindromeUsingStrings(int num) {
        String str = Integer.toString(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
