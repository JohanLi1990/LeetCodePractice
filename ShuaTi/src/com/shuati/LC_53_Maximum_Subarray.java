package com.shuati;

//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
public class LC_53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int[] max = new int[nums.length];
        max[0] = nums[0];
        int maxOutput = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length ; i++) {
            max[i] = Math.max(max[i - 1] + nums[i], nums[i]);
            maxOutput = Math.max(maxOutput, max[i]);
        }
        return Math.max(maxOutput, max[0]);
    }
}
