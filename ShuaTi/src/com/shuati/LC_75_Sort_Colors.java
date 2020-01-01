package com.shuati;

public class LC_75_Sort_Colors {
    public void sortColors(int[] nums) {
        if (nums.length == 0){
            return;
        }

        int mid = 0, lo = 0, hi = nums.length - 1;
        int temp = 0;
        while (mid <= hi){
            if (nums[mid] == 0){
                //mid is too small, swap mid with lo
                if (mid != lo){
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                }
                lo++;
                mid++;
            } else if (nums[mid] == 1){
                mid++;
            } else {
                //mid too big
                temp = nums[hi];
                nums[hi] = nums[mid];
                nums[mid] = temp;
                hi--;
            }
        }
    }
}
