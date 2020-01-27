package com.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: [1,1,2]
//Output:
//        [
//        [1,1,2],
//        [1,2,1],
//        [2,1,1]
//        ]
public class LC_47_Permutations_II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        helper(result, nums, new ArrayList<>(), visited);
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, List<Integer> curList, boolean[] visited) {
        if (curList.size() == nums.length){
            result.add(new ArrayList<>(curList));
        }

        for (int i = 0; i < nums.length ; i++) {
            if (visited[i]){
                continue;
            }

            if (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]){
                continue; // only use the number if previous is used..
                //else we risk repetition
            }

            curList.add(nums[i]);
            visited[i] = true;
            helper(result, nums, curList, visited);
            visited[i] = false;
            curList.remove(curList.size() - 1);
        }
    }
}
