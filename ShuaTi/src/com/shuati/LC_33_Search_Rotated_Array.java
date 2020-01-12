package com.shuati;

//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
public class LC_33_Search_Rotated_Array {
    public int search(int[] nums, int target) {
        //idea, need to determine location of target,
        // if it is between first to Pivot, then do bisearch there.
        // else do between pivot to end.
        if (nums.length == 0){
            return -1;
        }
        int pivot = -1;
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i + 1] < nums[i]){
                pivot = i;
                break;
            }
        }

        if (pivot == -1){
            pivot = nums.length - 1;
        }
        if (target < nums[0]){
            //target lies after pivot
            return bisearch(nums, pivot + 1, nums.length - 1, target);
        } else {
            return bisearch(nums, 0, pivot, target);
        }


    }

    private int bisearch(int[] nums, int start, int end, int target) {
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] < target){
                start = mid + 1;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
