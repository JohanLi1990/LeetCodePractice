package com.shuati;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class TwoSum {
    //idea:
    // create a hashmap of {number, index}
    // for each number in the list
    // if its complement not exist in hashmap
    //      add to hashmap
    // else return complement index retrived from hashmap
    //      and the index of this number
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (numIndex.containsKey(target - nums[i])){
                return new int[]{numIndex.get(target - nums[i]), i};
            } else {
                numIndex.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}
