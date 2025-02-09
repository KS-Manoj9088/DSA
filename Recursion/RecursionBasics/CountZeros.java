package Recursion.RecursionBasics;

public class CountZeros {
    
    public static void main(String[] args) {
        int n = 1000122340;

        int count = countZerosInNum(n,0);
        System.out.println("Number of zeros in " + n + " is " + count);
    }

    public static int countZerosInNum(int n,int count){
        if(n == 0) {
            return count;
        }
        int rem = n%10;
        if(rem == 0) {
            return countZerosInNum(n/10, count+1);
        }
        return countZerosInNum(n/10, count);
    }
}
