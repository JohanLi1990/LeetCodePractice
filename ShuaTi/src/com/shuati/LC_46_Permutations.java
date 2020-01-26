package com.shuati;

import java.util.ArrayList;
import java.util.List;

//Input: [1,2,3]
//Output:
//        [
//        [1,2,3],
//        [1,3,2],
//        [2,1,3],
//        [2,3,1],
//        [3,1,2],
//        [3,2,1]
//        ]
public class LC_46_Permutations {
    //distinct integers
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums, new ArrayList<>());
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, List<Integer> curList) {
        if (curList.size() == nums.length){
            result.add(new ArrayList<>(curList));
        }

        for (int j = 0; j < nums.length ; j++) {
            if (curList.contains(nums[j])){
                continue;
            }
            curList.add(nums[j]);
            helper(result, nums, curList);
            curList.remove(curList.size() - 1);
        }
    }
}
