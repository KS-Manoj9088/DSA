package HackerRank;

import java.util.Scanner;

public class Cricketers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read the 6 bowler names
        String[] bowlers = new String[6];
        for (int i = 0; i < 6; i++) {
            bowlers[i] = sc.nextLine();
        }

        // Step 2: Read the runs scored on each ball for each over
        int[][] runs = new int[6][6];  // 6 overs, each having 6 balls

        for (int i = 0; i < 6; i++) {  // Loop through overs
            for (int j = 0; j < 6; j++) {  // Loop through 6 balls in each over
                runs[i][j] = sc.nextInt();
            }
        }

        // Step 3: Calculate total runs for each bowler
        int maxRuns = 0;
        String maxBowler = "";

        for (int i = 0; i < 6; i++) {  // Loop through each bowler
            int totalRuns = 0;

            for (int j = 0; j < 6; j++) {  // Loop through each ball of that bowler
                totalRuns += runs[i][j];
            }

            // Check if this bowler has appeared before
            for (int k = 0; k < i; k++) {
                if (bowlers[i].equals(bowlers[k])) {
                    for (int j = 0; j < 6; j++) {
                        totalRuns += runs[k][j];  // Add previous over data
                    }
                }
            }

            // Step 4: Track the bowler with maximum runs
            if (totalRuns >= maxRuns) {
                maxRuns = totalRuns;
                maxBowler = bowlers[i];
            }
        }

        // Step 5: Output the bowler who conceded the most runs
        System.out.println(maxBowler);
        sc.close();
    }
}
