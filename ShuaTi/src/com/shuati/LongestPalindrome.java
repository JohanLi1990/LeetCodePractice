package com.shuati;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Input: "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
//Input: "cbbd"
//        Output: "bb"
//maximum length of s is 1000.
public class LongestPalindrome {
    /**
     * idea:
     *
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String result = "";
        if (isPalindrome(s)){
            return s;
        }

        for (int i = 0; i < s.length() ; i++) {
            for (int j = i; j < s.length() ; j++) {
                String temp = s.substring(i, j+1);
                if (isPalindrome(temp) && (temp.length() > result.length())){
                    result = temp;
                }
            }
        }

        return  result;
    }

    public boolean isPalindrome(String s){
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
