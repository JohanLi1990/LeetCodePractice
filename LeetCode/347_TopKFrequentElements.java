/*
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:

Input: nums = [1], k = 1
Output: [1]

Note:

    You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
    Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


*/


class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || nums == null){
            return new ArrayList();
        }
        //bucket sort
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer>[] lists = new List[nums.length + 1];
        for (int num : map.keySet()){
            int freq = map.get(num);
            if (lists[freq] == null){
                lists[freq] = new ArrayList();
            }
            lists[freq].add(num);
        }
        
        List<Integer> res = new ArrayList();
        for (int i = lists.length - 1; i >= 0; i--){
            if (lists[i] == null){
                continue;
            }
            
            for (int j = 0; j < lists[i].size(); j++){
                res.add(lists[i].get(j));
                k--;
            }
            if (k <= 0){
                break;
            }

        }
        return res;
    }
}