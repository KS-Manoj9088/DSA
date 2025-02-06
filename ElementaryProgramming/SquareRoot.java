package ElementaryProgramming;

public class SquareRoot {
    
    public static void main(String... args){

        int n = 123;
        int precision = 3;
        double sqrt = squareRoot(n,precision);
        System.out.println("Square root of " + n + " is " +sqrt);
    }

    public static double squareRoot(int n, int p) {
        int low = 1, high = n;
        double root = 0.0;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid;
            }
            else if (mid * mid < n) {
                root = mid;  // Store the closest integer value
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    
        // Adding decimal precision
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr; // Move back one step
            incr /= 10;   // Reduce increment
        }
    
        return root;
    }
    

}
