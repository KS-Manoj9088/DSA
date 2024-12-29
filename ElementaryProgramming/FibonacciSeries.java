package ElementaryProgramming;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of terms for the Fibonacci series: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Fibonacci series up to " + n + " terms:");
                generateFibonacci(n);
            }
        } finally {
            sc.close();
        }
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term in the series
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
