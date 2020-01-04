package com.shuati;

public class LC_287_Find_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int slow = 0, fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        // the entry point is the duplicate, it has to be found from start
        // floyd's hare and tortoise & cycle detection
        slow = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
