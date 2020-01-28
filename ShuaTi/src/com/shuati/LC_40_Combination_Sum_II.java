package com.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: candidates = [2,5,2,1,2], target = 5,
//        A solution set is:
//        [
//        [1,2,2],
//        [5]
//        ]
public class LC_40_Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // [1 2 2 2 5]
        List<List<Integer>> result = new ArrayList<>();
        helper(result, candidates, target, 0, new ArrayList<>());
        return result;
    }
    private void helper(List<List<Integer>> result, int[] candidates, int target, int start,
                        List<Integer> curList){
        if (target == 0){
            result.add(new ArrayList<>(curList));
            return;
        }
        if (target < 0){
            return;
        }

        for (int i = start; i < candidates.length ; i++) {
            if (candidates[i] > target){
                return;
            } // sort and filter is very very important here, can drastically improve performance
            if (i > start && candidates[i] == candidates[i - 1]){
                continue;
            }
            curList.add(candidates[i]);
            helper(result, candidates, target - candidates[i], i + 1, curList);
            curList.remove(curList.size() - 1);
        }

    }
}
