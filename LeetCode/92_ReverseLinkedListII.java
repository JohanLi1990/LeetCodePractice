/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        // travel to m
        // start reversing, till n 
        // return node n, connect m to n.next
        
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        cur.next = head;
        
        ListNode ptr = head;
        int ctr = 1;
        while (ctr < m){
            cur = cur.next;
            ptr = ptr.next;
            ctr++;
        }
        // start reversing;
        ListNode pre = null;
        while(ctr <= n){
            ListNode temp = ptr.next;
            ptr.next = pre;
            pre = ptr;
            ptr = temp;
            ctr++;
        }
        cur.next.next = ptr;
        cur.next = pre;
        
        return newHead.next;
    }
}