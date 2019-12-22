package com.shuati;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_17_LetterCombinationPhone {
    private final static Map<Character, String> phone = new HashMap<>();
    static {
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();

        helper(result, digits, digits.length(), "");

        return result;
    }

    private void helper(List<String> total, String keys, int keyLength, String curString){

        if (curString.length() == keyLength){
            total.add(curString);
            return;
        }

        String theLetters = phone.get(keys.charAt(0));
        if (theLetters == null){
            return;
        }
        for (int i = 0; i < theLetters.length() ; i++) {
            helper(total, keys.substring(1), keyLength, curString + theLetters.charAt(i));
        }

    }
}
