package ElementaryProgramming;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int getSum = getNumSum(number);
        System.out.println("Sum of digits: " + getSum);
    }
    public static int getNumSum(int num){
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    } 
    
}
