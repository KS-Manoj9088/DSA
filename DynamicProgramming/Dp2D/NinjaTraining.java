package DynamicProgramming.Dp2D;

import java.util.Arrays;

/*
Geek is going for a training program for n days.
He can perform any of these activities: Running, Fighting, and Learning Practice.
Each activity has some point on each day.
As Geek wants to improve all his skills,
he can't do the same activity on two consecutive days.
Given a 2D array arr[][] of size n where arr[i][0], arr[i][1], and arr[i][2]
represent the merit points for Running, Fighting, and Learning on the i-th day,
determine the maximum total merit points Geek can achieve .

Example:
Input: arr[]= [[1, 2, 5], [3, 1, 1], [3, 3, 3]]
Output: 11
Explanation: Geek will learn a new move and earn 5 point then on second day he will do running and earn 3 point and on third day he will do fighting and earn 3 points so, maximum merit point will be 11.
 */

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] points = new int[][] {
                                        {1,2,5},
                                        {3,1,1},
                                        {3,3,3}
                                     };
        
        NinjaTraining nj = new NinjaTraining();
        int maximumMerits = nj.maximumPoints(points); 
        System.out.println(maximumMerits);                        
    }

    public int maximumPoints(int arr[][]) {
        int[][] dp = new int[arr.length][4];
        
        // Fill dp Array - filling each row  dp[i] with -1.
        for(int i = 0;i < arr.length; i++){
            Arrays.fill(dp[i], -1);
        }
        
        int maxPoints = helper(arr.length-1, 3, dp, arr);
        return maxPoints;
    }
    
    public int helper(int day, int last_task,int[][] dp,int[][] arr){
        //Base Case
        if(day == 0){
            int maxPoints = 0;
            for(int i = 0;i < 3; i++){
                if(i!=last_task){
                    int max = arr[0][i];
                    maxPoints = Math.max(max, maxPoints);
                }
            }
            
            return maxPoints;
        }
        
        // Memoisation Condition
        if(dp[day][last_task]!=-1){
            return dp[day][last_task];
        }
        
        int maxPoints = 0;
        for(int i = 0;i < 3; i++){
            if(i!=last_task){
             int points = arr[day][i] + helper(day-1, i, dp, arr);   
             maxPoints = Math.max(maxPoints, points);
            }
        }
        return dp[day][last_task] = maxPoints;
    }
}
