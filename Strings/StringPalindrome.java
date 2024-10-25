package Strings;


public class StringPalindrome{
    public static void main(String[] args) {
        String str = "madam";

        // Using StringBuilder.
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("Given String is a palindrome");
        }
        else{
            System.out.println("Given string is not a palindrome");
        }

        boolean valid = StringPalindrome.isPalindrome("madam");
        System.out.println(valid);

    }

    // 2-pointer approach.
    public static boolean isPalindrome(String word){
        char[] ch = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(ch[start] != ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

