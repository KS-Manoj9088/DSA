package ElementaryProgramming;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 5, 3, 2, 34, 31, 17, 57, 83};
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime

        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to sqrt(num)
            if (num % i == 0) {
                return false; // Not a prime if divisible by any number other than 1 and itself
            }
        }

        return true; // Number is prime
    }
}
