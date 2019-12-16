package com.shuati;

public class LC_62_Unique_Path {
    public int uniquePaths(int m, int n) {
        //dynamic programming
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i < m+1 ; i++) {
            for (int j = 1; j < n+1 ; j++) {
                //left and top;
                dp[i][j] = Math.max(1, dp[i][j-1] + dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}
