package com.shuati;

public class LC_424_LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        int[] letters = new int[26];
        int start = 0, end = 0;
        int maxCount = 0;
        for (end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++letters[s.charAt(end) - 'A']);
            if (k + maxCount <= end - start ){
                letters[s.charAt(start++) - 'A']--;
            }
        }
        return s.length() - start;
    }
}
