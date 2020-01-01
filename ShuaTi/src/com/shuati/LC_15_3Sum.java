package com.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int sum =  0 - nums[i];
            while (left < right) {
                if (nums[left] + nums[right] > sum) {
                    right--;
                } else if (nums[left] + nums[right] < sum) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left],  nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
