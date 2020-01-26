package com.shuati;

import java.util.ArrayList;
import java.util.List;

//Input: nums = [1,2,3]
//        Output:
//        [
//        [3],
//        [1],
//        [2],
//        [1,2,3],
//        [1,3],
//        [2,3],
//        [1,2],
//        []
//        ]
public class LC_78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        //numbers are distinct
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, new ArrayList<Integer>(), result, 0);
        return result;
    }

    private void helper(int[] nums, List<Integer> cur, List<List<Integer>> result, int start){
        result.add(new ArrayList<>(cur));

        for (int i = start; i < nums.length ; i++) {
            cur.add(nums[i]);
            helper(nums, cur, result, i + 1);
            cur.remove(cur.size() - 1);
        }
    }

    // so [], [1], [1, 2], [
}
