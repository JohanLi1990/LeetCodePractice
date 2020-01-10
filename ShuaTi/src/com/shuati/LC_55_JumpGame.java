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
        int dist = 0;
        for (int i = 0; i <= dist ; i++) {
            dist = Math.max(dist, i + nums[i]);
            if (dist >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
