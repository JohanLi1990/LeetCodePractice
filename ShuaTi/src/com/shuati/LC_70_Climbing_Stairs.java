package com.shuati;


public class LC_70_Climbing_Stairs {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i] = 1;
            } else if (i == 1) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = dp[i - 2] + dp[i - 1];
            }
        }
        return dp[n - 1];
    }
}
