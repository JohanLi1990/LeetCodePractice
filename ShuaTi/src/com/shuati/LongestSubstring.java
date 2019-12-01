package com.shuati;

import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;

/*
To get the longest substring without repeat
 */
//Input: "abcabcbb" "bbbbb" "pwwkew"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
// idea:
// initial pointer -> 0
// initial len -> 0
// for each char in string:
//  if unique -> len ++
// else pointer shift to the index + 1 of the repeats, len = 0
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int pointer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)){
                //calculate length
                result = Math.max(result, i - pointer);
                //calculate new pointer
                if (pointer <= map.get(cur)){
                    pointer = map.get(cur) + 1;
                }
            }
            map.put(cur, i);
        }
        return Math.max(result, s.length() - pointer);
    }
}
