package com.shuati;

//You must do this in-place without making a copy of the array.
//        Minimize the total number of operations.

//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class LC_283_Move_Zeros {
    public void moveZeroes(int[] nums) {
        int j  = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0){
                // need to replace
                // if i == j then nothing happens, else
                // nums[i] will be zero
                if (i != j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
