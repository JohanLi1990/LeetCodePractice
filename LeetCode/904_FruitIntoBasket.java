/*
In a row of trees, the i-th tree produces fruit with type tree[i].

You start at any tree of your choice, then repeatedly perform the following steps:

    Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
    Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.

Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?

 

Example 1:

Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].

Example 2:

Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].

Example 3:

Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].

Example 4:

Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.

 

Note:

    1 <= tree.length <= 40000
    0 <= tree[i] < tree.length


*/


class Solution {
    public int totalFruit1(int[] tree) { // 60 ms code
        // sliding window 
        // longest max subarray with two distinct characters
        int count = 0, j = 0;
        Map<Integer, Integer> map = new HashMap();
        int res = 0;
        for (int i = 0; i < tree.length; i++){
            int type = tree[i];
            if (!map.containsKey(type) || map.get(type) == 0){
                count++;
            }
            map.put(type, map.getOrDefault(type, 0) + 1);
            
            while (count > 2){
                //two distinct characters
                int front = tree[j];
                map.put(front, map.get(front)-1);
                if (map.get(front) == 0){
                    count--;
                }
                j++;
            }
            res = Math.max(res, i - j + 1);
            
        }
        return res;
    }
    
    public int totalFruit(int[] tree) {
        int res = 0, curLength = 0, count_b = 0, a = 0, b = 0;
        for (int fruit : tree){
            if (fruit == b || fruit == a){
                curLength++;
            } else {
                curLength = count_b + 1;
            }
            if (fruit == b){
                count_b += 1;
            } else {
                count_b = 1;
            }
            
            if (fruit != b){
                a = b;
                b = fruit;
            }
            res = Math.max(res, curLength);    
        }
        return res;
    }
}