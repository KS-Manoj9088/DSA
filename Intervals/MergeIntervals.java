package Intervals;

import java.util.*;

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];
        
        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart <= end) {
                // Overlapping interval, merge it
                end = Math.max(end, currEnd);
            } else {
                // No overlap, push previous interval
                res.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add the last interval
        res.add(new int[]{start, end});

        // Convert List<int[]> to int[][]
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {8, 10},
            {2, 6},
            {15, 18}
        };

        int[][] merged = mergeIntervals(intervals);

        for (int[] i : merged) {
            System.out.println(i[0] + " " + i[1]);
        }

    }
}