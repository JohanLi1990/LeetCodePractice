package com.shuati;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Input: "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
//Input: "cbbd"
//        Output: "bb"
//maximum length of s is 1000.
public class LongestPalindrome {
    //idea:
    //
    private int lo, maxlen;
    public String longestPalindrome(String s) {
        if (s.length() <= 1){
            return s;
        }
        
        for (int i = 0; i < s.length() ; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }

        return s.substring(lo, lo + maxlen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >=0 && k < s.length() && s.charAt(j) == s.charAt(k) ){
            j--;
            k++;
        }
        if (k - j - 1> maxlen){
            lo = j + 1;
            maxlen = k - j - 1;
        }
    }


}
