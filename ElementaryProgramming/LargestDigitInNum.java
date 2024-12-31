package ElementaryProgramming;

public class LargestDigitInNum {
    public static void main(String[] args) {
        int num = 1234523;
        int max = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num = num / 10;
        }
        System.out.println("The largest digit in the number is: " + max);
    }
    
}
