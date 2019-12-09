package com.shuati;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LC_635_Two_Sum_IV_BST {
    private Set<Integer> theSet = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        theSet.add(root.val);
        return findTheNode(root.left, k) || findTheNode(root.right, k);
    }

    private boolean findTheNode(TreeNode left, int target) {
        if (left == null){
            return false;
        }
        if (theSet.contains(target - left.val)){
            return true;
        } else{
            theSet.add(left.val);
        }
        return findTheNode(left.left, target) || findTheNode(left.right, target);
    }
}
