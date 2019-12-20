package com.shuati;

import java.util.*;

public class LC_20_Valid_Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> theStack = new Stack(){};
        for (char c : s.toCharArray()){
            if (c == '{'){
                theStack.push('}');
            } else if (c == '['){
                theStack.push(']');
            } else if (c == '('){
                theStack.push(')');
            } else if (theStack.isEmpty() || c != theStack.pop()) {
                return false;
            }
        }
        return theStack.isEmpty();
    }
}
