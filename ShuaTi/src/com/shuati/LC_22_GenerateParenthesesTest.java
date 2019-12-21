package com.shuati;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC_22_GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        LC_22_GenerateParentheses stub = new LC_22_GenerateParentheses();
        List<String> result = stub.generateParenthesis(2);
        for (String s : result){
            System.out.println(s);
        }
    }
}