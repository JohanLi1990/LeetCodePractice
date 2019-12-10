package com.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC_989_AddToArrayForm {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int digit = 0;
        int index = A.length - 1;
        while (index > -1 || K > 0 ) {
            digit = (index > -1 ? A[index] : 0) + K;
            K = digit / 10;
            result.add(digit % 10);
            index--;
        }
        Collections.reverse(result);
        return result;
    }
}
