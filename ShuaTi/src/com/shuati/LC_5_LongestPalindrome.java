package com.shuati;

public class LC_5_LongestPalindrome {
    private int lo, maxlen;
    public String longestPalindrome(String s) {
        if (s.length() == 0){
            return s;
        }
        for (int i = 0; i <s.length() ; i++) {
            findPalindrome(s, i, i);
            findPalindrome(s, i, i + 1);
        }
        return s.substring(lo, lo + maxlen);
    }

    private void findPalindrome(String s, int k, int j) {
        while (k >= 0 && j < s.length() && s.charAt(k)==s.charAt(j)){
            k--;
            j++;
        }
        k = k + 1;
        j = j - 1;
        if (j - k + 1> maxlen){
            lo = k;
            maxlen = j - k + 1;
        }
    }
}
