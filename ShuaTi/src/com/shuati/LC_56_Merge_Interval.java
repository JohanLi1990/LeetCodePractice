package com.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Input: [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6]
//Input: [[1,4],[4,5]]
//        Output: [[1,5]]
//        Explanation: Intervals [1,4] and [4,5] are considered overlapping.
public class LC_56_Merge_Interval {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(l -> l[0]));
        List<int[]> res = new ArrayList<>();
        int[] curItem = intervals[0];
        res.add(curItem);

        for (int[] each : intervals) {
            if (each[0] > curItem[1]){
                // need new item
                curItem = each;
                res.add(curItem);
            } else {
                curItem[1] = Math.max(curItem[1], each[1]);
            }
        }
        return res.toArray(new int[res.size()][]);


    }
}
