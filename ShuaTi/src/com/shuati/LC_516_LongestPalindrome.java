package com.shuati;

public class LC_516_LongestPalindrome {
    public int longestPalindromeSubseq(String s) {
        //use dynamic programming
        int[][] dp = new int[s.length()][s.length()];
        //e.g. 6x6 matrix for axbdba
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1 ; j < s.length(); j++) {
                //if not the same
                if (s.charAt(j) != s.charAt(i)){
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i+1][j]);
                } else {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
