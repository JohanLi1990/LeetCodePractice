package com.shuati;

public class LC_209_Minimum_Size_Subarray {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0, sum =0;
        for (end = 0; end < nums.length; end++){
            if (nums[end] >= s){
                return 1;
            }
            sum += nums[end];
            if (sum >= s){
                while ( sum >= s && start < end){
                    sum -= nums[start];
                    start++;
                }
                minLen = Math.min(end - start + 2 , minLen);
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
