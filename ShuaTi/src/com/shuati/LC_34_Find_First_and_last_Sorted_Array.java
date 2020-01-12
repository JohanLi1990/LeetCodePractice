package com.shuati;

//Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
public class LC_34_Find_First_and_last_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int l = -1, r = -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] > target){
                right = mid - 1;
            } else {
                l = mid;
                r = mid;
                break;
            }
        }
        while (l > 0 && nums[l - 1] == nums[l]){
            l--;
        }
        while ( r >= 0 && r < nums.length -1 && nums[r + 1] == nums[r]){
            r++;
        }
        return new int[]{l, r};
    }
}
