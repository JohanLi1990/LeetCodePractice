package com.shuati;

public class LC_516_LongestPalindrome {
    public int longestPalindromeSubseq(String s) {
        //use dynamic programming
        int[][] dp = new int[s.length()][s.length()];
        //e.g. 6x6 matrix for axbdba
        dp[0][0] = 1;
        for (int i = 1; i < s.length(); i++) {
            dp[i][i] = 1;
            for (int j = i-1 ; j >=0 ; j--) {
                //if not the same
                if (s.charAt(j) != s.charAt(i)){
                    dp[j][i] = Math.max(dp[j][i - 1], dp[j+1][i]);
                } else {
                    dp[j][i] = dp[j + 1][i - 1] + 2;
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
