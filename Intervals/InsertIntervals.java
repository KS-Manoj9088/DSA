package Intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        InsertIntervals intv = new InsertIntervals();

        int[][] intervals = { {1,3}, {6,9}};
        int[] newInterval = {2,5};

        int[][] resIntervals = intv.insert(intervals, newInterval);

        for(int[] res : resIntervals){
            System.out.println(res[0]+" "+res[1]);
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals that come before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        // Merge all overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval); // Add the merged interval

        // Add remaining intervals
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
