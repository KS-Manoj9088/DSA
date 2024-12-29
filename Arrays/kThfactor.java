package Arrays;
import java.util.*; 

public class kThfactor {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int n = 4; // Number whose factors are to be found
        int k = 4; // Position of the factor to find
        
        // Finding factors of n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                l1.add(i);
            }
        }

        // Printing the size of the list of factors
        System.out.println("Number of factors: " + l1.size());

        // Checking if the k-th factor exists
        if (k > l1.size()) {
            System.out.println(-1); // If k-th factor doesn't exist
        } else {
            System.out.println("The " + k + "-th factor is: " + l1.get(k - 1));
        }
        
        // Printing the list of factors
        System.out.println("Factors of " + n + ": " + l1);
    }
}
