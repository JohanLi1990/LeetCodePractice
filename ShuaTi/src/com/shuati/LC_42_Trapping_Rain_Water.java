package com.shuati;

public class LC_42_Trapping_Rain_Water {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        while (l < r && height[l] <= height[l+1]){
            l++;
        }
        while (l < r && height[r] <= height[r - 1]){
            r--;
        }

        int maxWater = 0;
        while (l < r){
            int left = height[l];
            int right = height[r];

            if (left <= right){
                // pour water from the left
                while (l < r && height[++l] <= left){
                    maxWater += left - height[l];
                }
            } else {
                while (l < r && height[--r] <= right){
                    maxWater += right - height[r];
                }
            }
        }
        return maxWater;



    }
}
