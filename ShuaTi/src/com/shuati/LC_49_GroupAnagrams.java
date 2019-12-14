package com.shuati;

import java.util.*;

//Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//        Output:
//        [
//        ["ate","eat","tea"],
//        ["nat","tan"],
//        ["bat"]
//        ]
public class LC_49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> theMap = new HashMap<>();
        for (String str : strs){
            char[] listofChar = str.toCharArray();
            Arrays.sort(listofChar);
            String key = String.valueOf(listofChar);
            if (theMap.containsKey(key)){
                theMap.get(key).add(str);
            } else {
                theMap.put(key, new ArrayList<String>(Arrays.asList(str)));
            }
        }
        return new ArrayList<List<String>>(theMap.values());
    }

}
