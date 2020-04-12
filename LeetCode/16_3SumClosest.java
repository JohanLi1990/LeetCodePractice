/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        
        int prevDiff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            int cur  = nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k){
                int cursum = nums[j] + nums[k] + cur;
                if (cursum < target){
                    j++;
                } else if (cursum > target){
                    k--;
                } else {
                    return cursum;
                }
                
                int diff = Math.abs(cursum - target);
                
                if (diff < prevDiff){
                    res = cursum;
                    prevDiff = diff;
                }
            }
        }
        return res;
        
    }
}