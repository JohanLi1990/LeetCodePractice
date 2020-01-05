package com.shuati;

import java.util.Arrays;

public class LC_31_Next_Permutation {
    public void nextPermutation(int[] nums) {
        int pre = nums.length -1;
        while (pre > 0 && nums[pre] <= nums[pre - 1]){
            pre--;
        }
        pre--; //this is the location of where we need to do swaps

        if (pre != -1){
            //find from num[pre + 1, end] the next number after num[pre];
            int nextloc = pre + 1;
            while ( nextloc < nums.length && nums[nextloc] > nums[pre]){
                nextloc++;
            }
            nextloc--;
            //swap nextloc
            int temp = nums[pre];
            nums[pre] = nums[nextloc];
            nums[nextloc] = temp;
        }

        //just reverse the string after pre.
        int i = pre + 1, j = nums.length - 1;
        while (i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
