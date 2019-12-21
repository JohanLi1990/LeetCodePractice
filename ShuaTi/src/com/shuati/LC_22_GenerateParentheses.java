package com.shuati;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        //go dfs on each possible combination
        List<String> result = new ArrayList<>();
        if (n==0){
            return result;
        }
        helper(result, new StringBuilder(),0, 0, n);
        return result;
    }

    private void helper(List<String> list,  StringBuilder curSB, int Step1, int Step2, int max){
        if (curSB.length() == max * 2){
            list.add(curSB.toString());
            return;
        }

        if (Step1 < max){
            helper(list, curSB.append("("), Step1 + 1, Step2, max);
            curSB.setLength(curSB.length() - 1);
        }

        if (Step2 < Step1){
            helper(list, curSB.append(")"), Step1, Step2 +1, max);
            curSB.setLength(curSB.length() - 1);
        }
    }
}
