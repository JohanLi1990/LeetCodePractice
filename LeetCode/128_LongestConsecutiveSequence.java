/*

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Your algorithm should run in O(n) complexity.

Example:

Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.


*/

class Solution {
    public int longestConsecutive1(int[] nums) {
        int res = 0;
        // map indicates the longest consec length at each number from nums
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : nums){
            if (!map.containsKey(n)){
                //left boundary
                int left = map.containsKey(n - 1) ? map.get(n -1) : 0;
                //right boundary
                int right = map.containsKey(n + 1) ? map.get(n + 1) : 0;
                int curLength = left + right + 1;
                map.put(n, curLength);
                
                res = Math.max(res, curLength);
                map.put(n - left, curLength);
                map.put(n + right, curLength);
            }
        }
        return res;
    }
    
        // 3ms - 96%
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int v : nums){
            set.add(v);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++){
			// !set.contains (nums[i] - 1) very important condition
			// we only starts with the min number of a sequence
            if (set.contains(nums[i]) && !set.contains(nums[i] - 1)){
                int j = nums[i] + 1;
                while (set.remove(j)){
                    j++; //sequence keep increasing;
                }
                max = Math.max(max, j - nums[i]);// calculate the length
            }
        }
        return max;
    }
    
    
}