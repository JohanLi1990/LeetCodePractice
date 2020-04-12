/*
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5

Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4

Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.

*/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // partition algorithm
        if (nums == null || nums.length == 0){
            return 0;
        }
        
        
        return partition(nums, 0, nums.length - 1, nums.length + 1 - k);
        
        
    }
    
    private int partition(int[] nums, int lo, int hi, int target){
        int rand = lo + (hi - lo)/2;
        swap(nums, lo, rand);
        int pi = lo, pivot = nums[pi];
        for (int i = lo + 1; i <= hi; i++){
            if (nums[i] < pivot){
                pi++;
                swap(nums, pi, i);
            }
        }
        swap(nums, lo, pi);
        if (pi == target - 1){
            return nums[pi];
        } else if (pi < target - 1){
            return partition(nums, pi + 1, hi, target);
        } else {
            return partition(nums, lo, pi - 1, target);
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}