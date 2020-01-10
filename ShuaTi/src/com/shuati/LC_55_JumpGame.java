package com.shuati;

//Input: [2,3,1,1,4]
//        Output: true
//        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//
//        Input: [3,2,1,0,4]
//        Output: false
//        Explanation: You will always arrive at index 3 no matter what. Its maximum
//        jump length is 0, which makes it impossible to reach the last index.

public class LC_55_JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1){
            return true;
        }

        if (nums[0] == 0){
            return false;
        }

        if (nums[0] >= nums.length - 1){
            return true;
        }

        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 0; i < nums.length - 1 && dp[i] == 1 ; i++) {
            int steps = nums[i];
            if (steps == 0){
                continue;
            }

            steps = Math.min(steps, nums.length - 1 - i);
            while (steps > 0){
                dp[i + (steps--)] = 1;
            }

            if (dp[nums.length - 1] == 1){
                return true;
            }
        }
        return false;
    }
}
