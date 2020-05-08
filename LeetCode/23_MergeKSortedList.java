/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }

 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6


 
 
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists){
        // i can user merge sort
        // divide and conque
        if (lists == null || lists.length == 0){
            return null;
        }
        return mergeKLists(lists, 0, lists.length - 1);
    } 
    
    private ListNode mergeKLists(ListNode[] lists, int lo, int hi){
        
        if (lo == hi){
            return lists[lo];
        }
                
        int mid = lo + (hi - lo) / 2;
        ListNode l1 = mergeKLists(lists, lo, mid);
        ListNode l2 = mergeKLists(lists, mid + 1, hi);
        return merge(l1, l2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        cur.next = (l1== null ? l2 : l1);
        return head.next;
    }
    
    public ListNode mergeKLists1(ListNode[] lists) {
        // i can use Min-Heap to do it. It will be O(NLgN) O(N) space
        if (lists == null || lists.length  == 0){
            return null;
        }
        PriorityQueue<ListNode> q = new PriorityQueue<>((l1, l2) -> (l1.val - l2.val));
        for (ListNode l : lists){
            if (l != null){
                q.offer(l);
            }
        }
        
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (!q.isEmpty()){
            ListNode curNode = q.poll();
            cur.next = curNode;
            if (curNode.next != null){
                q.offer(curNode.next);                
            }
            cur = cur.next;
        }
        return head.next;
        
    }
}