package com.shuati;

import java.util.HashMap;
import java.util.Map;

public class LC_3_LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        //two pointer
        //hashtable
        Map<Character, Integer> theMap = new HashMap<>();
        int maxLen = 0;
        int start = 0; //pointer two, starting index of the substring
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (theMap.containsKey(key)){
                //there has already been an repeat;
                maxLen = Math.max(maxLen, i - start);
                start = Math.max(start, theMap.get(key) + 1);
            }
            theMap.put(key, i);
        }
        maxLen = Math.max(maxLen, s.length() - start);
        return maxLen;
    }
}
