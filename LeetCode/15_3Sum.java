/*

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]


*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList();
        }
        
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet();
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int cur = nums[i];
            // we use two sum algo to look for other two 
            int j = i+1;
            int k = nums.length - 1;
            int target = -cur;
            
            while (j < k){
                if (nums[j] + nums[k] < target){
                    j++;
                } else if (nums[j] + nums[k] > target){
                    k--;
                } else{
                    List<Integer> curList = new ArrayList();
                    curList.add(cur); 
                    curList.add(nums[j]);
                    curList.add(nums[k]);
                    res.add(curList);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList(res);
    }
    
    
}