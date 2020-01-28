package com.shuati;

import java.util.ArrayList;
import java.util.List;

public class LC_77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(n, k, result, new ArrayList<>(), 1);
        return result;
    }
    
    private void helper(int n, int size, List<List<Integer>> result, List<Integer> curList, int start){
        if (curList.size() == size){
            result.add(new ArrayList<>(curList));
            return;
        }

        if (size - curList.size() > n - start + 1){
            return;
        }

        for (int i = start; i < n + 1; i++) {
            curList.add(i);
            helper(n, size, result, curList, i + 1);
            curList.remove(curList.size() - 1);
        }
    }
}
