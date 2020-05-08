/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


*/


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || s.isEmpty()){
            return new ArrayList();
        }
        int[] map = new int[26];
        for (char c : p.toCharArray()){
            map[c - 'a']++;
        }
        List<Integer> res = new ArrayList();
        int j = 0, count = p.length();
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);
            map[c - 'a']--;
            if (map[c - 'a'] >= 0){
                count--;
            }
            
            if (i - j + 1 == p.length()){
                if (count == 0){
                    res.add(j);
                }
                char d = s.charAt(j);
                map[d - 'a']++;
                if (map[d - 'a'] > 0){
                    count++;
                }
                j++;
            }
        }
        return res;
    }
}