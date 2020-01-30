package com.shuati;

import java.util.ArrayList;
import java.util.List;


//generate all well formed parentheses
public class LC_22_GenerateParentheses_Redo {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, new StringBuilder(), n, 0);
        return result;
    }

    private void helper(List<String> result, StringBuilder curString, int n, int count ){
        if (n == 0 && count == 0){
            result.add(curString.toString());
        }

        if (n < 0 || count < 0){
            return;
        }


        helper(result, curString.append("("), n - 1, count + 1);
        curString.setLength(curString.length() - 1);

        helper(result, curString.append(")"), n, count - 1);
        curString.setLength(curString.length() - 1);
    }
}
