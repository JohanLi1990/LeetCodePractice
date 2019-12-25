package com.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_39_Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //sort the array
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(new ArrayList<Integer>(), result, candidates, 0, target, 0);
        return result;
    }

    private void helper(List<Integer> curList, List<List<Integer>> result, int[] candidates, int curStage, int target, int curSum) {
        if (curSum == target) {
            result.add(new ArrayList<>(curList));
            return;
        }

        //less than target
        for (int i = curStage; i < candidates.length; i++) {
            if (curSum + candidates[i] > target) {
                return;
            }
            curList.add(candidates[i]);
            helper(curList, result, candidates, i, target, curSum + candidates[i]);
            curList.remove(curList.size() - 1);
        }
    }
}
